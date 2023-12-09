import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class B4649 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String[] li = br.readLine().trim().split(" ");
            Map<String, Integer> liDict = new HashMap<>();
            int cnt = 0;

            if (li.length == 1 && li[0].equals("0")) {
                break;
            }

            int num = Integer.parseInt(li[0]);

            if (li.length != 1) {
                li = br.readLine().trim().split(" ");
            }

            for (String customer : li) {
                if (!liDict.containsKey(customer) && liDict.size() < num) {
                    liDict.put(customer, 1);
                } else if (liDict.containsKey(customer)) {
                    liDict.remove(customer);
                } else if (!liDict.containsKey(customer) && liDict.size() >= num) {
                    cnt += 1;
                }
            }

            if (cnt == 0) {
                System.out.println("All customers tanned successfully.");
            } else {
                System.out.printf("%d customer(s) walked away.%n", cnt / 2);
            }
        }
    }
}