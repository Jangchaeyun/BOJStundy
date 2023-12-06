import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2891 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(bf.readLine());

        int N = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());

        int[] team = new int[N];
        for (int i = 0; i < team.length; i++) {
            team[i] = 1;
        }

        st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < S; i++) {
            int num = Integer.parseInt(st.nextToken()) - 1;
            team[num] = team[num] - 1;
        }

        st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < R; i++) {
            int num = Integer.parseInt(st.nextToken()) - 1;
            team[num] = team[num] + 1;
        }

        for (int i = 0; i < team.length; i++) {
            if (i == 0) {
                if (team[0] == 2 && team[1] == 0) {
                    team[0] = 1;
                    team[1] = 1;
                }
            } else if (i == team.length - 1) {
                if (team[team.length - 1] == 2 && team[team.length - 2] == 0) {
                    team[team.length - 1] = 1;
                    team[team.length - 2] = 1;
                }
            } else {
                if (team[i] == 2) {
                    if (team[i - 1] == 0) {
                        team[i] = 1;
                        team[i - 1] = 1;
                    } else if (team[i + 1] == 0) {
                        team[i] = 1;
                        team[i + 1] = 1;
                    }
                }
            }
        }

        int count = 0;
        for (int i = 0; i < team.length; i++) {
            if (team[i] == 0) {
                count++;
            }
        }
        System.out.println(count++);
    }
}
