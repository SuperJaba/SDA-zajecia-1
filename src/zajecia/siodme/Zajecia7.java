package zajecia.siodme;

import java.util.Random;

/**
 * Created by RENT on 2017-02-08.
 */
public class Zajecia7 {
    public static void main(String[] args) {
        printStringStatistics(stringStatistics("se   baz"));
        String randomString = randomLowerCase(100);
        printStringStatistics(stringStatistics(randomString));
        convertSpaces("Ala_ma_kota.");
        System.out.println(reverseString("masakiera z klamrami"));
        String message = "Ala ma 2 koty i 3 psy";
        int sum = sumFromString(message);
        System.out.println("Ala ma " + sum + " zwierzat.");
    }


    public static int sumFromString(String message) {
        char[] charArray = message.toCharArray();
        int sum = 0;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] > 47 && charArray[i] < 58) {
                sum += charArray[i] - 48;
            }
        }
        return sum;
    }

    public static boolean isPalindrom(String message) {
        char[] charArray = message.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] != charArray[charArray.length -i -1]) {
                return false;
            }
        }
        return true;
    }

    public static String reverseString(String message) {
        char[] charArray = message.toCharArray();
        for (int i = 0; i < charArray.length / 2; i++) {
            char tmp = charArray[i];
            charArray[i] = charArray[charArray.length - i -1];
            charArray[charArray.length - i -1] = tmp;
        }
        return String.valueOf(charArray);
    }


    public static String convertSpaces(String message2) {
        char[] messageArray = message2.toCharArray();
        for (int i = 0; i < messageArray.length; i++) {
            if (messageArray[i] == 95) {
                messageArray[i] = (char) 32;
            }
        }
        return String.valueOf(messageArray);
    }


    public static String randomLowerCase(int size) {
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < size; i++) {
            int generatedValue = random.nextInt(26) + 97;
            stringBuilder.append((char) generatedValue);
        }
        return stringBuilder.toString();

//    public static String randomLowerCase(int size){
        /* problem tworzenia Stringa w pamiecie za kazdym razem
        jak dopisujemy kolejna litere
         */
//        Random random = new Random();
//        String tmpMessage = " ";
//        for (int i = 0; i < size; i++) {
//            int generatedValue = random.nextInt(26) + 97;
//            String generatedValueAsString = String.valueOf((char)(generatedValue));
//            tmpMessage += generatedValueAsString;
//        }
//        return tmpMessage;
//    }

//    public static String randomLowerCase(int size){ // nie do konca dobra metoda
//        int[] statisticArray = new int[26];
//        Random random = new Random();
//        char[] chars = new char[size];
//        for (int i = 0; i < chars.length; i++) {
//            int generatedValue = random.nextInt(26) + 97;
//            chars[i] = (char)generatedValue;
//
//            }
//            return String.valueOf(chars);
//        }
    }

        public static int[] stringStatistics(String messege){
            int[] statisticArray = new int[26];
            char[] messegArray = messege.toCharArray();
            for (int i = 0; i < messegArray.length; i++) {
                if (messegArray[i] >= 97 && messegArray[i] <= 122) {
                    int index = messegArray[i] - 97;
                    statisticArray[index]++;
                }
            }

            return statisticArray;
        }

    public static void printStringStatistics(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i]; j++) {
                System.out.print((char) (i + 97));
            }
        }
    }
}
