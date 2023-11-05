import java.awt.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B27961 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private void solution() throws Exception {
        long n = Long.parseLong(br.readLine());
        int cnt = 0;
        while (n > 3) {
            cnt++;
            n = n / 2 + (n % 2 == 1 ? 1 : 0);
        }
        System.out.println(cnt + n);
    }

    public static void main(String[] args) throws Exception {
        new B27961().solution();
    }
}