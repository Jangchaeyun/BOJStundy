import java.util.Scanner;

public class B4597 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String s = scanner.next();
            if (s.equals("#")) {
                break;
            }

            int count = 0;
            for (int i = 0; i < s.length() - 1; i++) {
                if (s.charAt(i) == '1')
                    count++;
            }
            if (s.charAt(s.length() - 1) == 'e') {
                if (count % 2 == 0) {
                    s = s.substring(0, s.length() - 1) + '0';
                } else {
                    s = s.substring(0, s.length() - 1) + '1';
                }
            } else {
                if (count % 2 == 0) {
                    s = s.substring(0, s.length() - 1) + '1';
                } else {
                    s = s.substring(0, s.length() - 1) + '0';
                }
            }
            System.out.println(s);
        }
        scanner.close();
    }
}
