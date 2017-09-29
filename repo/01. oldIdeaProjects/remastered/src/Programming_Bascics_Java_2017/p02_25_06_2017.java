package Programming_Bascics_Java_2017;

import java.util.Scanner;

public class p02_25_06_2017 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double recordSeconds = Double.parseDouble(scanner.nextLine());
        double lenghtMeters = Double.parseDouble(scanner.nextLine());
        double timePerMeter = Double.parseDouble(scanner.nextLine());

        double waterResistance = ((int)(lenghtMeters / 15) * 12.5);
        double ivanchoTime = (lenghtMeters * timePerMeter) + waterResistance;

        if (ivanchoTime < recordSeconds){
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", ivanchoTime);
        }else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", ivanchoTime - recordSeconds);
        }
    }
}