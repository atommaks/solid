package ru.atom.solid.srp.solution;

public class DataManagerImpl implements DataManager {

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
