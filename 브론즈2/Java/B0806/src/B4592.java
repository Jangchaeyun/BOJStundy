import java.util.Scanner;

public class B4592 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            StringBuilder result = new StringBuilder();

            if (input.equals("0")) {
                break;
            } else {
                String[] numbers = input.split(" ");

                int N = Integer.parseInt(numbers[0]);
                result.append(numbers[1]).append(" ");

                for (int index = 2; index <= N; index++) {
                    if (!numbers[index].equals(numbers[index - 1])) {
                        result.append(numbers[index]).append(" ");
                    }
                }
                System.out.println(result.append("$").toString());
            }
        }
        scanner.close();
    }
}
