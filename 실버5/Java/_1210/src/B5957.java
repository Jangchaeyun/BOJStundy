import java.util.Scanner;
import java.util.Stack;

public class B5957 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        Stack<Integer> a = new Stack<>();
        Stack<Integer> b = new Stack<>();
        Stack<Integer> c = new Stack<>();

        for (int i = n; i >= 1; i--) {
            a.push(i);
        }

        while (c.size() != n) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();

            if (u == 1) {
                while (v-- > 0) {
                    b.push(a.pop());
                }
            } else {
                while (v-- > 0) {
                    c.push(b.pop());
                }
            }
        }

        while (!c.empty()) {
            System.out.println(c.pop());
        }
    }
}