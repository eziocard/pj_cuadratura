package controlador;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import vista.ventanas_ingresoMontos.Menu_efectivo;
import vista.ventanas_ingresoMontos.Menu_sodexo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ezioc
 */
public class Cont_sodexo implements ActionListener {
    private Menu_sodexo menu;
    ArrayList<Integer> lista = new ArrayList<Integer>();

    public Cont_sodexo(Menu_sodexo menu) {
        this.menu = menu;
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == menu.getBtn_agregar()){
        int monto = Integer. parseInt(menu.getTxt_monto().getText());
        menu.getDtm().addRow(new Object[]{monto});
        lista.add(monto);
            System.out.println(lista);
        menu.getTxt_monto().setText("0");
        }
        
        if(e.getSource() == menu.getBtn_eliminar()){
            try{
                lista.remove(menu.getTabla_sodexo().getSelectedRow());
                System.out.println(lista);
                menu.getDtm().removeRow(menu.getTabla_sodexo().getSelectedRow());
            }catch(Exception f){
                 JOptionPane.showMessageDialog(null,"ERROR, NO HAY NINGÚN MONTO SELECCIONADO");
            }
            
            
        }
        
        if(e.getSource() == menu.getBtn_corregir()){
            try{
            menu.getDtm().setValueAt(Integer.parseInt(menu.getTxt_monto().getText()),menu.getTabla_sodexo().getSelectedRow(), 0);
            int newmonto = Integer.parseInt(menu.getTxt_monto().getText()); 
            lista.set(menu.getTabla_sodexo().getSelectedRow(),newmonto);
            System.out.println(lista);
            menu.getTxt_monto().setText("0");
            }catch(Exception f){
                JOptionPane.showMessageDialog(null,"ERROR, NO HAY NINGÚN MONTO SELECCIONADO");
            }
                 
        }
        if(e.getSource() == menu.getBtn_total()){
             int total = 0;
            
             for(int i=0;i<lista.size();i++){
                 total = lista.get(i) + total;
             
             }
            menu.getMenu().getTotal_sodexo().setText(""+ total);
            menu.setVisible(false);
            
  

        }
    }
    
}
