package zajecia.siodme;

import java.util.Random;

public class Zajecia7 {
    public static void main(String[] args) {
        boolean check = checkRoundBraces("(2+3*(2+4*(5/7)))");
        System.out.println(check);
    }

    public static boolean checkRoundBraces(String message) {
        char[] charArray = message.toCharArray();
        int counter = 0;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == '(') {
                counter++;
            } else if (charArray[i] == ')') {
                counter--;
                if (counter < 0) {
                    break;
                }
            }
        }
        return counter == 0;
    }

    public static int sumFromString(String message) {
        int sum = 0;
        char[] charArray = message.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] >= 48 && charArray[i] <= 57) {
                sum += charArray[i] - 48;
            }
        }
        return sum;
    }

    public static String convertSpaces(String message) {
        char[] charArray = message.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == 95) {
                charArray[i] = (char) 32;
            }
        }
        return String.valueOf(charArray);
    }

    public static boolean isPalindrome(String message) {
        char[] charArray = message.toCharArray();
        for (int i = 0; i < charArray.length / 2; i++) {
            if (charArray[i] != charArray[charArray.length - i - 1]){
                return false;
            }
        }
        return true;
    }

    public static String reverseString(String message) {
        char[] charArray = message.toCharArray();
        for (int i = 0; i < charArray.length / 2; i++) {
            char tmp = charArray[i];
            charArray[i] = charArray[charArray.length - i - 1];
            charArray[charArray.length - i - 1] = tmp;
        }
        return String.valueOf(charArray);
    }

    public static int[] stringStatistics(String message) {
        int[] statisticsArray = new int[26];
        char[] charArray = message.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] >= 97 && charArray[i] <= 122) {
                int index = charArray[i] - 97;
                statisticsArray[index]++;
            }
        }
        return statisticsArray;
    }

    public static void printStringStatistics(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i]; j++) {
                System.out.print((char) (i + 97));
            }
        }
    }

    public static String randomLowerCase(int size) {
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < size; i++) {
            int generatedValue = random.nextInt(26) + 97;
            stringBuilder.insert(0, (char) generatedValue);
        }
        return stringBuilder.toString();
    }
}
