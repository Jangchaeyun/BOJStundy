import java.util.Scanner;

public class B16360 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        while (n-- > 0) {
            String s = scanner.nextLine();
            int sSize = s.length();

            if (s.charAt(sSize - 1) == 'a') {
                s += "s";
            } else if (s.charAt(sSize - 1) == 'i' || s.charAt(sSize - 1) == 'y') {
                s = s.substring(0, sSize - 1) + "i" + "os";
            } else if (s.charAt(sSize - 1) == 'l') {
                s += "es";
            } else if (s.charAt(sSize - 1) == 'n') {
                s = s.substring(0, sSize - 1) + "a" + "nes";
            } else if (s.charAt(sSize - 1) == 'e' && s.charAt(sSize - 2) == 'n') {
                s = s.substring(0, sSize - 2) + "a" + "nes";
            } else if (s.charAt(sSize - 1) == 'o') {
                s += 's';
            } else if (s.charAt(sSize - 1) == 'r') {
                s += "es";
            } else if (s.charAt(sSize - 1) == 't') {
                s += "as";
            } else if (s.charAt(sSize - 1) == 'u') {
                s += "s";
            } else if (s.charAt(sSize - 1) == 'v') {
                s += "es";
            } else if (s.charAt(sSize - 1) == 'w') {
                s += "as";
            } else {
                s += "us";
            }
            System.out.println(s);
        }
    }
}
