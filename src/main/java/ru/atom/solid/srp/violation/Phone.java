package ru.atom.solid.srp.violation;

/**
 * Данный интерфейс реализован неправильно, и он наруешт SRP. Дело в том, что методы dial, disconnect - отвечают за
 * управление соединением. Методы send, receive - отвечают за управление данными. Так структура будет более понятна и
 * у нее будут свои единсвенные зоны ответсвенности. А в таком формате интейрфейс Phone имеет несколько обязанностей и
 * непонятно для чего был создан, что нарушает SRP.
 */
public interface Phone {
    void dial(String phoneNumber);
    void disconnect();
    void send(String message);
    int receive();
}
