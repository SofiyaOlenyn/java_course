package game;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
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

            //check input value to be int
            input = validateInputValue(sc);

            //user win
            if (input == model.getValue()) {
                view.printCongratulationMessage(input, model.getPreviousAttempts());
                break;

                //user does not win
            } else {
                if (input > model.getValue()) {
                    //check input to be in range
                    if (input <= model.getRangeMaxValue()) {
                        model.setRangeMaxValue(input);
                        model.addAttempt(input);
                    } else {
                        view.printMessage(view.NOT_IN_RANGE_DATA);
                    }

                } else {
                    //check input to be in range
                    if (input >= model.getRangeMinValue()) {
                        model.setRangeMinValue(input);
                        model.addAttempt(input);
                    } else {
                        view.printMessage(view.NOT_IN_RANGE_DATA);
                    }
                }
            }
        }
    }

    public int validateInputValue(Scanner sc) {
        try {
            while (!sc.hasNextInt()) {
                view.printMessage(View.WRONG_INPUT_DATA);
                view.printInputInRangeMessage(model.getRangeMinValue(), model.getRangeMaxValue());
                sc.next();
            }
        }  catch (NoSuchElementException e) {
            view.printMessage(View.WRONG_INPUT_DATA);
            view.printInputInRangeMessage(model.getRangeMinValue(), model.getRangeMaxValue());
        }
        return sc.nextInt();
    }

}
