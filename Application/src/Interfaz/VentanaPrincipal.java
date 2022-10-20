// Universidad ORT - Uruguay
// Facultad de Ingeniería

// OBLIGATORIO 2 - Ingeniería de Software 1

package Interfaz;

// Autores:
// *Fernando A. Hernández Gobertti (173631) - Ingeniería en Telecomunicaciones
// **Sebastián Effa Gallego (193248) - Ingeniería en Electrónica

// Docente:
// Martín Solari Buela

import Dominio.Restaurante;
import Dominio.Sistema;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.*;

public class VentanaPrincipal extends javax.swing.JFrame {
    
    public Sistema sistema;
    private ArrayList<Restaurante> listaFiltrado = new ArrayList<Restaurante>();
    private boolean filtrado;
    
    public VentanaPrincipal(Sistema system) {
        sistema = system;
        initComponents();
        seteoVentanaPrincipal();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        lblListaRestaurantes = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstRestaurantes = new javax.swing.JList<>();
        btnSeleccionarRestaurante = new javax.swing.JButton();
        btnBuscarSorteo = new javax.swing.JButton();
        btnAgregarRestaurante = new javax.swing.JButton();
        btnRegistrarUsuario = new javax.swing.JButton();
        btnOrdenarLista = new javax.swing.JButton();
        rdBtnPorCalificaciones = new javax.swing.JRadioButton();
        rdBtnAlfabeticamente = new javax.swing.JRadioButton();
        btnAyuda = new javax.swing.JButton();
        lblUsuario = new javax.swing.JLabel();
        lblCalidadUsuario = new javax.swing.JLabel();
        lblListaRestaurantes1 = new javax.swing.JLabel();
        lblImagenEstrella = new javax.swing.JLabel();
        lblImagenLogo = new javax.swing.JLabel();
        txtFiltro = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnCerrarSesion = new javax.swing.JButton();
        pnlFondoVentanaPrincipal = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setBounds(new java.awt.Rectangle(300, 100, 750, 770));
        setMinimumSize(new java.awt.Dimension(750, 770));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        lblListaRestaurantes.setFont(new java.awt.Font("Marker Felt", 1, 72)); // NOI18N
        lblListaRestaurantes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblListaRestaurantes.setText("R E S T A R");
        getContentPane().add(lblListaRestaurantes);
        lblListaRestaurantes.setBounds(190, 80, 400, 70);

        jScrollPane1.setViewportView(lstRestaurantes);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(90, 260, 300, 350);

        btnSeleccionarRestaurante.setFont(new java.awt.Font("Herculanum", 0, 18)); // NOI18N
        btnSeleccionarRestaurante.setText("SELECCIONAR RESTAURANTE");
        btnSeleccionarRestaurante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarRestauranteActionPerformed(evt);
            }
        });
        getContentPane().add(btnSeleccionarRestaurante);
        btnSeleccionarRestaurante.setBounds(90, 640, 450, 53);

        btnBuscarSorteo.setFont(new java.awt.Font("Herculanum", 0, 18)); // NOI18N
        btnBuscarSorteo.setText("<html> BUSCAR SORTEO");
        btnBuscarSorteo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBuscarSorteo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarSorteoActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscarSorteo);
        btnBuscarSorteo.setBounds(440, 310, 218, 56);

        btnAgregarRestaurante.setFont(new java.awt.Font("Herculanum", 0, 18)); // NOI18N
        btnAgregarRestaurante.setText("AGREGAR RESTAURANTE");
        btnAgregarRestaurante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarRestauranteActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregarRestaurante);
        btnAgregarRestaurante.setBounds(440, 390, 218, 60);

        btnRegistrarUsuario.setFont(new java.awt.Font("Herculanum", 0, 18)); // NOI18N
        btnRegistrarUsuario.setText("REGISTRAR/INGRESAR USUARIO");
        btnRegistrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrarUsuario);
        btnRegistrarUsuario.setBounds(410, 240, 280, 53);

        btnOrdenarLista.setFont(new java.awt.Font("Herculanum", 0, 18)); // NOI18N
        btnOrdenarLista.setText("ORDENAR LISTA");
        btnOrdenarLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarListaActionPerformed(evt);
            }
        });
        getContentPane().add(btnOrdenarLista);
        btnOrdenarLista.setBounds(440, 560, 218, 55);

        buttonGroup1.add(rdBtnPorCalificaciones);
        rdBtnPorCalificaciones.setText("Ordenar por Calificaciones");
        getContentPane().add(rdBtnPorCalificaciones);
        rdBtnPorCalificaciones.setBounds(440, 520, 199, 23);

        buttonGroup1.add(rdBtnAlfabeticamente);
        rdBtnAlfabeticamente.setText("Ordenar Alfabéticamente");
        getContentPane().add(rdBtnAlfabeticamente);
        rdBtnAlfabeticamente.setBounds(440, 480, 188, 23);

        btnAyuda.setFont(new java.awt.Font("Herculanum", 0, 24)); // NOI18N
        btnAyuda.setText("?");
        btnAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAyudaActionPerformed(evt);
            }
        });
        getContentPane().add(btnAyuda);
        btnAyuda.setBounds(560, 640, 96, 53);

        lblUsuario.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        lblUsuario.setText("Usuario:");
        getContentPane().add(lblUsuario);
        lblUsuario.setBounds(560, 170, 69, 30);

        lblCalidadUsuario.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        lblCalidadUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCalidadUsuario.setText("Invitado");
        getContentPane().add(lblCalidadUsuario);
        lblCalidadUsuario.setBounds(610, 170, 80, 30);

        lblListaRestaurantes1.setFont(new java.awt.Font("Luminari", 1, 18)); // NOI18N
        lblListaRestaurantes1.setText("Lista de Restaurantes:");
        getContentPane().add(lblListaRestaurantes1);
        lblListaRestaurantes1.setBounds(90, 190, 193, 36);

        lblImagenEstrella.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Estrella_opt.png"))); // NOI18N
        getContentPane().add(lblImagenEstrella);
        lblImagenEstrella.setBounds(590, 60, 100, 100);

        lblImagenLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo_Restaurante_opt.jpg"))); // NOI18N
        getContentPane().add(lblImagenLogo);
        lblImagenLogo.setBounds(90, 70, 100, 80);
        getContentPane().add(txtFiltro);
        txtFiltro.setBounds(90, 220, 250, 40);

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo_Lupa_opt.jpg"))); // NOI18N
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar);
        btnBuscar.setBounds(340, 220, 50, 42);

        btnCerrarSesion.setFont(new java.awt.Font("Herculanum", 0, 12)); // NOI18N
        btnCerrarSesion.setText("Cerrar Sesión");
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });
        getContentPane().add(btnCerrarSesion);
        btnCerrarSesion.setBounds(420, 170, 130, 30);

        pnlFondoVentanaPrincipal.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.MatteBorder(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Food_Logo_opt.jpg"))), javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(255, 0, 0)))); // NOI18N
        getContentPane().add(pnlFondoVentanaPrincipal);
        pnlFondoVentanaPrincipal.setBounds(0, 0, 760, 750);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSeleccionarRestauranteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarRestauranteActionPerformed
        if(sistema.getListaRestaurantes().isEmpty()){
            JOptionPane.showMessageDialog(this, "Por favor, ingrese primero un Restaurante");
        } else {
            if(!filtrado){
                sistema.setRestauranteSeleccionado(sistema.getListaRestaurantes().get(lstRestaurantes.getSelectedIndex()));
            } else {
                sistema.setRestauranteSeleccionado(listaFiltrado.get(lstRestaurantes.getSelectedIndex()));
            }
            VentanaRestaurante ventanaNuevaRestaurante = new VentanaRestaurante(sistema);
            ventanaNuevaRestaurante.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_btnSeleccionarRestauranteActionPerformed

    private void btnBuscarSorteoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarSorteoActionPerformed
        VentanaSorteo ventanaNuevaSorteo = new VentanaSorteo(sistema);
        ventanaNuevaSorteo.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBuscarSorteoActionPerformed

    private void btnAgregarRestauranteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarRestauranteActionPerformed
        VentanaAgregar ventanaNuevaAgregar = new VentanaAgregar(sistema);
        ventanaNuevaAgregar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAgregarRestauranteActionPerformed

    private void btnOrdenarListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarListaActionPerformed
        ordenarListaRestaurante();
    }//GEN-LAST:event_btnOrdenarListaActionPerformed

    private void btnRegistrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarUsuarioActionPerformed
        VentanaUsuario ventanaNuevaUsuario = new VentanaUsuario(sistema);
        ventanaNuevaUsuario.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRegistrarUsuarioActionPerformed

    private void btnAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAyudaActionPerformed
        String mensaje = "BIENVENIDO A RESTAR! \n\nLe presentamos el Menu Principal. Por favor, sírvase de: "
                + "\n_SELECCIONAR un Restaurante y presionar su correspondiente botón para poder CALIFICARLO o ver su HISTORIAL"
                + "\n_AGREGAR un nuevo Restaurante al presioinar la opción 'Agregar Restaurante'"
                + "\nAUTENTIFICARSE en el Sistema al presionar 'Registrar/Ingresar Usuario' "
                + "\n_Ver los SORTEOS pasados (o realizar NUEVOS) al presionar 'Buscar Sorteo'"
                + "\n_ORDENAR la Lista de Restaurantes según las calificaciones especificadas"
                + "\n\nMuchas Gracias Por Elegirnos!!!...";
        JOptionPane.showMessageDialog(this, mensaje);
    }//GEN-LAST:event_btnAyudaActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        ControlVentanas.salirPrograma(this, sistema);
    }//GEN-LAST:event_formWindowClosing

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        listaFiltrado = ControlVentanas.filtrarListaRestaurante(sistema.getListaRestaurantes(), txtFiltro.getText());
        ControlVentanas.agregarAListaRestaurantes(lstRestaurantes, listaFiltrado);
        filtrado = true;
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        int opcion = JOptionPane.showConfirmDialog(this, "Desea CERRAR su SESIÓN?", "ADVERTENCIA", JOptionPane.YES_NO_OPTION);
        if (opcion == JOptionPane.YES_OPTION){
            sistema.setUsuarioRegistrado(false);
            this.setVisible(false);
            VentanaPrincipal nuevaVentana = new VentanaPrincipal(sistema);
            nuevaVentana.setVisible(true);
        }
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarRestaurante;
    private javax.swing.JButton btnAyuda;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBuscarSorteo;
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnOrdenarLista;
    private javax.swing.JButton btnRegistrarUsuario;
    private javax.swing.JButton btnSeleccionarRestaurante;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCalidadUsuario;
    private javax.swing.JLabel lblImagenEstrella;
    private javax.swing.JLabel lblImagenLogo;
    private javax.swing.JLabel lblListaRestaurantes;
    private javax.swing.JLabel lblListaRestaurantes1;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JList<String> lstRestaurantes;
    private javax.swing.JPanel pnlFondoVentanaPrincipal;
    private javax.swing.JRadioButton rdBtnAlfabeticamente;
    private javax.swing.JRadioButton rdBtnPorCalificaciones;
    private javax.swing.JTextField txtFiltro;
    // End of variables declaration//GEN-END:variables

    private void seteoVentanaPrincipal(){
        pnlFondoVentanaPrincipal.setBackground(Color.WHITE);
        filtrado = false;
        if(sistema.isUsuarioRegistrado()){
            lblCalidadUsuario.setText(sistema.getUsuarioActual().getNombre());
        }
        if(sistema.getListaRestaurantes().isEmpty()){
            String[] mensajeListaVacia = {"Sin restaurantes ingresados"};
            lstRestaurantes.setListData(mensajeListaVacia);
        } else {
            ControlVentanas.agregarAListaRestaurantes(lstRestaurantes, sistema.getListaRestaurantes());
        //  lstRestaurantes.setListData(sistema.getListaRestaurantes().toArray(new String[0]));
        }
        if(sistema.isUsuarioRegistrado()){
            btnRegistrarUsuario.setEnabled(false);
            btnRegistrarUsuario.setBackground(Color.GRAY);
            btnCerrarSesion.setVisible(true);
        } else {
            btnRegistrarUsuario.setEnabled(true);
            btnRegistrarUsuario.setBackground(Color.WHITE);
            btnCerrarSesion.setVisible(false);
        }
        
        
    }
    
    private void ordenarListaRestaurante(){
        if(!sistema.getListaRestaurantes().isEmpty()){
                if (rdBtnAlfabeticamente.isSelected()){
                    Collections.sort(sistema.getListaRestaurantes());
                    ControlVentanas.agregarAListaRestaurantes(lstRestaurantes, sistema.getListaRestaurantes());
                    rdBtnAlfabeticamente.setSelected(false);
                    txtFiltro.setText("");
                }
                else {
                    if (rdBtnPorCalificaciones.isSelected()){
                        Comparator<Restaurante> comparator = new Comparator<Restaurante>(){
                            @Override
                            public int compare(Restaurante o1, Restaurante o2){
                                return o1.getCalificacion() - o2.getCalificacion();
                            }
                        };
                    Collections.sort(sistema.getListaRestaurantes(), comparator);
                    ControlVentanas.agregarAListaRestaurantes(lstRestaurantes, sistema.getListaRestaurantes());
                    rdBtnPorCalificaciones.setSelected(false);
                    txtFiltro.setText("");
                } else {
                    JOptionPane.showMessageDialog(this, "Por favor, seleccione primero un Criterio de Ordenamiento");
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "La Lista de Restaurantes está vacía! Disculpe las molestias");
        }
    }
    

}
