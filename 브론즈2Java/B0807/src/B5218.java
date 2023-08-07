import java.util.Scanner;

public class B5218 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for (int i = 0; i < N; i++) {
            String str1 = scanner.next();
            String str2 = scanner.next();
            int[] arr = new int[str1.length()];
            for (int j = 0; j < str1.length(); j++) {
                if (str2.charAt(j) >= str1.charAt(j)) {
                    arr[j] = str2.charAt(j) - str1.charAt(j);
                }
                else {
                    arr[j] = str2.charAt(j) - str1.charAt(j) + 26;
                }
            }
            System.out.print("Distances: ");
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
