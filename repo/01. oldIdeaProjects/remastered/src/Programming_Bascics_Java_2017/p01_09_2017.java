package Programming_Bascics_Java_2017;

import java.util.Scanner;

public class p01_09_2017 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tablesCount = Integer.parseInt(scanner.nextLine());
        double tableLong = Double.parseDouble(scanner.nextLine());
        double tablesShort = Double.parseDouble(scanner.nextLine());

        //double pokrivkaLong = tableLong + 0.30d;
        //double pokrivkaShort = tablesShort + 0.30d;
        //double kareSide = tableLong / 2d;

        double squarePokrivkaAll = tablesCount * (tableLong + 2 * 0.3) * (tablesShort + 2 * 0.3);
        double squareKareAll = tablesCount * (tableLong / 2) * (tableLong / 2);

        double squarePokrivkaUSD = 7;
        double squareKareUSD = 9;

        double conversionBGN = 1.85;
        double pokrivkaPrice = squarePokrivkaAll * squarePokrivkaUSD;
        double karePrice = squareKareAll * squareKareUSD;

        System.out.printf("%.2f USD\n", pokrivkaPrice + karePrice);
        System.out.printf("%.2f BGN", (pokrivkaPrice + karePrice) * conversionBGN);

    }
}