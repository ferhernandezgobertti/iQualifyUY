// Universidad ORT - Uruguay
// Facultad de Ingeniería

// OBLIGATORIO 2 - Ingeniería de Software 1

package Interfaz;

// Autores:
// *Fernando A. Hernández Gobertti (173631) - Ingeniería en Telecomunicaciones
// **Sebastián Effa Gallego (193248) - Ingeniería en Electrónica

// Docente:
// Martín Solari Buela

import Dominio.Comentario;
import Dominio.Sistema;
import Dominio.Restaurante;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JOptionPane;

public class VentanaAgregar extends javax.swing.JFrame {

    public Sistema sistema;
    
    public VentanaAgregar(Sistema system) {
        sistema = system;
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNuevoRestaurante = new javax.swing.JLabel();
        lblNombreRestaurante = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        lblContacto = new javax.swing.JLabel();
        lblApertura = new javax.swing.JLabel();
        lblCierre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtContacto = new javax.swing.JTextField();
        btnAtras = new javax.swing.JButton();
        btnAgregarRestaurante = new javax.swing.JButton();
        btnAyuda = new javax.swing.JButton();
        lblVerificacionContacto = new javax.swing.JLabel();
        lblVerificacionNombre = new javax.swing.JLabel();
        lblVerificacionDireccion = new javax.swing.JLabel();
        lblErrorNombre = new javax.swing.JLabel();
        lblErrorDireccion = new javax.swing.JLabel();
        lblErrorHorarios = new javax.swing.JLabel();
        cmbAperturaHora = new javax.swing.JComboBox<>();
        cmbAperturaMinuto = new javax.swing.JComboBox<>();
        lblErrorContacto = new javax.swing.JLabel();
        lblPuntosCierre = new javax.swing.JLabel();
        lblPuntosApertura = new javax.swing.JLabel();
        cmbCierreMinuto = new javax.swing.JComboBox<>();
        cmbCierreHora = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(380, 530));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        lblNuevoRestaurante.setFont(new java.awt.Font("Luminari", 1, 24)); // NOI18N
        lblNuevoRestaurante.setForeground(new java.awt.Color(255, 0, 0));
        lblNuevoRestaurante.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNuevoRestaurante.setText("Nuevo Restaurante");
        getContentPane().add(lblNuevoRestaurante);
        lblNuevoRestaurante.setBounds(90, 10, 260, 42);

        lblNombreRestaurante.setText("Nombre: (*)");
        getContentPane().add(lblNombreRestaurante);
        lblNombreRestaurante.setBounds(20, 90, 80, 25);

        lblDireccion.setText("Direccion: (*)");
        getContentPane().add(lblDireccion);
        lblDireccion.setBounds(20, 150, 82, 28);

        lblContacto.setText("Contacto: (*)");
        getContentPane().add(lblContacto);
        lblContacto.setBounds(20, 220, 80, 32);

        lblApertura.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblApertura.setText("Apertura (LaV):");
        getContentPane().add(lblApertura);
        lblApertura.setBounds(30, 310, 92, 27);

        lblCierre.setText("Cierre (LaV):");
        getContentPane().add(lblCierre);
        lblCierre.setBounds(30, 360, 92, 30);
        getContentPane().add(txtNombre);
        txtNombre.setBounds(110, 80, 200, 40);
        getContentPane().add(txtDireccion);
        txtDireccion.setBounds(110, 150, 200, 40);
        getContentPane().add(txtContacto);
        txtContacto.setBounds(110, 220, 200, 40);

