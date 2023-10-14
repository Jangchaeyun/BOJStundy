import java.util.Scanner;

public class B16337 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String first = scanner.nextLine();
        String second = scanner.nextLine();
        String third = scanner.nextLine();

        if (first.equals(":::") && second.equals(":o:") && third.equals(":::")) {
            System.out.println(1);
        } else if ((first.equals("o::") && second.equals(":::") && third.equals("::o")) ||
                (first.equals("::o") && second.equals(":::") && third.equals("o::"))) {
            System.out.println(2);
        } else if ((first.equals("o::") && second.equals(":o:") && third.equals("::o")) ||
                (first.equals("::o") && second.equals(":o:") && third.equals("o::"))) {
            System.out.println(3);
        } else if (first.equals("o:o") && second.equals(":::") && third.equals("o:o")) {
            System.out.println(4);
        } else if (first.equals("o:o") && second.equals(":o:") && third.equals("o:o")) {
            System.out.println(5);
        } else if ((first.equals("ooo") && second.equals(":::") && third.equals("ooo")) ||
                (first.equals("o:o") && second.equals("o:o") && third.equals("o:o"))) {
            System.out.println(6);
        } else {
            System.out.println("unknown");
        }

        scanner.close();
    }
}
