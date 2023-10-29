import java.io.*;
import java.util.StringTokenizer;

public class B17269 {
    public static int answer1 = 0;
    public static int answer2 = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        String str1 = st.nextToken();
        String str2 = st.nextToken();

        int[] vals = { 3, 2, 1, 2, 4, 3, 1, 3, 1, 1, 3, 1, 3, 2, 1, 2, 2, 2, 1, 2, 1, 1, 1, 2, 2, 1 };
        String newStr = "";
        int maxLength = 0;
        String result;

        if (N > M)
            maxLength = N;
        else
            maxLength = M;

        for (int i = 0; i < maxLength; i++) {
            if (N > i)
                newStr = newStr + str1.charAt(i);
            if (M > i)
                newStr = newStr + str2.charAt(i);
        }

        int[] newStrAlb = new int[newStr.length()];
        int[] newStrVals = new int[newStr.length()];

        for (int i = 0; i < newStr.length(); i++)
            newStrAlb[i] = newStr.charAt(i) - 'A';

        for (int i = 0; i < newStrVals.length; i++)
            newStrVals[i] = vals[newStrAlb[i]];

        dfs(newStrVals, true);

        if (answer1 == 0)
            result = "" +answer2+"%" ;
        else
            result = answer1 + "" + answer2 + "%";

        bw.write(result);
        br.close();
        bw.flush();
        bw.close();
    }

    public static void dfs(int[] vals, boolean flag) {
        if (vals.length > 2 && flag == true) {
            flag = true;
            int[] tmp = new int[vals.length - 1];
            for (int i = 0; i < vals.length - 1; i++) {
                tmp[i] = vals[i] + vals[i + 1];
                if (tmp[i] > 0 && tmp[i] >= 10)
                    tmp[i] = tmp[i] % 10;
            }
            dfs(tmp, flag);
        } else {
            answer1 = vals[0];
            answer2 = vals[1];
            flag = false;
            return;
        }
    }
}
