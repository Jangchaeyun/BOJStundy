import java.util.Scanner;

public class B5704 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int[] alphabet = new int[26];
            String str = sc.nextLine().replace(" ", "");
            if (str.equals("*"))
                break;
            for (int i = 0; i < str.length(); i++) {
                ++alphabet[str.charAt(i) - 97];
            }
            String ret = "Y";
            for (int i = 0; i < alphabet.length; i++) {
                if (alphabet[i] == 0) {
                    ret = "N";
                    break;
                }
            }
            System.out.println(ret);
        }

        sc.close();
    }
}
