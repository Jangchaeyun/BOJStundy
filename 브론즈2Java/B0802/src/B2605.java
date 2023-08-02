import java.util.ArrayList;
import java.util.Scanner;

public class B2605 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        list.add(-1);

        for (int i = 1; i <= N; i++) {
            int num = sc.nextInt();
            list.add(i - num, i);
        }

        for (int i = 1; i <= N; i++) System.out.print(list.get(i) + " ");
    }
}