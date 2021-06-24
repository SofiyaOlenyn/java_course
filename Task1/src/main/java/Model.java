public class Model {

    private String value;

    public String addStringToValue(String string) {
        return value += " " + string;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String string) {
        this.value = string;
    }
}
