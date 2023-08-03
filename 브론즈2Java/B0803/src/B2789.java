import java.util.Scanner;

public class B2789 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] cArr = {'C', 'A', 'M', 'B', 'R', 'I', 'D', 'G', 'E'};
        String str = sc.next();
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            boolean check = true;
            for (int j = 0; j < cArr.length; j++) {
                if (str.charAt(i) == cArr[j]) {
                    check = false;
                    break;
                }
            }

            if (check) {
                result += str.charAt(i);
            }
        }

        System.out.println(result);
        sc.close();
    }
}
