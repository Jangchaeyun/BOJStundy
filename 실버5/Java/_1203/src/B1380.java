import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class B1380 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sce = 0;
        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) {
                return;
            } else {
                sce++;
            }

            ArrayList<String> grils = new ArrayList<String>();

            for (int i = 0; i < n; i++) {
                grils.add(br.readLine());
            }

            ArrayList<Integer> isNum = new ArrayList<Integer>();
            for (int i = 0; i < 2 * n - 1; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int num = Integer.parseInt(st.nextToken());

                if (isNum.contains(num)) {
                    isNum.remove((Integer) num);
                } else {
                    isNum.add(num);
                }
            }

            int resultgirl = isNum.get(0);
            System.out.println(sce + " " + grils.get(resultgirl - 1));
        }
    }
}