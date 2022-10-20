// Universidad ORT - Uruguay
// Facultad de Ingeniería

// OBLIGATORIO 2 - Ingeniería de Software 1

package Dominio;

// Autores:
// *Fernando A. Hernández Gobertti (173631) - Ingeniería en Telecomunicaciones
// **Sebastián Effa Gallego (193248) - Ingeniería en Electrónica

// Docente:
// Martín Solari Buela

import Interfaz.VentanaPrincipal;

public class Obligatorio2IS {

    public static void main(String[] args) {
        Sistema system = new Sistema();
        system = ControlArchivos.leerSistema();
        VentanaPrincipal ventanaNueva = new VentanaPrincipal (system);
        ventanaNueva.setVisible(true);
    }
    
}
