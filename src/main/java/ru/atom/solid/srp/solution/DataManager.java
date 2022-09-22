package ru.atom.solid.srp.solution;

public interface DataManager {
    void send(String message);
    int receive();
}
