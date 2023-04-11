package J03.weekTwo.Labs.Lab4.Q5;

import java.util.Scanner;

public class ConsoleIO {

    public void displayMessage(String message) {
        System.out.println(message);
    }

    public void repeatedString(String word, int multiplier) {
        String newWord = "";
        for (int i = 0; i < multiplier; i++) {
            newWord = newWord + word;
        }
        displayMessage(newWord);
    }
        
    
}
