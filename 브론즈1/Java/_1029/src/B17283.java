import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class B17283 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int branchLength = Integer.valueOf(br.readLine());
        int branchRatio = Integer.valueOf(br.readLine());

        Deque<Integer> branchLengthDeq = new ArrayDeque<>();

        while (branchLength > 5) {
            branchLength = branchRatio * branchLength / 100;
            branchLengthDeq.push(branchLength);
        }

        branchLengthDeq.pop();
        int sum = branchLengthDeq.stream().reduce(0, (a, b) -> (a + b) * 2);
        System.out.print(sum);
    }
}