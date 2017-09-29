package Programming_Bascics_Java_2017;

import java.util.Scanner;

public class p01_07_05_2017 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double whiskeyPrice = Double.parseDouble(scanner.nextLine());

        double rakiaPrice = whiskeyPrice / 2;
        double winePrice = rakiaPrice - (rakiaPrice * 0.40);
        double beerPrice = rakiaPrice - (rakiaPrice * 0.80);

        double beer = Double.parseDouble(scanner.nextLine());
        double wine = Double.parseDouble(scanner.nextLine());
        double rakia = Double.parseDouble(scanner.nextLine());
        double whiskey = Double.parseDouble(scanner.nextLine());

        double cashNeed = rakiaPrice * rakia + whiskeyPrice * whiskey + winePrice * wine + beerPrice * beer;

        System.out.printf("%.2f", cashNeed);
    }
}
