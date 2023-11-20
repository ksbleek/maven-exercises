package kbleek;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter something:");
        String userInput = scanner.nextLine();
        if(StringUtils.isNumeric(userInput)){
            System.out.println(userInput + " is a numeric");
        } else {
            System.out.println(userInput + " is not a numeric");
        }
        System.out.println(StringUtils.swapCase(userInput));
        System.out.println(StringUtils.reverse(userInput));
    }
}