package ua.training;

public class Model {
    private String value;

    public Model() {
        this.value = "";
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value += value+" ";
    }
}
