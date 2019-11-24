/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examplemvcwithswing.view;

import examplemvcwithswing.controller.UserController;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 *
 * @author udin
 */
public class LoginView extends ComponentView{

    public LoginView() {
        
        // write your view design
        
        btnUser.setBounds(150, 150, 200, 25);
        btnUser.setFont(new Font("Consolas", Font.CENTER_BASELINE, 14));
        add(btnUser);
        
        btnUser.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                UserController controller = new UserController();
                controller.userView();
            }
        });
        
        setTitle("Login");
        setSize(500,400);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
    }
    
    
}
