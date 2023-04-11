package J03.weekTwo.Labs.Lab4.Q3;

import java.util.Scanner;

public class ConsoleIO {

    public void displayMessage(String message) {
        System.out.println(message);
    }
    
    public void lotteryTicket() {
        Scanner sc = new Scanner(System.in);
        displayMessage("Please enter the three numbers on your lottery ticket (numbers must be 1, 2 or 3)");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        determineWinnings(num1, num2, num3);
    }

    public void determineWinnings(int num1, int num2, int num3) {
        int winnings = 0;
        if  (num1 == num2 && num1 == num3) {
            winnings = 20;
            displayMessage("You have won $" + winnings);
        }
        else if ((num1 == num2) || (num1 == num3) || (num2 == num3)) {
            winnings = 10;
            displayMessage("You have won $" + winnings);
        } else {
            displayMessage("You have won $" + winnings);
        }
    }
}
