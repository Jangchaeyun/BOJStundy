import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B28239 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        boolean flag = false;
        while (N --> 0) {
            long m = Long.parseLong(br.readLine());
            for (int i = 0; i <= 63; i++) {
                for (int j = 63; j >= 0; j--) {
                    flag = (long) Math.pow(2, i) + (long) Math.pow(2, j) == m ? true : false;
                    if (flag) {
                        sb.append(i).append(" ").append(j).append("\n");
                        break;
                    }
                }
                if (flag) {
                    break;
                }
            }
        }
        System.out.print(sb);
    }
}