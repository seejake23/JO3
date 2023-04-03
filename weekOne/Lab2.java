package J03.weekOne;

import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;


public class Lab2 {
    public static void main (String[]args) {
        calculateCircle();
        
    }

    

    public static void calculateCircle () {
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the radius of the circle");
        int radius = sc.nextInt();
        double area = Math.PI * (radius * radius);
        double circumference = 2 * Math.PI * radius;
        System.out.format("The area of the circle is " + df.format(area) + ".");
        System.out.println("The circumference of the circle is " + df.format(circumference) + ".");
    }


}
