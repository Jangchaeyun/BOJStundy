import java.util.Scanner;

public class B14724 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int member_num = s.nextInt();
        int max_score = 0;
        int cur_score = 0;

        int[] max_mem = new int[9];

        for (int k = 0; k < 9; k++) {
            for (int i = 0; i < member_num; i++) {
                cur_score = s.nextInt();
                if (max_score < cur_score) {
                    max_score = cur_score;
                }
            }
            max_mem[k] = max_score;
            max_score = 0;
        }

        int max_club = 0;
        max_score = 0;
        for (int p = 0; p < 9; p++) {
            if (max_mem[p] > max_score) {
                max_score = max_mem[p];
                max_club = p;
            }
        }

        switch(max_club) {
            case 0:
                System.out.println("PROBRAIN");
                break;
            case 1:
                System.out.println("GROW");
                break;
            case 2:
                System.out.println("ARGOS");
                break;
            case 3:
                System.out.println("ADMIN");
                break;
            case 4:
                System.out.println("ANT");
                break;
            case 5:
                System.out.println("MOTION");
                break;
            case 6:
                System.out.println("SPG");
                break;
            case 7:
                System.out.println("COMON");
                break;
            case 8:
                System.out.println("ALMIGHTY");
                break;
        }
    }
}
