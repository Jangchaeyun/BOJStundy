import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class B27913 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "SciComLove";
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int Q = Integer.parseInt(st.nextToken());
        ArrayList<String> list = new ArrayList<>();

        String strResult = "";

        for (int i = 0; i < N / 10; i++) {
            strResult += str;
        }

        for (int i = 0; i < N % 10; i++) {
            strResult += str.substring(i, i + 1);
        }

        char[] ch = strResult.toCharArray();

        for (int i = 0; i < Q; i++) {
            int num = Integer.parseInt(br.readLine());

            if (Character.isLowerCase(ch[num - 1])) {
                ch[num - 1] = Character.toUpperCase(ch[num - 1]);
            } else {
                ch[num - 1] = Character.toLowerCase(ch[num - 1]);
            }

            int cnt = 0;

            for (int j = 0; j < ch.length; i++) {
                if (Character.isUpperCase(ch[j])) {
                    cnt++;
                }
            }

            System.out.println(cnt);
        }
    }
}