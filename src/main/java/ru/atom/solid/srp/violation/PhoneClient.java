package ru.atom.solid.srp.violation;

public class PhoneClient {
    public static void main(String[] args) {
        Phone phone = new PhoneImpl();
        phone.dial("89999999999");
        phone.send("Hello, world!");
        phone.receive();
        phone.disconnect();
    }
}
