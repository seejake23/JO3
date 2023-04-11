package J03.weekTwo.Labs.Lab4.Q4;

import java.util.Scanner;

public class ConsoleIO {
    
    public void displayMessage(String message) {
        System.out.println(message);
    }

    //after the first instance of an x, start counting x's after that
    public void findTheX () {
        Scanner sc = new Scanner(System.in);
        displayMessage("Please enter any word and we will count how many x's are present.");
        String word = sc.nextLine();
        int xCounter = 0;
        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            if (letter == 'x') {
                xCounter += 1;
            }
        }
        if (xCounter >= 1) {
            xCounter -=1;
        }
        displayMessage("There is/are " + xCounter + " x(s) in '" + word + "'. (Not including the initial instance)");

    }
}
