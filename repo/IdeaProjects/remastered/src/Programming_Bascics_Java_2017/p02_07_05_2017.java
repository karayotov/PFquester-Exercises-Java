package Programming_Bascics_Java_2017;

import java.util.Scanner;

public class p02_07_05_2017 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double tour = Double.parseDouble(scanner.nextLine());
        double puzzlesCount = Double.parseDouble(scanner.nextLine());
        double dollsCount = Double.parseDouble(scanner.nextLine());
        double teddyBearCount = Double.parseDouble(scanner.nextLine());
        double minionsCount = Double.parseDouble(scanner.nextLine());
        double truckToysCount = Double.parseDouble(scanner.nextLine());

        double puzzle = 2.6;
        double doll = 3.0;
        double teddyBear = 4.1;
        double minion = 8.2;
        double truckToy = 2.0;

        double puzzlePrice = puzzle * puzzlesCount;
        double dollPrice = doll * dollsCount;
        double teddyBearPrice = teddyBear * teddyBearCount;
        double minionPrice = minion * minionsCount;
        double truckToyPrice = truckToy * truckToysCount;

        double toysCount = puzzlesCount + dollsCount + teddyBearCount + minionsCount + truckToysCount;
        double toysSum = puzzlePrice + dollPrice + teddyBearPrice + minionPrice + truckToyPrice;

        if (toysCount >= 50){
            toysSum = toysSum - (toysSum * 0.25);
        }
        toysSum = toysSum - (toysSum * 0.10);

        double margin = Math.abs(tour - toysSum);

        if (toysSum < tour){
            System.out.printf("Not enough money! %.2f lv needed.", margin);
        }else {
            System.out.printf("Yes! %.2f lv left.", margin);
        }
    }
}