import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;

public class B6426 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = null;
        int idx = 0;
        while (!(s = br.readLine()).equals("0 0 0 0")) {
            StringTokenizer st = new StringTokenizer(s);
            int Z = Integer.parseInt(st.nextToken());
            int I = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            int L = Integer.parseInt(st.nextToken());
            HashSet<Integer> set = new HashSet<Integer>();
            while (true) {
                L = (Z * L + I) % M;
                int size = set.size();
                set.add(L);
                if (size == set.size())
                    break;
            }

            bw.write(String.format("Case %d: %d\n", ++idx, set.size()));
        }
        bw.flush();
        bw.close();
        br.close();
    }
}