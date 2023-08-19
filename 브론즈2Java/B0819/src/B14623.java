import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B14623 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String B1 = br.readLine();
        String B2 = br.readLine();

        long B1n = Long.parseLong(B1, 2);
        long B2n = Long.parseLong(B2, 2);

        String sum = Long.toBinaryString(B1n * B2n);

        System.out.println(sum);
    }
}