import java.util.Scanner;
import java.util.Stack;

public class B2408 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Stack<Integer> numbers = new Stack<>();
        Stack<Character> operators = new Stack<>();

        for (int i = 0; i < 2 * n - 1; i++) {
            if (i % 2 == 0) {
                int number = Integer.parseInt(scanner.nextLine());
                numbers.push(number);
            } else {
                char operator = scanner.nextLine().charAt(0);
                while (!operators.isEmpty() && getPriority(operators.peek()) >= getPriority(operator)) {
                    calculateTop(numbers, operators);
                }
                operators.push(operator);
            }
        }

        while (!operators.isEmpty()) {
            calculateTop(numbers, operators);
        }

        int result = numbers.pop();
        System.out.println(result);
    }

    private static int getPriority(char operator) {
        if (operator == '+' || operator == '-') {
            return 1;
        } else if (operator == '*' || operator == '/') {
            return 2;
        }
        return 0;
    }

    private static void calculateTop(Stack<Integer> numbers, Stack<Character> operators) {
        char operator = operators.pop();
        int b = numbers.pop();
        int a = numbers.pop();
        int result = 0;
        if (operator == '+') {
            result = a + b;
        } else if (operator == '-') {
            result = a - b;
        } else if (operator == '*') {
            result = a * b;
        } else if (operator == '/') {
            result = a / b;
        }
        numbers.push(result);
    }
}
