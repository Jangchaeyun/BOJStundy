import java.util.Scanner;

public class B26041 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] A = scanner.nextLine().split(" ");
        String B = scanner.nextLine();
        int cnt = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i].equals(B)) {
                continue;
            } else {
                if (A[i].startsWith(B)) {
                    cnt++;
                }
            }
        }

        System.out.println(cnt);
    }
}