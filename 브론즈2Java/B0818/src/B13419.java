import java.util.Scanner;

public class B13419 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        char[] arr = new char[30];
        char[] a = new char[30];
        char[] b = new char[30];

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            arr = input.toCharArray();

            int len = arr.length;
            int ja = 0, jb = 0;

            if (len % 2 == 0) {
                for (int k = 0; k < len; k++)
                    if (k % 2 == 0)
                        a[ja++] = arr[k];
                    else
                        b[jb++] = arr[k];
            } else {
                for (int k = 0; k < len; k++)
                    if (k % 2 == 0)
                        a[ja++] = arr[k];
                    else
                        b[jb++] = arr[k];

                for (int k = 0; k < len; k++)
                    if (k % 2 == 0)
                        b[jb++] = arr[k];
                    else
                        a[ja++] = arr[k];
            }

            System.out.println(a);
            System.out.println(b);

            for (int k = 0; k < len; k++) {
                a[k] = 0;
                b[k] = 0;
            }
        }
    }
}
