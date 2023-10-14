import java.util.Scanner;

public class B1919 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] alpha = new int[26];
        boolean check = true;
        int cnt = 0;
        int sum = 0;
        char[] word1 = scan.nextLine().toCharArray();
        char[] word2 = scan.nextLine().toCharArray();

        for (char c : word1)
            alpha[c - 97]++;
        for (char c : word2)
            alpha[c - 97]--;

        for (int i = 0; i < alpha.length; i++) {
            alpha[i] = Math.abs(alpha[i]);

            if (alpha[i] != 0)
                sum += alpha[i];
        }
        System.out.println(sum);
    }
}