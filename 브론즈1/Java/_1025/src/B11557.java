import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

class YYJ implements Comparable<YYJ> {
    private String school;
    private int sul;

    public String getSchool() {return school;}

    public YYJ(String school, int sul) {
        this.school = school;
        this.sul = sul;
    }

    @Override
    public int compareTo(YYJ o) {
        if (sul > o.sul) return 1;
        else if (sul < o.sul) return -1;
        else return 0;
    }
}

public class B11557 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        final int T = Integer.parseInt(br.readLine());

        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < T; i++) {
            final int N = Integer.parseInt(br.readLine());
            ArrayList<YYJ> list = new ArrayList<YYJ>();
            for (int j = 0; j < N; j++) {
                String strtmp = br.readLine();
                String[] strArr = strtmp.split(" ");
                list.add(new YYJ(strArr[0], Integer.parseInt(strArr[1])));
            }

            Collections.sort(list);
            YYJ yyj = list.get(N - 1);
            if (i < T - 1)
                sb.append(yyj.getSchool() + "\n");
            else
                sb.append(yyj.getSchool());
        }
        System.out.println(sb);
    }
}
