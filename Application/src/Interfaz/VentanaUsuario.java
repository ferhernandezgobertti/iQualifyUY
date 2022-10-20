// Universidad ORT - Uruguay
// Facultad de Ingeniería

// OBLIGATORIO 2 - Ingeniería de Software 1

package Interfaz;

// Autores:
// *Fernando A. Hernández Gobertti (173631) - Ingeniería en Telecomunicaciones
// **Sebastián Effa Gallego (193248) - Ingeniería en Electrónica

// Docente:
// Martín Solari Buela

import Dominio.Sistema;
import Dominio.Usuario;
import javax.swing.JOptionPane;

public class VentanaUsuario extends javax.swing.JFrame {

    public Sistema sistema;
    
    public VentanaUsuario(Sistema system) {
        sistema = system;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        lblUsuario = new javax.swing.JLabel();
        txtNombreUsuario = new javax.swing.JTextField();
        lblNombreUsuario = new javax.swing.JLabel();
        txtCorreoElectronico = new javax.swing.JTextField();
        lblCorreoElectronico = new javax.swing.JLabel();
        rdBtnRegistrar = new javax.swing.JRadioButton();
        rdBtnIngresar = new javax.swing.JRadioButton();
        btnAceptar = new javax.swing.JButton();
        btnAyuda = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        lblVerificacionCorreo = new javax.swing.JLabel();
        lblVerificacionNombre = new javax.swing.JLabel();
        lblErrorCorreo = new javax.swing.JLabel();
        lblErrorNombre = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(280, 445));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        lblUsuario.setFont(new java.awt.Font("Luminari", 1, 24)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(255, 0, 0));
        lblUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsuario.setText("Usuario");
        getContentPane().add(lblUsuario);
        lblUsuario.setBounds(70, 10, 210, 40);
        getContentPane().add(txtNombreUsuario);
        txtNombreUsuario.setBounds(30, 80, 207, 50);

        lblNombreUsuario.setText("Nombre de Usuario: (*)");
        getContentPane().add(lblNombreUsuario);
        lblNombreUsuario.setBounds(40, 60, 160, 16);
        getContentPane().add(txtCorreoElectronico);
        txtCorreoElectronico.setBounds(30, 170, 207, 47);

        lblCorreoElectronico.setText("Correo Electrónico: (*)");
        getContentPane().add(lblCorreoElectronico);
        lblCorreoElectronico.setBounds(30, 150, 160, 16);

        buttonGroup1.add(rdBtnRegistrar);
        rdBtnRegistrar.setText("Registrar Usuario");
        getContentPane().add(rdBtnRegistrar);
        rdBtnRegistrar.setBounds(60, 240, 140, 23);

        buttonGroup1.add(rdBtnIngresar);
        rdBtnIngresar.setText("Ingresar Usuario");
        getContentPane().add(rdBtnIngresar);
        rdBtnIngresar.setBounds(60, 280, 135, 23);

