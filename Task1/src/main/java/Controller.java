import java.util.Scanner;

public class Controller {

    private Model model;
    private View view;

    public final String HELLO_STRING = "Hello";
    public final String WORD_STRING = "word!";

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser() {

        Scanner sc = new Scanner(System.in);

        view.printMessage(View.INPUT_HELLO_STRING);
        while (!sc.next().equals(HELLO_STRING)) {
            view.printMessage(View.WRONG_INPUT_DATA + View.INPUT_HELLO_STRING);
        }

        model.setValue(HELLO_STRING);

        view.printMessage(View.INPUT_WORD_STRING);
        while (!sc.next().equals(WORD_STRING)) {
            view.printMessage(View.WRONG_INPUT_DATA + View.INPUT_WORD_STRING);
        }

        model.addStringToValue(WORD_STRING);

        view.printMessage(View.OUR_STRING+" "+model.getValue());
    }


}
