import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B10829 {
    private void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(Long.toBinaryString(Long.parseLong(br.readLine())));
    }

    public static void main(String[] args) throws Exception {
        new B10829().solution();
    }
}
