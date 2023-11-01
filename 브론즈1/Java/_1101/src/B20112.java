import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B20112 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(reader.readLine());
        String[][] rowWord = new String[N][N];
        String[][] colWord = new String[N][N];
        String result = "YES";

        for (int i = 0; i < N; i++) {
            String word = reader.readLine();
            for (int j = 0; j < N; j++) {
                rowWord[i][j] = String.valueOf(word.charAt(j));
                colWord[j][i] = rowWord[i][j];
            }
        }
        if (!Arrays.deepEquals(rowWord, colWord)) {
            result = "NO";
        }

        System.out.println(result);
    }
}