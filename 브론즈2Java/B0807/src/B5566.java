import java.util.Scanner;

public class B5566 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int turn = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int nowIdx = 0;
        int cnt = 0;

        for (int i = 1; i <= turn; i++) {
            int now = sc.nextInt();
            nowIdx += now;
            if (nowIdx >= size - 1) {
                cnt = i;
                break;
            }

            int gomore = arr[nowIdx];
            nowIdx += gomore;
            if (nowIdx >= size - 1) {
                cnt = i;
                break;
            }
        }
        System.out.println(cnt);
    }
}
