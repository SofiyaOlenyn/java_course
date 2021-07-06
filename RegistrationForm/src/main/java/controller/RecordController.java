package controller;

import entities.Record;
import view.RecordView;

import java.util.Scanner;

/**
 * @author Sofiia Olenyn
 *
 */
public class RecordController {

    private Record record;
    private RecordView view;

    public RecordController(RecordView view,Record record) {
        this.view = view;
    }

    public void processUser() {
        Scanner sc = new Scanner(System.in);
        InputRegisterForm inputRegisterForm =
                new InputRegisterForm(view, sc);
        inputRegisterForm.inputData();
    }

    public Record getRecord() {
        return record;
    }

    public void setRecord(Record record) {
        this.record = record;
    }
}
