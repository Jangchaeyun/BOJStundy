import java.util.Scanner;

public class B3054 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        int index = input.length();
        char[] alpha = new char[index];

        for (int i = 0; i < index; i++) {
            alpha[i] = input.charAt(i);
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 1; j < index + 1; j++) {
                if (i == 0 || i == 4) {
                    if (j % 3 != 0) {
                        System.out.print("..#.");
                    } else {
                        System.out.print("..*.");
                    }
                } else if (i == 1 || i == 3) {
                    if (j % 3 != 0) {
                        System.out.print(".#.#");
                    } else {
                        System.out.print(".*.*");
                    }
                } else {
                    if (j % 3 == 0 || (j != 1 && j % 3 == 1)) {
                        System.out.print("*." + alpha[j - 1] + ".");
                    } else {
                        System.out.print("#." + alpha[j - 1] + ".");
                    }
                }
            }
            if (i != 2) {
                System.out.println(".");
            } else {
                if (index % 3 == 0) {
                    System.out.println("*");
                } else {
                    System.out.println("#");
                }
            }
        }
        sc.close();
    }
}