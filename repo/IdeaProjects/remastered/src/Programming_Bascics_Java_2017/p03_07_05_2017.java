package Programming_Bascics_Java_2017;

import java.util.Scanner;

public class p03_07_05_2017 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String season = scanner.nextLine().toLowerCase();
        String groupType = scanner.nextLine().toLowerCase();
        int studentsCount = Integer.parseInt(scanner.nextLine());
        int nightsCount = Integer.parseInt(scanner.nextLine());
        double pricePerNight = 0.0;
        double beforeDiscountPrice = 0.0;
        double afterDiscountPrice = 0.0;

        switch (season){
            case "winter":
                if (groupType.equals("boys")){

                    pricePerNight += 9.6;
                    System.out.printf("Judo");

                }
                else if (groupType.equals("girls")){

                    pricePerNight += 9.6;
                    System.out.printf("Gymnastics");

                }
                else if (groupType.equals("mixed")){

                    pricePerNight += 10;
                    System.out.printf("Ski");

                }
                break;
            case "spring":
                if (groupType.equals("boys")){

                    pricePerNight += 7.2;
                    System.out.printf("Tennis");

                }
                else if (groupType.equals("girls")){

                    pricePerNight += 7.2;
                    System.out.printf("Athletics");

                }
                else if (groupType.equals("mixed")){

                    pricePerNight += 9.5;
                    System.out.printf("Cycling");
                }
                break;
            case "summer":
                if (groupType.equals("boys")){

                    pricePerNight += 15;
                    System.out.printf("Football");

                }
                else if (groupType.equals("girls")){

                    pricePerNight += 15;
                    System.out.printf("Volleyball");

                }
                else if (groupType.equals("mixed")){

                    pricePerNight += 20;
                    System.out.printf("Swimming");

                }
                break;
                default:
                    break;
        }
        beforeDiscountPrice = pricePerNight * nightsCount * studentsCount;
        if (studentsCount < 10) afterDiscountPrice += beforeDiscountPrice;
        else if (studentsCount < 20) afterDiscountPrice += beforeDiscountPrice - (beforeDiscountPrice * 0.05);
        else if (studentsCount < 50) afterDiscountPrice += beforeDiscountPrice - (beforeDiscountPrice * 0.15);
        else if (studentsCount >= 50) afterDiscountPrice += beforeDiscountPrice - (beforeDiscountPrice * 0.50);

        System.out.printf(" %.2f lv.", afterDiscountPrice);
    }
}
