import java.util.*;

public class B4775 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();

        Set<String> dict = new HashSet<>();
        for (int i = 0; i < N; i++) {
            String S = scanner.nextLine();
            dict.add(S);
        }

        int num_of_email = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= num_of_email; i++) {
            List<String> not_exist = new ArrayList<>();
            boolean good = true;

            String S;
            while (true) {
                S = scanner.next();
                if (S.equals("-1")) break;
                if (dict.contains(S)) {

                } else {
                    good = false;
                    not_exist.add(S);
                }
            }

            if (good) {
                System.out.println("Email " + i + " is spelled correctly.");
            } else {
                System.out.println("Email " + i + " is not spelled correctly.");
            }

            for (String a : not_exist) {
                System.out.println(a);
            }
        }

        System.out.println("End of Output");
    }
}