package ru.atom.solid.dip;

public class SimpleLogin implements AuthService {
    //low level class

    @Override
    public boolean auth(User user) {
        // some logic

        return true;
    }
}
