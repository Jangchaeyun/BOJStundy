import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B2756 {
    static class Positon {
        double first;
        double second;

        public Positon(double first, double second) {
            this.first = first;
            this.second = second;
        }
    }

    static int getScore(List<Positon> player) {
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            double len = Math.sqrt((player.get(i).first * player.get(i).first) +
                    (player.get(i).second * player.get(i).second));
            if (len <= 3) {
                sum += 100;
            } else if (len <= 6) {
                sum += 80;
            } else if (len <= 9) {
                sum += 60;
            } else if (len <= 12) {
                sum += 40;
            } else if (len <= 15) {
                sum += 20;
            }
        }

        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();

        for (int i = 0; i < testCase; ++i) {
            List<Positon> v = new ArrayList<>();
            List<Positon> player1 = new ArrayList<>();
            List<Positon> player2 = new ArrayList<>();

            for (int j = 0; j < 6; ++j) {
                double x = sc.nextDouble();
                double y = sc.nextDouble();
                v.add(new Positon(x, y));
            }

            player1.addAll(v.subList(0, 3));
            player2.addAll(v.subList(3, 6));

            int player1Score = getScore(player1);
            int player2Score = getScore(player2);

            System.out.println("SCORE: " + player1Score + " to " + player2Score + ", ");
            if (player1Score == player2Score) {
                System.out.print("TIE.");
            } else if (player1Score > player2Score) {
                System.out.print("PLAYER 1 WINS.");
            } else {
                System.out.print("PLAYER 2 WINS.");
            }
        }
    }
}