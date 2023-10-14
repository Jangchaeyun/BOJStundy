import java.util.Map;
import java.util.Scanner;

public class B9151 {
    static int getCubic(int num) {
        return num * num * num;
    }

    static int getTetrahedral(int num) {
        return (num * (num + 1) * (num + 2) / 6);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int num = scanner.nextInt();

            if (num == 0) {
                break;
            }

            int result = 0;

            for (int i = 1; ;i++) {
                if (getCubic(i) > num) {
                    break;
                }

                result = Math.max(result, getCubic(i));
            }

            for (int i = 1; ;i++) {
                if (getTetrahedral(i) > num) {
                    break;
                }

                result = Math.max(result, getTetrahedral(i));
            }

            for (int i = 1; getCubic(i) <= num; i++) {
                for (int j = 1; getTetrahedral(j) <= num; j++) {
                    int temp = getCubic(i) + getTetrahedral(j);

                    if (temp > num) {
                        continue;
                    }

                    result = Math.max(result, temp);
                }
            }

            System.out.println(result);
        }
    }
}