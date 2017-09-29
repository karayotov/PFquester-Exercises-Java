import java.math.BigDecimal;
import java.util.Scanner;
public class ZaTriene {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);
        int counter = Integer.parseInt(scanner.nextLine());
        BigDecimal bd = new BigDecimal(0) ;
        BigDecimal sum = new BigDecimal(0);
        for (int i = 0; i < counter; i++) {

            bd = scanner.nextBigDecimal();

            sum = sum.add(bd);
        }
        System.out.println(sum);
    }
}