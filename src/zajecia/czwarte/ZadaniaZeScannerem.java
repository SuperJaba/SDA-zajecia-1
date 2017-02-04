package zajecia.czwarte;

import java.util.Scanner;

/**
 * Created by RENT on 2017-02-04.
 */
public class ZadaniaZeScannerem {
    public static void main(String[] args) {
        int[] array = {4, 3, 2, 2, 6, 8, 11, -2};
//        scanerExample();
//        checkNumberFromUser();
//        compareThreeNumbers();
//        int numberFromUser = getNumberFromUser();
//        int numberFromUser1 = getNumberFromUser("Podaj swoja liczbe ");
//        System.out.println(min(array));
//        System.out.println(max(array));
//        System.out.println("Grade system 2000.");
//        double avg = avgOfGrades();
//        System.out.println("Avg of your grade is: " + avg);
        calculator();
    }

    public static void calculator() {
        System.out.println("1. Dodawanie");
        System.out.println("2. Odejmowanie");
        System.out.println("3. Mnożenie");
        System.out.println("4. Dzielenie");
        int operation = getNumberFromUser("Chose your decision");
        if (operation < 0 || operation > 4) {
            System.out.println("Wrong data!");
        } else {
            int firstNumber = getNumberFromUser("Insert first number");
            int secondNumber = getNumberFromUser("Insert second number");
            if (operation == 1) {
                System.out.println(firstNumber + secondNumber);
            } else if (operation == 2) {
                System.out.println(firstNumber - secondNumber);
            } else if (operation == 3) {
                System.out.println(firstNumber * secondNumber);
            } else if (operation == 4) {
                if (secondNumber == 0) {
                    System.out.println("Nie dziel przez 0!");
                }
                System.out.println(firstNumber / secondNumber);
            }

        }

    }

    public static double avgOfGrades() {
        int size = getNumberFromUser("Insert number of grades.");
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = getNumberFromUser("Insert " + (i + 1) + " grade.");
        }
        return Zajecia4.average(array);

    }

    public static void scanerExample() { //przyklad scanera
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert your name: ");
        String name = scanner.nextLine();
        System.out.println("Please insert your last name: ");
        String lastName = scanner.nextLine();

        System.out.println("Your name is " + name + " " + lastName);
    }


    public static int getNumberFromUser() {
        return getNumberFromUser("Please insert your number: ");

    }

    public static int getNumberFromUser(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextInt();
    }

    public static void checkNumberFromUser() {
        int number = getNumberFromUser();
        Zajecia4.printLessThan(number);
    }

    public static void compareThreeNumbers() {
        int a = getNumberFromUser("Insert first number:");
        int b = getNumberFromUser("Insert second number:");
        int c = getNumberFromUser("Insert third number:");

        System.out.println("Max: " + max(a, b, c));
        System.out.println("min: " + min(a, b, c));
    }

    public static void listNumbersFromUser() {
        int number = getNumberFromUser();
        Zajecia4.printLessThan(number);
    }

    public static void listEvenNumbersFromUser() {
        int number = getNumberFromUser();
        Zajecia4.printEvenLessThen(number);
    }

    public static int max(int a, int b, int c) {
        int[] array = {a, b, c};
        return max(array);
    }

    public static int min(int a, int b, int c) {
        int[] array = {a, b, c};
        return min(array);
    }

    public static int min(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int max(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}



