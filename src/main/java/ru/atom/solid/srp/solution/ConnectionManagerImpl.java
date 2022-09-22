package ru.atom.solid.srp.solution;

public class ConnectionManagerImpl implements ConnectionManager {

    @Override
    public void dial(String phoneNumber) {
        System.out.println("Связь с " + phoneNumber + " установлена.");
    }

    @Override
    public void disconnect() {
        System.out.println("Связь сброшена.");
    }
}