        btnAceptar.setBackground(new java.awt.Color(255, 255, 255));
        btnAceptar.setFont(new java.awt.Font("Herculanum", 0, 18)); // NOI18N
        btnAceptar.setText("ACEPTAR");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAceptar);
        btnAceptar.setBounds(30, 330, 170, 50);

        btnAyuda.setFont(new java.awt.Font("Herculanum", 1, 24)); // NOI18N
        btnAyuda.setText("?");
        btnAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAyudaActionPerformed(evt);
            }
        });
        getContentPane().add(btnAyuda);
        btnAyuda.setBounds(210, 330, 50, 50);

        btnAtras.setFont(new java.awt.Font("Krungthep", 1, 12)); // NOI18N
        btnAtras.setText("⇐ Atrás");
        btnAtras.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtras);
        btnAtras.setBounds(10, 10, 70, 40);

        lblVerificacionCorreo.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        lblVerificacionCorreo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVerificacionCorreo.setText("☐");
        getContentPane().add(lblVerificacionCorreo);
        lblVerificacionCorreo.setBounds(240, 180, 20, 30);

        lblVerificacionNombre.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        lblVerificacionNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVerificacionNombre.setText("☐");
        getContentPane().add(lblVerificacionNombre);
        lblVerificacionNombre.setBounds(240, 80, 20, 30);

        lblErrorCorreo.setFont(new java.awt.Font("Lucida Grande", 0, 8)); // NOI18N
        lblErrorCorreo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblErrorCorreo);
        lblErrorCorreo.setBounds(10, 220, 260, 20);

        lblErrorNombre.setFont(new java.awt.Font("Lucida Grande", 0, 8)); // NOI18N
        lblErrorNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblErrorNombre);
        lblErrorNombre.setBounds(30, 130, 200, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo_Menu_opt_VentanaUsuario.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(255, 0, 51)));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 280, 420);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        if(!txtNombreUsuario.getText().equals("") && !txtCorreoElectronico.getText().equals("")){
            if (!rdBtnIngresar.isSelected() && !rdBtnRegistrar.isSelected()) {
                JOptionPane.showMessageDialog(this, "Disculpe, debe seleccionar si desea REGISTRARSE o INGRESAR al Sistema", "ADVERTENCIA", 2);
            } else {
                String nombre = txtNombreUsuario.getText();
                String correo = txtCorreoElectronico.getText();
                boolean ingresoCorrecto = ControlVentanas.verificarIngresoUsuario(correo, lblErrorCorreo, lblVerificacionCorreo);
                if (ingresoCorrecto){
                    Usuario unUsuario = new Usuario (nombre, correo);
                    System.out.println("\n"+sistema.getListaUsuarios()+"\n");
                    System.out.println("\n"+unUsuario+"\n");
                    System.out.println("\n"+sistema.contieneUsuario(unUsuario)+"\n");
                    System.out.println("\n"+sistema.getListaUsuarios().indexOf(unUsuario)+"\n");
                    if (rdBtnRegistrar.isSelected()){
                        //System.out.println(sistema.getListaUsuarios());
                        registrarUsuario(unUsuario);
                    } 
                    if (rdBtnIngresar.isSelected()){
                        ingresarUsuario(unUsuario);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Ingreso Incorrecto. Ingrese un Correo Electrónico correcto por favor.");
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Existen campos sin rellenar. Por favor verifique que ingreso su Nombre y Correo Electrónico");
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAyudaActionPerformed
        String mensaje = "FORME PARTE DE LA FAMILIA! \n\nRellene los campos siguientes y seleccione si desea REGISTRAR o INGRESAR su Usuario"
                + "\nLos campos (*) son OBLIGATORIOS";
        JOptionPane.showMessageDialog(this, mensaje);
    }//GEN-LAST:event_btnAyudaActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        ControlVentanas.salirPrograma(this, sistema);
    }//GEN-LAST:event_formWindowClosing

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        ControlVentanas.volverAlMenuPrincipal(this, sistema);
    }//GEN-LAST:event_btnAtrasActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnAyuda;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblCorreoElectronico;
    private javax.swing.JLabel lblErrorCorreo;
    private javax.swing.JLabel lblErrorNombre;
    private javax.swing.JLabel lblNombreUsuario;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JLabel lblVerificacionCorreo;
    private javax.swing.JLabel lblVerificacionNombre;
    private javax.swing.JRadioButton rdBtnIngresar;
    private javax.swing.JRadioButton rdBtnRegistrar;
    private javax.swing.JTextField txtCorreoElectronico;
    private javax.swing.JTextField txtNombreUsuario;
    // End of variables declaration//GEN-END:variables

    private void registrarUsuario(Usuario unUsuario){
        boolean ingresoRepetido = ControlVentanas.verificarRepeticionUsuario(sistema, unUsuario, lblErrorNombre, lblVerificacionNombre, lblErrorCorreo, lblVerificacionCorreo);
        if(!ingresoRepetido){
            sistema.getListaUsuarios().add(unUsuario);
            JOptionPane.showMessageDialog(this, "REGISTRO CORRECTO");
            System.out.println("\n"+sistema.getListaUsuarios().toString());
            sistema.setUsuarioActual(unUsuario);
            sistema.setUsuarioRegistrado(true);
            this.setVisible(false);
            VentanaPrincipal ventanaNueva = new VentanaPrincipal(sistema);
            ventanaNueva.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "ATENCIÓN: El Usuario ya existe. No puede poseer más de un Usuario.");
        }
    }
    
    private void ingresarUsuario (Usuario unUsuario){
        boolean ingresoRepetido = ControlVentanas.verificarRepeticionUsuario(sistema, unUsuario, lblErrorNombre, lblVerificacionNombre, lblErrorCorreo, lblVerificacionCorreo);
        if(ingresoRepetido){
            sistema.setUsuarioActual(unUsuario);
            JOptionPane.showMessageDialog(this, "INGRESO CORRECTO como Usuario "+unUsuario.getNombre());
            sistema.setUsuarioRegistrado(true);
            this.setVisible(false);
            VentanaPrincipal ventanaNueva = new VentanaPrincipal(sistema);
            ventanaNueva.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "ATENCIÓN: El Usuario NO EXISTE como para ingresar al Sistema. Primero debe REGISTRARLO.");
        }
        
    }
}
