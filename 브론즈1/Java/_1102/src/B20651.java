import java.util.Scanner;

public class B20651 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[100];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int tempSum;
        int tempAvg;
        int tempCnt;
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            for (int begin = 0; begin <= n - i; begin++) {
                tempSum = 0;
                tempCnt = 0;
                tempAvg = 0;
                for (int j = begin; j < begin + i; j++) {
                   tempSum += arr[j];
                }

                if (tempSum % i != 0) {
                    continue;
                }
                tempAvg = tempSum / i;
                for (int j = begin; j < begin + i; j++) {
                    if (arr[j] == tempAvg) {
                        tempCnt++;
                        break;
                    }
                }
                answer += tempCnt;
            }
        }

        System.out.println(answer);
    }
}