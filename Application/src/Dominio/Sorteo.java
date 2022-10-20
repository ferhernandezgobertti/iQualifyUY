// Universidad ORT - Uruguay
// Facultad de Ingeniería

// OBLIGATORIO 2 - Ingeniería de Software 1

package Dominio;

// Autores:

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Properties;
import java.util.Random;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

// *Fernando A. Hernández Gobertti (173631) - Ingeniería en Telecomunicaciones
// **Sebastián Effa Gallego (193248) - Ingeniería en Electrónica

// Docente:
// Martín Solari Buela

public class Sorteo implements Serializable{
    
    //Atributos de la clase Sorteo
    private String descripcionSorteo;
    private Calendar fechaSorteo;
    private int cantGanadores;
    private ArrayList<Usuario> listaGanadores = new ArrayList<Usuario>();
    
    //Constructor Sin Parámetros de la Clase Sorteo
    public Sorteo() {
        this.setDescripcion("No hay información");
        this.setCantGanadores(1);
    }
    
    //Constructor Con Parámetros de la Clase Sorteo
    public Sorteo(String descripcion, Calendar fecha, int numero){
        this.setDescripcion(descripcion);
        this.setFecha(fecha);
        this.setCantGanadores(numero);
    }
    
    //Métodos de Acceso y Modificación de la clase Sorteo
    public String getDescripcion(){
        return descripcionSorteo;
    }
    
    public void setDescripcion (String unDescripcion){
        this.descripcionSorteo = unDescripcion;
    }
    
    public Calendar getFecha(){
        return fechaSorteo;
    }
    
    public void setFecha (Calendar unFecha){
        this.fechaSorteo = unFecha;
    }
    
    
    public int getCantGanadores() {
        return cantGanadores;
    }

    public void setCantGanadores(int cantGanadores) {
        this.cantGanadores = cantGanadores;
    }
    
    public ArrayList <Usuario> getGanadores(){
        return listaGanadores;
    }
    
    //Método que setea la cantidad de Ganadores ingresada por el Administrador
    public boolean setGanadores (ArrayList <Usuario> usuarios){
        boolean ok = true;
        try {
            this.getGanadores().clear();
            Random rnd = new Random();
            
            for (int i=0; i<this.getCantGanadores(); i++){
                
                this.getGanadores().add(i, usuarios.get(rnd.nextInt(usuarios.size())));
                
            }
        } catch(Exception e) {
            ok = false;
        }
        return ok;
    }
    
    
    //Método que notifica por correo electónico al ganador del sorteo
    public boolean notificarGanador (JFrame padre){
        boolean ok = true;
        try{

         enviarDesdeGMail(this.getGanadores(), "Ganador Sorteo Restar", this.getDescripcion(), padre);

        }catch(Exception e){
            ok = false;
        }
        return ok;
    }
    
    //Método utilizado para notificar ganador del sorteo
    private void enviarDesdeGMail(ArrayList <Usuario> destinatarios, String asunto, String cuerpoMensaje, JFrame ventanaPadre) {
        
        //datos del remitente, cuenta de correo del restaurante (datos fijos)
        String remitente = "assessment.restar@gmail.com";
        String contra = "Obligatorio2IS";
        
        Properties props = System.getProperties();
        String host = "smtp.gmail.com";
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.user", remitente);
        props.put("mail.smtp.password", contra);
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");

        Session sesion = Session.getDefaultInstance(props);
        MimeMessage mensaje = new MimeMessage(sesion);

        try {
            mensaje.setFrom(new InternetAddress(remitente));
            InternetAddress [] direccionesDestino = new InternetAddress [destinatarios.size()];
            
            for (int i=0; i<destinatarios.size(); i++){
                direccionesDestino [i] = new InternetAddress(destinatarios.get(i).getCorreoElectronico() );
            }
            
            for( int i = 0; i < listaGanadores.size(); i++) {
                mensaje.addRecipient(Message.RecipientType.TO, direccionesDestino [i]);
            }
            
            mensaje.setSubject(asunto);
            mensaje.setText(cuerpoMensaje);
            Transport transporte = sesion.getTransport("smtp");
            transporte.connect(host, remitente, contra);
            transporte.sendMessage(mensaje, mensaje.getAllRecipients());
            JOptionPane.showMessageDialog(ventanaPadre, "Éxito al notificar ganador.", "Sorteo", JOptionPane.PLAIN_MESSAGE);
            transporte.close();
        }
        catch (AddressException ae) {
            JOptionPane.showMessageDialog(ventanaPadre, ae.getMessage(), "Error Sorteo", JOptionPane.ERROR_MESSAGE);
        }
        catch (MessagingException me) {
            JOptionPane.showMessageDialog(ventanaPadre, me.getMessage(), "Error Sorteo", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    //Método para Mostrar la Fecha de Realizado del Sorteo según el formato considerado (y en ESPAÑOL)
    public String fechaEspanolSorteo(Calendar fecha){
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        
        int enteroMinuto = fecha.get(Calendar.MINUTE);
        int enteroHora = (fecha.get(Calendar.HOUR)-1);
        int enteroDia = fecha.get(Calendar.DAY_OF_MONTH);
        int enteroMes = fecha.get(Calendar.MONTH);
        int enteroAno = fecha.get(Calendar.YEAR);
        
        String stringMinuto = ""+enteroMinuto;
        String stringHora = ""+enteroHora;
        String stringDia = ""+enteroDia;
        
        if(enteroMinuto<10 && enteroMinuto>=0){
            stringMinuto = "0"+enteroMinuto;
        }
        if(enteroHora<10 && enteroHora>=0){
            stringHora = "0"+enteroHora;
        }
        if(enteroDia<10 && enteroDia>=0){
            stringDia = "0"+enteroDia;
        }
        
        return stringHora+":"+stringMinuto+" de "+meses[enteroMes]+" del "+enteroAno;
    }
    
    @Override
     public String toString (){
         return "<html>SORTEO: "+this.getCantGanadores()+"<bR>Fecha: "+this.fechaEspanolSorteo(this.getFecha())+"<br>GANADOR/ES: "
                 +this.getGanadores()+"<br><br>Descripción: "+this.getDescripcion()+"<br>_______________________________<br><html>";
     }
    
}
