import java.util.Scanner;

public class B11923 {
    static final int MAX = 1000 + 1;

    static int N, C;
    static int result;
    static int[] fruit = new int[MAX];

    public static void maxFruit(int idx, int cnt, int total) {
        if (total >= 0)
            result = Math.max(result, cnt);

        if (idx > N || total < 0)
            return;

        if (total - fruit[idx] >= 0)
            maxFruit(idx + 1, cnt + 1, total - fruit[idx]);
        else maxFruit(idx + 1, cnt, total);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        C = scanner.nextInt();

        for (int i = 1; i <= N; i++)
            fruit[i] = scanner.nextInt();

        for (int i = 1; i <= N; i++)
            maxFruit(i, 0, C);

        System.out.println(result);
    }
}