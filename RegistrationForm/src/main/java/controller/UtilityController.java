package controller;

import view.RecordView;

import java.util.Scanner;

public class UtilityController {
    private Scanner scanner;
    private RecordView view;

    public UtilityController(Scanner scanner, RecordView view) {
        this.scanner = scanner;
        this.view = view;
    }

    String inputStringValueWithScanner(String message, String regex) {
        String res;
        view.printStringInput(message);
        while( !(scanner.hasNext() && (res = scanner.next()).matches(regex))) {
            view.printWrongStringInput(message);
        }
        return res;
    }
}
