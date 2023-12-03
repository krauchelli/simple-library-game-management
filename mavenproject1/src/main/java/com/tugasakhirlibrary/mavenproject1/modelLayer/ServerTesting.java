/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tugasakhirlibrary.mavenproject1.modelLayer;
import java.sql.*;
/**
 *
 * @author kraun
 */
public class ServerTesting {
    public static void main(String[] args) {
        Database.getInstance();
        UserModel model = new UserModel(Database.getConnection());

        try {
            model.addUser(new User("root02", "test02", "root11"));
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(model.getUsers());

        /*try {
            System.out.println(model.getSpecificUser("test"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }*/

    }
}
