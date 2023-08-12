import java.util.Scanner;

public class B9449 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int W, H, w, h;
        W = scanner.nextInt();
        H = scanner.nextInt();
        w = scanner.nextInt();
        h = scanner.nextInt();

        int result = ((W / w + 1) / 2) * ((H / h + 1) / 2);
        System.out.println(result);
    }
}