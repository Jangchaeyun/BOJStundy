import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class B25177 {
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String input = br.readLine();
        final int crtPCount = Integer.parseInt(input.split(" ")[0]);
        final int pstPCount = Integer.parseInt(input.split(" ")[1]);
        final int macCount = Math.max(crtPCount, pstPCount);

        int[] pointArr = new int[macCount];
        List<Integer> crtPList = Arrays.stream(br.readLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> pstPList = Arrays.stream(br.readLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        IntStream.range(0, crtPCount).forEach(i -> pointArr[i] -= crtPList.get(i));
        IntStream.range(0, pstPCount).forEach(i->pointArr[i] += pstPList.get(i));
        OptionalInt maxPoint = Arrays.stream(pointArr).max();

        int result = 0;
        if (maxPoint.isPresent() && maxPoint.getAsInt() >= 0) {
            result = maxPoint.getAsInt();
        }
        System.out.print(result);
    }
}