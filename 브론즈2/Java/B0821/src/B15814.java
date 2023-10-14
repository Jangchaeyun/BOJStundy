import java.util.Scanner;

public class B15814 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int t = sc.nextInt();

        char[] array = s.toCharArray();

        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            char temp = array[a];
            array[a] = array[b];
            array[b] = temp;
        }

        sc.close();

        for (char c : array) {
            System.out.print(c);
        }
    }
}