package ru.atom.solid.dip;

// high level class
public class LoginManager {
    private AuthService authService = new SimpleLogin();

    public void login(User user) {
        authService.auth(user);
    }
}
