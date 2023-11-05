import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class B27065 {
    private static final int MAX_N = 5001;
    private static int[] memo = new int[MAX_N];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        memo[1] = 2;
        memo[2] = 2;
        memo[3] = 3;

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int temp = Integer.parseInt(br.readLine());
            List<Integer> arr = divisor(temp);

            if (memo[temp] != 0 && memo[temp] != 1) {
                sb.append("BOJ 2022").append('\n');
                continue;
            } else if (memo[temp] == 0 && !isAbundantNumber(temp, arr)) {
                sb.append("BOJ 2022").append('\n');
                continue;
            }

            int size = arr.size();
            boolean flag = true;
            for (int j = 0; j < size; j++) {
                if (arr.get(j) == temp) continue;

                if (memo[arr.get(j)] == 1) {
                    sb.append("BOJ 2022").append('\n');
                    flag = false;
                    break;
                }

                if (memo[arr.get(j)] == 2 || memo[arr.get(j)] == 3) {
                    continue;
                }

                if (isAbundantNumber(arr.get(j), divisor(arr.get(j)))) {
                    sb.append("BOJ 2022").append('\n');
                    flag = false;
                    break;
                }
            }

            if (flag) {
                sb.append("Good Bye").append('\n');
            }
        }

        bw.write(sb.toString());
        bw.close();
    }

    private static List<Integer> divisor(int targetNum) {
        List<Integer> arr = new ArrayList<>();
        int sqrt = (int) Math.sqrt(targetNum);
        for (int i = 1; i <= sqrt; i++) {
            if (targetNum % i == 0) {
                if (i * i == targetNum) {
                    arr.add(i);
                } else {
                    arr.add(i);
                    arr.add(targetNum / i);
                }
            }
        }
        return arr;
    }

    private static boolean isAbundantNumber(int targetNum, List<Integer> arr) {
        int size = arr.size();
        int sum = 0;
        for (int i = 0; i < size; i++) {
            if (arr.get(i) == targetNum) continue;
            sum += arr.get(i);
        }

        if (sum > targetNum) {
            memo[targetNum] = 1;
            return true;
        }

        if (sum == targetNum) {
            memo[targetNum] = 3;
        } else {
            memo[targetNum] = 2;
        }

        return false;
    }
}
