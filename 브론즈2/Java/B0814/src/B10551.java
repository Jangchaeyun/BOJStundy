import java.util.Scanner;

public class B10551 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String typed = scanner.next();
        int[] fingerCnt = new int[8];

        for (int i = 0; i < typed.length(); i++) {
            switch (typed.charAt(i)) {
                case '1': case 'Q': case 'A': case 'Z':
                    fingerCnt[0]++;
                    break;

                case '2': case 'W': case 'S': case 'X':
                    fingerCnt[1]++;
                    break;

                case '3': case 'E': case 'D': case 'C':
                    fingerCnt[2]++;
                    break;

                case '4': case 'R': case 'F': case 'V': case '5': case 'T': case 'G': case 'B':
                    fingerCnt[3]++;
                    break;

                case '6': case 'Y': case 'H': case 'N': case '7': case 'U': case 'J': case 'M':
                    fingerCnt[4]++;
                    break;

                case '8': case 'I': case 'K': case ',':
                    fingerCnt[5]++;
                    break;

                case '9': case 'O': case 'L': case '.':
                    fingerCnt[6]++;
                    break;

                case '0': case '-': case '=': case 'P': case '[': case ']': case ';': case '\'': case '/':
                    fingerCnt[7]++;
                    break;
            }
        }

        for (int i = 0; i < 8; i++) {
            System.out.println(fingerCnt[i]);
        }
    }
}