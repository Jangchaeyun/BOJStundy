import java.util.Scanner;

public class B24389 {
    public static String Convert32bit(String temp) {
        int N = 32 - temp.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append("0");
        }
        sb.append(temp);
        return sb.toString();
    }

    public static String toBinary(int num) {
        return Integer.toBinaryString(num);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String B_N = toBinary(N);

        int flipBit = ~N;
        int plusOne = flipBit + 1;
        String B_plusOne = toBinary(plusOne);

        int cnt = 0;
        for (int i = 0; i < 32; i++) {
            String a = Convert32bit(B_N);
            String b = Convert32bit(B_plusOne);
            if (a.charAt(i) != b.charAt(i)) cnt++;
        }
        System.out.println(cnt);
    }
}