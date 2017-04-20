package ua.training;

public class View {

    public static final String INPUT_DATA="Input string = ";
    public static final String WRONG_DATA="Wrong input! Please try again! ";
    public static final String VALUES_DATA="Values = ";

    public void printMessage(String message){
        System.out.println(message);
    }

    public void printMessageAndValue(String message, String value){
        System.out.println(message+value);
    }

}
