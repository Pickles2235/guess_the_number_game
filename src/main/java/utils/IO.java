package utils;

import java.util.Scanner;

public abstract class IO {
    private final Scanner in;

    protected IO(){
        in = new Scanner(System.in);
    }

    protected String getUserInput(String msg){
        System.out.printf("%s >> ", msg);
        String input = in.nextLine();
        System.out.println();
        return input;
    }
}
