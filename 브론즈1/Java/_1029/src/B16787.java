import java.util.Scanner;

public class B16787 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        int cnt = 0;
        int result = 0;

        for (int i = 0; i < N - 1; i++) {
            if (S.charAt(i) != S.charAt(i + 1) && cnt == 0) {
                result++;
                cnt = 1;
            }
            else {
                cnt = 0;
            }
        }
        System.out.println(result);
    }
}