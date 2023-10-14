import java.math.BigDecimal;
import java.util.Scanner;

public class B2052 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        System.out.println(exponentiation(N));
        scanner.close();
    }

    public static String exponentiation(int N) {
        BigDecimal result = BigDecimal.ONE.divide(BigDecimal.valueOf(2).pow(N));
        String answer = result.toPlainString();

        int sliceIdx = answer.length();

        for (int idx = answer.length() - 1; idx > 1; idx--) {
            if (answer.charAt(idx) != '0') {
                sliceIdx = idx + 1;
                break;
            }
        }

        return answer.substring(0, sliceIdx);
    }
}
