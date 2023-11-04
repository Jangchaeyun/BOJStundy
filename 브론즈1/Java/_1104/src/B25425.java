import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B25425 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long N = Long.parseLong(st.nextToken());
        long M = Long.parseLong(st.nextToken());
        long a = Long.parseLong(st.nextToken());
        long K = Long.parseLong(st.nextToken());

        long max, min;
        if (a - K >= N - 1) {
            max = N - 1 + 1;
            if ((a - K) % M == 0) {
                min = (a - K) / M + 1;
            } else {
                min = (a - K) / M + 1 + 1;
            }
        } else {
            max = a - K + 1;
            if (a - K == 0) {
                min = 1;
            } else if ((a - K) % M == 0) {
                min = (a - K) / M + 1;
            } else {
                min = (a - K) / M + 1 + 1;
            }
        }

        System.out.println(max + " " + min);
    }
}