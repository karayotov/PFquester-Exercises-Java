package Programming_Bascics_Java_2017;

import java.util.Scanner;

public class p05_23_07_2017 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int wight = 5 * num;
        String dot = ".";
        String slash = "#";
        String dance = "D^A^N^C^E^";

        //първа част

        int dotsCount = num;
        int slashesCount = wight - dotsCount * 2;
        String dots = "";
        String slashes = "";
        for (int i = 0; i < num / 2; i++) {
            dots = repeatString(dot, dotsCount);
            slashes = repeatString(slash, slashesCount);
            System.out.println(dots + slashes + dots);
            dotsCount ++;
            slashesCount -= 2;
        }
        
        //втора част

        int middleDotsCount = slashesCount - 2;
        String middleDots = "";
        for (int i = 0; i < num / 2 + 1; i++) {
            dots = repeatString(dot, dotsCount);
            middleDots = repeatString(dot, middleDotsCount);
            System.out.println(dots + slash + middleDots + slash + dots);
            dotsCount ++;
            middleDotsCount -= 2;
        }

        // трета част
        dotsCount --;
        slashesCount = num;
        dots = repeatString(dot, dotsCount);
        slashes = repeatString(slash, slashesCount);
        System.out.println(dots + slashes + dots);

        //четвърта част

        dotsCount -= 2;
        slashesCount += 4;
        dots = repeatString(dot, dotsCount);
        slashes = repeatString(slash, slashesCount);
        for (int i = 0; i < num + 2; i++) {
            if (i == num / 2) {
                int dotsCountDance = (num * 5 - 10) / 2;
                String dotsDance = repeatString(dot, dotsCountDance);
                System.out.println(dotsDance + dance + dotsDance);
            }
            else System.out.println(dots + slashes + dots);
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
