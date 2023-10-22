import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B9299 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        boolean correct = true;
        char[] c2 = br.readLine().toCharArray();
        while (true) {
            char[] c1 = c2;
            c2 = br.readLine().toCharArray();

            if (c2[0] == '#') {
                if (c1[0] == '#') {
                    break;
                } else {
                    if (correct) {
                        sb.append("Correct\n");
                    } else {
                        sb.append("Incorrect\n");
                    }
                    correct = true;
                    continue;
                }
            }
            if (c1[0] == '#') {
                continue;
            }

            if (correct) {
                if (c1.length != c2.length) {
                    correct = false;
                    continue;
                }

                int count = 0;
                for (int i = 0; i < c1.length; i++) {
                    if (c1[i] != c2[i]) count++;
                }
                if (count != 1) {
                    correct = false;
                }
            }
        }

        System.out.println(sb);
    }
}