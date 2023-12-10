import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class B5648 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        String str = reader.readLine();

        while (str != null) {
            StringTokenizer st = new StringTokenizer(str);
            while (st.hasMoreTokens()) {
                list.add(st.nextToken());
            }
            str = reader.readLine();
        }
        list.remove(0);

        StringBuilder sb = new StringBuilder();
        list.stream().map(s -> new StringBuilder(s).reverse().toString()).mapToLong(Long::parseLong).sorted()
                .forEachOrdered(l -> sb.append(l).append("\n"));
        System.out.print(sb);
    }
}