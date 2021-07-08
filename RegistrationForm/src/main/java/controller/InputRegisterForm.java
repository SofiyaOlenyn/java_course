package controller;

import entities.Record;
import entities.RecordBook;
import exception.NotUniqueLoginException;
import view.RecordView;


import java.util.ResourceBundle;
import java.util.Scanner;

import static controller.RegexConstants.REGEX_LOGIN;
import static controller.RegexConstants.REGEX_NAME;
import static view.RecordViewConstants.FIRST_NAME;
import static view.RecordViewConstants.LOGIN_DATA;
import static settings.Settings.LANGUAGE;

public class InputRegisterForm {

    private RecordView view;
    private Scanner sc;
    private RecordBook recordBook;
    private String firstName;
    private String login;


    static String REGEX_BUNDLE_NAME = "regex";
    public static final ResourceBundle bundle =
            ResourceBundle.getBundle(
                    REGEX_BUNDLE_NAME,
                    LANGUAGE);


    public InputRegisterForm(RecordView view, Scanner sc) {
        this.view = view;
        this.sc = sc;
        this.recordBook = new RecordBook();
    }

    public void inputData() {


        UtilityController utilityController =
                new UtilityController(sc, view);

        this.firstName =
                utilityController.inputStringValueWithScanner
                        (FIRST_NAME, bundle.getString(REGEX_NAME));
        this.login =
                utilityController.inputStringValueWithScanner
                        (LOGIN_DATA, bundle.getString(REGEX_LOGIN));

        boolean isLoginUnique = false;
        do {
            try {
                recordBook.add(new Record(firstName, login));
                isLoginUnique = true;
            } catch (NotUniqueLoginException e) {
                view.printMessage("Not unique login " + e.getLogin());
                this.login =
                        utilityController.inputStringValueWithScanner
                                (LOGIN_DATA, bundle.getString(REGEX_LOGIN));
            }
        } while (!isLoginUnique);

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLogin() {
        return login;
    }

    public RecordBook getRecordBook() {
        return recordBook;
    }
}
