package Programming_Bascics_Java_2017;

import java.util.Scanner;

public class p02_233_07_2017 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int stepsCount = Integer.parseInt(scanner.nextLine());
        int dancersCount = Integer.parseInt(scanner.nextLine());
        int learningDays = Integer.parseInt(scanner.nextLine());

        double percentagePerDay = Math.ceil((double)(stepsCount / learningDays) / stepsCount * 100);
        double percentagePerDancer = percentagePerDay / dancersCount;

        if (percentagePerDay > 13){
            System.out.printf("No, They will not succeed in that goal! Required %.2f%% steps to be learned per day.", percentagePerDancer);
        }else {
            System.out.printf("Yes, they will succeed in that goal! %.2f%%.", percentagePerDancer);
        }
    }
}