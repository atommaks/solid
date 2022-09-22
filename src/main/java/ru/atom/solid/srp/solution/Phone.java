package ru.atom.solid.srp.solution;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Phone implements ConnectionManager, DataManager {
    private final ConnectionManager connectionManager;
    private final DataManager dataManager;

    @Override
    public void dial(String phoneNumber) {
        connectionManager.dial(phoneNumber);
    }

    @Override
    public void disconnect() {
        connectionManager.disconnect();
    }

    @Override
    public void send(String message) {
        dataManager.send(message);
    }

    @Override
    public int receive() {
        return dataManager.receive();
    }
}
