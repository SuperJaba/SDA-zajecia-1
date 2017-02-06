package zajecia;

import java.util.Scanner;

/**
 * Created by Karamba on 2017-02-03.
 */
public class CwiczeniaPraca {
    public static void main(String[] args) {
        int[] aray = {-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5,};
//        sumPositive(aray);
//        System.out.println(sumPositive(aray));
//        System.out.println();
//        sumNegative(aray);
//        System.out.println(sumNegative(aray));
        nadgodziny();
    }

    public static void nadgodziny() {
        double iloscNadgodzin = getNumber("Podaj liczbe nadgodzin:");
        double stawkaBrutto = getNumber("Podaj swoja stawke brutto:");
        double zarobek = iloscNadgodzin * stawkaBrutto * 0.71 * 1.5;
        System.out.println("Zarobiles dotychczas: " + zarobek);
    }

    public static double getNumber() {
        return getNumber("Podaj swoja liczbe:");
    }

    public static double getNumber(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextDouble();
    }


    public static int sumPositive(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                sum += array[i];
            }
        }
        return sum;
    }

    public static int sumNegative(int[] array) {
        int sumNeg = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                sumNeg += array[i];
            }
        }
        return sumNeg;
    }

}
