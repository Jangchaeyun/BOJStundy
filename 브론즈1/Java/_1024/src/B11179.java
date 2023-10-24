import java.util.Scanner;

public class B11179 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        String binaryString = Integer.toBinaryString(input);
        String reversedBinaryString = new StringBuilder(binaryString).reverse().toString();
        int reversedInt = Integer.parseInt(reversedBinaryString, 2);
        System.out.println(reversedInt);
    }
}
