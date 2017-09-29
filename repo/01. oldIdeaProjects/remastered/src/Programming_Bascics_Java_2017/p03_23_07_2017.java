package Programming_Bascics_Java_2017;

import java.util.Scanner;

public class p03_23_07_2017 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dancers = Integer.parseInt(scanner.nextLine());
        double points = Double.parseDouble(scanner.nextLine());

        String season = scanner.nextLine().toLowerCase();
        String place = scanner.nextLine();

        double award = 1d * points * dancers;
        double expenses = 0d;
        double charity = 0d;
        double moneyPerDancer = 0d;

        if (place.equals("Bulgaria")){
            if (season.equals("summer")){
                expenses = award * 0.05;
            }
            else if (season.equals("winter")){
                expenses = expenses + award * 0.08;
            }
        }else if (place.equals("Abroad")){
            award += award / 2.0;
            if (season.equals("summer")){
                expenses = award * 0.1;
            }
            else if (season.equals("winter")){
                expenses = award * 0.15;
            }
        }
        charity += (award - expenses) * 0.75;
        moneyPerDancer += ((award - expenses) - (award - expenses) * 0.75) / dancers;
        System.out.printf("Charity - %.2f \n", charity);
        System.out.printf("Money per dancer - %.2f", moneyPerDancer);
    }
}