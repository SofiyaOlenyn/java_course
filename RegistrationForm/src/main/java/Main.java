import controller.RecordController;
import entities.Record;
import entities.RecordBook;
import exception.NotUniqueLoginException;
import view.RecordView;

public class Main {

    public static void main(String[] args) {


    RecordController controller = new RecordController(new RecordView());
    controller.processUser();


    }
}
