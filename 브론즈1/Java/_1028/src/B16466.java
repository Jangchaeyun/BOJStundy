import java.util.*;

public class B16466 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int testCase = scanner.nextInt();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < testCase; i++) {
            list.add(scanner.nextInt());
        }
        Collections.sort(list);
        int count = 0;
        for (int i = 0; i < testCase; i++) {
            if (list.get(i) != i + 1) {
                System.out.println(i + 1);
                count++;
                break;
            }
        }
        if (count == 0) {
            System.out.println(testCase + 1);
        }
    }
}