package game;

import java.util.ArrayList;

public class Model {

    private int value;
    private int rangeMinValue;
    private int rangeMaxValue;
    private ArrayList<Integer> previousAttempts = new ArrayList<Integer>();;


    public Model() {
        this.value = rand(0,100);
        this.rangeMinValue = 0;
        this.rangeMaxValue = 100;

    }
    public int getValue() {
        return value;
    }

    public ArrayList<Integer> getPreviousAttempts() {
        return previousAttempts;
    }

    public void setPreviousAttempts(int attempt) {
        this.previousAttempts.add(attempt);
    }

    public int getRangeMaxValue() {
        return rangeMaxValue;
    }

    public void setRangeMaxValue(int rangeMaxValue) {
        this.rangeMaxValue = rangeMaxValue;
    }

    public int getRangeMinValue() {
        return rangeMinValue;
    }

    public void setRangeMinValue(int rangeMinValue) {
        this.rangeMinValue = rangeMinValue;
    }


    public int rand (int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
}
