import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class B25551 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] mask = new int[2];
        int[] shirt = new int[2];
        int[] pants = new int[2];

        for (int i = 0; i < 2; i++) {
            mask[i] = scanner.nextInt();
        }
        for (int i = 0; i < 2; i++) {
            shirt[i] = scanner.nextInt();
        }
        for (int i = 0; i < 2; i++) {
            pants[i] = scanner.nextInt();
        }

        ArrayList<Integer> array1 = new ArrayList<>();
        ArrayList<Integer> array2 = new ArrayList<>();

        array1.add(mask[0]);
        array1.add(shirt[1]);
        array1.add(pants[0]);

        array2.add(mask[1]);
        array2.add(shirt[0]);
        array2.add(pants[1]);

        Collections.sort(array1);
        Collections.sort(array2);

        ArrayList<Integer> answerArray = new ArrayList<>();
        answerArray.add(array1.get(0));
        answerArray.add(array2.get(0));
        Collections.sort(answerArray);

        if (answerArray.get(1) - answerArray.get(0) != 0 && answerArray.get(1) - answerArray.get(0) != 1) {
            System.out.println(answerArray.get(0) * 2 + 1);
        } else {
            System.out.println(answerArray.get(0) + answerArray.get(1));
        }
    }
}
