import java.util.Scanner;

public class B24051 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int[] a = new int[num1];

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        int tmp = 0;

        for (int i = 1; i < a.length; i++) {
            tmp = a[i];
            int j = i;
            while (a[j - 1] > tmp) {
                num2--;
                a[j] = a[j - 1];
                j--;
                if (num2 == 0) {
                    System.out.println(a[j]);
                }
                if (j - 1 < 0) break;
            }
            if (j != i) {
                a[j] = tmp;
                num2--;
                if (num2 == 0) {
                    System.out.println(a[j]);
                }
            }
        }
        if (num2 > 0) {
            System.out.println(-1);
        }
    }
}