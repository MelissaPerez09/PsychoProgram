/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pro;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author imarg
 */
public class nuevo extends javax.swing.JFrame {

    /**
     * Creates new form nuevo
     */
    public nuevo() {
        initComponents();
                 getContentPane().setBackground(new Color(255,255,255));
        

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        triste = new javax.swing.JLabel();
        Feliz = new javax.swing.JLabel();
        Enojado = new javax.swing.JLabel();
        jbtriste = new javax.swing.JButton();
        jbenojado = new javax.swing.JButton();
        jbfeliz = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        fielporque = new javax.swing.JTextField();
        jregistrar = new javax.swing.JButton();
        jbmodificar = new javax.swing.JButton();
        jbeliminar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        fielfecha = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        fielrevisar = new javax.swing.JTextField();
        importante = new javax.swing.JLabel();
        jbbuscar = new javax.swing.JButton();
        emocion = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        jLabel4.setText("jLabel4");

        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(102, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.pink);

        jLabel1.setBackground(new java.awt.Color(255, 153, 255));
        jLabel1.setFont(new java.awt.Font("Candara Light", 1, 48)); // NOI18N
        jLabel1.setText("Diario Emocional");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Por favor indica como te sientes el día de hoy....");

        triste.setForeground(new java.awt.Color(240, 240, 240));
        triste.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/feliz.jpg"))); // NOI18N
        triste.setText("jLabel3");

        Feliz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/triste.jpg"))); // NOI18N
        Feliz.setText("jLabel3");

        Enojado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/enojado.jpg"))); // NOI18N
        Enojado.setText("jLabel3");

        jbtriste.setBackground(new java.awt.Color(155, 246, 255));
        jbtriste.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtriste.setText("Triste");
        jbtriste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtristeActionPerformed(evt);
            }
        });

        jbenojado.setBackground(new java.awt.Color(255, 198, 255));
        jbenojado.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbenojado.setText("Enojado");
        jbenojado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbenojadoActionPerformed(evt);
            }
        });

        jbfeliz.setBackground(new java.awt.Color(253, 255, 182));
        jbfeliz.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbfeliz.setText("Feliz");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText("Puedes indicar el porque de tus emociones :");

        jregistrar.setBackground(new java.awt.Color(202, 255, 191));
        jregistrar.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jregistrar.setText("Registrar");
        jregistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jregistrarActionPerformed(evt);
            }
        });

        jbmodificar.setBackground(new java.awt.Color(189, 178, 255));
        jbmodificar.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbmodificar.setText("Modificar");

        jbeliminar.setBackground(new java.awt.Color(160, 196, 255));
        jbeliminar.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbeliminar.setText("Eliminar");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setText("Ingresa la fecha del dia de hoy:");

        fielfecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fielfechaActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("Ingresa la fecha para revisar el registro:");

        importante.setText("\"\"");

        jbbuscar.setBackground(new java.awt.Color(255, 198, 255));
        jbbuscar.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbbuscar.setText("Buscar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jbtriste, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Feliz, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fielporque, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fielfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jregistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jbmodificar, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jbeliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(37, 37, 37)
                                        .addComponent(jbbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(fielrevisar, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(142, 142, 142)
                                                .addComponent(importante, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(600, 600, 600)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jbenojado, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Enojado, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(emocion)
                                        .addGap(519, 519, 519)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jbfeliz, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(triste, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(678, 678, 678)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(triste, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(149, 149, 149)
                                .addComponent(Feliz, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Enojado, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(emocion)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtriste, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbenojado, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbfeliz, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbeliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(fielporque, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jregistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbmodificar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fielfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(importante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fielrevisar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jbbuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtristeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtristeActionPerformed
        // TODO add your handling code here:
        emocion.setText("Triste");
    }//GEN-LAST:event_jbtristeActionPerformed

    private void jbenojadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbenojadoActionPerformed
        // TODO add your handling code here:
        emocion.setText("Enojado");
    }//GEN-LAST:event_jbenojadoActionPerformed

    private void fielfechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fielfechaActionPerformed
        // TODO add your handling code here:
        emocion.setText("Feliz");
    }//GEN-LAST:event_fielfechaActionPerformed

    private void jregistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jregistrarActionPerformed
        // TODO add your handling code here:
        
        
        
             try{
                    Connection cn=DriverManager.getConnection("jdbc:mysql://localhost/bd_micalendario","root","");
            PreparedStatement pst=cn.prepareStatement("insert into emociones values(?,?,?,?)");
            if(fielfecha.getText().equals("")||emocion.getText().equals("") || fielporque.getText().equals("") ){
                JOptionPane.showMessageDialog( null, "Debes llenar todos los campos!!!");
            }else{
            pst.setString(1,"0");
            pst.setString(2,fielfecha.getText().trim());
            pst.setString(3,emocion.getText().trim());
            pst.setString(4,fielporque.getText().trim());
           // pst.setString(4, txtfactor3.getText().trim());
            pst.executeUpdate();
            fielfecha.setText("");
            fielporque.setText("");
            emocion.setText("");
           // txtfactor3.setText("");
            importante.setText("Registro Exitoso");
            }
            
        }catch(Exception e){
            System.out.println("Hubo un error");
            System.out.println(e );
            
        }
    }//GEN-LAST:event_jregistrarActionPerformed

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
            java.util.logging.Logger.getLogger(nuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(nuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(nuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(nuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new nuevo().setVisible(true);
                 
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Enojado;
    private javax.swing.JLabel Feliz;
    private javax.swing.JLabel emocion;
    private javax.swing.JTextField fielfecha;
    private javax.swing.JTextField fielporque;
    private javax.swing.JTextField fielrevisar;
    private javax.swing.JLabel importante;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JButton jbbuscar;
    private javax.swing.JButton jbeliminar;
    private javax.swing.JButton jbenojado;
    private javax.swing.JButton jbfeliz;
    private javax.swing.JButton jbmodificar;
    private javax.swing.JButton jbtriste;
    private javax.swing.JButton jregistrar;
    private javax.swing.JLabel triste;
    // End of variables declaration//GEN-END:variables
}
