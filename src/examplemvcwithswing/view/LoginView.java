/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examplemvcwithswing.view;

import javax.swing.JFrame;

/**
 *
 * @author udin
 */
public class LoginView extends ComponentView{

    public LoginView() {
        
        // write your view design
        
        setTitle("Login");
        setSize(500,400);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
    }
    
    
}
