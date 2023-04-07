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
 
        isFactor(5, 25);
        System.out.println("----------------------------------");    
        isPerfect(12, 144);
        System.out.println("----------------------------------");
        isPrime(13, 169);


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
        System.out.println(c + "\n");
        return c;
    }

    public static boolean isFactor(int k, int n) {
        if(n % k == 0) {
            System.out.println(k + " is a factor of " + n);
            return true;
        } else {
            System.out.println(k + " is not a factor of " + n);
            return false;
        }
        
    }

    public static boolean isPerfect(int num1, int num2) {
        if (num1 == 6 || num1 == 28 || num1 == 248) {
            if(isFactor(num1, num2)) {
                System.out.println(num1 + " is a perfect number and a factor of " + num2);
            } else {
                System.out.println(num1 + " is a perfect number and but not a factor of" + num2);
            return true;
            }
        } 
        else if (isFactor(num1, num2)) {
            System.out.println((num1 + " is not perfect number and but is a factor of " + num2)); 
        }
        else {
            if (!isFactor(num1, num2)) {
                System.out.println(num1 + " is neither a perfect number nor a factor of " + num2);
            return false;
            }
        }
        return false;
    }

    public static boolean isPrime(int k, int n) {
        isFactor(k, n);
        if(k <= 1) {
            return false;
        }
        for(int i=2; i < k; i++) {
            if (k % i == 0) {
                System.out.println(k + " is not prime");
                return false;
            }
        }
        System.out.println(k + " is prime");
        return true;
        
    }
}
