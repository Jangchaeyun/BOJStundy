import java.util.Scanner;

public class B20973 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String cowphabet = scanner.next();
        String bessie = scanner.next();
        int cowphabetLen = cowphabet.length();
        int len = bessie.length();
        int pt = 0;
        int pt2 = 0;
        int ans = 1;

        while (true) {
            if (pt2 == len)
                break;
            if (pt == cowphabetLen) {
                pt = 0;
                ans++;
            }
            if (cowphabet.charAt(pt) == bessie.charAt(pt2)) {
                pt2++;
                pt++;
            } else {
                pt++;
            }
        }

        System.out.println(ans);
    }
}