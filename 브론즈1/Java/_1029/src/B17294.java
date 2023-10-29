import java.util.ArrayList;
import java.util.Scanner;

public class B17294 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long k = scanner.nextLong();
        ArrayList<Integer> num = new ArrayList<>();

        int tmp;
        int n = 0;

        while (k > 0) {
            tmp = (int) (k % 10);
            k = k / 10;
            num.add(tmp);
            n++;
        }

        int gap = num.get(0) - num.get(1);

        for (int i = 1; i < n; i++) {
            if (num.get(i - 1) - num.get(i) != gap) {
                System.out.println("흥칫뿡!! <(￣ ﹌ ￣)>");
                return;
            }
        }

        System.out.println("◝(⑅•ᴗ•⑅)◜..°♡ 뀌요미!!");
    }
}