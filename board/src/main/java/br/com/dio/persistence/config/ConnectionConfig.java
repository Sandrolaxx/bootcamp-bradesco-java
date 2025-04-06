package br.com.dio.persistence.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class ConnectionConfig {

    public static Connection getConnection() throws SQLException {
        var url = "jdbc:postgresql://localhost:5432/board";
        var user = "board";
        var password = "board";
        var connection = DriverManager.getConnection(url, user, password);
        
        connection.setAutoCommit(false);

        return connection;
    }

}
