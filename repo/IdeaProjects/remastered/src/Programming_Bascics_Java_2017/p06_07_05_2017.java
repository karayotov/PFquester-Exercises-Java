package Programming_Bascics_Java_2017;

import java.util.Scanner;

public class p06_07_05_2017 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());
        int specialNum = Integer.parseInt(scanner.nextLine());
        int controlNum = Integer.parseInt(scanner.nextLine());

        for (int i = m; i >= 1; i--) {
            for (int j = n; j >= 1; j--) {
                for (int k = l; k >= 1; k--) {

                    if ((i + j + k) % 3 == 0){
                        specialNum += 5;

                    }else if (k % 2 == 0){
                        specialNum *= 2;

                    }else if (k == 5){
                        specialNum -= 2;
                    }if (specialNum >= controlNum){
                        System.out.printf("Yes! Control number was reached! Current special number is %d.", specialNum);
                        return;
                    }
                }
            }
        }
        System.out.printf("No! %d is the last reached special number.", specialNum);
    }
}
