import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class B3230 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        LinkedList<Integer> player = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            int score = Integer.parseInt(br.readLine()) - 1;
            player.add(score, i);
        }

        LinkedList<Integer> finalplayer = new LinkedList<>();
        for (int j = M; j > 0; j--) {
            int num = player.get(j - 1);
            int score = Integer.parseInt(br.readLine()) - 1;
            finalplayer.add(score, num);
        }

        for (int i = 0; i < 3; i++) {
            System.out.println(finalplayer.get(i) + 1);
        }
    }
}