import java.util.Scanner;

public class B2711 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            int index = sc.nextInt();
            StringBuilder sb = new StringBuilder(sc.next());
            sb.deleteCharAt(index - 1);
            System.out.println(sb);
        }
        sc.close();
    }
}