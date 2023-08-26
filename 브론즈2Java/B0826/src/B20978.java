import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class B20978 {
    public static void main(String[] args) throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        final int listSizeA = Integer.parseInt(st.nextToken());
        final int listSizeB = Integer.parseInt(st.nextToken());

        List<Integer> listA = Stream.of(br.readLine().split("\\s+")).map(Integer::valueOf).collect(Collectors.toList());
        List<Integer> listB = Stream.of(br.readLine().split("\\s+")).map(Integer::valueOf).collect(Collectors.toList());

        List<Integer> listCommon = new ArrayList<>(listA);
        listCommon.retainAll(listB);

        listCommon = listCommon.stream().distinct().sorted(Comparator.naturalOrder()).collect(Collectors.toList());

        listCommon.forEach(System.out::println);
    }
}