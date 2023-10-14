import java.util.Scanner;

public class B23756 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int start = scanner.nextInt();
        int ans = 0;

        for (int i = 0; i < n; i++) {
            int go = scanner.nextInt();
            ans += Math.min(Math.min(Math.abs(start - go), 360 - start + go), Math.min(start + 360 - go, go));
            start = go;
        }

        System.out.println(ans);
    }
}
