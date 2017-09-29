package Programming_Bascics_Java_2017;

import java.util.Scanner;

public class p04_07_05_2017 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int stadiumCapacity = Integer.parseInt(scanner.nextLine());
        byte fansCount = Byte.parseByte(scanner.nextLine());

        byte sectorFans = (byte) 0;

        byte aSectorFans = (byte) 0;
        byte bSectorFans = (byte) 0;
        byte vSectorFans = (byte) 0;
        byte gSectorFans = (byte) 0;

        double aPercent = 0.0;
        double bPercent = 0.0;
        double vPercent = 0.0;
        double gPercent = 0.0;
        double stadiumPercent = 0.0;

        for (int i = 0; i < (int)fansCount; i++) {
            String fanLocation = scanner.nextLine().toUpperCase();
            if (fanLocation.equals("A")){
                aSectorFans ++;
            }if (fanLocation.equals("B")){
                bSectorFans ++;
            }if (fanLocation.equals("V")){
                vSectorFans ++;
            }if (fanLocation.equals("G")){
                gSectorFans ++;
            }
        }

        aPercent = 1.0 * aSectorFans / fansCount * 100;
        bPercent = 1.0 * bSectorFans / fansCount * 100;
        vPercent = 1.0 * vSectorFans / fansCount * 100;
        gPercent = 1.0 * gSectorFans / fansCount * 100;
        stadiumPercent = 1.0 * fansCount / stadiumCapacity * 100;

        System.out.printf("%.2f%%\n", aPercent);
        System.out.printf("%.2f%%\n", bPercent);
        System.out.printf("%.2f%%\n", vPercent);
        System.out.printf("%.2f%%\n", gPercent);
        System.out.printf("%.2f%%\n", stadiumPercent);
    }
}