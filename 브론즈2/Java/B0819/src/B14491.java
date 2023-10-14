import java.util.Scanner;

public class B14491 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        System.out.println(convert(t));
    }

    static String convert(int t) {
        int tmp = t;
        StringBuilder s = new StringBuilder();
        while (tmp > 0) {
            s.append(tmp % 9);
            tmp /= 9;
        }
        return s.reverse().toString();
    }
}