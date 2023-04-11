package J03.weekTwo.Labs.Lab4.Q2;

import java.util.Scanner;

public class ConsoleIO {

    public void displayMessage(String message) {
        System.out.println(message);
    }
    
    //take user input for the temp and if it is summer or not, to determine if the squirrels are out playing 
    public void squirrelPlay() {
        Scanner sc = new Scanner(System.in);
        displayMessage("What is the temperature? ");
        int temp = sc.nextInt();
        displayMessage("Is it summer?");
        boolean isSummer = sc.nextBoolean();
        tempUpperLimit(temp, isSummer);

    }


    //temp >= 60 and <= 90 while not summer is true, temp >= 60 and <= 100 while it is summer is true. else, is not true
    public void tempUpperLimit(int temp, boolean isSummer) {
        if (isSummer == true && temp >= 60 && temp <= 100) {
            displayMessage("True, the squirrels are playing.");
        }
        else if (isSummer == false && temp >= 60 && temp <= 90) {
            displayMessage("True, the squirrels are playing.");
        } else {
            displayMessage("False, they are not playing.");
        }
    }
}
