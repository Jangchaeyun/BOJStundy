import java.util.Scanner;

public class B7513 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cases = Integer.parseInt(scanner.nextLine());

        for (int caseNumber = 1; caseNumber <= cases; caseNumber++) {
            int wordCount = Integer.parseInt(scanner.nextLine());
            String[] words = new String[wordCount];
            for (int i = 0; i < wordCount; i++) {
                words[i] = scanner.nextLine();
            }
            System.out.println("Scenario #" + caseNumber + ":");

            int opertaions = Integer.parseInt(scanner.nextLine());
            for (int op = 0; op < opertaions; op++) {
                String[] line = scanner.nextLine().split(" ");
                int k = Integer.parseInt(line[0]);
                int[] indices = new int[k];
                for (int i = 0; i < k; i++) {
                    indices[i] = Integer.parseInt(line[i + 1]);
                }

                StringBuilder result = new StringBuilder();

                for (int index : indices) {
                    result.append(words[index]);
                }
                System.out.println(result.toString());
            }
            System.out.println();
        }

        scanner.close();
    }
}
