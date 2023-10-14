import java.util.Scanner;

public class B21567 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        long a = sc.nextInt();
        long b = sc.nextInt();
        long c = sc.nextInt();

        String num = (a * b * c) + "";

        long[] arr = new long[10];
        for (int i = 0; i < num.length(); i++) {
            arr[num.charAt(i) - 48]++;
        }

        String ret = "";
        for (int i = 0; i < arr.length; i++) {
            ret += arr[i];
            if (i != arr.length - 1)
                ret += "\n";
        }
        System.out.println(ret);
    }
}