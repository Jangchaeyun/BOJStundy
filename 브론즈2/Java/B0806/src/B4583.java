import java.util.Scanner;

public class B4583 {
    public static void main(String[] args) {
        char[] reflect = {'b', 'd', 'p', 'q', 'i', 'o', 'v', 'w', 'x'};

        while (true) {
            Scanner scanner = new Scanner(System.in);
            String word = scanner.nextLine();

            if (word.equals("#")) {
                break;
            }

            StringBuilder result = new StringBuilder();

            for (char alphabet : word.toCharArray()) {
                if (new String(reflect).indexOf(alphabet) == -1) {
                    result = new StringBuilder("INVALID");
                    break;
                }

                else {
                    if (alphabet == 'b') {
                        result.append('d');
                    } else if (alphabet == 'd') {
                        result.append('b');
                    } else if (alphabet == 'p') {
                        result.append('q');
                    } else if (alphabet == 'q') {
                        result.append('p');
                    }
                    else {
                        result.append(alphabet);
                    }
                }
            }

            if (!result.toString().equals("INVALID")) {
                System.out.println(result.reverse().toString());
            }
            else {
                System.out.println(result);
            }
        }
    }
}
