package ru.atom.solid.srp.solution;

public class PhoneClient {
    public static void main(String[] args) {
        Phone phone = new Phone(new ConnectionManagerImpl(), new DataManagerImpl());
        phone.dial("89999999999");
        phone.send("Hello, world!");
        phone.receive();
        phone.disconnect();
    }
}
