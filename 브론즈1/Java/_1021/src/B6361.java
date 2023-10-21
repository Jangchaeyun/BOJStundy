import java.util.*;
import java.math.BigInteger;

public class B6361 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger[] conv = new BigInteger[128];
        char[] rev = new char[128];

        for (int i = 0; i < 10; i++) {
            conv["0123456789".charAt(i)] = BigInteger.valueOf(i);
            rev[i] = "0123456789".charAt(i);
        }
        for (int i = 0; i < 26; i++) {
            conv["ABCDEFGHIJKLMNOPQRSTUVWXYZ".charAt(i)] = BigInteger.valueOf(10 + i);
            rev[10 + i] = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".charAt(i);
        }
        for (int i = 0; i < 26; i++) {
            conv["abcdefghijklmnopqrstuvwxyz".charAt(i)] = BigInteger.valueOf(36 + i);
            rev[36 + i] = "abcdefghijklmnopqrstuvwxyz".charAt(i);
        }

        int N = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        while (N-- > 0) {
            BigInteger n = scanner.nextBigInteger();
            BigInteger m = scanner.nextBigInteger();
            String s = scanner.next();

            System.out.println(n + " " + s);
            System.out.print(m + " ");

            BigInteger sum = BigInteger.ZERO;
            BigInteger t = BigInteger.ONE;

            for (int i = s.length() - 1; i >= 0; i--) {
                int digitValue = conv[s.charAt(i)].intValue();
                sum = sum.add(t.multiply(BigInteger.valueOf(digitValue)));
                t = t.multiply(n);
            }

            List<Integer> res = new ArrayList<>();

            if (sum.equals(BigInteger.ZERO)) {
                res.add(0);
            }

            while (!sum.equals(BigInteger.ZERO)) {
                BigInteger[] divAndRemainder = sum.divideAndRemainder(m);
                int remainder = divAndRemainder[1].intValue();
                res.add(remainder);
                sum = divAndRemainder[0];
            }

            Collections.reverse(res);

            for (int i : res) {
                System.out.print(rev[i]);
            }

            System.out.println("\n");
        }
    }
}
