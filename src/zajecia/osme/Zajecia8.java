package zajecia.osme;

import zajecia.siodme.Zajecia7;

import java.math.BigInteger;

public class Zajecia8 {
    public static void main(String[] args) {
//        System.out.println(fibonacciNumberRec(0));
//        System.out.println(fibonacciNumberRec(1));
//        System.out.println(fibonacciNumberRec(2));
//        System.out.println(fibonacciNumberRec(3));
//        System.out.println(fibonacciNumberRec(4));
//        System.out.println(fibonacciNumberRec(5));
//        long l = System.currentTimeMillis();
//        System.out.println(fibonacciNumber(43));
//        System.out.println(System.currentTimeMillis() - l);
//        String message = switchCase("ABCdefGHIjkl");
//        System.out.println(message);
//        System.out.println(switchCaseWithBuilder("KLJHLKjlkjnLKJNLkjnlkjnLJKNLKJN"));
//        System.out.println(-3 % 10);
//        System.out.println(sumOfNumberDigits(1234));
        System.out.println(startsWith2("Ala ma kota", "Ala"));
        System.out.println(startsWith2("Ala ma kota", "Aleksander"));
        System.out.println(startsWith2("Aleksander", "Ala ma kota"));
    }


    //"Ala ma kota" -> {"Ala", "ma", "kota"}
//    public static String[] words(String message) {
//        return null;
//    }

    public static int sumOfNumberDigitsWithString(int number) {
        String numberAsString = String.valueOf(number);
        return Zajecia7.sumFromString(numberAsString);
    }


    public static boolean startsWith1(String message, String expression) {
        return message.startsWith(expression);
    }
    /**
     * Can throw exception
     */
    public static boolean startsWith2(String message, String expression) {
        return message.substring(0, expression.length()).equals(expression);
    }

    public static boolean startsWith3(String message, String expression) {
        char[] messageAsCharArray = message.toCharArray();
        char[] expressionAsCharArray = expression.toCharArray();
        boolean flag = true;
        for (int i = 0; i < expressionAsCharArray.length; i++) {
            if (messageAsCharArray[i] != expressionAsCharArray[i]) {
                flag = false;
            }
        }
        return flag;
    }

    public static int sumOfNumberDigits(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    public static String switchCase(String message) {
        char[] charArray = message.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] >= 65 && charArray[i] <= 90) {
                charArray[i] += 32;
            } else if (charArray[i] >= 97 && charArray[i] <= 122) {
                charArray[i] -= 32;
            }
        }
        return String.valueOf(charArray);
    }

    public static String switchCaseWithBuilder(String message) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            char tmp = message.charAt(i);
            if (tmp >= 65 && tmp <= 90) {
                stringBuilder.append((char) (tmp + 32));
            } else if (tmp >= 97 && tmp <= 122) {
                stringBuilder.append((char) (tmp - 32));
            } else {
                stringBuilder.append(tmp);
            }
        }
        return stringBuilder.toString();
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
        if (index < 0) {
            return -1;
        }
        if (index < 2) {
            return index;
        }
        for (int i = 2; i <= index; i++) {
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
        for (int i = 2; i <= number; i++) {
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
