import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B18312 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = 0;
        int K = 0;
        int cnt = 0;
        try {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            N = Integer.parseInt((String) st.nextElement());
            K = Integer.parseInt((String) st.nextElement());
            for (int h = 0; h <= N; h++) {
                for (int m = 0; m <= 59; m++) {
                    for (int s = 0; s <= 59; s++) {
                        if (check(h, m, s, K)) cnt++;
                    }
                }
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (Exception e) {

            }
        }

        System.out.println(cnt);
    }
    public static boolean check(int h, int m, int s, int K) {
        if (h / 10 == K || h % 10 == K || m / 10 == K || m % 10 == K || s / 10 == K || s % 10 == K) {
            return true;
        }
        return false;
    }
}