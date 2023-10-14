import java.util.Scanner;

public class B8713 {
    static int a, b, biggest;
    static int biggestOp() {
        int[] nums = { a + b, a - b, a * b };
        int maxNum = Integer.MIN_VALUE;
        int maxIdx = -1;
        for (int i = 0; i < 3; i++) {
            if (maxNum == nums[i]) return  - 1;
            if (maxNum < nums[i]) {
                maxIdx = i;
                maxNum = nums[i];
            }
        }
        return maxIdx;
    }

    static String getString(int num) {
        String str = Integer.toString(num);
        if (num < 0) return "(" + str + ")";
        return str;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        biggest = biggestOp();

        if (biggest == 0) {
            System.out.println(getString(a) + "+" + getString(b) + "=" + getString(a + b));
        } else if (biggest == 1)  {
            System.out.println(getString(a) + "-" + getString(b) + "=" + getString(a - b));
        } else if (biggest == 2) {
            System.out.println(getString(a) + "*" + getString(b) + "=" + getString(a * b));
        } else {
            System.out.println("NIE");
        }
    }
}