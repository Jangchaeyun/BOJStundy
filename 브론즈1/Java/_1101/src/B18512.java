import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class B18512 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int X = Integer.parseInt(st.nextToken());
        int Y = Integer.parseInt(st.nextToken());
        int P1 = Integer.parseInt(st.nextToken());
        int P2 = Integer.parseInt(st.nextToken());

        ArrayList<int[]> list = new ArrayList<int[]>();
        if (X <= Y) {
            list.add(new int[] { X, P1 });
            list.add(new int[] { Y, P2 });
        } else {
            list.add(new int[] { Y, P2 });
            list.add(new int[] { X, P1 });
        }

        int cnt = 1;
        while (true) {
            int num = list.get(0)[1] + cnt * list.get(0)[0];
            if (num >= 10000 + list.get(0)[1]) {
                System.out.println(-1);
                break;
            }

            num -= list.get(1)[1];
            if (num >= 0 && num % list.get(1)[0] == 0) {
                System.out.println(num + list.get(1)[1]);
                break;
            } else
                cnt++;
        }
    }
}