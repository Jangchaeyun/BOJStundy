import java.util.Scanner;

public class B15920 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.next());

        String str = sc.next();

        int train = 1;

        int answer = 5;
        boolean lever = false;
        for (int i = 0; i < N; i++) {
            String action = str.substring(i, i + 1);

            if (train == 3) {
                break;
            }

            if (action.equals("W")) {
                train++;
            } else if (action.equals("P")) {
                if (train == 1) {
                    if (lever) {
                        answer = 5;
                    } else {
                        answer = 1;
                    }
                    lever = !lever;
                } else if (train == 2) {
                    answer = 6;
                }
            }
        }

        if (train < 3) {
            answer = 0;
        }
        System.out.println(answer);
    }
}
