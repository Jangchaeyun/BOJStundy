import java.util.Scanner;

public class B16648 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int p = sc.nextInt();

        if (p >= 20) {
            double nm = (100 - p) / (double) t;
            System.out.println((p - 20) / nm + (40 / nm));
        } else {
            double nm = (80 + (20 - p) * 2) / (double) t;
            System.out.println(p * 2 / nm);
        }

        sc.close();
    }
}