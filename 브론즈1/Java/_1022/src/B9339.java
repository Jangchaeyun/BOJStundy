import java.util.Scanner;

public class B9339 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();
        while (T --> 0) {
            int studentCnt = scanner.nextInt();
            int[] students = new int[101];

            for (int i = 0; i < studentCnt; i++) {
                students[i] = scanner.nextInt();
            }

            int participantCnt = scanner.nextInt();
            int bestScore = 987654321;
            int successCnt = 0;
            int bestScoreIdx = 0;

            for (int i = 0; i < participantCnt; i++) {
                int number = scanner.nextInt();
                int hour = scanner.nextInt();
                int min = scanner.nextInt();

                for (int j = 0; j < studentCnt; j++) {
                    if (students[j] == number) {
                        int score = hour * 60 + min;
                        if (score >= 0 && score <= 6 * 60) {
                            if (score < bestScore) {
                                bestScore = score;
                                bestScoreIdx = j;
                            }
                            successCnt++;
                            break;
                        }
                    }
                }
            }

            System.out.println(students[bestScoreIdx] + " " + successCnt);
        }

        scanner.close();
    }
}