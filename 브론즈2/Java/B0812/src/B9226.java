import java.util.*;

public class B9226 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a;

        while (true) {
            a = scanner.next();
            Queue<Character> q = new LinkedList<>();

            if (a.charAt(0) == '#') {
                break;
            }

            if (a.charAt(0) == 'a' || a.charAt(0) == 'e' || a.charAt(0) == 'i' || a.charAt(0) == 'o' || a.charAt(0) == 'u') {
                System.out.println(a + "ay");
            } else {
                q.add(a.charAt(0));
                for (int i = 1; i < a.length(); i++) {
                    if (a.charAt(i) == 'a' || a.charAt(i) == 'e' || a.charAt(i) == 'i' || a.charAt(i) == 'o' || a.charAt(i) == 'u') {
                        System.out.print(a.substring(i) + a.substring(0, i));
                        break;
                    } else {
                        q.add(a.charAt(i));
                    }
                }
                while (!q.isEmpty()) {
                    System.out.print(q.poll());
                }
                System.out.println("ay");
            }
        }
    }
}