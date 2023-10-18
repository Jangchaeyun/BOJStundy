import java.util.Scanner;

public class B2755 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String [][] arr = new String[n][3];

        double sum = 0;
        double hakSum = 0;
        for (int i = 0; i < n; i++) {
            double temp = 0;
            for (int j = 0; j < 3; j++) {
                arr[i][j] = scan.next();
            }
            String score = arr[i][2];
            if (score.charAt(0) == 'A') temp = 4;
            if (score.charAt(0) == 'B') temp = 3;
            if (score.charAt(0) == 'C') temp = 2;
            if (score.charAt(0) == 'D') temp = 1;
            if (score.charAt(1) == '+') temp += 0.3;
            if (score.charAt(1) == '-') temp -= 0.3;

            sum += Integer.parseInt(arr[i][1]) * temp;
            hakSum += Integer.parseInt(arr[i][1]);
        }

        System.out.println(String.format("%.2f", sum / hakSum));
    }
}
