import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B14593 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;
    static class Score implements Comparable<Score> {
        int num, S, C, L;

        public Score(int num, int s, int c, int l) {
            this.num = num;
            S = s;
            C = c;
            L = l;
        }

        @Override
        public int compareTo(Score o) {
            if (this.S != o.S) return o.S - this.S;
            else if (this.C != o.C) return this.C - o.C;
            else return this.L = o.L;
        }
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        int N = Integer.parseInt(br.readLine());
        Score[] students = new Score[N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int l = Integer.parseInt(st.nextToken());
            students[i] = new Score(i + 1, s, c, l);
        }

        Arrays.sort(students);
        System.out.println(students[0].num);
    }
}