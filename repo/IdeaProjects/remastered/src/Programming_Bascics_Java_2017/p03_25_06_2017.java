package Programming_Bascics_Java_2017;

import java.util.Scanner;

public class p03_25_06_2017 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fruit = scanner.nextLine().toLowerCase();
        String drinkSize = scanner.nextLine().toLowerCase();
        double drinksCount = Double.parseDouble(scanner.nextLine());
        double watermelonPerLiter = 0.0;
        double mangoPerLiter = 0.0;
        double pineapplePerLiter = 0.0;
        double raspberryPerLiter = 0.0;
        double sum = 0.0;

        if (drinksCount < 2){
            switch (fruit){
                case "watermelon":
                    if (drinkSize.equals("small")){
                        watermelonPerLiter += 56.0 * 2.0;
                    }else {
                        watermelonPerLiter += 28.70 * 5.0;
                    }
                    sum += watermelonPerLiter;
                    break;
                case "mango":
                    if (drinkSize.equals("small")){
                        mangoPerLiter += 36.66 * 2.0;
                    }else {
                        mangoPerLiter += 19.60 * 5.0;
                    }
                    sum += mangoPerLiter;
                    break;
                case "pineapple":
                    if (drinkSize.equals("small")){
                        pineapplePerLiter += 42.1 * 2.0;
                    }else {
                        pineapplePerLiter += 24.8 * 5.0;
                    }
                    sum += pineapplePerLiter;
                    break;
                case "raspberry":
                    if (drinkSize.equals("small")){
                        raspberryPerLiter += 20.0 * 2.0;
                    }else {
                        raspberryPerLiter += 15.2 * 5.0;
                    }
                    sum += raspberryPerLiter;
                    break;
                    default:
                        break;
            }
            System.out.printf("%.2f lv.", sum);
        }else {
            switch (fruit){
                case "watermelon":
                    if (drinkSize.equals("small")){
                        watermelonPerLiter += 56.0 * 2.0;
                    }else {
                        watermelonPerLiter += 28.70 * 5.0;
                    }
                    sum += watermelonPerLiter * drinksCount;
                    break;
                case "mango":
                    if (drinkSize.equals("small")){
                        mangoPerLiter += 36.66 * 2.0;
                    }else {
                        mangoPerLiter += 19.60 * 5.0;
                    }
                    sum += mangoPerLiter * drinksCount;
                    break;
                case "pineapple":
                    if (drinkSize.equals("small")) {
                        pineapplePerLiter += 42.1 * 2.0;
                    }else {
                        pineapplePerLiter += 24.80 * 5.0;
                    }
                    sum += pineapplePerLiter * drinksCount;
                    break;
                case "raspberry":
                    if (drinkSize.equals("small")){
                        raspberryPerLiter += 20.0 * 2.0;
                    }else {
                        raspberryPerLiter += 15.2 * 5.0;
                    }
                    sum += raspberryPerLiter * drinksCount;
                    break;
                    default:
                        break;
            }
            if (sum < 400){
                System.out.printf("%.2f lv.", sum);
            }else if (sum < 1000){
                System.out.printf("%.2f lv.", sum - (sum * 0.15));
            }else {
                System.out.printf("%.2f lv.", sum - (sum * 0.5));
            }
        }
    }
}
