import java.util.Scanner;

public class B4564 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String n = sc.nextLine();
            if (n.equals("0")) {
                break;
            }
            while (n.length() > 1) {
                int res = 1;
                System.out.print(n + " ");
                for (int i = 0; i < n.length(); i++) {
                    char c = n.charAt(i);
                    int digit = Character.getNumericValue(c);
                    res *= digit;
                }
                n = Integer.toString(res);
            }
            System.out.println(n);
        }
    }
}