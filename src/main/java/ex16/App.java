/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Mauricio Rios
 */
package ex16;

import java.util.Scanner;

public class App {
    Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();
        int age = myApp.getAge();
        String outputString = myApp.getDrive(age);
        myApp.printOutput(outputString);
    }

    public int getAge() {
        System.out.print("Whats is your age? ");
        return in.nextInt();
    }

    public String getDrive(int age) {
        if(age>15)
            return "Your are old enough to legally drive.";
        else
            return "You are not old enough to legally drive";
    }

    public void printOutput(String outputString) {
        System.out.print(outputString);
    }
}
