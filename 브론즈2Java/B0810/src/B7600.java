import java.util.Scanner;

public class B7600 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[26];

        while (true) {
            int cnt = 0;
            String word = sc.nextLine();

            if (word.equals("#"))
                break;

            for (int i = 0; i < word.length(); i++) {
                if ((int) word.charAt(i) >= 97 && (int) word.charAt(i) <= 122)
                {
                    arr[(int) word.charAt(i) - 97]++;
                }
                if ((int) word.charAt(i) >= 65 && (int) word.charAt(i) <= 90)
                {
                    arr[(int) word.charAt(i) - 65]++;
                }
            }

            for (int i = 0; i < arr.length; i++)
            {
                if (arr[i] > 0)
                {
                    cnt++;
                    arr[i] = 0;
                }
            }
            System.out.println(cnt);
        }
    }
}