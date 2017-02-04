package zajecia;

/**
 * Created by RENT on 2017-02-04.
 */
public class Zajecia4 {
    public static void main(String[] args) {
        int[] array = {-1, -2, -4, -3, 1, 2, 3, 4, 5, 6, 10, 11};
//        printLessThan(5);
//        printEvenLessThen(8);
//        sumOfLessThan(6);
//        double value = celsiucToFahrentheit(7);
//        System.out.println(value);
        sum(array);
        System.out.println("Suma wszystkich elementow tablicy: " + sum(array));
        lenght(array);
        System.out.println("Długość tablicy: " + lenght(array));
        average(array);
        System.out.println("Srednia z tablicy: " + average(array));
        product(array);
        System.out.println("Iloczyn elementow tablicy: " + product(array));
        sumOfEven(array);
        System.out.println("Suma parzystych z tablicy: " + sumOfEven(array));
    }


    public static void printLessThan(int number) {
        for (int i = 0; i <= number; i++) {
            System.out.println(i);
        }
    }

    public static void printEvenLessThen(int number) {
        for (int i = 0; i < number; i += 2) {
            System.out.println(i);
        }

    }

    public static int sumOfLessThan(int number) {
        int sum = 0;
        for (int i = 0; i <= number; i++) {
            sum += i;

        }
        return sum;
    }

    public static int productOfLessThan(int number) {
        int product = 1;
        for (int i = 1; i <= number; i++) {
            product *= i;
        }
        return product;
    }

    public static double celsiucToFahrentheit(int value) {
        return (value * (9.0 / 5.0)) + 32;
    }

    public static double fahrentheitToCelsius(int value) {
        return (value - 32) / 1.8;
    }

    public static double sum(int[] array) {
        double ave = 0;
        for (int i = 0; i < array.length; i++) {
            ave += array[i];
        }
        return ave;
    }

    public static int lenght(int[] array) {
        int dlugoscTablicy = 0;
        for (int i = 0; i < array.length; i++) {
            dlugoscTablicy = array.length;
        }
        return dlugoscTablicy;
    }

    public static double average(int[] array) {
        double ave = sum(array) / lenght(array);
        return ave;
    }

    public static int product(int[] array) {
        int product = 1;
        for (int i = 0; i < array.length; i++) {
            product *= array[i];
        }
        return product;
    }

    public static int sumOfEven(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (isEven(array[i])) {
                sum += array[i];
            }
        }
        return sum;
    }

    public static int numberOfEven(int[] array){
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (isEven(array[i])) {
                counter++;
            }
        }
        return counter;
    }

    public static int numberOfOdd(int[] array) {
        return array.length - numberOfEven(array); //drugi sposob zwrotu wyniku
//        int number = array.length - numberOfEven(array);
//        return number;

    }

    public static int sumOfOdd(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (isEven(array[i])) {

            }
        }
    }

    public static boolean isEven (int number){
        if (number % 2 == 0){
            return true;
        } return false;
    }
}

