import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B23882 {
    private static int N, K;

    private void selectionSort(int[] A) {
        int swapCnt = 0;
        for (int last = N; last >= 2; last--) {
            int max = Integer.MIN_VALUE;
            int i = 0;
            for (int idx = 1; idx <= last; idx++) {
                if (max < A[idx]) {
                    max = A[idx];
                    i = idx;
                }
            }

            if (last != i) {
                int tmp = A[last];
                A[last] = A[i];
                A[i] = tmp;

                if (++swapCnt == K) {
                    StringBuilder sb = new StringBuilder();
                    for (int j = 1; j <= N; j++) {
                        sb.append(A[j]).append(' ');
                    }
                    System.out.println(sb);
                    return;
                }
            }
        }
        System.out.println(-1);
    }

    private void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        int[] arr = new int[N + 1];
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        selectionSort(arr);
    }

    public static void main(String[] args) throws Exception {
        new B23882().solution();
    }
}