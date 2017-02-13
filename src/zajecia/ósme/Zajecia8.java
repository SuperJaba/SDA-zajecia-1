package zajecia.ósme;

import zajecia.siodme.Zajecia7;

/**
 * Created by RENT on 2017-02-09.
 */
public class Zajecia8 {
    public static void main(String[] args) {
        System.out.println(factorial(6));
        System.out.println(factorialRecursion(4));
        System.out.println(fibonacciNumber(6));
        System.out.println(fibonacciNumberRec(6));
        System.out.println(switchCase("adhbfguAHNBT"));
        System.out.println(switchCaseBuilder("adfghADFGH"));
        System.out.println(sumOfNumberDigits(1234567));
        System.out.println(startsWith1("Ala ma kota", "Ala"));
        System.out.println(startsWith2("Ala ma kota", "Aleksander"));
        System.out.println(startsWith3("Ala ma 2 koty", "Aleksiej"));
        System.out.println(split1("Ala ma kota"));
        String message = "Ala ma kota";
        System.out.println(startsWith2("Ala ma kota", "Aleksander"));
        String[] array = split2(message);
        System.out.println(startsWith2("Aleksander", "Ala ma kota"));
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static String[] split1(String message) {
        return message.split(" ");
    }

    public static String[] split2(String message) {
        String[] strings = new String[100];
        int i = 0;
        boolean flag = true;
        int tmp = 0;
        while (flag) {
            int indexOfSpace = message.indexOf(' ', tmp);
            String substring;
            if (indexOfSpace == -1) {
                substring = message.substring(tmp);
            } else {
                substring = message.substring(tmp, indexOfSpace);
            }
            tmp = indexOfSpace + 1;
            strings[i] = substring;
            i++;
            if (indexOfSpace == -1) {
                flag = false;
            }
        }
        return rewrite(strings, i);
    }

    public static String[] rewrite(String[] array, int size) {
        String[] tmpArray = new String[size];
        for (int i = 0; i < size; i++) {
            tmpArray[i] = array[i];
        }
        return tmpArray;
    }

    public static boolean startsWith1(String message, String expresion) {
        return message.startsWith(expresion);
    }

    public static boolean startsWith2(String message, String expresion) {
        return message.substring(0, expresion.length()).equals(expresion);
    }

    public static boolean startsWith3(String message, String expresion) {
        char[] messageAsCcharArray = message.toCharArray();
        char[] expressionAsCharArray = expresion.toCharArray();
        boolean flag = true;
        for (int i = 0; i < expressionAsCharArray.length; i++) {
            if (messageAsCcharArray[i] != expressionAsCharArray[i]) {
                flag = false;
            }
        }
        return true;
    }


    public static int sumOfNumberDigitsWithString(int number) {
        String numberAsString = String.valueOf(number);
        return Zajecia7.sumFromString(numberAsString);
    }

    public static int sumOfNumberDigits(int number) {
        int sum = 0;
        while (number != 0) {
            sum += (number % 10);
            number /= 10;
        }
        return sum;
    }

    public static String[] words(String message) {
        char[] messageArray = message.toCharArray();
        for (int i = 0; i < message.length(); i++) {

        }
        return null;
    }

    public static String switchCaseBuilder(String message) {
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

    public static String switchCase(String message) {
        char[] messageArray = message.toCharArray();
        for (int i = 0; i < messageArray.length; i++) {
            if (messageArray[i] >= 97 && messageArray[i] <= 122) {
                messageArray[i] -= 32;
            } else if (messageArray[i] >= 65 && messageArray[i] <= 90) {
                messageArray[i] += 32;
            }
        }
        return String.valueOf(messageArray);
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
