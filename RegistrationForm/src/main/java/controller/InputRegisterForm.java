package controller;

import view.RecordView;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

import static controller.RegexConstants.REGEX_LOGIN;
import static controller.RegexConstants.REGEX_NAME;
import static view.RecordViewConstants.FIRST_NAME;
import static view.RecordViewConstants.LOGIN_DATA;

public class InputRegisterForm {

    private RecordView view;
    private Scanner sc;

    private String firstName;
    private String login;


    static String REGEX_BUNDLE_NAME = "regex";
    public static final ResourceBundle bundle =
            ResourceBundle.getBundle(
                    REGEX_BUNDLE_NAME,
                    new Locale("ua", "UA"));  // Ukrainian
    //new Locale("en"));        // English


    public InputRegisterForm(RecordView view, Scanner sc) {
        this.view = view;
        this.sc = sc;
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
    }
}
