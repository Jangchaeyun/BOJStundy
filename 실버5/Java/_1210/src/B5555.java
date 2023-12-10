import java.util.Scanner;

public class B5555 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String t = scanner.nextLine();
        int cnt = 0;

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String s = scanner.nextLine();
            if (s.concat(s).contains(t)) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}