package J03.weekOne;

public class Lab1 {
    
    public static void main(String[] args) {
        int maxNum = max3(25, 99, 11);
        System.out.println("The max value is " + maxNum);

        int minNum = min3(25, 99, 11);
        System.out.println("The min value is " + minNum);

        int middleNum = middle3(25, 99, 11);
        System.out.println("The middle value is " + middleNum);
        
        xor();


    }

    public static int max3(int num1, int num2, int num3) {
        int maxNum = num1;
        if (maxNum < num2) {
            maxNum = num2; 
        }
        if (maxNum < num3) {
            maxNum = num3; 
        }
        return maxNum;
    }

    public static int min3(int num1, int num2, int num3) {
        int minNum = num1;
        if (minNum > num2) {
            minNum = num2; 
        }
        if (minNum > num3) {
            minNum = num3; 
        }        
        return minNum;
    }

    public static int middle3(int num1, int num2, int num3) {
        int middleNum = num1 + num2 + num3;
        int max = max3(num1, num2, num3);
        int min = min3(num1, num2, num3);
        middleNum = middleNum - max - min;
        return middleNum;        
    }
    public static boolean xor() {
        boolean a = true;
        boolean b = false; 
        boolean c = a ^ b;
        System.out.println(c);
        return c;
    }

 }
