import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B23627 {
    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        System.out.print((br.readLine().endsWith("driip")) ? "cute" : "not cute");
    }
}