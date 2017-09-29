package Programming_Bascics_Java_2017;

import java.util.Scanner;

public class p05_07_05_2017 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        int oddEven = num % 2;
        int length = num / 2 - oddEven - 2;

        String at = "@";
        String star = "*";
        String placeholder = " ";
        String dot = ".";

        //първа част
        String firstPartPlaceholder = repeatString(placeholder, num - 2 + oddEven);
        String firstPart = at + firstPartPlaceholder + at + firstPartPlaceholder + at;
        System.out.println(firstPart);

        //втора част
        String secondPartPlaceHolder = repeatString(placeholder, num - 3 + oddEven);
        String secondPart = star + star + secondPartPlaceHolder + star + secondPartPlaceHolder + star + star;
        System.out.println(secondPart);

        //трета част


        int thirdPartPlaceHolderCount = num - 5 + oddEven;
        int thirdPartDotsCount = 1;
        int thirdPartMiddleDotsCount = thirdPartDotsCount;


        String thirdPartPlaceHolder = "";
        String thirdPartSideDots = "";
        String thirdPartMiddleDots = "";
        String thirdPart = "";


        for (int i = 0; i < length; i++) {

            thirdPartPlaceHolder = repeatString(placeholder, thirdPartPlaceHolderCount);
            thirdPartSideDots = repeatString(dot, thirdPartDotsCount);
            thirdPartMiddleDots = repeatString(dot, thirdPartMiddleDotsCount);
            thirdPart = star + thirdPartSideDots + star + thirdPartPlaceHolder + star + thirdPartMiddleDots + star + thirdPartPlaceHolder + star + thirdPartSideDots + star;

            System.out.println(thirdPart);

            thirdPartDotsCount ++;
            thirdPartMiddleDotsCount += 2;
            thirdPartPlaceHolderCount -= 2;
        }

        //четвърта част

        String fourPartDots = repeatString(dot, thirdPartDotsCount);
        String fourPartMiddleDots = repeatString(dot, thirdPartMiddleDotsCount);
        String fourPart = star + fourPartDots + star + fourPartMiddleDots + star + fourPartDots + star;

        System.out.println(fourPart);


        //пета част
        int fifthPartStarsCount = length;
        String fifthPartStar = repeatString(star, length);
        String fifthPart = star + fourPartDots + dot + fifthPartStar + dot + fifthPartStar + fourPartDots + dot + star;
        System.out.println(fifthPart);

        //шеста част

        String sixthPart = repeatString(star, num * 2 - 1);
        System.out.println(sixthPart);
        System.out.println(sixthPart);




    }
    private static String repeatString(String num, int count) {
        String result = "";
        for (int i = 1; i <= count; i++) {
            result += num;
        }
        return result;
    }
}