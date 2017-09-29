package Programming_Bascics_Java_2017;

import java.util.Scanner;

public class p01_23_07_2017 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double lSide = Double.parseDouble(scanner.nextLine()) * 100;
        double wSide = Double.parseDouble(scanner.nextLine()) * 100;
        double aSide = Double.parseDouble(scanner.nextLine()) * 100;

        double hallSquare = lSide * wSide;
        double storageSquare = Math.pow(aSide, 2);
        double seatingSquare = hallSquare / 10;
        double dancerSquare = 40 + 7000;

        int dancersCapacity = (int)((hallSquare - storageSquare - seatingSquare) / dancerSquare);

        System.out.println(dancersCapacity);
    }
}