import java.util.Scanner;

public class B15813 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int len = scanner.nextInt();
        String name = scanner.next();

        int sum = 0;
        for (int i = 0; i < len; i++) {
            int tmp = name.charAt(i) - 'A' + 1;
            sum += tmp;
        }

        System.out.println(sum);
    }
}