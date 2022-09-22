package ru.atom.solid.srp.violation;

public class PhoneImpl implements Phone {

    @Override
    public void dial(String phoneNumber) {
        System.out.println("Связь с " + phoneNumber + " установлена.");
    }

    @Override
    public void disconnect() {
        System.out.println("Связь сброшена.");
    }

    @Override
    public void send(String message) {
        System.out.println("Сообщение:\""+ message + "\" доставлено.");
    }

    @Override
    public int receive() {
        System.out.println("Информация получена.");
        return 0;
    }
}
