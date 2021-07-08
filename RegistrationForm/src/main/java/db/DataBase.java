package db;

import java.util.stream.Stream;


public enum DataBase {

    LOGIN1("Sophie"),
    LOGIN2("Lesya"),
    LOGIN3("Johnn");

    private String login;

    DataBase(String login) {
        this.login = login;
    }

    public static boolean isLoginUnique(String login) {
        return Stream.of(values()).noneMatch(e -> e.getLogin().equals(login));
    }


    public String getLogin() {
        return login;
    }
}
