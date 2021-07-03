import java.util.Scanner;

public class RecordController {

    private Record record;
    private RecordView view;

    public RecordController(RecordView view) {

        this.view = view;
    }

    public void processUser() {

        view.printMessage("Fill in information about yourself");
        Scanner sc = new Scanner(System.in);

        String secondName = verifySimpleWord(sc,"second name");

//        String firstName = verifySimpleWord(sc,"first name");
//
//        String patronymic = verifySimpleWord(sc,"patronymic");

        String nickname = verifySimpleWord(sc,"nickname");

        view.printMessage("Write comment");
        String comment = sc.next();

        String homePhoneNumber=verifyHomePhoneNumber(sc);

        String mobilePhoneNumber= verifyMobilePhoneNumber(sc);

        view.printMessage("Do you want to fill additional phone number? (Write Y to admit)");

        String input = sc.next();
        String mobilePhoneNumberAdditional;
        if(input.equals("Y")) {
            mobilePhoneNumberAdditional = verifyMobilePhoneNumber(sc);
        }else{
            mobilePhoneNumberAdditional = "";
        }

        String email = verifyEmail(sc);

    }

    public String verifySimpleWord(Scanner sc, String inputWord){
        view.printMessage("Write your "+inputWord);
        String input;
        while (true) {
            input= sc.next();
            if(input.matches("[A-Za-z]+"))
                return input;
            view.printMessage(RecordView.WRONG_INPUT_DATA);
            view.printMessage("Write your "+inputWord);
        }
    }

    public String verifyHomePhoneNumber(Scanner sc){
        view.printMessage("Write your  home phone number");
        String input;
        while (true) {
            input= sc.next();
            if(input.matches("[0-9]{7}"))
                return input;
            view.printMessage(RecordView.WRONG_INPUT_DATA);
            view.printMessage("Write your home phone number");
        }
    }
    public String verifyMobilePhoneNumber(Scanner sc){
        view.printMessage("Write your mobile phone number");
        String input;
        while (true) {
            input= sc.next();
            if(input.matches("^(\\+\\d{1,3}( )?)?((\\(\\d{3}\\))|\\d{3})[- .]?\\d{3}[- .]?\\d{4}$"))
                return input;
            view.printMessage(RecordView.WRONG_INPUT_DATA);
            view.printMessage("Write your mobile phone number");
        }
    }

    public String verifyEmail(Scanner sc){
        view.printMessage("Write your email");
        String input;
        while (true) {
            input= sc.next();
            if(input.matches("^[A-Za-z0-9+_.-]+@(.+)$"))
                return input;
            view.printMessage(RecordView.WRONG_INPUT_DATA);
            view.printMessage("Write your email");
        }
    }


}
