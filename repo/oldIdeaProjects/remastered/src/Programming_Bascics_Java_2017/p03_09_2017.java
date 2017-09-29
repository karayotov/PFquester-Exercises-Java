package Programming_Bascics_Java_2017;

import java.util.Scanner;

public class p03_09_2017 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int picsCount = Integer.parseInt(scanner.nextLine());
        String sizePics = scanner.nextLine();
        String onlineOrOffice = scanner.nextLine();
        double pricePerOne = 0d;
        double priceForAll = 0d;
        if (sizePics.equals("9X13")){
            pricePerOne += 0.16;
            priceForAll += pricePerOne * picsCount;
            if (picsCount >= 50){
                priceForAll = priceForAll - (priceForAll * 0.05);
            }
        }else if (sizePics.equals("10X15")){
            pricePerOne += 0.16;
            priceForAll += pricePerOne * picsCount;

            if (picsCount >= 80){
                priceForAll = priceForAll - (priceForAll * 0.03);
            }
        }else if (sizePics.equals("13X18")){
            pricePerOne += 0.38;
            priceForAll += pricePerOne * picsCount;

            if (picsCount >= 50 && picsCount <= 100){
                priceForAll = priceForAll - (priceForAll * 0.03);
            }else if (picsCount > 100){
                priceForAll = priceForAll - (priceForAll * 0.05);
            }
        }else if (sizePics.equals("20X30")){
            pricePerOne += 2.9;
            priceForAll += pricePerOne * picsCount;

            if (picsCount >= 10 && picsCount <= 50){

                priceForAll = priceForAll - (priceForAll * 0.07);
            }else if (picsCount > 50){
                priceForAll = priceForAll - (priceForAll * 0.09);
            }
        }
        if (onlineOrOffice.equals("online")){
            priceForAll = priceForAll - (priceForAll * 0.02);
        }
        System.out.printf("%.2fBGN", priceForAll);
    }
}