package Programming_Bascics_Java_2017;

import java.util.Scanner;

public class p01_25_06_2017 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());

        int cakes = Integer.parseInt(scanner.nextLine());
        int waffles = Integer.parseInt(scanner.nextLine());
        int pancakes = Integer.parseInt(scanner.nextLine());

        double cakePrice = 45;
        double wafflesPrice = 5.8;
        double pancakesPrice = 3.2;

        double cakeDally = cakes * cakePrice;
        double wafflesDally = waffles * wafflesPrice;
        double pancakeDally = pancakes * pancakesPrice;

        double dallyIncom = (cakeDally + wafflesDally + pancakeDally) * workers;

        double totalIncom = days * dallyIncom;

        double totalExpend = totalIncom - (totalIncom * 1/8);

        System.out.printf("%.2f", totalExpend);
    }
}
