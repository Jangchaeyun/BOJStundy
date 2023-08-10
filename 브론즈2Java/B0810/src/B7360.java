import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class B7360 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line = br.readLine();
        while (Integer.parseInt(line) != 0) {
            int r = Integer.parseInt(line);
            int scoreA = 0;
            int scoreB = 0;
            int[] A = new int[r];
            int[] B = new int[r];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < r; i++) {
                A[i] = Integer.parseInt(st.nextToken());
            }
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < r; i++) {
                B[i] = Integer.parseInt(st.nextToken());
            }
            for (int i = 0; i < r; i++) {
                if (A[i]  != B[i]) {
                    if (A[i] - 1 == B[i]) {
                        if (A[i] == 2) {
                            scoreB += 6;
                        } else {
                            scoreB += A[i] + B[i];
                        }
                    } else if (B[i]  - 1 == A[i]) {
                        if (B[i] ==  2) {
                            scoreA += 6;
                        } else {
                            scoreA += A[i] + B[i];
                        }
                    } else if (A[i] > B[i]) {
                        scoreA += A[i];
                    } else if (B[i] > A[i]) {
                        scoreB += B[i];
                    }
                }
            }
            bw.write("A has " + scoreA + " points. B has " + scoreB + " points.\n");
            line = br.readLine();
            if (Integer.parseInt(line) == 0) {
                break;
            } else {
                bw.write("\n");
            }
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
