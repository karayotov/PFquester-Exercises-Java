package Programming_Bascics_Java_2017;

import java.util.Scanner;

public class p04_23_07_2017 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        int dancersCount =Integer.parseInt(scanner.nextLine());
        int hours = 0;
        double energyPerOne = 100d;
        double energyLeft = 0d;

        double evenEvenEnergyPercent = 0d;
        double evenOddEnergyPercent = 0d;
        double oddEvenEnergyPercent = 0d;
        double oddOddEnergyPercent = 0d;
        int evenEvendaysCounter = 0;
        int evenOdddaysCounter = 0;
        int oddEvendaysCounter = 0;
        int oddOdddaysCounter = 0;

        for (int i = 1; i <= days; i++) {
            if (i % 2 == 0){
                hours = Integer.parseInt(scanner.nextLine());
                if (hours % 2 == 0){
                    evenEvenEnergyPercent = energyPerOne - 68d;
                    evenEvendaysCounter ++;
                }else {
                    evenOddEnergyPercent = energyPerOne - 65d;
                    evenOdddaysCounter ++;
                }
            }else {
                hours = Integer.parseInt(scanner.nextLine());
                if (hours % 2 == 0){
                    oddEvenEnergyPercent = energyPerOne - 49d;
                    oddEvendaysCounter ++;
                }else {
                    oddOddEnergyPercent = energyPerOne - 30d;
                    oddOdddaysCounter ++;
                }
            }
        }
        energyLeft = (oddEvenEnergyPercent * oddEvendaysCounter + oddOddEnergyPercent * oddOdddaysCounter
                  + evenEvenEnergyPercent * evenEvendaysCounter + evenOddEnergyPercent * evenOdddaysCounter)/ days;

        if (energyLeft > 50) System.out.printf("They feel good! Energy left: %.2f", energyLeft);
        else System.out.printf("They are wasted! Energy left: %.2f", energyLeft);
    }
}