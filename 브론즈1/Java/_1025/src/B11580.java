import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;

public class B11580 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Integer, HashSet<Integer>> hm = new HashMap<>();
        try {
            br.readLine();
            String s = br.readLine();
            int x = 0, y = 0, ans = 1;
            HashSet<Integer> hs = new HashSet<>();
            hs.add(y);
            hm.put(x, hs);

            int len = s.length();
            for (int i = 0; i < len; ++i) {
                char c = s.charAt(i);
                switch (c) {
                    case 'N':
                        ++y;
                        break;
                    case 'S':
                        --y;
                        break;
                    case 'W':
                        --x;
                        break;
                    case 'E':
                        ++x;
                        break;
            }
            if (!hm.containsKey(x)) {
                HashSet<Integer> tmp = new HashSet<>();
                tmp.add(y);
                hm.put(x, tmp);
                ++ans;
            } else {
                HashSet<Integer> tmp = hm.get(x);
                if (!tmp.contains(y)) {
                    tmp.add(y);
                    ++ans;
                }
            }
        }

            System.out.println(ans);
    } catch (IOException e) {
            e.printStackTrace();

        }
    }
}
