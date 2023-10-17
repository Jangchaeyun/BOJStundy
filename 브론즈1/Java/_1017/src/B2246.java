import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2246 {
    class Conbo {
        int d, c;
        public Conbo(int d, int c) {
            this.d = d;
            this.c = c;
        }
    }

    private void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Conbo[] arr = new Conbo[n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i] = new Conbo(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            Conbo cur = arr[i];
            boolean chk = true;
            for (int j = 0; j < n; j++) {
                if (i == j) continue;
                if (cur.c>arr[j].c && cur.d>=arr[j].d) {
                    chk = false;
                    break;
                }
                if (cur.d>arr[j].d && cur.c>=arr[j].c) {
                    chk = false;
                    break;
                }
            }
            if (chk) cnt++;
        }
        System.out.println(cnt);
    }

    public static void main(String[] args) throws Exception {
        new B2246().solution();
    }
}
