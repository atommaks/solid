package ru.atom.solid.srp.solution;

public interface ConnectionManager {
    void dial(String phoneNumber);
    void disconnect();
}
