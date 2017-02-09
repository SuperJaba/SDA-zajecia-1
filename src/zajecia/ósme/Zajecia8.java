package zajecia.ósme;

/**
 * Created by RENT on 2017-02-09.
 */
public class Zajecia8 {
    public static void main(String[] args) {
        System.out.println(factorial(6));
        System.out.println(factorialRecursion(4));
        System.out.println(fibonacciNumber(6));
        System.out.println(fibonacciNumberRec(6));
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
        return fibonacciNumberRec(index - 2) + fibonacciNumberRec(index -1);
    }

    public static int fibonacciNumber(int index) {
        int left = 0;
        int right = 1;
        int result = 0;

        for (int i = 0; i < index; i++) {
            result = left + right;
            left = right;
            right = result;
        }
        return result;
    }

    public static long factorialRecursion(int number) {
        if (number < 0) {
            return -1;
        }
        if (number == 0) {
            return 1;
        }
        return number * factorial(number - 1);
    }

    public static long factorial(int number) {
        long tmp = 1;
        for (int i = 1; i <= number; i++) {
            if (number < 0) {
                System.out.println("wrong data");
                break;
            } else if (number == 0) {
                tmp = 1;
                break;
            }
            tmp *= i;
        }
        return tmp;
    }
}
