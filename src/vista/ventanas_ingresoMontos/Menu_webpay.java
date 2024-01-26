/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista.ventanas_ingresoMontos;

import controlador.Cont_efectivo;
import controlador.Cont_webpay;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import vista.Menu_principal;


/**
 *
 * @author ezioc
 */
public class Menu_webpay extends javax.swing.JFrame {
    
    DefaultTableModel dtm = new DefaultTableModel();

    /**
     * Creates new form Menu_efectivo
     */
    private Menu_principal menu;
    public Menu_webpay(Menu_principal menu) {
        this.menu = menu;
        initComponents();
        this.setLocationRelativeTo(null);
        String montos [] = {"Montos"};
        dtm.setColumnIdentifiers(montos);
        tabla_webpay.setModel(dtm);
        this.txt_monto.setText("0");
        
        Cont_webpay cf = new Cont_webpay(this);
        this.btn_agregar.addActionListener(cf);
        this.btn_eliminar.addActionListener(cf);
        this.btn_corregir.addActionListener(cf);
        this.btn_total.addActionListener(cf);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_webpay = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btn_agregar = new javax.swing.JButton();
        txt_monto = new javax.swing.JTextField();
        btn_eliminar = new javax.swing.JButton();
        btn_corregir = new javax.swing.JButton();
        btn_total = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tabla_webpay.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Montos"
            }
        ));
        jScrollPane1.setViewportView(tabla_webpay);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setText("Webpay");

        btn_agregar.setBackground(new java.awt.Color(0, 0, 0));
        btn_agregar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_agregar.setForeground(new java.awt.Color(255, 255, 255));
        btn_agregar.setText("Agregar");
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });

        txt_monto.setText("jTextField1");

        btn_eliminar.setBackground(new java.awt.Color(204, 0, 51));
        btn_eliminar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_eliminar.setForeground(new java.awt.Color(255, 255, 255));
        btn_eliminar.setText("Eliminar");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        btn_corregir.setBackground(new java.awt.Color(153, 153, 153));
        btn_corregir.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btn_corregir.setForeground(new java.awt.Color(255, 255, 255));
        btn_corregir.setText("Corregir");
        btn_corregir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_corregirActionPerformed(evt);
            }
        });

        btn_total.setBackground(new java.awt.Color(255, 0, 51));
        btn_total.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btn_total.setForeground(new java.awt.Color(255, 255, 255));
        btn_total.setText("Calcular Total");
        btn_total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_totalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(txt_monto, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_agregar)
                        .addGap(0, 27, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btn_corregir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_eliminar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(btn_total)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(jLabel1)
                .addGap(57, 57, 57))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_monto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_agregar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_eliminar)
                            .addComponent(btn_corregir))
                        .addGap(48, 48, 48)
                        .addComponent(btn_total)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btn_agregarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_corregirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_corregirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_corregirActionPerformed

    private void btn_totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_totalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_totalActionPerformed

    /**
     * @param args the command line arguments
     */
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_corregir;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_total;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla_webpay;
    private javax.swing.JTextField txt_monto;
    // End of variables declaration//GEN-END:variables

    public DefaultTableModel getDtm() {
        return dtm;
    }

    public JButton getBtn_agregar() {
        return btn_agregar;
    }

    public JTextField getTxt_monto() {
        return txt_monto;
    }

    public JButton getBtn_eliminar() {
        return btn_eliminar;
    }

    public JTable getTabla_webpay() {
        return tabla_webpay;
    }

    public JButton getBtn_corregir() {
        return btn_corregir;
    }

    public JButton getBtn_total() {
        return btn_total;
    }

    public Menu_principal getMenu() {
        return menu;
    }
    
    
    
}
