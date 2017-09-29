package Programming_Bascics_Java_2017;

import java.util.Scanner;

public class p05_09_2017 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        String dot = ".";
        String star = "*";

        //първа част
        int dotsCount = num;
        int sideDotsCount = num - dotsCount;
        String dots = "";
        String sideDots = "";
        for (int i = 0; i < num - 1; i++) {
            dots = repeatString(dot, dotsCount);
            sideDots = repeatString(dot, sideDotsCount);
            System.out.println(sideDots + star + dots + star + dots + star + sideDots);
            dotsCount --;
            sideDotsCount++;
        }

        //втора част
        String middleStars = repeatString(star, 5);
        sideDots = repeatString(dot, sideDotsCount);
        System.out.println(sideDots + middleStars + sideDots);

        //трета част / среда /

        String center = repeatString(star, 2 * num + 3);
        System.out.println(center);

        //четвърта част /като втора/

        System.out.println(sideDots + middleStars + sideDots);

        //пета част
        dotsCount ++;
        sideDotsCount--;
        for (int i = 0; i < num - 1; i++) {
            dots = repeatString(dot, dotsCount);
            sideDots = repeatString(dot, sideDotsCount);
            System.out.println(sideDots + star + dots + star + dots + star + sideDots);
            dotsCount ++;
            sideDotsCount--;
        }

    }
    private static String repeatString(String num, int count) {
        String result = "";
        for (int i = 1; i <= count; i++) {
            result += num;
        }
        return result;
    }
}