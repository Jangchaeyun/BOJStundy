import java.util.Scanner;

public class B29196 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double k = scanner.nextDouble();

        int p = 1;
        int q = 1;

        while (Math.abs((double) p / q - k) > 1e-6) {
            if ((double) p / q > k) {
                q++;
            } else {
                p++;
            }
        }
        System.out.println("YES");
        System.out.println(p + " " + q);
    }
}