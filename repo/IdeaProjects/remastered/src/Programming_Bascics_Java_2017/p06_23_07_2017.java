package Programming_Bascics_Java_2017;

import java.util.Scanner;

public class p06_23_07_2017 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char firstChar = scanner.next().trim().charAt(0);
        char secondChar = scanner.next().trim().charAt(0);
        char thirdChar = scanner.next().trim().charAt(0);
        char fourthChar = scanner.next().trim().charAt(0);
        scanner.nextLine();
        int num = Integer.parseInt(scanner.nextLine());
        int counter = 0;

        for (char a = 'A'; a <= firstChar; a++) {
            for (char b = 'a'; b <= secondChar; b++) {
                for (char c = 'a'; c <= thirdChar; c++) {
                    for (char i = 'a'; i <= fourthChar; i++) {

                        for (int j = 0; j <= num; j++) {
                            counter++;
                        }
                    }
                }
            }
        }
        System.out.println(counter - 1);
    }
}
