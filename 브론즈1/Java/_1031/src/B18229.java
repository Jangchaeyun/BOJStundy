import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B18229 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int [][] arr = new int[N][M];
        int [] sum = new int[N];

        for (int i = 0; i < N; i++) {
            StringTokenizer token = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                arr[i][j] = Integer.parseInt(token.nextToken());
            }
        }
        out:for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                sum[j] += arr[j][i];
                if (sum[j] >= K) {
                    System.out.println((j + 1) + " " + (i + 1));
                    break out;
                }
            }
        }
    }
}