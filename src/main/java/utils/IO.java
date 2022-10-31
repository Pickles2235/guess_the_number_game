package utils;

import java.io.StringReader;
import java.util.Scanner;

public abstract class IO {
    private final Scanner userInput;

    protected IO (){
        userInput = new Scanner(System.in);
    }

    protected String inputPrompt(String message){
        //System.out.print(message +  ">>");
        System.out.printf("%s >>", message);
        return userInput.nextLine();
    }
}
