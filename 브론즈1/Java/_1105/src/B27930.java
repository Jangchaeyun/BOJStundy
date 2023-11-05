import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B27930 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        char[] Slist = S.toCharArray();

        List<Character> K = new ArrayList<>();
        K.add('K');
        K.add('O');
        K.add('R');
        K.add('E');
        K.add('A');

        List<Character> Y = new ArrayList<>();
        Y.add('Y');
        Y.add('O');
        Y.add('N');
        Y.add('S');
        Y.add('E');
        Y.add('I');

        for (int i = 0; i < Slist.length; i++) {
            char val = Slist[i];
            if (K.contains(val)) {
                K.remove((Character) val);
                if (K.isEmpty()) {
                    System.out.println("KOREA");
                    break;
                }
            }
            if (Y.contains(val)) {
                Y.remove((Character) val);
                if (Y.isEmpty()) {
                    System.out.println("YONSEI");
                    break;
                }
            }
        }
    }
}