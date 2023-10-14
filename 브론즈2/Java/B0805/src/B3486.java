import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B3486 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String[] numbers = br.readLine().split(" ");
            int sum = 0;
            for (String number : numbers) {
                sum += Integer.parseInt(new StringBuilder(number).reverse().toString());
            }
            String reversedSum = new StringBuilder(String.valueOf(sum)).reverse().toString();
            System.out.println(Integer.parseInt(reversedSum));
        }
    }
}