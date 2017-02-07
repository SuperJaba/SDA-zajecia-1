package zajecia.Szoste;

import zajecia.Zajecia5.ZadanieDo5;
import zajecia.czwarte.ZadaniaZeScannerem;

/**
 * Created by RENT on 2017-02-07.
 */
public class Zajecia6 {
    public static void main(String[] args) {
//        int reCounter = avgUntil(40);
//        System.out.println(reCounter);
        calculator();
    }

    public static void calculator() {
        System.out.println("1. Dodawanie");
        System.out.println("2. Odejmowanie");
        System.out.println("3. Mnożenie");
        System.out.println("4. Dzielenie");
        System.out.println("0. Koniec");
        boolean flag = true;
        while (flag) {
            int numberFromUser = ZadaniaZeScannerem.getNumberFromUser("Podaj nr działania:");
            int firstNumber = 0;
            int secondNumber = 0;
            if (numberFromUser > 0 && numberFromUser < 5) {
                firstNumber = ZadaniaZeScannerem.getNumberFromUser("Pierwsza liczba ?");
                secondNumber = ZadaniaZeScannerem.getNumberFromUser("Druga liczba ?");
            }
            switch (numberFromUser) {
                case 1:
                    System.out.println(firstNumber + " + " + secondNumber + " = " + firstNumber + secondNumber);
                    break;
                case 2:
                    System.out.println(firstNumber + " - " + secondNumber + " = " + firstNumber + secondNumber);
                    break;
                case 3:
                    System.out.println(firstNumber + " * " + secondNumber + " = " + firstNumber * secondNumber);
                    break;
                case 4:
                    if (secondNumber == 0) {
                        System.out.println("Nie dziel przez zero!");
                        secondNumber = ZadaniaZeScannerem.getNumberFromUser("Podaj druga liczbe");
                        System.out.println(firstNumber + " / " + secondNumber + " = " + firstNumber / secondNumber);
                    }
                case 0:
                    flag = false;
                    break;
                default:
                    System.out.println("Wrong data");
                    break;
            }
            System.out.println();
            System.out.println();
        }
    }

    public static int avgUntil(int avg) {
        boolean flag = true;
        int tempSum = 0;
        int counter = 0;
        while (flag) {
            int numberFromUser = ZadaniaZeScannerem.getNumberFromUser();
            tempSum += numberFromUser;
            counter++;
            System.out.println("tempSum: " + tempSum);
            if ((double) tempSum / counter > avg) {
                flag = false;
            }
        }
        return counter;

    }

    public static int sumUntil(int sum) {
        boolean flag = true;
        int counter = 0;
        int numberFromUserSum = 0;
        while (flag) {
            if (numberFromUserSum < sum) {
                int numberFromUser = ZadaniaZeScannerem.getNumberFromUser();
                numberFromUserSum += numberFromUser;
                counter++;
            } else {
                flag = false;
            }
        }
        return counter;
    }
}
