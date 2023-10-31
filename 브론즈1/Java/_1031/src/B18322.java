import java.util.Scanner;

public class B18322 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();

        String[] strArr = str.split(" ");

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            cnt += strArr[i].length();

            if (!(cnt > k)) {
                if (i == 0) System.out.print(strArr[i]);
                else System.out.print(" " + strArr[i]);
            } else {
                System.out.print("\n" + strArr[i]);
                cnt = strArr[i].length();
            }
        }
    }
}