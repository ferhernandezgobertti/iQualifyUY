// Universidad ORT - Uruguay
// Facultad de Ingeniería

// OBLIGATORIO 2 - Ingeniería de Software 1

package Dominio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;

// Autores:
// *Fernando A. Hernández Gobertti (173631) - Ingeniería en Telecomunicaciones
// **Sebastián Effa Gallego (193248) - Ingeniería en Electrónica

// Docente:
// Martín Solari Buela

public class Restaurante implements Serializable, Comparable<Restaurante>{
    
    //Atributos de la clase Restaurante
    private String nombreRestaurante, direccion, contacto;
    private Calendar horarioApertura, horarioCierre;
    private int calificacion;
    private ArrayList <Comentario> listaComentarios;
    
    //Constructor Sin Parámetros de la Clase Restaurante
    public Restaurante() {
        this.setNombre ("Sin nombre");
        this.setDireccion("Sin dirección");
        this.setContacto("Sin contacto");
        this.setCalificacion(0);
    }
    
    //Constructor Con Parámetros de la Clase Restaurante
    public Restaurante(String nombre, String direccion, String contacto, Calendar horarioApertura, Calendar horarioCierre, int calificacion, ArrayList <Comentario> listaComentarios){
        this.setNombre(nombre);
        this.setDireccion(direccion);
        this.setContacto(contacto);
        this.setHorarioApertura(horarioApertura);
        this.setHorarioCierre(horarioCierre);
        this.setCalificacion(calificacion);
        this.setListaComentarios(listaComentarios);
    }
    
    //Métodos de la clase Restaurante
    public String getNombre(){
        return nombreRestaurante;
    }
    
    public void setNombre (String unNombre){
        this.nombreRestaurante = unNombre;
    }

    public String getDireccion(){
        return direccion;
    }
    
    public void setDireccion (String unDireccion){
        this.direccion = unDireccion;
    }

    public String getContacto(){
        return contacto;
    }
    
    public void setContacto (String unContacto){
        this.contacto = unContacto;
    }

    public Calendar getHorarioApertura(){
        return horarioApertura;
    }
    
    public void setHorarioApertura(Calendar unHorarioApertura){
        this.horarioApertura = unHorarioApertura;
    }

    public Calendar getHorarioCierre(){
        return horarioCierre;
    }
    
    public void setHorarioCierre(Calendar unHorarioCierre){
        this.horarioCierre = unHorarioCierre;
    }
    
    public int getCalificacion(){
        return calificacion;
    }
    
    public void setCalificacion(int unCalificacion){
        this.calificacion = unCalificacion;
    }
    
    public ArrayList<Comentario> getListaComentarios() {
        return listaComentarios;
    }

    public void setListaComentarios(ArrayList<Comentario> listaComentarios) {
        this.listaComentarios = listaComentarios;
    }
    
    public int realizarPromedioCalificaciones(){
        int promedio = 0;
        int contador = 0;
        int cantidadRestaurantes = this.getListaComentarios().size();
        while(contador<=cantidadRestaurantes-1){
            promedio = promedio + this.getListaComentarios().get(contador).getCalificacion();
            contador++;
        }
        return promedio/cantidadRestaurantes;
    }
    
    public void editarInformacionRestaurante(Restaurante restauranteActualizado){
        this.setNombre(restauranteActualizado.getNombre());
        this.setDireccion(restauranteActualizado.getDireccion());
        this.setHorarioApertura(restauranteActualizado.getHorarioApertura());
        this.setHorarioCierre(restauranteActualizado.getHorarioCierre());
        this.setContacto(restauranteActualizado.getContacto());
    }
    
    public String mostrarEstrellasCalificacion(int calificacion){
        String estrellas = "0";
        if(calificacion>=1){
            estrellas = "★";
            if(calificacion>=2){
                estrellas = estrellas + "★";
                if(calificacion>=3){
                    estrellas = estrellas + "★";
                    if(calificacion>=4){
                        estrellas = estrellas + "★";
                        if(calificacion>=5){
                            estrellas = estrellas + "★";
                        }
                    }
                }
            }
        }
        return estrellas;
    }
    
     @Override
     public String toString (){
         return "Nombre: "+this.getNombre()+"      Calificación: "+this.mostrarEstrellasCalificacion(this.getCalificacion());
     }
    
      //Redefinición del Método equals
    public boolean equals(Restaurante o){
        boolean ok = this.getNombre().equals(o.getNombre()) || this.getDireccion().equals(o.getDireccion());
        return ok;
    }
    
    //ORDEN NATURAL
    @Override
    public int compareTo(Restaurante unRestaurante){
        return this.getNombre().compareTo(unRestaurante.getNombre());
    }
    
}
