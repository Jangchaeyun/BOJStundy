import java.util.Scanner;

public class B20650 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = new int[7];

        for (int i = 0; i < 7; i++) {
            arr[i] = input.nextInt();
        }

        int max = -99;
        for (int i = 0; i < 7; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        int min = 999999999;
        int minIdx = -1;
        for (int i = 0; i < 7; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minIdx = i;
            }
        }

        int min2 = 999999999;
        for (int i = 0; i < 7; i++) {
            if (i == minIdx) {
                continue;
            }
            if (arr[i] < min2) {
                min2 = arr[i];
            }
        }

        System.out.printf("%d %d %d", min, min2, max - min - min2);
    }
}