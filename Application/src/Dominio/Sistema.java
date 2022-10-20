// Universidad ORT - Uruguay
// Facultad de Ingeniería

// OBLIGATORIO 2 - Ingeniería de Software 1

package Dominio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Observable;

// Autores:
// *Fernando A. Hernández Gobertti (173631) - Ingeniería en Telecomunicaciones
// **Sebastián Effa Gallego (193248) - Ingeniería en Electrónica

// Docente:
// Martín Solari Buela

public class Sistema extends Observable implements Serializable{
    
     //Atributos de la clase Sistema
    private ArrayList<Restaurante> listaRestaurantes;
    private ArrayList<Usuario> listaUsuarios;
    private ArrayList<Sorteo> listaSorteos;
    private boolean hayGanadores;
    private boolean usuarioRegistrado;
    private Usuario usuarioActual;
    private Restaurante restauranteSeleccionado;
    
    //Constructor Sin Parámetros de la Clase Sistema
    public Sistema() {
        listaRestaurantes = new ArrayList<Restaurante>();
        listaUsuarios = new ArrayList<Usuario>();
        listaSorteos = new ArrayList<Sorteo>();
        usuarioActual = new Usuario();
    }
    
    //Métodos de Acceso y Modificación de la clase Sistema
    public ArrayList<Restaurante> getListaRestaurantes() {
        return listaRestaurantes;
    }

    public void setListaRestaurantes(ArrayList<Restaurante> listaRestaurant) {
        this.listaRestaurantes = listaRestaurant;
    }
    
    public ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(ArrayList<Usuario> listaUser) {
        this.listaUsuarios = listaUser;
    }
    
    public ArrayList<Sorteo> getListaSorteos() {
        return listaSorteos;
    }

    public void setListaSorteos(ArrayList<Sorteo> listaSort) {
        this.listaSorteos = listaSort;
    }
    
    public boolean isHayGanadores(){
        return hayGanadores;
    }
    
    public void setHayGanadores(boolean siHayGanadores){
        this.hayGanadores = siHayGanadores;
    }
    
    public boolean isUsuarioRegistrado (){
        return usuarioRegistrado;
    }
    
    public void setUsuarioRegistrado(boolean siUsuarioRegistrado){
        this.usuarioRegistrado = siUsuarioRegistrado;
    }
    
    public Usuario getUsuarioActual(){
        return usuarioActual;
    }
    
    public void setUsuarioActual(Usuario unUsuarioActual){
        this.usuarioActual = unUsuarioActual;
    }
    
    public Restaurante getRestauranteSeleccionado(){
        return restauranteSeleccionado;
    }
    
    public void setRestauranteSeleccionado(Restaurante unRestauranteSeleccionado){
        this.restauranteSeleccionado = unRestauranteSeleccionado;
    }
    
    public boolean isNumeroEntero(String mensaje){
        boolean esNumeroEntero;
        try{
            esNumeroEntero = true;
            int numero = Integer.parseInt(mensaje);
        } catch(Exception e){
            esNumeroEntero = false;
        }
        return esNumeroEntero;
    }
    
    //Método creado para Verificar si ya se encuentra unRestaurante en la Lista de Restaurantes de Sistema (POR BUG DE MÉTODO CONTAINS)
    public boolean contieneRestaurante (Restaurante unRestaurante){
        boolean ok = false;    
        for(int i=0; i<this.getListaRestaurantes().size(); i++){
            if(this.getListaRestaurantes().get(i).equals(unRestaurante)){
                ok = true;
                break;
            }
        }
        return ok;
    }
    
    //Método creado para Verificar si ya se encuentra unUsuario en la Lista de Usuarios de Sistema (POR BUG DE MÉTODO CONTAINS)
    public boolean contieneUsuario (Usuario unUsuario){
        boolean ok = false;    
        for(int i=0; i<this.getListaUsuarios().size(); i++){
            if(this.getListaUsuarios().get(i).equals(unUsuario)){
                ok = true;
                break;
            }
        }
        return ok;
    }
    
}
