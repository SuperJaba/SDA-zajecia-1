package zajecia.osme;

import java.math.BigInteger;

public class Zajecia8 {
    public static void main(String[] args) {
        System.out.println(fibonacciNumberRec(0));
        System.out.println(fibonacciNumberRec(1));
        System.out.println(fibonacciNumberRec(2));
        System.out.println(fibonacciNumberRec(3));
        System.out.println(fibonacciNumberRec(4));
        System.out.println(fibonacciNumberRec(5));
        long l = System.currentTimeMillis();
        System.out.println(fibonacciNumber(43));
        System.out.println(System.currentTimeMillis() - l);
    }

    public static int fibonacciNumberRec(int index) {
        if (index < 0) {
            return -1;
        }
        if (index == 0) {
            return 0;
        }
        if (index == 1) {
            return 1;
        }
        return fibonacciNumberRec(index - 2) + fibonacciNumberRec(index - 1);
    }

    /**
     * TODO sprawdzic co nie dziala
     */
    public static int fibonacciNumber(int index) {
        int left = 0;
        int right = 1;
        int result = 0;
        for (int i = 0 ; i <= index ; i++) {
            result = left + right;
            left = right;
            right = result;
        }
        return result;
    }

    /**
     * returns factorial from number
     * if wrong input (e.g. -5) then return -1
     */
    public static long factorial(int number) {
        long tmp = 1;
        for (int i = 2; i <= number ; i++) {
            tmp *= i;
        }
        return tmp;
    }

    public static long factorialRecursion(int number) {
        if (number < 0) {
            return -1;
        }
        if (number == 0) {
            return 1;
        }
        return number * factorialRecursion(number - 1);
    }
}
