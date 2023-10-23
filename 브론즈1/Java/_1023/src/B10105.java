import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class B10105 {
    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int playerCount = Integer.parseInt(br.readLine());

        List<String> names01 = getInputList(playerCount);
        List<String> names02 = getInputList(playerCount);

        String output = "bad";
        if (isConsistent(playerCount, names01, names02)) {
            output = "good";
        }
        System.out.print(output);
    }

    private static boolean isConsistent(int playerCount, List<String> names01, List<String> names02) {
        boolean isConsistent = true;
        Map<String, String> nameMap = new HashMap<>();

        for (int i = 0; i < playerCount; i++) {
            String name01 = names01.get(i);
            String name02 = names02.get(i);

            if (name01.equals(name02)) {
                isConsistent = false;
                break;
            }

            if (nameMap.get(name02) != null && (!nameMap.get(name02).equals(name01))) {
              isConsistent = false;
              break;
            }

            nameMap.put(name01, name02);
        }
        return isConsistent;
    }

    private static List<String> getInputList(int playerCount) throws IOException {
        List<String> inputList = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int j = 0; j < playerCount; j++) {
            inputList.add(st.nextToken());
        }
        return inputList;
    }
}