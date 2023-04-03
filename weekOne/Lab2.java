package J03.weekOne;

import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;

public class Lab2 {
    public static void main(String[] args) {
        calculateCircle();
        calculateTriangle();
        oddOrEven();

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
        double triangleWidth = sc.nextInt();
        System.out.println("Please enter the height of the triangle: ");
        double triangleHeight = sc.nextInt();
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
        } 
        else {
            System.out.println("The number is odd.");
        }
    }


}
