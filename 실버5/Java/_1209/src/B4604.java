import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class B4604 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque<Integer> dq = new ArrayDeque<>();

        while (true) {
            String temp = scanner.nextLine();

            if (temp.length() == 1 && temp.equals("#")) {
                break;
            } else if (temp.length() == 1 && temp.equals("*")) {
                while (true) {
                    if (dq.size() % 5 == 0) {
                        break;
                    }
                    dq.addLast(0);
                }

                while (!dq.isEmpty()) {
                    int result = 0;
                    for (int i = 0; i < 5; i++) {
                        result += dq.pollFirst() * Math.pow(2, 4 - i);
                    }

                    if (result == 0) {
                        System.out.print(" ");
                    } else if (1 <= result && result <= 26) {
                        System.out.print((char) (result - 1 + 'A'));
                    } else if (result == 27) {
                        System.out.print("'");
                    } else if (result == 28) {
                        System.out.print(",");
                    } else if (result == 29) {
                        System.out.print("-");
                    } else if (result == 30) {
                        System.out.print(".");
                    } else {
                        System.out.print("?");
                    }
                }
                System.out.println();
                dq.clear();
            } else {
                int consecutive = 0;
                
                for (int i = 0; i < temp.length(); i++) {
                    if (temp.charAt(i) == ' ') {
                        consecutive++;
                    } else {
                        if (consecutive > 0 && consecutive % 2 == 1) {
                            dq.addLast(0);
                        } else if (consecutive > 0 && consecutive % 2 == 0) {
                            dq.addLast(1);
                        }
                        consecutive = 0;
                    }
                }

                if (consecutive > 0) {
                    if (consecutive % 2 == 1) {
                        dq.addLast(0);
                    } else {
                        dq.addLast(1);
                    }
                }
            }
        }
    }
}