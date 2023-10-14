import java.util.Scanner;

public class B4606 {
    public static void main(String[] args) {
        boolean flag;
        String s;
        String result;
        String[] arr = { "%20", "%21", "%24", "%25", "%28", "%29", "%2a" };
        char[] c = { ' ', '!', '$', '%', '(', ')', '*' };

        Scanner scanner = new Scanner(System.in);

        while (true) {
            result = "";

            s = scanner.nextLine();

            if (s.equals("#")) {
                break;
            }

            for (int i = 0; i < s.length(); ++i) {
                flag = false;
                for (int j = 0; j < 7; ++j) {
                    if (s.charAt(i) == c[j]) {
                        result += arr[j];
                        flag = true;
                        break;
                    }
                }
                if (!flag) {
                    result += s.charAt(i);
                }
            }
            System.out.println(result);
        }
        scanner.close();
    }
}
