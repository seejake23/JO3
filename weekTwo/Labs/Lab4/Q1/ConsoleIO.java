package J03.weekTwo.Labs.Lab4.Q1;

import java.util.Scanner;

public class ConsoleIO {


    // prints out whatever message is passed
    public void displayMessage(String message) {
        System.out.println(message);
    }

    //return the sum of the two numbers, unless the sum is more than 1 digit, then only return a
    public void returnSumOrFirstInt() {
        displayMessage("Please enter two non-negative integers!");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        if (sum > 9) {
            displayMessage("The sum is more than 1 digit here is " + a);
        } else {
            displayMessage("The sum of 'a' and 'b' is " + sum);
        }

    }
}
