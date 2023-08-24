import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;

public class B17285 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Character> encodedList = br.readLine().codePoints().mapToObj(c -> (char) c).collect(Collectors.toList());
        int key = encodedList.get(0) ^ 67;
        List<Character> decodedList = encodedList.stream().map(c -> (char) (Integer.valueOf(c) ^ key)).collect(Collectors.toList());
        decodedList.stream().forEach(System.out::print);
    }
}