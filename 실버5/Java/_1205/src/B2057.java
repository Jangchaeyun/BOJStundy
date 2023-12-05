import java.util.Scanner;

public class B2057 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] check = new int[21];
        check[20] = 1;
        int k = 19;
        int fac = factorial(19);

        if (N != 0) {
            while (true) {
                while (true) {
                    k = indexOf(check, 1) - 1;
                    fac = factorial(k);
                    check[k] = 1;
                    if (N >= fac) {
                        break;
                    }
                }
                N -= fac;
                if (check[0] == 1 || N == 0) {
                    break;
                }
            }
            if (N == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } else {
            System.out.println("NO");
        }
    }

    private static int indexOf (int[] array, int target){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }

    private static int factorial ( int n){
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}