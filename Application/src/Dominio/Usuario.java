// Universidad ORT - Uruguay
// Facultad de Ingeniería

// OBLIGATORIO 2 - Ingeniería de Software 1

package Dominio;

// Autores:

import java.io.Serializable;

// *Fernando A. Hernández Gobertti (173631) - Ingeniería en Telecomunicaciones
// **Sebastián Effa Gallego (193248) - Ingeniería en Electrónica

// Docente:
// Martín Solari Buela

public class Usuario implements Serializable{
    
    //Atributos de la clase Usuario
    private String nombreUsuario, correoElectronico;
    
    //Constructor Sin Parámetros de la Clase Usuario
    public Usuario() {
        this.setNombre("Invitado");
        this.setCorreoElectronico("Sin correo");
    }
    
    //Constructor Con Parámetros de la Clase Usuario
    public Usuario(String nombre, String correo){
        this.setNombre(nombre);
        this.setCorreoElectronico(correo);
    }
    
    //Métodos de Acceso y Modificación de la clase Usuario
    public String getNombre(){
        return nombreUsuario;
    }
    
    public void setNombre (String unNombre){
        this.nombreUsuario = unNombre;
    }
    
    public String getCorreoElectronico(){
        return correoElectronico;
    }
    
    public void setCorreoElectronico (String unCorreo){
        this.correoElectronico = unCorreo;
    }
    
    @Override
     public String toString (){
         return "Usuario: "+this.getNombre()+".\tCorreo Electrónico: "+this.getCorreoElectronico();
     }
     
     //Redefinición del Método equals
    public boolean equals(Usuario o){
        boolean ok = this.getNombre().equals(o.getNombre()) || this.getCorreoElectronico().equals(o.getCorreoElectronico());
        return ok;
    }
    
}
