import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class B20362 {
    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        List<PlayInfo> playInfoList = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int chatCount = Integer.parseInt(st.nextToken());
        String winnerNickName = st.nextToken();
        String winnerAnswer = "";

        for (int i = 0; i < chatCount; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            String nickName = st.nextToken();
            String answer = st.nextToken();
            PlayInfo playInfo = new PlayInfo(nickName, answer);
            playInfoList.add(playInfo);
            if (nickName.equals(winnerNickName)) {
                winnerAnswer = answer;
            }
        }

        int answerBeforeWinnerCount = 0;
        for (PlayInfo playInfo : playInfoList) {
            if (playInfo.getNickName().equals(winnerNickName)) {
                break;
            }

            if (playInfo.getAnswer().equals(winnerAnswer)) {
                answerBeforeWinnerCount++;
            }
        }

        System.out.print(answerBeforeWinnerCount);
    }

    private static class PlayInfo {
        private final String nickName;
        private final String answer;

        public PlayInfo(String nickName, String answer) {
            this.nickName = nickName;
            this.answer = answer;
        }

        public String getNickName() {
            return nickName;
        }

        public String getAnswer() {
            return answer;
        }
    }
}
