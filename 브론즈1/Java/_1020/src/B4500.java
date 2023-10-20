import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class B4500 {
    public static void main(String[] args) throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        final int testCase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testCase; i++) {
            List<String> inputList = Arrays
                    .stream(br.readLine().split(" "))
                    .collect(Collectors.toList());

            final int startIdx = inputList.indexOf(br.readLine());
            final int gumCount = Integer.parseInt(br.readLine());
            final int inputListSize = inputList.size();
            final int winnerIdx = (startIdx + gumCount - 1) % inputListSize;

            sb.append(inputList.get(winnerIdx)).append("\n");
        }

        sb.setLength(sb.length() - 1);
        System.out.print(sb);
    }
}