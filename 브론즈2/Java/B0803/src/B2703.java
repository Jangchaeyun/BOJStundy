import java.util.Scanner;

public class B2703 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String bef = sc.nextLine();
            String aft = sc.nextLine();
            int size = bef.length();
            for (int j = 0; j < size; j++) {
                if (bef.charAt(j) == ' ') {
                    System.out.print(" ");
                } else {
                    System.out.print(aft.charAt(bef.charAt(j) - 'A'));
                }
            }
            System.out.println();
        }
    }
}