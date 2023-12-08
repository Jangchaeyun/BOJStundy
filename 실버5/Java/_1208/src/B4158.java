import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class B4158 {
    static int n;
    static int m;
    static HashSet<Integer> set;
    static int count;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());

            if (n == 0 && m == 0) {
                break;
            }

            set = new HashSet<>();
            count = 0;

            for (int i = 0; i < n; i++) {
                set.add(Integer.parseInt(br.readLine()));
            }

            for (int j = 0; j < n; j++) {
                int cd = Integer.parseInt(br.readLine());

                if (set.contains(cd))
                    count++;
            }

            System.out.println(count);
        }
    }
}