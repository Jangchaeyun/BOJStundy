import java.util.Arrays;
import java.util.Scanner;

class Race implements Comparable<Race> {
    int h, m, s;

    public Race(int h, int m, int s) {
        this.h = h;
        this.m = m;
        this.s = s;
    }

    @Override
    public int compareTo(Race other) {
        if (this.h == other.h) {
            if (this.m == other.m) {
                return Integer.compare(this.s, other.s);
            } else {
                return Integer.compare(this.m, other.m);
            }
        } else {
            return Integer.compare(this.h, other.h);
        }
    }
}

public class B5939 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        Race[] t = new Race[n];

        for (int i = 0; i < n; i++) {
            int h = scanner.nextInt();
            int m = scanner.nextInt();
            int s = scanner.nextInt();
            t[i] = new Race(h, m, s);
        }

        Arrays.sort(t);

        for (Race race : t) {
            System.out.println(race.h + " " + race.m + " " + race.s);
        }
    }
}