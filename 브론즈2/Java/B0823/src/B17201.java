import java.util.Scanner;

public class B17201 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        String line = sc.nextLine();

        boolean flag = false;
        for (int i = 1; i < line.length() - 1; i += 2) {
            if (line.charAt(i) == line.charAt(i + 1)) {
                flag = true;
                break;
            }
        }

        if (flag) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}