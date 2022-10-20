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
import Dominio.Sorteo;
import java.util.Calendar;
import javax.swing.JOptionPane;

public class VentanaSorteo extends javax.swing.JFrame {

    public Sistema sistema;
    
    public VentanaSorteo(Sistema system) {
        sistema = system;
        initComponents();
        habilitarSorteo(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHistorialSorteos = new javax.swing.JLabel();
        btnAtras = new javax.swing.JButton();
        lblNuevoSorteo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcionSorteo = new javax.swing.JTextArea();
        lblCantidadGanadores = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstSorteos = new javax.swing.JList<>();
        chkAdministrador = new javax.swing.JCheckBox();
        btnSorteo = new javax.swing.JButton();
        btnAyuda = new javax.swing.JButton();
        lblDescripcion = new javax.swing.JLabel();
        txtCantidadGanadores = new javax.swing.JTextField();
        lblErrorSorteo = new javax.swing.JLabel();
        lblFondoVentanaSorteo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 23, 570, 450));
        setMinimumSize(new java.awt.Dimension(620, 490));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        lblHistorialSorteos.setFont(new java.awt.Font("Luminari", 1, 24)); // NOI18N
        lblHistorialSorteos.setForeground(new java.awt.Color(255, 0, 51));
        lblHistorialSorteos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHistorialSorteos.setText("Historial de Sorteos");
        getContentPane().add(lblHistorialSorteos);
        lblHistorialSorteos.setBounds(310, 30, 280, 50);

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

        lblNuevoSorteo.setFont(new java.awt.Font("Luminari", 1, 24)); // NOI18N
        lblNuevoSorteo.setForeground(new java.awt.Color(255, 0, 51));
        lblNuevoSorteo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNuevoSorteo.setText("Nuevo Sorteo");
        getContentPane().add(lblNuevoSorteo);
        lblNuevoSorteo.setBounds(10, 60, 250, 40);

