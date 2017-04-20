package ua.training;

import java.util.Scanner;

public class Controller {

    public  static final String STRING_HELLO="Hello";
    public  static final String STRING_WORLD="world";

    Model model;
    View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUserRun(){

        Scanner sc =new Scanner(System.in);

        model.setValue(inputValueWithScanner(sc,STRING_HELLO));
        model.setValue(inputValueWithScanner(sc,STRING_WORLD));

        view.printMessageAndValue(view.VALUES_DATA, model.getValue());

    }

    public String inputValueWithScanner(Scanner sc, String sample){

        view.printMessage(View.INPUT_DATA+sample);

        String inputValue=sc.nextLine();

        while (!inputValue.equals(sample)){
            view.printMessage(view.WRONG_DATA + view.INPUT_DATA+sample);
            inputValue=sc.nextLine();
        }
        return inputValue;
    }

}
