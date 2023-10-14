import java.util.Scanner;

public class B4613 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String s = scanner.nextLine();
            if (s.equals("#")) {
                break;
            }
            int sum = 0;
            int len = s.length();
            for (int i = 0; i < len; i++) {
                if (s.charAt(i) == ' ')
                    continue;
                else
                    sum += (int)(s.charAt(i) - 'A' + 1) * (i + 1);
            }
            System.out.println(sum);
        }
        scanner.close();
    }
}
