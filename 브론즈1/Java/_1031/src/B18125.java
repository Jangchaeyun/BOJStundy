import java.util.Scanner;

public class B18125 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int [][] ab = new int[b][a];
        boolean food = true;

        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                ab[i][j] = sc.nextInt();
            }
        }


        for (int i = 0; i < a; i++) {
            for (int j = b - 1; j >= 0; j--) {
                int n = sc.nextInt();

                if (ab[j][i] != n) {
                    food = false;
                    break;
                }
            }

            if (!food) {
                break;
            }
        }

        if (food) {
            System.out.println( "|>___/|        /}\n" +
                    "| O < |       / }\n" +
                    "(==0==)------/ }\n" +
                    "| ^  _____    |\n" +
                    "|_|_/     ||__|");
        } else {
            System.out.println("|>___/|     /}\n" +
                    "| O O |    / }\n" +
                    "( =0= )\"\"\"\"  \\\n" +
                    "| ^  ____    |\n" +
                    "|_|_/    ||__|");
        }
    }
}