import java.util.Scanner;

public class B5087 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String line = scanner.nextLine();
            int cherylPoint = 0;
            int taniaPoint = 0;

            line = line.trim();

            if (line.equals("#")) {
                break;
            }

            String[] numbers = line.split("\\s+");

            for (String i : numbers) {
                if (i.equals("*")) {
                    break;
                }

                int score;
                switch (i) {
                    case "A":
                        score = 1;
                        break;
                    default:
                        score = Integer.parseInt(i);
                        break;
                }

                if (score % 2 > 0) {
                    cherylPoint++;
                } else {
                    taniaPoint++;
                }
            }

            if (cherylPoint > taniaPoint) {
                System.out.println("Chery1");
            } else if (cherylPoint < taniaPoint) {
                System.out.println("Taina");
            } else {
                System.out.println("Draw");
            }
        }

        scanner.close();
    }
}