import java.util.Scanner;

public class B12759 {
    static int[][] map = new int[3][3];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int x, y;
        int value;
        int ans = 0;
        boolean check = false;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                map[i][j] = 0;
            }
        }

        for (int i = 0; i < 9; i++) {
            if (i % 2 == 0) {
                value = num;
            } else {
                if (num == 2) {
                    value = 1;
                } else {
                    value = 2;
                }
            }
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
            map[x][y] = value;

            if (!check) {
                ans = func(value);
                if (ans != 0) {
                    check = true;
                }
            }
        }
        System.out.println(ans);
    }

    public static int func(int x) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (map[i][j] != x) {
                    break;
                }
                if (j == 2) {
                    return x;
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (map[j][i] != x) {
                    break;
                }
                if (j == 2) {
                    return x;
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (map[j][i] != x) {
                    break;
                }
                if (j == 2) {
                    return x;
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            if (map[i][i] != x) {
                break;
            }
            if (i == 2) {
                return x;
            }
        }
        for (int i = 0; i < 3; i++) {
            if (map[i][2 - i] != x) {
                break;
            }
            if (i == 2) {
                return x;
            }
        }

        return 0;
    }
}