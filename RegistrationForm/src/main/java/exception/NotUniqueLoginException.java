package exception;

public class NotUniqueLoginException extends Exception {

    private String login;

    public NotUniqueLoginException(String message, String login) {
        super(message + ": " + login);
        this.login = login;
    }

    public String getLogin() {
        return login;
    }
}
