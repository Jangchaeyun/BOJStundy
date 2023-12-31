import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B2804 {
    static char[] A, B;
    static int N, M;
    static char[][] map;
    static int I, J;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        A = st.nextToken().toCharArray();
        B = st.nextToken().toCharArray();

        N = A.length;
        M = B.length;

        map = new char[M][N];

        for (int i = 0; i < M; i++) {
            Arrays.fill(map[i], '.');
        }

        loop:for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (A[i] == B[j]) {
                    map[j] = A;

                    for (int k = 0; k < M; k++) {
                        map[k][i] = B[k];
                    }
                    break loop;
                }
            }
        }

        for (int i  = 0; i < M; i++) {
            sb.append(map[i]);
            sb.append("\n");
        }
        System.out.print(sb.toString());
    }
}