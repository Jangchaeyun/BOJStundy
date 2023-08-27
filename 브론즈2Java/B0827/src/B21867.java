import java.util.Scanner;

public class B21867 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
        String S = scanner.nextLine();
        String res = "";

        for (char c : S.toCharArray()) {
            if (c != 'J' && c != 'A' && c != 'V') {
                res += c;
            }
        }

        if (res.isEmpty()) {
            System.out.println("nojava");
        } else {
            System.out.println(res);
        }
    }
}