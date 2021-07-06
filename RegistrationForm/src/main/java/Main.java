import controller.RecordController;
import entities.Record;
import view.RecordView;

public class Main {

    public static void main(String[] args) {


    RecordController controller = new RecordController(new RecordView(),new Record());
    controller.processUser();


    }
}
