import java.util.Map;
import java.util.Scanner;

class Coord {
    int x, y;

    Coord(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class B18786 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        Coord[] p = new Coord[101];

        for (int i = 0; i < n; i++) {
            int x = input.nextInt();
            int y = input.nextInt();
            p[i] = new Coord(x, y);
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    if (i == j || i == k || j == k)
                        continue;
                    if (p[i].x == p[j].x && p[i].y == p[k].y)
                        ans = Math.max(ans, Math.abs(p[i].y - p[j].y) * Math.abs(p[i].x - p[k].x));
                }
            }
        }

        System.out.println(ans);
    }
}
