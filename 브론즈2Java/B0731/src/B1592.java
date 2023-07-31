import java.util.Scanner;

public class B1592 {
    static int N;
    static int M;
    static int L;
    static int[] friend;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        L = sc.nextInt();

        friend = new int[N+1];

        int count = 0;

        friend[1] = 1;
        int index = 1;
        while (true) {
            if (friend[index] == M) break;

            if (friend[index] % 2 ==1) index = index + L;
            else index = index - L;

            if (index > N) index %= N;

            else if (index < 1) index += N;

            friend[index]++;
            count++;
        }
        System.out.println(count);
    }
}