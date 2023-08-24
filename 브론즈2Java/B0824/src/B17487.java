import java.util.Scanner;

public class B17487 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();

        char[] leftHand = {'q', 'w', 'e', 'r', 't', 'y', 'a', 's', 'd', 'f', 'g', 'z', 'x', 'c', 'v', 'b'};
        char[] rightHand = {'u', 'i', 'o', 'p', 'h', 'j', 'k', 'l', 'n', 'm'};

        int left = 0;
        int right = 0;
        int space = 0;
        int shift = 0;

        for (char i : S.toCharArray()) {
            if (contains(leftHand, i) || contains(leftHand, Character.toLowerCase(i))) {
                left++;
            } else if (contains(rightHand, i) || contains(rightHand, Character.toLowerCase(i))) {
                right++;
            }
            if (i == ' ') {
                space++;
            } else if (Character.isUpperCase(i)) {
                shift++;
            }
        }

        for (int j = 0; j < space; j++) {
            if (right < left) {
                right++;
            } else {
                left++;
            }
        }

        for (int k = 0; k < shift; k++) {
            if (right < left) {
                right++;
            } else {
                left++;
            }
        }

        System.out.println(left + " " + right);
    }

    public static boolean contains(char[] array, char target) {
        for (char c : array) {
            if (c == target) {
                return true;
            }
        }
        return false;
    }
}