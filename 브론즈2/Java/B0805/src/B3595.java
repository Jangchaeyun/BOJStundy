import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B3595 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String minIdx = "";
        int min = Integer.MAX_VALUE;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i * j > n) break;

                for (int k = 1; k <= n; k++) {
                    if (i * j * k > n) break;
                    else if (i * j * k < n) continue;
                    else {
                        int size = i * j * 2 + i * k * 2 + j * k * 2;
                        if (size < min) {
                            min = size;
                            minIdx = k + " " + j + " " + i;
                        }
                        break;
                    }
                }
            }
        }

        System.out.println(minIdx);
    }
}