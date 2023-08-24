import java.util.Scanner;

public class B17838 {
    public static int CorrectCommand(String strTmp) {
        if (strTmp.length() != 7)
            return 0;

        if (strTmp.charAt(0) == strTmp.charAt(1) &&
                strTmp.charAt(0) == strTmp.charAt(4) &&
                strTmp.charAt(6) == strTmp.charAt(2) &&
                strTmp.charAt(6) == strTmp.charAt(3) &&
                strTmp.charAt(6) == strTmp.charAt(5) &&
                strTmp.charAt(0) != strTmp.charAt(6)) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nT = scanner.nextInt();

        for (int t = 0; t < nT; t++) {
            String strTmp = scanner.next();
            System.out.println(CorrectCommand(strTmp));
        }
    }
}