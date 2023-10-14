import java.util.Scanner;

public class B2704 {
    public static void getBin(int[] arr, int n) {
        int i = 0;
        while (n > 0) {
            arr[i] = n % 2;
            n /= 2;
            i++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();

        while (T-- > 0) {
            String time = sc.nextLine();
            String[] parts = time.split(":");
            int hour = Integer.parseInt(parts[0]);
            int minute = Integer.parseInt(parts[1]);
            int second = Integer.parseInt(parts[2]);

            int[] bin_hour = new int[6];
            int[] bin_minute = new int[6];
            int[] bin_second = new int[6];

            getBin(bin_hour, hour);
            getBin(bin_minute, minute);
            getBin(bin_second, second);

            for (int i = 5; i >= 0; i--) {
                System.out.print(bin_hour[i]);
                System.out.print(bin_minute[i]);
                System.out.print(bin_second[i]);
            }
            System.out.print(" ");

            for (int i = 5; i >= 0; i--) {
                System.out.print(bin_hour[i]);
            }
            for (int i = 5; i >= 0; i--) {
                System.out.print(bin_minute[i]);
            }
            for (int i = 5; i >= 0; i--) {
                System.out.print(bin_second[i]);
            }

            System.out.println();
        }
    }
}
