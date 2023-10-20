import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class B5608 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        Map<String, String> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String A = scanner.next();
            String B = scanner.next();
            map.put(A, B);
        }

        StringBuilder ans = new StringBuilder();
        N = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            String tmp = scanner.next();
            if (map.containsKey(tmp)) {
                ans.append(map.get(tmp));
            } else {
                ans.append(tmp);
            }
        }
        System.out.println(ans.toString());
    }
}
