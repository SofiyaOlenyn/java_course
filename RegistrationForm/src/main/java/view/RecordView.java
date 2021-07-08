package view;

import java.util.ResourceBundle;

import static settings.Settings.LANGUAGE;

public class RecordView {

    static String MESSAGES_BUNDLE_NAME = "messages";
    public static final ResourceBundle bundle =
            ResourceBundle.getBundle(
                    MESSAGES_BUNDLE_NAME, LANGUAGE);        // English


    public void printMessage(String message) {
        System.out.println(message);
    }

    public String concatenationString(String... message){
        StringBuilder concatString = new StringBuilder();
        for(String v : message) {
            concatString = concatString.append(v);
        }
        return new String(concatString);
    }

    public void printStringInput(String message) {
        printMessage(concatenationString(
                bundle.getString(RecordViewConstants.INPUT_STRING_DATA),
                bundle.getString(message)));
    }

    public void printWrongStringInput(String message) {
        printMessage(concatenationString(
                bundle.getString(RecordViewConstants.WRONG_INPUT_DATA),
                bundle.getString(RecordViewConstants.INPUT_STRING_DATA),
                bundle.getString(message)));
    }

}
