import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class B2238 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int U = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        List<String>[] p = new ArrayList[10001];
        for (int i = 0; i < 10001; i++) {
            p[i] = new ArrayList<>();
        }

        int[] num = new int[10001];
        int m = 10001;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int price = Integer.parseInt(st.nextToken());

            p[price].add(name);
            num[price] += 1;
        }

        for (int i = 0; i < 10001; i++) {
            if (num[i] != 0) {
                m = Math.min(num[i], m);
            }
        }

        for (int i = 0; i < 10001; i++) {
            if (m == num[i]) {
                System.out.println(p[i].get(0) + " " + i);
                break;
            }
        }
    }
}
