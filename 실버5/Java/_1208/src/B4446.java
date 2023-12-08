import java.util.Scanner;

public class B4446 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String w = scanner.nextLine();
            String com = "aiyeou";
            String com1 = "AIYEOU";
            String a = "bkxznhdcwgpvjqtsrlmf";
            String b = "BKXZNHDCWGPVJQTSRLMF";

            for (int i = 0; i < w.length(); i++) {
                if (w.charAt(i) == 'a' || w.charAt(i) == 'i' || w.charAt(i) == 'y' ||
                        w.charAt(i) == 'e' || w.charAt(i) == 'o' || w.charAt(i) == 'u' ||
                        w.charAt(i) == 'A' || w.charAt(i) == 'I' || w.charAt(i) == 'Y' ||
                        w.charAt(i) == 'E' || w.charAt(i) == 'O' || w.charAt(i) == 'U') {
                    for (int j = 0; j < 6; j++) {
                        if (w.charAt(i) == com.charAt(j)) {
                            if (j >= 3)
                                System.out.print(com.charAt(j - 3));
                            else
                                System.out.print(com.charAt(j + 3));
                        } else if (w.charAt(i) == com1.charAt(j)) {
                            if (j >= 3)
                                System.out.print(com1.charAt(j - 3));
                            else
                                System.out.print(com1.charAt(j + 3));
                        }
                    }
                } else if (Character.isAlphabetic(w.charAt(i)) &&
                        w.charAt(i) != 'a' && w.charAt(i) != 'i' && w.charAt(i) != 'y' &&
                        w.charAt(i) != 'e' && w.charAt(i) != 'o' && w.charAt(i) != 'u' &&
                        w.charAt(i) != 'A' && w.charAt(i) != 'I' && w.charAt(i) != 'Y' &&
                        w.charAt(i) != 'E' && w.charAt(i) != 'O' && w.charAt(i) != 'U') {
                    for (int p = 0; p < a.length(); p++) {
                        if (w.charAt(i) == a.charAt(p)) {
                            if (p >= 10)
                                System.out.print(a.charAt(p - 10));
                            else
                                System.out.print(a.charAt(p + a.length() - 10));
                        } else if (w.charAt(i) == b.charAt(p)) {
                            if (p >= 10)
                                System.out.print(b.charAt(p - 10));
                            else
                                System.out.print(b.charAt(p + b.length() - 10));
                        }
                    }
                } else {
                    System.out.print(w.charAt(i));
                }
            }
            System.out.println();
        }
    }
}