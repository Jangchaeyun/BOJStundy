import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B2204 {
    static int n;
    static String list[];

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            n = Integer.parseInt(br.readLine());

            if (n == 0)
                break;

            list = new String[n];

            for (int i = 0; i < n; i++) {
                list[i] = br.readLine();
            }

            Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);

            System.out.println(list[0]);
        }
    }
}
