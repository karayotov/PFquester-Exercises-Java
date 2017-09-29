package Programming_Bascics_Java_2017;

import java.util.Scanner;

public class p02_23_07_2017 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double tripPrice = Double.parseDouble(scanner.nextLine());
        int puzzlesCount = Integer.parseInt(scanner.nextLine());
        int talkingDollsCount = Integer.parseInt(scanner.nextLine());
        int teddyBearsCount = Integer.parseInt(scanner.nextLine());
        int minionsCount = Integer.parseInt(scanner.nextLine());
        int toyTruckCount = Integer.parseInt(scanner.nextLine());

        double puzzle = 2.6;
        int talkingDoll = 3;
        double teddyBear = 4.1;
        double minion = 8.2;
        int truckToy = 2;

        double puzzlesPrice = puzzlesCount * puzzle;
        int talkingDollsPrice = talkingDollsCount * talkingDoll;
        double teddyBearsPrice = teddyBearsCount * teddyBear;
        double minionsPrice = minionsCount * minion;
        int truckToysPrice = toyTruckCount * truckToy;

        double toysPrice = puzzlesPrice + talkingDollsPrice + teddyBearsPrice + minionsPrice + truckToysPrice;
        int toysCount = puzzlesCount + talkingDollsCount + teddyBearsCount + minionsCount + toyTruckCount;

        if (toysCount >= 50){

            toysPrice -= toysPrice * 0.25;
        }

        double afterRent = toysPrice - toysPrice * 0.1;
        double margin = afterRent - tripPrice;

        if (afterRent < tripPrice) System.out.printf("Not enough money! %.2f lv needed.", Math.abs(margin));
        else System.out.printf("Yes! %.2f lv left.", Math.abs(margin));

    }
}