package J03.weekOne;

import java.util.*;
import java.lang.Math;
import java.text.DecimalFormat;

public class Lab2 {
    public static void main(String[] args) {
        calculateCircle();
        calculateTriangle();
        oddOrEven();
        intToDouble();
        letterToAscii();
        doubleToInt();
        leapYear();

    }

    public static void calculateCircle() {
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the radius of the circle: ");
        double radius = sc.nextInt();
        double cirArea = Math.PI * (radius * radius);
        double circumference = 2 * Math.PI * radius;
        System.out.println("\nThe area of the circle is " + df.format(cirArea) + ".");
        System.out.println("The circumference of the circle is " + df.format(circumference) + ".\n");
    }

    public static void calculateTriangle() {
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the base-width of the triangle: ");
        double triangleWidth = sc.nextDouble();
        System.out.println("Please enter the height of the triangle: ");
        double triangleHeight = sc.nextDouble();
        double triArea = 0.5 * (triangleWidth * triangleHeight);
        System.out.println("The area of the triangle is " + df.format(triArea) + ".");
    }

    public static void oddOrEven() {
        String answer;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number to determine if it is odd or even: ");
        int userNumber = sc.nextInt();
        if (userNumber % 2 == 0) {
            answer = "even";
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }
    }

    public static void intToDouble() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a whole number to be converted to a single decimal point: ");
        int wholeNumber = sc.nextInt();
        double singleDecimal = (double) wholeNumber;
        System.out.println("You entered " + wholeNumber + ", the new value is " + singleDecimal + ".");
    }

    public static void letterToAscii () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a letter to have it converted to its acsii code: ");
        String userInput = sc.nextLine(); 
        char letter = userInput.charAt(0);
        int ascii = (int) letter;
        System.out.println("The acii code for "+ "'"+ letter+ "'" + " is " + ascii + ".");
    }

    public static void doubleToInt() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number with decimals to be converted to a to a whole number(rounded properly): ");
        double decimalNumber = sc.nextDouble();
        int wholeNumber = (int) Math.round(decimalNumber);
        System.out.println("You entered " + decimalNumber + ", the new value is " + wholeNumber + ".");

    }

    public static void leapYear() {
        Scanner sc = new Scanner(System.in);
        System.out.println("What year would you like to check, to see if it was a leap year?: ");
        int year = sc.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("The year is a leap year (it has 366 days).");
                } else {
                    System.out.println("The year is not a leap year (it has 365 days).");
                }
            } else {
                System.out.println("The year is not a leap year (it has 365 days).");
            }
        } else {
            System.out.println("The year is not a leap year (it has 365 days).");
        }
    }

}
