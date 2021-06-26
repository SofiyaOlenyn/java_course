package game;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Controller {

    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser() {

        Scanner sc = new Scanner(System.in);
        int input;

        while (true) {
            view.printInputInRangeMessage(model.getRangeMinValue(), model.getRangeMaxValue());
            input = validation(sc);
            if (input == model.getValue()) {
                view.printCongratulationMessage(input, model.getPreviousAttempts());
                break;
            } else {
                if (input > model.getValue()) {
                    if (input <= model.getRangeMaxValue()) {
                        model.setRangeMaxValue(input);
                        model.setPreviousAttempts(input);
                    } else {
                        view.printMessage(view.NOT_IN_RANGE_DATA);
                    }
                } else {
                    if (input >= model.getRangeMinValue()) {
                        model.setRangeMinValue(input);
                        model.setPreviousAttempts(input);
                    } else {
                        view.printMessage(view.NOT_IN_RANGE_DATA);
                    }
                }
            }
        }
    }

    public int validation(Scanner sc) {
        try {
            while (!sc.hasNextInt()) {
                view.printMessage(View.WRONG_INPUT_DATA);
                view.printInputInRangeMessage(model.getRangeMinValue(), model.getRangeMaxValue());
                sc.next();
            }
        } catch (InputMismatchException e) {
            view.printMessage(View.WRONG_INPUT_DATA);
            view.printInputInRangeMessage(model.getRangeMinValue(), model.getRangeMaxValue());
        }
        return sc.nextInt();
    }

}
