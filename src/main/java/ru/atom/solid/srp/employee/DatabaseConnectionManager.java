package ru.atom.solid.srp.employee;

import lombok.Getter;

import java.sql.Connection;

public class DatabaseConnectionManager {
    private static DatabaseConnectionManager connectionManager = new DatabaseConnectionManager();

    @Getter
    private Connection connection;

    private DatabaseConnectionManager() {
        connection = null;
    }

    public void connect() {
        System.out.println("Connected!");
    }

    public void disconnect() {
        System.out.println("Disconnected!");
    }
}