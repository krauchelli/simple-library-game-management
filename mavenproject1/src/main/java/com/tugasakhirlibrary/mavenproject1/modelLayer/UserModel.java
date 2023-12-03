package com.tugasakhirlibrary.mavenproject1.modelLayer;

import com.mysql.cj.protocol.Resultset;

import javax.xml.transform.Result;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserModel {
    private Connection connection;

    public UserModel(Connection paramConnection) {
        this.connection = paramConnection;
    }

    public List<User> getUsers() {
        List<User> daftarUser = new ArrayList<>();
        String sqlQuery = "SELECT * FROM user";

        try (PreparedStatement statement = this.connection.prepareStatement(sqlQuery);
             ResultSet resultSet = statement.executeQuery();){
            while (resultSet.next()) {
                String idUser = resultSet.getString("idUser");
                String username = resultSet.getString("username");
                String password = resultSet.getString("password");

                User user = new User(idUser, username, password);
                daftarUser.add(user);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return daftarUser;
    }

    public String addUser(User user) throws SQLException {
        String idUser = "";
        String sqlQuery = "INSERT INTO user VALUES (?, ?, ?)";
        int updateCount;

        System.out.println(user.getIdUser());
        System.out.println(user.getUsername());
        System.out.println(user.getPassword());
        try (PreparedStatement statement = connection.prepareStatement(sqlQuery, Statement.RETURN_GENERATED_KEYS)) {
            statement.setString(1, user.getIdUser());
            statement.setString(2, user.getUsername());
            statement.setString(3, user.getPassword());

            updateCount = statement.executeUpdate();
            if (updateCount > 0) {
                // Get the generated keys (if any)
                try (ResultSet generatedKeys = statement.getGeneratedKeys()) {
                    if (generatedKeys.next()) {
                        idUser = generatedKeys.getString(1);
                    }
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return idUser;
    }

    //spesifik berdasarkan username
    public User getSpecificUser (String paramUsername) throws SQLException, Exception {
        User user = null;
        String sqlQuery = "SELECT * FROM user WHERE username=?";
        try (PreparedStatement statement = connection.prepareStatement(sqlQuery);) {
            statement.setString(1, paramUsername);

            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                String idUser = resultSet.getString("idUser");
                String username = resultSet.getString("username");
                String password = resultSet.getString("password");

                user = new User(idUser, username, password);
            } else {
                throw new Exception("Invalid username!");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return user;
    }
}
