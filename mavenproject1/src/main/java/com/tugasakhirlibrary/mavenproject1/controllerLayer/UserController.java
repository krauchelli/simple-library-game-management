package com.tugasakhirlibrary.mavenproject1.controllerLayer;

import com.aventrix.jnanoid.jnanoid.NanoIdUtils;
import com.tugasakhirlibrary.mavenproject1.modelLayer.Database;
import com.tugasakhirlibrary.mavenproject1.modelLayer.UserModel;
import com.tugasakhirlibrary.mavenproject1.modelLayer.User;
import com.tugasakhirlibrary.mavenproject1.viewLayer.LoginWindow;
import com.tugasakhirlibrary.mavenproject1.viewLayer.RegisterWindow;
import java.sql.Connection;
import java.sql.SQLException;

import javax.swing.JOptionPane;


public class UserController {
    private Database database;
    private Connection connect;
    private UserModel userModel;
    private RegisterWindow registerWindow;
    private LoginWindow loginWindow;

    //bagian login
    public UserController(RegisterWindow registerWindow, LoginWindow loginWindow) {
        this.database = Database.getInstance();
        this.connect = Database.getConnection();

        this.userModel = new UserModel(this.connect);
        this.registerWindow = registerWindow;
        this.loginWindow = loginWindow;

        this.registerWindow.SaveUser(e -> {
                String iduser = "u-" + NanoIdUtils.randomNanoId();
                iduser = iduser.substring(0, Math.min(iduser.length(), 24));
                String username = this.registerWindow.getTuser().trim();
                String password = this.registerWindow.getTpass().trim();

                //test show on console
                System.out.println("username: " + username);
                System.out.println("password: " + password);

                //checking data yang dimasukkan
                if (username.isEmpty()) {
                    JOptionPane.showMessageDialog(this.registerWindow, "Butuh username!",
                            "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                if (password.isEmpty()) {
                    JOptionPane.showMessageDialog(this.registerWindow, "Butuh password!",
                            "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

            //database check
            try {
                System.out.println("attempting to add user to the database.. ");
                this.userModel.addUser(new User(iduser, username, password));
                System.out.println("User added successfully!");
            } catch (SQLException er) {
                System.out.println(er.getMessage());
                JOptionPane.showMessageDialog(this.registerWindow, "kesalahan server",
                        "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            RegisterWindow.isRegistered = true;
            this.registerWindow.reset(true);
        });

        this.loginWindow.SubmitUser(e -> {
            String username = this.loginWindow.getTuser().trim();
            String password = this.loginWindow.getTpass().trim();

            //masuk database
            try {
                User user = this.userModel.getSpecificUser(username);
                String passwd = user.getPassword();
                if (!password.equals(passwd)) {
                    throw new Exception("Password salah~~, coba lagi!");
                }
                JOptionPane.showMessageDialog(this.loginWindow, "login sukses",
                        "Berhasil", JOptionPane.PLAIN_MESSAGE);
                return;
            } catch (Exception er) {
                System.out.println(er.getMessage());
                JOptionPane.showMessageDialog(this.loginWindow, er.getMessage(), "Error",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }
        });
    }
}
