package Programming_Bascics_Java_2017;

import java.util.Scanner;

public class p04_25_06_2017 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        String slash = "#";
        String dot = ".";
        String placeHolder = " ";
        String at = "(@)";

        int placeHolderCount = 1;
        int dotsCount = 1;
        int triangleSlashCount = num * 2 - dotsCount;
        String thirdPartPlaceHolder = "";

        //първа част
        String firstPart = repeatString(slash, (4 * num) + 1);
        System.out.println(firstPart);

        //втора част
        for (int i = 0; i < num / 2; i++){
            String dots = repeatString(dot, dotsCount);
            String triangleSlash = repeatString(slash, triangleSlashCount);
            String spaceBetweenTriangles = repeatString(placeHolder, placeHolderCount);
            dotsCount++;
            triangleSlashCount -= 2;
            placeHolderCount += 2;

            System.out.println(dots + triangleSlash + spaceBetweenTriangles + triangleSlash + dots);
        }

        //трета част
        int thirdPartDotsCount = dotsCount;
        String thirdPartDots = repeatString(dot, thirdPartDotsCount);
        String thirdPartSlashes = repeatString(slash, triangleSlashCount);
        if (num % 2 == 0){
            thirdPartPlaceHolder = repeatString(placeHolder, triangleSlashCount / 2);
        }else {
            thirdPartPlaceHolder = repeatString(placeHolder, (triangleSlashCount / 2) - 1);
        }
        System.out.println(thirdPartDots + thirdPartSlashes + thirdPartPlaceHolder + at
                            + thirdPartPlaceHolder + thirdPartSlashes + thirdPartDots);

        //-------------------------------------------------------------------------------
        //четвърта част
        dotsCount++;
        triangleSlashCount -= 2;
        placeHolderCount += 2;

        if (num % 2 == 0){
            for (int i = 0; i < (num / 2) - 1; i++){
                String dots = repeatString(dot, dotsCount);
                String triangleSlash = repeatString(slash, triangleSlashCount);
                String spaceBetweenTriangles = repeatString(placeHolder, placeHolderCount);
                dotsCount++;
                triangleSlashCount -= 2;
                placeHolderCount += 2;
                System.out.println(dots + triangleSlash + spaceBetweenTriangles + triangleSlash + dots);
            }
        }else {
            for (int i = 0; i < num / 2; i++) {
                String dots = repeatString(dot, dotsCount);
                String triangleSlash = repeatString(slash, triangleSlashCount);
                String spaceBetweenTriangles = repeatString(placeHolder, placeHolderCount);
                dotsCount++;
                triangleSlashCount -= 2;
                placeHolderCount += 2;
                System.out.println(dots + triangleSlash + spaceBetweenTriangles + triangleSlash + dots);
            }
        }
        //пета част
        int triangleSlashCountFive = num * 2 - 1;
        int dotsCountFive = num + 1;
        for (int i = 0; i < num; i++) {
            String dots = repeatString(dot, dotsCountFive);
            String triangleSlash = repeatString(slash, triangleSlashCountFive);
            dotsCountFive++;
            triangleSlashCountFive -= 2;
            System.out.println(dots + triangleSlash + dots);
        }
    }
    private static String repeatString(String symbol, int count) {
        String result = "";
        for (int i = 0; i < count; i++) {
            result += symbol;
        }
        return result;
    }
}
