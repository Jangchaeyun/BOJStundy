import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class B24937 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int N = scanner.nextInt() % 10;
        Queue<Character> queue = new ArrayDeque<>();
        queue.add('S');
        queue.add('c');
        queue.add('i');
        queue.add('C');
        queue.add('o');
        queue.add('m');
        queue.add('L');
        queue.add('o');
        queue.add('v');
        queue.add('e');

        for (int i = 0; i < N; i++) {
            queue.add(queue.poll());
        }

        StringBuilder result = new StringBuilder();
        for (Character character : queue) {
            result.append(character);
        }

        System.out.println(result.toString());
    }
}