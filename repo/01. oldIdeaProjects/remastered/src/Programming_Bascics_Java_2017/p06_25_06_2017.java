package Programming_Bascics_Java_2017;

import java.util.Scanner;

public class p06_25_06_2017 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        for (int a = 1; a <= 30; a++) {
            for (int b = 1; b <= 30; b++) {
                for (int c = 1; c <= 30; c++) {
                    if (a < b && b < c){
                        if (a + b + c == num){
                            System.out.printf("%d + %d + %d = %d%n", a, b, c, num);
                            counter++;
                        }
                    }
                }
            }
        }
        if (counter < 1){
            System.out.printf("No!");
        }
    }
}