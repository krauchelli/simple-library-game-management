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
public class Database {
    private static Database instance;
    private static Connection connection;

    private static final String url ="jdbc:mysql://localhost:3306/library_game_management";
    private static final String username = "root";
    private static final String password = "";

    private Database() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, username, password);
          /*  Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from alamat");

            while(resultSet.next()){
                System.out.println(resultSet.getString(2));
            }*/
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static Database getInstance() {
        if (instance == null) {
            synchronized (Database.class) {
                if (instance == null) {
                    instance = new Database();
                }
            }
        }
        return instance;
    }

    public static Connection getConnection() {
        return connection;
    }

   /* public static void main(String[] args) {
        Database db = Database.getInstance();
        UserModel testUser = new UserModel(db.getConnection());
        System.out.println(testUser.getUsers());

    }*/
}
