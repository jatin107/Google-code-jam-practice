package codejam2019;

import java.util.Scanner;

public class ForegoneSolutionNew {
    public static void main(String[] arr) {
        try {

            Scanner s = new Scanner(System.in);
            int testlines = s.nextInt(), count = 0;
            String jamcoins, s1, s2;
            while (testlines > 0) {
                testlines--;
                jamcoins = s.next();
                s1 = jamcoins;
                Pair p = find4Occur(s1);

                System.out.print("Case #" + count++ + " " + p.s1 + " " + p.s2);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    private static Pair find4Occur(String s1) {
        StringBuilder r1 = new StringBuilder();
        StringBuilder r2 = new StringBuilder();
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            if (c == '4') {
                r1.append('3');
                r2.append('1');
            } else {
                r1.append(c);
                r2.append('0');
            }
        }

        int zeroCount = 0;
        while (zeroCount < r2.length() && r2.charAt(zeroCount) == '0')
            zeroCount++;

        return new Pair(r1.toString(), r2.substring(zeroCount));

    }

    private static class Pair {
        public String s1;
        public String s2;

        public Pair(String item1, String item2) {
            this.s1 = item1;
            this.s2 = item2;
        }
    }


}

