/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tugasakhirlibrary.mavenproject1.modelLayer;

/**
 *
 * @author kraun
 */
public class User {
    private String idUser;
    private String username;
    private String password;

    public User(String paramIdUser, String paramUsername, String paramPassword) {
        this.idUser = paramIdUser;
        this.username = paramUsername;
        this.password = paramPassword;
    }

    //getter n setter
    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIdUser() {
        return idUser;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    //testing purposes, mark comment if not needed
    public String toString() {
        return "User [idUser=" + idUser + ", username=" + username + ", password=" + password + "]";
    }
}
