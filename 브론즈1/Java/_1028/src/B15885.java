import java.util.Scanner;

public class B15885 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        int result = (int) (Math.abs(a / b - 1) * 2);
        System.out.println(result);
    }
}