package Programming_Bascics_Java_2017;

import java.util.Scanner;

public class p02_09_2017 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double paymentBGN= Double.parseDouble(scanner.nextLine());
        double middleOcenka = Double.parseDouble(scanner.nextLine());
        double minPayment = Double.parseDouble(scanner.nextLine());
        double socialStipendia = 0d;
        double highStipendia = 0d;
        //if (socialStipendia > highStipendia){

        //}
        if (paymentBGN < minPayment && middleOcenka <= 5.5){
            if (middleOcenka <= 4.5){
                System.out.printf("You cannot get a scholarship!");
            }else {
                socialStipendia += 0.35 * minPayment;

                System.out.printf("You get a Social scholarship %d BGN", (int)socialStipendia);
            }
        }else  if (paymentBGN > minPayment && middleOcenka <= 5.5){
            System.out.printf("You cannot get a scholarship!");

        }else if (paymentBGN < minPayment && middleOcenka > 4.5) {
            socialStipendia += 0.35 * minPayment;
            if (middleOcenka > 5.5) {
                highStipendia += 25.00 * middleOcenka;
                if (highStipendia < socialStipendia) {
                    System.out.printf("You get a Social scholarship %d BGN", (int)socialStipendia);
                } else {
                    System.out.printf("You get a scholarship for excellent results %d BGN", (int)highStipendia);
                }
            }
        }else if (middleOcenka > 5.5) {
            if (highStipendia < socialStipendia) {
                System.out.printf("You get a Social scholarship %d BGN", (int)socialStipendia);
            } else {
                highStipendia += 25.00 * middleOcenka;
                System.out.printf("You get a scholarship for excellent results %d BGN", (int)highStipendia);
            }
        }
    }
}
