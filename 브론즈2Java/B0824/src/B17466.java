import java.util.Scanner;

public class B17466 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int P = scanner.nextInt();
        long res = 1;

        for (int i = 1; i <= N; i++) {
            res = ((res * (i % P))) % P;
        }

        System.out.println(res);
    }
}
