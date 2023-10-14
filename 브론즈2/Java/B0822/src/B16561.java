import java.util.Scanner;

public class B16561 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int sum = 1;
        int count = 2;

        for (int i = 9; i < N; i += 3) {
            sum += count;
            count += 1;
        }

        System.out.println(sum);
    }
}
