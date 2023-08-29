import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B25053 {
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        final int testCase = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < testCase; i++) {
            ProblemDto problemDto = new ProblemDto();
            final int problems = Integer.parseInt(br.readLine());
            for (int j = 0; j < problems; j++) {
                String[] inputArr = br.readLine().split(" ");
                problemDto.insert(Integer.parseInt(inputArr[0]), Integer.parseInt(inputArr[1]));
            }
            sb.append(problemDto.findTotalBeauty()).append("\n");
        }
        sb.setLength(sb.length() - 1);
        System.out.print(sb);
    }

    private static class ProblemDto {
        private final int[] beautyScoreArr;
        private final boolean[] isDifficultyArr;

        public ProblemDto() {
            beautyScoreArr = new int[11];
            isDifficultyArr = new boolean[11];
            isDifficultyArr[0] = true;
        }

        public void insert(int beautyScore, int difficulty) {
            if (!isDifficultyArr[difficulty]) {
                isDifficultyArr[difficulty] = true;
            }
            if (beautyScoreArr[difficulty] < beautyScore) {
                beautyScoreArr[difficulty] = beautyScore;
            }
        }

        public String findTotalBeauty() {
            String retVal = "MOREPROBLEMS";
            if (hasAllDifficulty()) {
                retVal = String.valueOf(Arrays.stream(beautyScoreArr).sum());
            }
            return retVal;
        }

        private boolean hasAllDifficulty() {
            boolean hasAllDifficulty = true;
            for (boolean b : isDifficultyArr) {
                if (!b) {
                    hasAllDifficulty = false;
                    break;
                }
            }
            return hasAllDifficulty;
        }
    }
}