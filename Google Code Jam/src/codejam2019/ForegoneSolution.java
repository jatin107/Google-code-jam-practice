package codejam2019;

import java.util.Scanner;

public class ForegoneSolution {

    public static void main(String[] arr) {
        try {

            Scanner s = new Scanner(System.in);
            int testlines = s.nextInt();
            int jamcoins, s1, s2, place = 1;
            while (testlines > 0) {
                testlines--;
                jamcoins = s.nextInt();
                s1 = jamcoins;
                s2 = 0;
                s1 = find4Occur(s1, s2, place);
                s2 = jamcoins - s1;
                System.out.print(s1 + " " + s2);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    private static int find4Occur(int s1, int s2, int place) {
        int placeMulti = place * 10;
        if (((s1 % placeMulti - (s1 % placeMulti) % place) / place) == 4) {
            s1 -= 1 * place;
            s2 += place;
        }
        if (placeMulti > s1)
            return s1;
        else {
            return find4Occur(s1, s2, placeMulti);
        }
    }


}

