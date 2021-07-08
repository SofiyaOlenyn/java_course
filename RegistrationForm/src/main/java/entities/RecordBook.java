package entities;

import db.DataBase;
import exception.NotUniqueLoginException;

import java.util.ArrayList;
import java.util.List;

public class RecordBook {

    private List<Record> records;

    public RecordBook() {
        this.records = new ArrayList<>();
    }

    public void add(Record record) throws NotUniqueLoginException {
        String login = record.getLogin();
        if (DataBase.isLoginUnique(login)) {
            records.add(record);
        } else {
            throw new NotUniqueLoginException("Login is not unique", login);
        }
    }

    public List<Record> getRecords() {
        return records;
    }
}
