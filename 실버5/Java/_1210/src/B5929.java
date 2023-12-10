import java.util.Scanner;

public class B5929 {
    static final int NMAX = 35;
    static char[] inp2 = new char[NMAX];
    static char[] inp3 = new char[NMAX];
    static int[] len = new int[2];
    static int[] num2 = new int[NMAX];
    static int[] num3 = new int[NMAX];
    static int N2, N3, ret;

    static char convert(char c) {
        if (c == '0') return '1';
        else return '0';
    }

    static int getNum(int[] num, int k) {
        int result = 0;

        for (int i = 0; i < len[k - 2]; i++) {
            result = result * k + num[i];
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input2 = scanner.next();
        for (int i = 0; i < input2.length(); i++) {
            inp2[i] = input2.charAt(i);
            if (inp2[i] == '0') num2[i] = 0;
            else num2[i] = 1;

            len[0]++;
        }

        String input3 = scanner.next();
        for (int i = 0; i < input3.length(); i++) {
            inp3[i] = input3.charAt(i);
            if (inp3[i] == '0') num3[i] = 0;
            else num3[i] = inp3[i] - '0';

            len[1]++;
        }

        for (int i = 0; i < len[0]; i++) {
            num2[i] = (num2[i] + 1) % 2;

            for (int j = 0; j < len[1]; j++) {
                for (int k = 1; k <= 3; k++) {
                    num3[j] = (num3[j] + 1) % 3;

                    N2 = getNum(num2, 2);
                    N3 = getNum(num3, 3);

                    if (N2 == N3) ret = N2;
                }
            }

            num2[i] = (num2[i] + 1) % 2;
        }

        System.out.print(ret);
    }
}
