/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ezioc
 */
public class Menu_buscador extends javax.swing.JFrame {

    /**
     * Creates new form Menu_buscador
     */
    DefaultTableModel dtm = new DefaultTableModel();
    public Menu_buscador() {
        initComponents();
        this.setLocationRelativeTo(null);
        String ids [] = {"Fecha","Efectivo","Sodexo","Debito Multicaja","Debito Autoservicio","Credito Multicaja","Credito Autoservicio","Hites","Arcor","Webpay","Total"};
        dtm.setColumnIdentifiers(ids);
        jTable1.setModel(dtm);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_dia = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_mes = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_año = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btn_buscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setText("Registros");

        jLabel2.setText("Ingresar Fecha:");

        jLabel3.setText("/");

        jLabel4.setText("/");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Fecha", "Efectivo", "Sodexo", "Debito Multicaja", "Debito autoservicio", "Credito multicaja", "Credito autoservicio", "Hites", "Arcor", "Webpay", "Total"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1363, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_dia, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_mes, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_año, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_buscar))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(596, 596, 596)
                        .addComponent(jLabel1)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_dia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txt_mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txt_año, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscar))
                .addGap(42, 42, 42)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(155, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        // TODO add your handling code here:
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bd_pjarqueo","root","");
            PreparedStatement pst = cn.prepareStatement("select * from registros where Fecha = ?");
            
            
        if(txt_dia.getText().equals("")){
            JOptionPane.showMessageDialog(null,"ERROR, NO SE HA INGRESADO EL DIA    ");
        }
        if(txt_mes.getText().equals("")){
            JOptionPane.showMessageDialog(null,"ERROR, NO SE HA INGRESADO EL MES    ");
        }
        if(txt_año.getText().equals("")){
            JOptionPane.showMessageDialog(null,"ERROR, NO SE HA INGRESADO EL AÑO   ");
        }else{
        String dia = txt_dia.getText();
        String mes = txt_mes.getText();
        String año = txt_año.getText();
        if(dia.length() == 1){
            dia = "0"+dia;
        }
        if(mes.length() == 1){
            mes = "0"+mes;
        }
        if(año.length() < 4){
            JOptionPane.showMessageDialog(null,"ERROR,INGRESE EL AÑO CORRECTAMENTE");
        }else{
        String fecha = dia+"/"+mes+"/"+año;
        pst.setString(1,fecha);
        ResultSet rs = pst.executeQuery();
        if(rs.next()){ 
                String fecha_t = rs.getString("Fecha");
                String efectivo = rs.getString("Efectivo");
                String sodexo = rs.getString("Sodexo");
                String debitomult = rs.getString("Debito_multicaja");
                String debitoauto = rs.getString("Debito_autoservicio");
                String creditomult = rs.getString("Credito_multicaja");
                String creditoauto = rs.getString("Credito_autoservicio");
                String hites = rs.getString("Hites");
                String arcor = rs.getString("Arcor");
                String webpay = rs.getString("Webpay");
                String total = rs.getString("Total");
                
                dtm.addRow(new Object []{fecha_t,efectivo,sodexo,debitomult,debitoauto,creditomult,creditoauto,hites,arcor,webpay,total});
                
                  
            }else{/// en caso de que la id que se haya ingresado no tenga resultados 
                JOptionPane.showMessageDialog(null,"Alumno no registrado");
            }
        }}
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btn_buscarActionPerformed

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
            java.util.logging.Logger.getLogger(Menu_buscador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_buscador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_buscador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_buscador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_buscador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txt_año;
    private javax.swing.JTextField txt_dia;
    private javax.swing.JTextField txt_mes;
    // End of variables declaration//GEN-END:variables
}
