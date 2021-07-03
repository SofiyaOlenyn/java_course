public class Main {

    public static void main(String[] args) {

    RecordView view = new RecordView();
    RecordController controller = new RecordController( view);
    controller.processUser();
    }
}
