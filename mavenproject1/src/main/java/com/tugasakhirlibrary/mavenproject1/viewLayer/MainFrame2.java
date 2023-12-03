package com.tugasakhirlibrary.mavenproject1.viewLayer;

import com.tugasakhirlibrary.mavenproject1.controllerLayer.UserController;

import javax.swing.*;
import java.awt.*;

public class MainFrame2 extends JFrame {

    // A constructor that takes a title as a parameter
    public MainFrame2(String title) {
        // Call the super constructor with the title
        super(title);
        // Set the size of the window
        setSize(700, 700);
        // Set the location of the window to the center of the screen
        setLocationRelativeTo(null);
        // Set the default close operation to exit the program
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Set the layout of the window to BorderLayout
        setLayout(new BorderLayout());
        // Create objects of the UserController, RegisterWindow, and LoginWindow classes
        RegisterWindow registerWindow = new RegisterWindow(false);
        LoginWindow loginWindow = new LoginWindow(true);
        UserController userController = new UserController(registerWindow, loginWindow);
        // Add the register window and login window objects to the mainframe
        add(registerWindow, BorderLayout.NORTH);
        add(loginWindow, BorderLayout.SOUTH);
        // Set the window to be visible
        setVisible(true);
    }

    // A main method to test the mainframe class
    public static void main(String[] args) {
        // Create a mainframe object with a title
        MainFrame2 mainframe = new MainFrame2("My Mainframe");
    }
}
