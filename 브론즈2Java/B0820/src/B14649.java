import java.util.Scanner;

public class B14649 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int MAX = 100 + 1;

        int P, N;
        int[] stone = new int[MAX];

        P = scanner.nextInt();
        N = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            int pos;
            char direction;
            pos = scanner.nextInt();
            direction = scanner.next().charAt(0);

            if (direction == 'L') {
                for (int j = 1; j < pos; j++) {
                    stone[j] = (stone[j] + 1) % 3;
                }
            } else {
                for (int j = pos + 1; j < MAX; j++) {
                    stone[j] = (stone[j] + 1) % 3;
                }
            }
        }

        double blue = 0, red = 0, green = 0;
        for (int i = 1; i < MAX; i++) {
            switch (stone[i]) {
                case 0:
                    blue++;
                    break;
                case 1:
                    red++;
                    break;
                case 2:
                    green++;
                    break;
            }
        }

        blue /= 100;
        red /= 100;
        green /= 100;

        System.out.printf("%.2f\n%.2f\n%.2f\n", P * blue, P * red, P * green);

        scanner.close();
    }
}
