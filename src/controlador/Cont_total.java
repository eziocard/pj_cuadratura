package controlador;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.Menu_principal;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ezioc
 */
public class Cont_total implements ActionListener {
    private Menu_principal menu;

    public Cont_total(Menu_principal menu) {
        this.menu = menu;
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(menu.getBtn_total())){
            int efectivo = Integer.parseInt(menu.getTotal_efectivo().getText());
            int debitomult = Integer.parseInt(menu.getTotal_debitomulticaja().getText());
            int debitoauto = Integer.parseInt(menu.getTotal_debitoauto().getText());
            int creditomult = Integer.parseInt(menu.getTotal_creditomult().getText());
            int creditoauto = Integer.parseInt(menu.getTotal_creditoauto().getText());
            int hites = Integer.parseInt(menu.getTotal_hites().getText());
            int arcor = Integer.parseInt(menu.getTotal_arcor().getText());
            int webpay = Integer.parseInt(menu.getTotal_webpay().getText());
            int sodexo = Integer.parseInt(menu.getTotal_sodexo().getText());
            int total = efectivo + sodexo + debitoauto + debitomult + creditoauto + creditomult + hites + arcor + webpay;
            menu.getTxt_total().setText(""+total);
            
        }
        
    }
    
}
