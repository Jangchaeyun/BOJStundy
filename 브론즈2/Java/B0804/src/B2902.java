import java.util.Scanner;

public class B2902 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String answer = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
                answer += str.charAt(i);
        }
        System.out.println(answer);
    }
}