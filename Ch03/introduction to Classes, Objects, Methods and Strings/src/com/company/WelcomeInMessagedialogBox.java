package com.company;

import javax.swing.JOptionPane;

public class WelcomeInMessagedialogBox {

    String name = JOptionPane.showInputDialog("What`s Your Name");
    String mail = JOptionPane.showInputDialog("Email");
    String message = String.format("Welcome,%s,To Java Programming!\n",name,mail);

    public void message(){
        JOptionPane.showMessageDialog(null,message);
    }

}
