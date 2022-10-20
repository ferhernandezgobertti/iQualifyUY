// Universidad ORT - Uruguay
// Facultad de Ingeniería

// OBLIGATORIO 2 - Ingeniería de Software 1

package Interfaz;

import Dominio.Comentario;
import Dominio.ControlArchivos;
import Dominio.Restaurante;
import Dominio.Sistema;
import Dominio.Sorteo;
import Dominio.Usuario;
import java.awt.Color;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;

// Autores:
// *Fernando A. Hernández Gobertti (173631) - Ingeniería en Telecomunicaciones
// **Sebastián Effa Gallego (193248) - Ingeniería en Electrónica

// Docente:
// Martín Solari Buela

public class ControlVentanas {
    
    public static void salirPrograma(JFrame ventanaActual, Sistema sistema){
        boolean salir = ControlVentanas.salir(ventanaActual, "Está seguro que desea Salir del Programa?");
        if (salir){
            ControlArchivos.guardarSistema(sistema);
            ventanaActual.setVisible(false);
            System.exit(0);
        }
    }
    
//Método ejecutado al cerrar una ventana o al abandonar el programa en el Menu Principal
    public static boolean salir(JFrame ventana, String mensaje) {
        Object[] opciones = {"Aceptar", "Cancelar"};
        int eleccion = JOptionPane.showOptionDialog(ventana, mensaje, null, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
        //int eleccion = JOptionPane.showConfirmDialog(ventana, mensaje, "ADVERTENCIA", JOptionPane.YES_NO_OPTION);
        return eleccion==JOptionPane.YES_OPTION;
    }
    
//Método para volver al Menu Principal (al estar en una ventana diferente a la VentanaPrincipal)
    public static void volverAlMenuPrincipal (JFrame ventanaActual, Sistema sistema){
        boolean salir = ControlVentanas.salir(ventanaActual, "¿Está seguro que desea volver al Menú Principal? \nSu ingreso actual será eliminado");
        if(salir){
            ventanaActual.setVisible(false);
            VentanaPrincipal ventanaNueva = new VentanaPrincipal(sistema);
            ventanaNueva.setVisible(true);
        }
    }
    
//Método para verificar y reaccionar al INGRESO de un NUEVO RESTAURANTE
    public static boolean verificarIngresoRestaurante(String contacto, int horaAbierto, int horaCerrado, JLabel lblErrorContacto, JLabel lblVerificacionContacto, JLabel lblErrorHorarios){
        boolean ingresoCorrecto = false;
        if(contacto.contains("@")){
            StringTokenizer direccionContacto = new StringTokenizer(contacto, "@");
            direccionContacto.nextToken();
            if(direccionContacto.nextToken().contains(".")){
                lblErrorContacto.setText("Contacto Correcto");
                lblErrorContacto.setForeground(Color.green);
                lblVerificacionContacto.setText("✓");
                lblVerificacionContacto.setForeground(Color.green);
                ingresoCorrecto = true;
            } 
        }
        if(!ingresoCorrecto) {
            lblErrorContacto.setText("Contacto Inválido");
            lblErrorContacto.setForeground(Color.red);
            lblVerificacionContacto.setText("✘");
            lblVerificacionContacto.setForeground(Color.red);
        }
        if(horaAbierto<horaCerrado){
            lblErrorHorarios.setText("Horario Correcto");
            lblErrorHorarios.setForeground(Color.green);
        } else {
            lblErrorHorarios.setText("Horario Inválido");
            lblErrorHorarios.setForeground(Color.red);            
        }
        return ingresoCorrecto&&horaAbierto<horaCerrado;
    }
    
    public static boolean verificarYAccion(boolean condicionAVerificar, JLabel error, JLabel verificar, String mensajeCorrecto, String mensajeIncorrecto){
    
        boolean verificado = false;
        
        if (!condicionAVerificar){
            error.setText(mensajeCorrecto);
            error.setForeground(Color.green);
            verificar.setText("✓");
            verificar.setForeground(Color.green);
        } else {
            error.setText(mensajeIncorrecto);
            error.setForeground(Color.red);
            verificar.setText("✘");
            verificar.setForeground(Color.red);
            verificado = true;
        }
        
        return verificado;
    }
    
//Método para verificar y reaccionar al INGRESO de un RESTAURANTE YA EXISTENTE
    public static boolean verificarRepeticionRestaurante(Sistema sistema, Restaurante unRestaurante, JLabel lblErrorNombre, JLabel lblVerificacionNombre, JLabel lblErrorDireccion, JLabel lblVerificacionDireccion){
        boolean unicidadNombre = false;
        boolean unicidadDireccion = false;
        
        Restaurante soloNombre = new Restaurante ();
        soloNombre.setNombre(unRestaurante.getNombre());
        
        unicidadNombre = verificarYAccion(sistema.contieneRestaurante(soloNombre), lblErrorNombre, lblVerificacionNombre, "Nombre Correcto", "Nombre Inválido");
        
        Restaurante soloDireccion = new Restaurante();
        soloDireccion.setDireccion(unRestaurante.getDireccion());
        
        unicidadDireccion = verificarYAccion(sistema.contieneRestaurante(soloDireccion), lblErrorDireccion, lblVerificacionDireccion, "Dirección Correcta", "Dirección Inválida");
        
        return unicidadNombre&&unicidadDireccion;
    }
    
//Método para verificar y reaccionar al INGRESO de un NUEVO USUARIO
    public static boolean verificarIngresoUsuario(String correoElectronico, JLabel lblErrorCorreoElectronico, JLabel lblVerificacionCorreoElectronico){
        boolean ingresoCorrecto = false;
        if(correoElectronico.contains("@")){
            StringTokenizer direccionCorreo = new StringTokenizer(correoElectronico, "@");
            direccionCorreo.nextToken();
            if(direccionCorreo.nextToken().contains(".")){
                ingresoCorrecto = true;
                lblErrorCorreoElectronico.setText("Correo Electrónico Correcto");
                lblErrorCorreoElectronico.setForeground(Color.green);
                lblVerificacionCorreoElectronico.setText("✓");
                lblVerificacionCorreoElectronico.setForeground(Color.green);
            }
        }
            if(!ingresoCorrecto){
                lblErrorCorreoElectronico.setText("Correo Electrónico Inválido (Formato correo@direccion.terminacion)");
                lblErrorCorreoElectronico.setForeground(Color.red);
                ingresoCorrecto = false;
                lblVerificacionCorreoElectronico.setText("✘");
                lblVerificacionCorreoElectronico.setForeground(Color.red);
            }
        return ingresoCorrecto;
    }
    
//Método para verificar y reaccionar al INGRESO de un USUARIO YA REGISTRADO
    public static boolean verificarRepeticionUsuario(Sistema sistema, Usuario unUsuario, JLabel lblErrorNombre, JLabel lblVerificacionNombre, JLabel lblErrorCorreoElectronico, JLabel lblVerificacionCorreoElectronico){
        boolean repeticionNombre = false;
        boolean repeticionCorreo = false;
        Usuario soloNombre = new Usuario ();
        soloNombre.setNombre(unUsuario.getNombre());
        
        repeticionNombre = verificarYAccion(sistema.contieneUsuario(soloNombre), lblErrorNombre, lblVerificacionNombre, "Nombre Correcto", "Nombre Inválido: Ya lo posee otro Usuario");
        
        Usuario soloCorreoElectronico = new Usuario();
        soloCorreoElectronico.setCorreoElectronico(unUsuario.getCorreoElectronico());
        
        repeticionCorreo = verificarYAccion(sistema.contieneUsuario(soloCorreoElectronico), lblErrorCorreoElectronico, lblVerificacionCorreoElectronico, "Correo Electrónico Correcto", "Correo Inválido: Ya lo posee otro Usuario");
        
        return repeticionNombre&&repeticionCorreo;
    }
    
//Método para verificar y reaccionar al INGRESO de un NUEVO SORTEO por parte del Administrador
    public static boolean verificarIngresoSorteo(ArrayList <Usuario> listaUsuarios, int cantidadGanadores, JLabel lblErrorSorteo){
        boolean ingresoCorrecto = true;
        if(cantidadGanadores<=listaUsuarios.size() && cantidadGanadores>0){
            lblErrorSorteo.setText("Sorteo Realizado Correctamente");
            lblErrorSorteo.setForeground(Color.green);
        } else {
            lblErrorSorteo.setText("Sorteo Imposible de Realizar. Cantidad de Ganadores Inválida.");
            lblErrorSorteo.setForeground(Color.red);
            ingresoCorrecto = false;
        }
    return ingresoCorrecto;
    }

//Método para desplegar las Estrellas correspondientes a un Restaurante determinado pre-seleccionado
    public static void seteoEstrellasRestaurante(JLabel lblEstrella1, JLabel lblEstrella2, JLabel lblEstrella3, JLabel lblEstrella4, JLabel lblEstrella5, Restaurante unRestaurante) {
        if(unRestaurante.getCalificacion()>=1){
            lblEstrella1.setForeground(Color.yellow);
            if(unRestaurante.getCalificacion()>=2){
                lblEstrella2.setForeground(Color.yellow);
                if(unRestaurante.getCalificacion()>=3){
                    lblEstrella3.setForeground(Color.yellow);
                    if(unRestaurante.getCalificacion()>=4){
                        lblEstrella4.setForeground(Color.yellow);
                        if(unRestaurante.getCalificacion()>=5){
                            lblEstrella5.setForeground(Color.yellow);
                        }
                    }
                }
            }
        }
    }

    public static void agregarAListaRestaurantes(JList lista, ArrayList<Restaurante> listaRestaurantes) {
        int contador = 0;
        int tamanoArrayList = listaRestaurantes.size();
        String[] aAgregar = new String[tamanoArrayList];
        lista.setListData(aAgregar);
        while(contador<=tamanoArrayList-1){
            aAgregar[contador] = listaRestaurantes.get(contador).toString();
            contador++;
        }
        lista.setListData(aAgregar);
    }
    
    public static void agregarAListaSorteos(JList lista, ArrayList<Sorteo> listaSorteos) {
        int contador = 0;
        int tamanoArrayList = listaSorteos.size();
        String[] aAgregar = new String[tamanoArrayList];
        while(contador<=tamanoArrayList-1){
            aAgregar[contador] = listaSorteos.get(contador).toString();
            contador++;
        }
        lista.setListData(aAgregar);
    }
    
    public static void agregarAListaComentarios (JList lista, ArrayList<Comentario> listaComentarios) {
        int contador = 0;
        int tamanoArrayList = listaComentarios.size();
        String[] aAgregar = new String[tamanoArrayList];
        while(contador<=tamanoArrayList-1){
            aAgregar[contador] = listaComentarios.get(contador).toString();
            contador++;
        }
        lista.setListData(aAgregar);
    }

    public static ArrayList<Restaurante> filtrarListaRestaurante(ArrayList<Restaurante> listaRestaurantes, String filtro) {
        int contador = 0;
        ArrayList<Restaurante> listaFiltrada = new ArrayList<Restaurante>();
        while(contador <= listaRestaurantes.size()-1){                          //Alternativamente: con Método Collections.binarySearch(listaRestaurantes, filtro)
            if(listaRestaurantes.get(contador).getNombre().contains(filtro)){
                listaFiltrada.add(listaRestaurantes.get(contador));
            }
            contador++;
        }
        return listaFiltrada;
    }
    
}