        txtDescripcionSorteo.setColumns(20);
        txtDescripcionSorteo.setRows(5);
        jScrollPane1.setViewportView(txtDescripcionSorteo);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 200, 260, 130);

        lblCantidadGanadores.setText("Cantidad de Ganadores:");
        getContentPane().add(lblCantidadGanadores);
        lblCantidadGanadores.setBounds(20, 130, 150, 16);

        jScrollPane2.setViewportView(lstSorteos);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(310, 80, 280, 350);

        chkAdministrador.setFont(new java.awt.Font("Herculanum", 0, 14)); // NOI18N
        chkAdministrador.setText("Soy el Administrador");
        chkAdministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAdministradorActionPerformed(evt);
            }
        });
        getContentPane().add(chkAdministrador);
        chkAdministrador.setBounds(50, 340, 200, 23);

        btnSorteo.setFont(new java.awt.Font("Herculanum", 0, 18)); // NOI18N
        btnSorteo.setText("REALIZAR SORTEO");
        btnSorteo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSorteoActionPerformed(evt);
            }
        });
        getContentPane().add(btnSorteo);
        btnSorteo.setBounds(20, 380, 190, 50);

        btnAyuda.setFont(new java.awt.Font("Herculanum", 0, 18)); // NOI18N
        btnAyuda.setText("?");
        btnAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAyudaActionPerformed(evt);
            }
        });
        getContentPane().add(btnAyuda);
        btnAyuda.setBounds(220, 380, 50, 50);

        lblDescripcion.setText("Descripción:");
        getContentPane().add(lblDescripcion);
        lblDescripcion.setBounds(20, 180, 90, 16);
        getContentPane().add(txtCantidadGanadores);
        txtCantidadGanadores.setBounds(180, 120, 80, 40);

        lblErrorSorteo.setFont(new java.awt.Font("Lucida Grande", 0, 8)); // NOI18N
        lblErrorSorteo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblErrorSorteo);
        lblErrorSorteo.setBounds(20, 430, 260, 30);

        lblFondoVentanaSorteo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/background_Menu_opt_VentanaRestaurante.png"))); // NOI18N
        lblFondoVentanaSorteo.setText("jLabel1");
        lblFondoVentanaSorteo.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(255, 0, 51)));
        getContentPane().add(lblFondoVentanaSorteo);
        lblFondoVentanaSorteo.setBounds(0, 0, 620, 470);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        ControlVentanas.volverAlMenuPrincipal(this, sistema);
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAyudaActionPerformed
        String mensaje = "A REGALAR SE HA DICHO! \n\nSírvase de observar el HISTORIAL de Sorteos pasados"
                + "\n\nEs usted el Administrador? En ese caso sírvase también de realizar un NUEVO SORTEO rellenando los campos correspondientes";
        JOptionPane.showMessageDialog(this, mensaje);
    }//GEN-LAST:event_btnAyudaActionPerformed

    private void btnSorteoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSorteoActionPerformed
        if(chkAdministrador.isEnabled()){
            realizarSorteo();
        } else {
            JOptionPane.showMessageDialog(this, "Disculpe: el ADMINISTRADOR es el único que puede REALIZAR SORTEOS");
        }
    }//GEN-LAST:event_btnSorteoActionPerformed

    private void chkAdministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAdministradorActionPerformed
        if (chkAdministrador.isSelected()){
            habilitarSorteo(true);
            JOptionPane.showMessageDialog(this, "Se ha autentificado como el ADMINISTRADOR");
        } else {
            habilitarSorteo(false);
        }
    }//GEN-LAST:event_chkAdministradorActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        ControlVentanas.salirPrograma(this, sistema);
    }//GEN-LAST:event_formWindowClosing

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnAyuda;
    private javax.swing.JButton btnSorteo;
    private javax.swing.JCheckBox chkAdministrador;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCantidadGanadores;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblErrorSorteo;
    private javax.swing.JLabel lblFondoVentanaSorteo;
    private javax.swing.JLabel lblHistorialSorteos;
    private javax.swing.JLabel lblNuevoSorteo;
    private javax.swing.JList<String> lstSorteos;
    private javax.swing.JTextField txtCantidadGanadores;
    private javax.swing.JTextArea txtDescripcionSorteo;
    // End of variables declaration//GEN-END:variables

    private void realizarSorteo(){
    
        if(!txtCantidadGanadores.getText().equals("") && !txtDescripcionSorteo.getText().equals("")){
            if(sistema.isNumeroEntero(txtCantidadGanadores.getText())){
                int cantidad = Integer.parseInt(txtCantidadGanadores.getText());
                if(cantidad<=sistema.getListaUsuarios().size()){
                    String descripcion = txtDescripcionSorteo.getText();
                    boolean ingresoCorrecto = ControlVentanas.verificarIngresoSorteo(sistema.getListaUsuarios(), cantidad, lblErrorSorteo);
                    if (ingresoCorrecto){
                        Calendar fecha = Calendar.getInstance();
                        Sorteo nuevoSorteo = new Sorteo(descripcion, fecha, cantidad);
                        boolean sorteoCorrecto = nuevoSorteo.setGanadores(sistema.getListaUsuarios());
                        if(sorteoCorrecto){
                            String mensajeGanadores = "SORTEO REALIZADO!\n\n"+nuevoSorteo.toString();
                            JOptionPane.showMessageDialog(this, mensajeGanadores);
                            sistema.getListaSorteos().add(nuevoSorteo);
                            boolean mailCorrecto = nuevoSorteo.notificarGanador(this);
                            if(mailCorrecto){
                                JOptionPane.showMessageDialog(this, "ADMINISTRADOR: \nENVÍO del Mail REALIZADO");
                                ControlVentanas.agregarAListaSorteos(lstSorteos, sistema.getListaSorteos());
                            } else {
                                JOptionPane.showMessageDialog(this, "ADMINISTRADOR: \nENVÍO del Mail FALLIDO");
                            }
                        } else {
                            JOptionPane.showMessageDialog(this, "ADMINISTRADOR: \nCREACIÓN INCORRECTA del Sorteo");
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "ADMINISTRADOR: \nEl Sorteo NO se pudo realizar.");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "ADMINISTRADOR: \n No posee tantos Usuarios como para realizar ese Sorteo");
                }
            } else {
            JOptionPane.showMessageDialog(this, "ADMINISTRADOR: \n Recuerde ingresar un NÚMERO en Cantidad de Ganadores");
            }
        } else {
            JOptionPane.showMessageDialog(this, "ADMINISTRADOR: \nExisten campos vacíos en el SORTEO que busque realizar. Por favor verifique");
        }
    }
    
    private void habilitarSorteo(boolean habilitado){
    
        txtCantidadGanadores.setEnabled(habilitado);
        txtDescripcionSorteo.setEnabled(habilitado);
        
    }
    

}
