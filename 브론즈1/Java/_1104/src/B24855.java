import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class B24855 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int tSize = Integer.parseInt(br.readLine());
        final int tHalfSize = tSize / 2;
        List<Integer> tValues = Arrays.stream(br.readLine().split(" "))
                .map(Integer::parseInt).sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        final int tHalfSum = IntStream.range(0, tHalfSize).map(tValues::get).sum();

        System.out.print(tHalfSum);
        br.close();
    }
}