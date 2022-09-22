package ru.atom.solid.dip;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class User {
    private int id;
    private String username;
    private String password;
}
