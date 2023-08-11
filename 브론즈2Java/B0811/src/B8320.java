import java.util.Scanner;

public class B8320 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;

        for (int i = 1; i <= N; i++) {
            for (int j = i; i * j <= N; j++) count++;
        }
        System.out.println(count);
    }
}