package zajecia.Zajecia5;

import zajecia.czwarte.ZadaniaZeScannerem;
import zajecia.czwarte.Zajecia4;

/**
 * Created by Karamba on 2017-02-07.
 */
public class ZadanieDo5 {
    public static void main(String[] args) {
        printArrayAdres(arrayAdres());
    }

    public static void printArrayAdres(int[] arrayAdres) {
        for (int i = 0; i < arrayAdres.length; i++) {
//            if ( arrayAdres[i] == 0){ gdyby trzeba bylo wyswielic miejsca puste
//                System.out.print(0);
//            }
            for (int j = 0; j < arrayAdres[i]; j++) {
                System.out.print(i);
            }
        }
    }

    public static int[] arrayAdres() {
        int[] array = new int[10];
        System.out.println("Wartosc -1 konczy pobieranie liczb.");
        boolean flag = true;
        while (flag) {
            int numberFromUser = ZadaniaZeScannerem.getNumberFromUser();
            if (numberFromUser == -1) {
                flag = false;
            } else if (numberFromUser > 9) {
                System.out.println("Wprowadz liczbe mniejsza od 9.");
            } else {
                array[numberFromUser]++;
            }
        }
        return array;
    }
}
