/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package CapaPresentacion.PaginaPrincipal.Ventanas.VentanasProductos;
import CapaDatos.Almacen.datosUnidadProducto;
import CapaLogica.Almacen.conexionUnidadProducto;
import CapaLogica.ExpresionesRegulares;
import CapaPresentacion.PaginaPrincipal.Ventanas.Ventana_Inventario;
import static CapaPresentacion.PaginaPrincipal.Ventanas.Ventana_Inventario.accionUnidad;
import static CapaPresentacion.PaginaPrincipal.Ventanas.Ventana_Inventario.IdUnidad;
import static CapaPresentacion.PaginaPrincipal.main.Principal.containerVentanas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import static CapaPresentacion.PaginaPrincipal.main.Principal.inventario;
import java.text.DecimalFormat;
import javax.swing.JComponent;
/**
 *
 * @author KENNY
 */
public class VentanaRegistroUnidad extends javax.swing.JFrame {
    int xMouse,  yMouse;
    ExpresionesRegulares expresiones= new ExpresionesRegulares();
    /**
     * Creates new form VentanaRegistroUnidad
     */
    public VentanaRegistroUnidad() {
        initComponents();
        centrarPantalla();
        IniciarId();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        vent_Inicial_Productos1 = new CapaPresentacion.PaginaPrincipal.Ventanas.VentanasProductos.Vent_Inicial_Productos();
        Header = new javax.swing.JPanel();
        btnExit = new javax.swing.JPanel();
        txtExit = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cajaNombreUnidad = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cajaId = new javax.swing.JTextField();
        CajaCantidadUnidades = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        Header.setBackground(new java.awt.Color(255, 255, 255));
        Header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                HeaderMouseDragged(evt);
            }
        });
        Header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                HeaderMousePressed(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(255, 255, 255));

        txtExit.setBackground(new java.awt.Color(255, 255, 255));
        txtExit.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        txtExit.setForeground(new java.awt.Color(0, 0, 0));
        txtExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtExit.setText("X");
        txtExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtExitMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnExitLayout = new javax.swing.GroupLayout(btnExit);
        btnExit.setLayout(btnExitLayout);
        btnExitLayout.setHorizontalGroup(
            btnExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtExit, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
        );
        btnExitLayout.setVerticalGroup(
            btnExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtExit, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Registro Unidades");

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Roboto Medium", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre:");

        cajaNombreUnidad.setBackground(new java.awt.Color(255, 255, 255));
        cajaNombreUnidad.setFont(new java.awt.Font("Roboto Medium", 1, 24)); // NOI18N
        cajaNombreUnidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaNombreUnidadActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Roboto Medium", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Id:");

        cajaId.setEditable(false);
        cajaId.setBackground(new java.awt.Color(255, 255, 255));
        cajaId.setFont(new java.awt.Font("Roboto Medium", 1, 24)); // NOI18N
        cajaId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaIdActionPerformed(evt);
            }
        });

        CajaCantidadUnidades.setBackground(new java.awt.Color(255, 255, 255));
        CajaCantidadUnidades.setFont(new java.awt.Font("Roboto Medium", 1, 24)); // NOI18N
        CajaCantidadUnidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CajaCantidadUnidadesActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Roboto Medium", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Unidades:");

        btnGuardar.setBackground(new java.awt.Color(0, 0, 0));
        btnGuardar.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/disquete.png"))); // NOI18N
        btnGuardar.setText("GUARDAR");
        btnGuardar.setBorderPainted(false);
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.setFocusPainted(false);
        btnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGuardarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGuardarMouseExited(evt);
            }
        });
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(0, 0, 0));
        btnEliminar.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/eliminar-carpeta.png"))); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.setBorderPainted(false);
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.setFocusPainted(false);
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEliminarMouseExited(evt);
            }
        });
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout vent_Inicial_Productos1Layout = new javax.swing.GroupLayout(vent_Inicial_Productos1);
        vent_Inicial_Productos1.setLayout(vent_Inicial_Productos1Layout);
        vent_Inicial_Productos1Layout.setHorizontalGroup(
            vent_Inicial_Productos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(vent_Inicial_Productos1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(vent_Inicial_Productos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(vent_Inicial_Productos1Layout.createSequentialGroup()
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(vent_Inicial_Productos1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CajaCantidadUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(vent_Inicial_Productos1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cajaId, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(vent_Inicial_Productos1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cajaNombreUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        vent_Inicial_Productos1Layout.setVerticalGroup(
            vent_Inicial_Productos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vent_Inicial_Productos1Layout.createSequentialGroup()
                .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(vent_Inicial_Productos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cajaId, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(vent_Inicial_Productos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cajaNombreUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(vent_Inicial_Productos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CajaCantidadUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(vent_Inicial_Productos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(vent_Inicial_Productos1, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(vent_Inicial_Productos1, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtExitMouseClicked
        dispose();
    }//GEN-LAST:event_txtExitMouseClicked

    private void txtExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtExitMouseEntered
        btnExit.setBackground(Color.red);
        txtExit.setForeground(Color.white);
    }//GEN-LAST:event_txtExitMouseEntered

    private void txtExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtExitMouseExited
        btnExit.setBackground(Color.white);
        txtExit.setForeground(Color.black);
    }//GEN-LAST:event_txtExitMouseExited

    private void HeaderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderMouseDragged
        int x = evt.getXOnScreen();//esto captura en todo momento donde se encuentra la ventana
        int y = evt.getYOnScreen();
        // este evento es cuando arrastramos la ventana por la pantalla
        this.setLocation(x-xMouse,y- yMouse);
    }//GEN-LAST:event_HeaderMouseDragged

    private void HeaderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderMousePressed
        xMouse = evt.getX(); //me da la posicion en el eje X de la ventana
        yMouse = evt.getY();//me da la posicion en el eje Y de la ventana
    }//GEN-LAST:event_HeaderMousePressed

    private void cajaNombreUnidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaNombreUnidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaNombreUnidadActionPerformed

    private void cajaIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaIdActionPerformed

    private void CajaCantidadUnidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CajaCantidadUnidadesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CajaCantidadUnidadesActionPerformed

    private void btnGuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseEntered
        btnGuardar.setBackground(new Color(255,255,255));
        btnGuardar.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_btnGuardarMouseEntered

    private void btnGuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseExited

        btnGuardar.setBackground(new Color(0,0,0));
        btnGuardar.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_btnGuardarMouseExited

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if(cajaNombreUnidad.getText().length()==0) {//esta vacio
            JOptionPane.showConfirmDialog(null, "Ingrese nombre del producto","VENTANA DE INFORMACIÓN", JOptionPane.CLOSED_OPTION, JOptionPane.INFORMATION_MESSAGE);
            cajaNombreUnidad.requestFocus();
            return;
        }
        
         if(!expresiones.validarNombreUnidad(cajaNombreUnidad.getText())){
            JOptionPane.showConfirmDialog(null, "Ingrese Nombre de unidad correcto","VENTANA DE INFORMACIÓN", JOptionPane.CLOSED_OPTION, JOptionPane.INFORMATION_MESSAGE);
            cajaNombreUnidad.requestFocus();
            return;
        } 
        
        if(CajaCantidadUnidades.getText().length()==0) {//esta vacio
            JOptionPane.showConfirmDialog(null, "Ingrese cantidad en unidades","VENTANA DE INFORMACIÓN", JOptionPane.CLOSED_OPTION, JOptionPane.INFORMATION_MESSAGE);
            cajaNombreUnidad.requestFocus();
            return;
        }
        
        if(!expresiones.validarCantidadUnidades(CajaCantidadUnidades.getText())){
            JOptionPane.showConfirmDialog(null, "Ingrese una cantidad correcta","VENTANA DE INFORMACIÓN", JOptionPane.CLOSED_OPTION, JOptionPane.INFORMATION_MESSAGE);
            CajaCantidadUnidades.requestFocus();
            return;
        } 
        
        
        datosUnidadProducto datos = new datosUnidadProducto();
        conexionUnidadProducto fun = new conexionUnidadProducto();
        
        datos.setIdUnidad(cajaId.getText());
        datos.setNombreUnidad(cajaNombreUnidad.getText());
        datos.setCantidadEnUnidades(Integer.parseInt(CajaCantidadUnidades.getText()));
        

        if(accionUnidad=="crear"){
            fun.registrarDatos(datos);
            JOptionPane.showConfirmDialog(null, "Unidad creada","VENTANA DE INFORMACIÓN", JOptionPane.CLOSED_OPTION, JOptionPane.INFORMATION_MESSAGE);

        } else {
            fun.editarDatos(datos);
            JOptionPane.showConfirmDialog(null, "Unidad editada","VENTANA DE INFORMACIÓN", JOptionPane.CLOSED_OPTION, JOptionPane.INFORMATION_MESSAGE);

        }
        accionUnidad="guardar";
        
        
        inventario= new Ventana_Inventario();
                setForm(inventario);  

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseEntered
        btnEliminar.setBackground(new Color(255,255,255));
        btnEliminar.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_btnEliminarMouseEntered

    private void btnEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseExited
        btnEliminar.setBackground(new Color(0,0,0));
        btnEliminar.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_btnEliminarMouseExited

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        datosUnidadProducto datos= new datosUnidadProducto();
        conexionUnidadProducto fun = new conexionUnidadProducto();

        if (fun.verificarRegistroExistente(cajaId.getText())==1){
            int confirmacion = JOptionPane.showConfirmDialog(rootPane, "Desea eliminar la Unidad?","Confirmar",2);
            if(confirmacion==0){
                datos.setIdUnidad(cajaId.getText());
                fun.eliminarDatos(datos);
                JOptionPane.showConfirmDialog(null, "Unidad eliminada","VENTANA DE INFORMACIÓN", JOptionPane.CLOSED_OPTION, JOptionPane.INFORMATION_MESSAGE);
                dispose();
                inventario= new Ventana_Inventario();
                setForm(inventario);  
            }
        }
        else {

            JOptionPane.showConfirmDialog(null, "No existe la unidad","VENTANA DE INFORMACIÓN", JOptionPane.CLOSED_OPTION, JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_btnEliminarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistroUnidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistroUnidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistroUnidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistroUnidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaRegistroUnidad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CajaCantidadUnidades;
    private javax.swing.JPanel Header;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JPanel btnExit;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JTextField cajaId;
    private javax.swing.JTextField cajaNombreUnidad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel txtExit;
    private CapaPresentacion.PaginaPrincipal.Ventanas.VentanasProductos.Vent_Inicial_Productos vent_Inicial_Productos1;
    // End of variables declaration//GEN-END:variables
    private void centrarPantalla() {
        Dimension tamanioVentana = getSize();
        Dimension tamanioPantalla = Toolkit.getDefaultToolkit().getScreenSize();
        int ejeX = (tamanioPantalla.width-tamanioVentana.width) / 2;
        int ejeY = (tamanioPantalla.height-tamanioVentana.height) / 2;
        
        setLocation(ejeX, ejeY);
    }

       private void setForm(JComponent com){
                   containerVentanas.removeAll();
                    containerVentanas.add(com); ///TENER CUIDADO CON ESTO O MODIFICARLO, REVISAR BIEN, ES PARA VOLVER A PINTAR LAS VENTANAS EN CASO DE MODIFICACIONES
                    containerVentanas.repaint();
                    containerVentanas.revalidate();
    
    }
       
       
       private void IniciarId() {
       

          if (IdUnidad =="") {
            generarID();
        } else {
            conexionUnidadProducto fun = new conexionUnidadProducto();
            datosUnidadProducto registro = fun.devolverDatos(IdUnidad);

            if(registro!= null) {
                cajaId.setText(registro.getIdUnidad());
                cajaNombreUnidad.setText(registro.getNombreUnidad());
                CajaCantidadUnidades.setText(String.valueOf(registro.getCantidadEnUnidades()));
            }
        }
        IdUnidad="";

    }
       
       private void generarID(){
        conexionUnidadProducto fun= new conexionUnidadProducto();
        DecimalFormat formato = new DecimalFormat("000000");
        cajaId.setText(formato.format(fun.generarIdUnidad()));
    }
}
