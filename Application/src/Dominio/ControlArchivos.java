// Universidad ORT - Uruguay
// Facultad de Ingeniería

// OBLIGATORIO 2 - Ingeniería de Software 1

package Dominio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

// Autores:
// *Fernando A. Hernández Gobertti (173631) - Ingeniería en Telecomunicaciones
// **Sebastián Effa Gallego (193248) - Ingeniería en Electrónica

// Docente:
// Martín Solari Buela

public class ControlArchivos {

//Método para Guardar el Sistema al Salir del Programa Correctamente
    public static boolean guardarSistema (Sistema system) {
        boolean guardadoCorrecto = false;
        try {
            File archivo = new File("datosSistema");
            ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(archivo.getAbsolutePath()));
            Usuario usuarioPredeterminado = new Usuario();
            system.setUsuarioRegistrado(false);
            system.setUsuarioActual(usuarioPredeterminado);
            salida.writeObject(system);
            salida.close();
            guardadoCorrecto = true;
            System.out.println("\nGUARDADO CORRECTO\n");
              
        } catch (Exception e) {}
        return guardadoCorrecto;
    }
    
//Método para Cargar el Sistema desde un archivo fijo al comenzar la aplicación
    public static Sistema leerSistema (){
        Sistema system = new Sistema();
        try {
            File archivo = new File("datosSistema");
            if(archivo.exists()){
                ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(archivo.getAbsolutePath()));
                system = (Sistema)entrada.readObject();
                entrada.close();
            }
        } catch (Exception e) {}
        return system;
    }
    
}
