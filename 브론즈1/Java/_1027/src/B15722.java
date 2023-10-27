import java.util.Scanner;

class Coord {
    int x, y;

    Coord(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class B15722 {
    public static Coord snail(int n) {
        Coord point = new Coord(0, 0);
        boolean sign = true;
        int move = 1;

        while (true) {
            if (sign) {
                for (int i = 0; i < move; i++) {
                    point.y += 1;
                    n--;
                    if (n == 0)
                        return point;
                }
                for (int i = 0; i < move; i++) {
                    point.x += 1;
                    n--;
                    if (n == 0)
                        return point;
                }
            } else {
                for (int i = 0; i < move; i++) {
                    point.y -= 1;
                    n--;
                    if (n == 0)
                        return point;
                }
                for (int i = 0; i < move; i++) {
                    point.x -= 1;
                    n--;
                    if (n == 0)
                        return point;
                }
            }
            move++;
            sign = !sign;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        Coord result = snail(n);

        System.out.println(result.x + " " + result.y);
    }
}
