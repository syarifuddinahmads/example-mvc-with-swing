/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examplemvcwithswing.controller;

import examplemvcwithswing.abstracts.AbstractProses;
import examplemvcwithswing.view.LoginView;
import examplemvcwithswing.view.UserView;

/**
 *
 * @author udin
 */
public class UserController extends AbstractProses {

    public static void loginView() {
        LoginView loginView = new LoginView();
    }
    
    public static void userView() {
        UserView userView =  new UserView();
    }

    @Override
    public void insert() {
        // write control proses view
    }

    @Override
    public void view() {
        // write control proses view
    }

    @Override
    public void edit() {
        // write control proses view
    }

    @Override
    public void delete() {
        // write control proses view
    }

    @Override
    public void search() {
        // write control proses view
    }
}
