import java.util.Scanner;

public class B10163 {
    static int N;
    static int[][] map;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        map = new int[101][101];

        for (int tc = 1; tc <= N; tc++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();

            for (int i = a; i < a + c; i++) {
                for (int j = b; j < b + d; j++) {
                    map[i][j] = tc;
                }
            }
        }

        for (int rep = 1; rep <= N; rep++) {
            int count = 0;
            for (int i = 0; i < 101; i++) {
                for (int j = 0; j < 101; j++) {
                    if (map[i][j] == rep) count++;
                }
            }
            System.out.println(count);
        }
    }
}