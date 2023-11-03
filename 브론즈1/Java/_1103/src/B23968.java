import java.util.Scanner;

public class B23968 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int[] a = new int[num1];

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        int tmp = 0;

        for (int i = a.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (a[j] >= a[j + 1]) {
                    --num2;
                    tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                    if (num2 == 0) {
                        System.out.printf("%d %d", a[j], a[j + 1]);
                    }
                }
            }
        }
        if (num2 > 0) {
            System.out.println(-1);
        }
    }
}