package game;

import java.util.ArrayList;

public class View {
    public static final String INPUT_VALUE_IN_RANGE = "Input integer value in range :";
    public static final String WRONG_INPUT_DATA = "Wrong input data! Repeat please! ";
    public static final String NOT_IN_RANGE_DATA = "Data is not in range ";
    public static final String CONGRATULATION_MASSAGE = "CONGRATULATION! You win!";

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printInputInRangeMessage(int min, int max) {

        System.out.println(INPUT_VALUE_IN_RANGE+" [ "+min+";"+max+" ]");
    }

    public void printCongratulationMessage(int value, ArrayList<Integer> attempts) {

        System.out.println(CONGRATULATION_MASSAGE);
        System.out.println("Value = "+value);
        System.out.println("Previous attempts:");
        for (Integer i : attempts) {
            System.out.print(i+" ");
        }
    }
}
