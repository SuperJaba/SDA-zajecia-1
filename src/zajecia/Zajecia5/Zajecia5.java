package zajecia.Zajecia5;

import zajecia.czwarte.ZadaniaZeScannerem;
import zajecia.czwarte.Zajecia4;

import java.util.Random;

/**
 * Created by RENT on 2017-02-06.
 */
public class Zajecia5 {
    public static void main(String[] args) {
//        int number = ZadaniaZeScannerem.getNumberFromUser();
//        square(number);
//        triangle(number);
//        tree(number);
//        oneMatrix(number);
//        evenMatrix(number);
//        System.out.println(sumOfNumbersFromUsers());
//        printArray(arrayOfNumbersFromUser());
        Random random = new Random();
        int iloscKrokowDoZwyciestwa = game(random.nextInt(100));
        System.out.println("Koniec gry");
        System.out.println("Wygrales w " + iloscKrokowDoZwyciestwa + " krokach.");
    }

    public static int game(int number) {
        boolean flag = true;
        int counter = 0;
        while (flag) {
            int numberFromUser = ZadaniaZeScannerem.getNumberFromUser();
            counter++;
            if (numberFromUser == number) {
                flag = false;
            } else if (numberFromUser < number) {
                System.out.println("Za mala liczba.");
            } else {
                System.out.println("Za duza liczba");
            }
        }
        return counter;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static int[] arrayOfNumbersFromUser() {
        int[] tmpArray = new int[100];
        int size = 0;
        boolean flag = true;
        while (flag) {
            int numberFromUser = ZadaniaZeScannerem.getNumberFromUser();
            if (numberFromUser != 0) {
                tmpArray[size] = numberFromUser;
                size++;
            } else {
                flag = false;
            }
        }
        return revriteArray(tmpArray, size);
    }

    public static int[] revriteArray(int[] bigArray, int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = bigArray[i];
        }
        return array;
    }

    public static int sumOfNumbersFromUsers() {
        int sum = 0;
        boolean flag = true;
        while (flag) {
            int numberFromUser = ZadaniaZeScannerem.getNumberFromUser("Insert next number: ");
            if (numberFromUser != 0) {
                sum += numberFromUser;
            } else {
                flag = false;
            }
        }
        return sum;
    }

    public static void oneMatrix(int number) {
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                if (i == j) {
                    System.out.print(1);
                } else {
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }

    public static void evenMatrix(int number) {
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(1);
                } else {
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }

    public static void triangle(int number) {

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void square(int number) {
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void tree(int number) {
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < (number - i) - 1; j++) {
                System.out.print(" ");

            }
            for (int k = 0; k < (i * 2) + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int z = 0; z < number; z++) {
            for (int l = 0; l < number - 1; l++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }


    }

}
