// Universidad ORT - Uruguay
// Facultad de Ingeniería

// OBLIGATORIO 2 - Ingeniería de Software 1

package Dominio;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

// Autores:
// *Fernando A. Hernández Gobertti (173631) - Ingeniería en Telecomunicaciones
// **Sebastián Effa Gallego (193248) - Ingeniería en Electrónica

// Docente:
// Martín Solari Buela

public class Comentario implements Serializable{
    
    //Atributos de la clase Comentario
    private Usuario usuario;
    private String descripcionComentario;
    private Calendar fechaComentario;
    private int calificacion;
    
    //Constructor Sin Parámetros de la Clase Comentario
    public Comentario() {
        this.setDescripcion("Sin descripción definida");
        this.setCalificacion(0);
    }
    
    //Constructor Con Parámetros de la Clase Comentario
    public Comentario(Usuario unUsuario, String unDescripcion, Calendar unFechaComentario, int unCalificacion){
        this.setUsuario(unUsuario);
        this.setDescripcion(unDescripcion);
        this.setFecha(unFechaComentario);
        this.setCalificacion(unCalificacion);
    }
    
    //Métodos de la clase Comentario
    public Usuario getUsuario(){
        return usuario;
    }
    
    public void setUsuario (Usuario unUsuario){
        this.usuario = unUsuario;
    }
    
    public String getDescripcion(){
        return descripcionComentario;
    }
    
    public void setDescripcion (String unDescripcion){
        this.descripcionComentario = unDescripcion;
    }
    
    public Calendar getFecha(){
        return fechaComentario;
    }
    
    public void setFecha (Calendar unFecha){
        this.fechaComentario = unFecha;
    }

    public int getCalificacion(){
        return calificacion;
    }
    
    public void setCalificacion (int unCalificacion){
        this.calificacion = unCalificacion;
    }
    
    //Método para Contar la Cantidad de Palabras del String mensaje, con aplicación de limitar la Descripción del Comentario ingresado
    public int contarPalabras (String mensaje){
        
        int palabras = 0;
        
        for(int contador = 0; contador<mensaje.length(); contador++){
            if(mensaje.charAt(contador) == ' '){
                palabras++;
            }
        }
        
        return palabras;
    }
    
    //Método para Mostrar la Fecha de Realizado del Comentario según el formato considerado (y en ESPAÑOL)
    public String fechaEspanolComentario(Calendar fecha){
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
         return "<html>CALIFICACION: "+this.getCalificacion()+"<br>Realizado por: Usuario "+this.getUsuario().getNombre()+"<br>Fecha: "+this.fechaEspanolComentario(this.getFecha())+""
                 +"<br><br>Comentario: "+this.getDescripcion()+"<br>__________________________________<br>"+"<html>";
     }
    
}
