package controller;

import entities.Record;
import entities.RecordBook;
import exception.NotUniqueLoginException;
import view.RecordView;

import java.util.Scanner;

/**
 * @author Sofiia Olenyn
 */
public class RecordController {

    private RecordView view;

    public RecordController(RecordView view) {
        this.view = view;
    }

    public void processUser(){
        Scanner sc = new Scanner(System.in);
        InputRegisterForm inputRegisterForm =
                new InputRegisterForm(view, sc);
        inputRegisterForm.inputData();
    }


}
