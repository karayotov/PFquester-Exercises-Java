package Programming_Bascics_Java_2017;

import java.util.Scanner;

public class p06_09_2017 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countOne = Integer.parseInt(scanner.nextLine());
        int countTwo = Integer.parseInt(scanner.nextLine());
        int countFive = Integer.parseInt(scanner.nextLine());
        int sum = Integer.parseInt(scanner.nextLine());

        int counterOne = 0;
        int counterTwo = 0;
        int counterFive = 0;
        int one = 0;
        int two = 0;
        int five = 0;


        for (int i = 0; i < countOne; i++) {
            counterOne ++;
            one ++;
            for (int j = 0; j < countTwo; j++) {
                counterTwo += 2;
                two++;
                for (int k = 0; k < countFive; k++) {
                    counterFive += 5;
                    five++;

                    //System.out.println(counterOne);
                    //System.out.println(counterTwo);
                    //System.out.println(counterFive);
                    if (countOne * i + countTwo * j + countFive * k == sum || countOne * i == sum|| countTwo * j == sum || countFive * k == sum){
                        System.out.printf("%d * 1 lv. + %d * 2 lv. + %d * 5 lv. = %d lv.\n", i, j, k, sum);
                    }
                }
            }
        }
    }
}