        btnAtras.setFont(new java.awt.Font("Krungthep", 1, 14)); // NOI18N
        btnAtras.setText("⇐ Atrás");
        btnAtras.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtras);
        btnAtras.setBounds(10, 10, 80, 40);

        btnAgregarRestaurante.setFont(new java.awt.Font("Herculanum", 0, 18)); // NOI18N
        btnAgregarRestaurante.setText("AGREGAR RESTAURANTE");
        btnAgregarRestaurante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarRestauranteActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregarRestaurante);
        btnAgregarRestaurante.setBounds(30, 430, 240, 60);

        btnAyuda.setFont(new java.awt.Font("Herculanum", 0, 24)); // NOI18N
        btnAyuda.setText("?");
        btnAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAyudaActionPerformed(evt);
            }
        });
        getContentPane().add(btnAyuda);
        btnAyuda.setBounds(290, 430, 60, 60);

        lblVerificacionContacto.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        lblVerificacionContacto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVerificacionContacto.setText("☐");
        getContentPane().add(lblVerificacionContacto);
        lblVerificacionContacto.setBounds(320, 220, 20, 30);

        lblVerificacionNombre.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        lblVerificacionNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVerificacionNombre.setText("☐");
        getContentPane().add(lblVerificacionNombre);
        lblVerificacionNombre.setBounds(320, 80, 20, 30);

        lblVerificacionDireccion.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        lblVerificacionDireccion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVerificacionDireccion.setText("☐");
        getContentPane().add(lblVerificacionDireccion);
        lblVerificacionDireccion.setBounds(320, 150, 20, 30);

        lblErrorNombre.setFont(new java.awt.Font("Lucida Grande", 0, 8)); // NOI18N
        lblErrorNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblErrorNombre);
        lblErrorNombre.setBounds(70, 120, 270, 20);

        lblErrorDireccion.setFont(new java.awt.Font("Lucida Grande", 0, 8)); // NOI18N
        lblErrorDireccion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblErrorDireccion);
        lblErrorDireccion.setBounds(70, 190, 280, 20);

        lblErrorHorarios.setFont(new java.awt.Font("Lucida Grande", 0, 8)); // NOI18N
        lblErrorHorarios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblErrorHorarios);
        lblErrorHorarios.setBounds(70, 390, 260, 20);

        cmbAperturaHora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));
        getContentPane().add(cmbAperturaHora);
        cmbAperturaHora.setBounds(150, 310, 72, 27);

        cmbAperturaMinuto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));
        getContentPane().add(cmbAperturaMinuto);
        cmbAperturaMinuto.setBounds(250, 310, 72, 27);

        lblErrorContacto.setFont(new java.awt.Font("Lucida Grande", 0, 8)); // NOI18N
        lblErrorContacto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblErrorContacto);
        lblErrorContacto.setBounds(70, 260, 270, 20);

        lblPuntosCierre.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblPuntosCierre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPuntosCierre.setText(":");
        getContentPane().add(lblPuntosCierre);
        lblPuntosCierre.setBounds(210, 360, 50, 22);

        lblPuntosApertura.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblPuntosApertura.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPuntosApertura.setText(":");
        getContentPane().add(lblPuntosApertura);
        lblPuntosApertura.setBounds(210, 310, 50, 22);

        cmbCierreMinuto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));
        getContentPane().add(cmbCierreMinuto);
        cmbCierreMinuto.setBounds(250, 360, 72, 27);

        cmbCierreHora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));
        getContentPane().add(cmbCierreHora);
        cmbCierreHora.setBounds(150, 360, 72, 27);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo_Menu_opt_VentanaAgregar.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(255, 0, 0)));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 380, 510);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        ControlVentanas.volverAlMenuPrincipal(this, sistema);
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnAgregarRestauranteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarRestauranteActionPerformed
        if(!txtNombre.getText().equals("") && !txtDireccion.getText().equals("") && !txtContacto.getText().equals("")){
            agregarRestaurante();
        } else {
            JOptionPane.showMessageDialog(this, "Existen campos sin rellenar. Por favor verifique el ingreso de todos los CAMPOS OBLIGATORIOS (*)");
        }
    }//GEN-LAST:event_btnAgregarRestauranteActionPerformed

    private void btnAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAyudaActionPerformed
        String mensaje = "UN RESTAURANTE MÁS PARA LA COLECCIÓN! \n\nRellene los espacios para registrar un Restaurante"
                + "\nLos campos (*) son OBLIGATORIOS";
        JOptionPane.showMessageDialog(this, mensaje);
    }//GEN-LAST:event_btnAyudaActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        ControlVentanas.salirPrograma(this, sistema);
    }//GEN-LAST:event_formWindowClosing

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarRestaurante;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnAyuda;
    private javax.swing.JComboBox<String> cmbAperturaHora;
    private javax.swing.JComboBox<String> cmbAperturaMinuto;
    private javax.swing.JComboBox<String> cmbCierreHora;
    private javax.swing.JComboBox<String> cmbCierreMinuto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblApertura;
    private javax.swing.JLabel lblCierre;
    private javax.swing.JLabel lblContacto;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblErrorContacto;
    private javax.swing.JLabel lblErrorDireccion;
    private javax.swing.JLabel lblErrorHorarios;
    private javax.swing.JLabel lblErrorNombre;
    private javax.swing.JLabel lblNombreRestaurante;
    private javax.swing.JLabel lblNuevoRestaurante;
    private javax.swing.JLabel lblPuntosApertura;
    private javax.swing.JLabel lblPuntosCierre;
    private javax.swing.JLabel lblVerificacionContacto;
    private javax.swing.JLabel lblVerificacionDireccion;
    private javax.swing.JLabel lblVerificacionNombre;
    private javax.swing.JTextField txtContacto;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

    private void agregarRestaurante(){
        String nombre = txtNombre.getText();
        String direccion = txtDireccion.getText();
        String contacto = txtContacto.getText();
        int horaAbierto = cmbAperturaHora.getSelectedIndex();
        int horaCerrado = cmbCierreHora.getSelectedIndex();
        boolean correcto = ControlVentanas.verificarIngresoRestaurante(contacto, horaAbierto, horaCerrado, lblErrorContacto, lblVerificacionContacto, lblErrorHorarios);
        if (correcto){
            Calendar abierto = Calendar.getInstance();
            abierto.set(Calendar.HOUR_OF_DAY, horaAbierto);
            abierto.set(Calendar.MINUTE, cmbAperturaMinuto.getSelectedIndex());
            
            Calendar cerrado = Calendar.getInstance();
            cerrado.set(Calendar.HOUR_OF_DAY, horaCerrado);
            cerrado.set(Calendar.MINUTE, cmbCierreMinuto.getSelectedIndex());
            
            ArrayList <Comentario> listaComentarios = new ArrayList <Comentario>();
            Restaurante unRestaurante = new Restaurante(nombre, direccion, contacto, abierto, cerrado, 0, listaComentarios);
            boolean unico = ControlVentanas.verificarRepeticionRestaurante(sistema, unRestaurante, lblErrorNombre, lblVerificacionNombre, lblErrorDireccion, lblVerificacionDireccion);
            if (!unico){
                sistema.getListaRestaurantes().add(unRestaurante);
                JOptionPane.showMessageDialog(this, "INGRESO CORRECTO");
                this.setVisible(false);
                VentanaPrincipal ventanaNueva = new VentanaPrincipal(sistema);
                ventanaNueva.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "El Restaurante ya existe. Ingrese nuevamente por favor");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Ingreso Incorrecto. Verifique lo digitado por favor");
        }
    }
    
}
