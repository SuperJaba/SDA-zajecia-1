package zajecia.szoste;

import zajecia.czwarte.ZadaniaZeScannerem;

import java.util.Scanner;

public class Zajecia6 {
    public static void main(String[] args) {
        System.out.println("Zakodowane: ");
        String message = "Wojna";
        String codded = cezarCode(message, 2);
        System.out.println(codded);

        System.out.println("Odkodowane: ");
        System.out.println(decodeCezarCode(codded, 2));
    }

    public static String decodeCezarCode(String coddedMessage, int key) {
        return cezarCode(coddedMessage, -key);
    }

    public static String decodeCezarCode(String coddedMessage) {
        return cezarCode(coddedMessage, -1);
    }

    public static String cezarCode(String message) {
        return cezarCode(message, 1);
    }

    public static String cezarCode(String message, int key) {
        char[] charArray = message.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = (char) (charArray[i] + key);
        }
        return String.valueOf(charArray);
    }

    public static boolean isSmallLetter(char a) {
        if (a >= 97 && a <= 122) {
            return true;
        } else {
            return false;
        }
    }

    public static void calculator() {
        boolean flag = true;
        while (flag) {
            System.out.println("1. Dodawanie");
            System.out.println("2. Odejmowanie");
            System.out.println("3. Mnozenie");
            System.out.println("4. Dzielenie");
            System.out.println("0. Koniec");
            int nrDzialania = ZadaniaZeScannerem.getNumberFromUser("Podaj nr dzialania");
            int firstNumber = 0;
            int secondNumber = 0;
            if (!(nrDzialania > 0 && nrDzialania < 5)) {

            }
            if (nrDzialania > 0 && nrDzialania < 5) {
                firstNumber = ZadaniaZeScannerem.getNumberFromUser("Podaj pierwsza liczbe");
                secondNumber = ZadaniaZeScannerem.getNumberFromUser("Podaj druga liczbe");
            }
            switch (nrDzialania) {
                case 1:
                    System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));
                    break;
                case 2:
                    System.out.println(firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber));
                    break;
                case 3:
                    System.out.println(firstNumber + " * " + secondNumber + " = " + (firstNumber * secondNumber));
                    break;
                case 4:
                    if (secondNumber == 0) {
                        System.out.println("Nie dziel przez 0");
                    } else {
                        System.out.println(firstNumber + " / " + secondNumber + " = " + (firstNumber / secondNumber));
                    }
                    break;
                case 0:
                    flag = false;
                    break;
                default:
                    System.out.println("Podano niepoprawna operacje");
                    break;
            }
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
        }
    }

    public static int sumUntil(int sum) {
        int tmpSum = 0;
        int counter = 0;
        boolean flag = true;
        while (flag) {
            int numberFromUser = ZadaniaZeScannerem.getNumberFromUser();
            counter++;
            tmpSum += numberFromUser;
            System.out.println("tmpSum:" + tmpSum);
            if (tmpSum > sum) {
                flag = false;
            }
        }
        return counter;
    }

    public static int avgUntil(int avg) {
        boolean flag = true;
        int sum = 0;
        int counter = 0;
        while (flag) {
            int numberFromUser = ZadaniaZeScannerem.getNumberFromUser();
            sum += numberFromUser;
            counter++;
            if ((double) sum / counter > avg) {
                flag = false;
            }
        }
        return counter;
    }
}
