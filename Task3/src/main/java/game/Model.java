package game;

import java.util.ArrayList;

public class Model {

    private int value;
    private int rangeMinValue;
    private int rangeMaxValue;
    private ArrayList<Integer> previousAttempts = new ArrayList<Integer>();

    public Model() {
        this.value = getRandomValue(GlobalConstants.PRIMARY_MIN_BARRIER, GlobalConstants.PRIMARY_MAX_BARRIER);
        this.rangeMinValue = GlobalConstants.PRIMARY_MIN_BARRIER;
        this.rangeMaxValue = GlobalConstants.PRIMARY_MAX_BARRIER;
    }

    public int getValue() {
        return value;
    }

    public ArrayList<Integer> getPreviousAttempts() {
        return previousAttempts;
    }

    public void addAttempt(int attempt) {
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

    public int getRandomValue(int min, int max) {
        return (int) Math.ceil(Math.random() * (max - min - 1) + min);

    }
}
