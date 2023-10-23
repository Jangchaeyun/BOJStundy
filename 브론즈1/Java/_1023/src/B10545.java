import java.util.Scanner;

public class B10545 {
    static int[] button = new int[10];
    static char[] text;
    static char[] click = new char[500];
    static int position = 0;

    public static void typing(int num, int count) {
        if (click[position - 1] == (char) (num + '0')) {
            click[position] = '#';
            position++;
        }
        for (int i = 0; i < count; i++) {
            click[position + i] = (char) (num + '0');
        }
        position += count;
    }

    public static int fixButton(int original) {
        for (int i = 1; i < 10; i++) {
            if (button[i] == original) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i < 10; i++) {
            button[i] = scanner.nextInt();
        }

        scanner.nextLine();

        String inputText = scanner.nextLine();
        text = inputText.toCharArray();

        for (char ch : text) {
            int temp;
            switch (ch) {
                case 'a':
                    temp = fixButton(2);
                    typing(temp, 1);
                    break;
                case 'b':
                    temp = fixButton(2);
                    typing(temp, 2);
                    break;
                case 'c':
                    temp = fixButton(2);
                    typing(temp, 3);
                    break;
                case 'd':
                    temp = fixButton(3);
                    typing(temp, 1);
                    break;
                case 'e':
                    temp = fixButton(3);
                    typing(temp, 2);
                    break;
                case 'f':
                    temp = fixButton(3);
                    typing(temp, 3);
                    break;
                case 'g':
                    temp = fixButton(4);
                    typing(temp, 1);
                    break;
                case 'h':
                    temp = fixButton(4);
                    typing(temp, 2);
                    break;
                case 'i':
                    temp = fixButton(4);
                    typing(temp, 3);
                    break;
                case 'j':
                    temp = fixButton(5);
                    typing(temp, 1);
                    break;
                case 'k':
                    temp = fixButton(5);
                    typing(temp, 2);
                    break;
                case 'l':
                    temp = fixButton(5);
                    typing(temp, 3);
                    break;
                case 'm':
                    temp = fixButton(6);
                    typing(temp, 1);
                    break;
                case 'n':
                    temp = fixButton(6);
                    typing(temp, 2);
                    break;
                case 'o':
                    temp = fixButton(6);
                    typing(temp, 3);
                    break;
                case 'p':
                    temp = fixButton(7);
                    typing(temp, 1);
                    break;
                case 'q':
                    temp = fixButton(7);
                    typing(temp, 2);
                    break;
                case 'r':
                    temp = fixButton(7);
                    typing(temp, 3);
                    break;
                case 's':
                    temp = fixButton(7);
                    typing(temp, 4);
                    break;
                case 't':
                    temp = fixButton(8);
                    typing(temp, 1);
                    break;
                case 'u':
                    temp = fixButton(8);
                    typing(temp, 2);
                    break;
                case 'v':
                    temp = fixButton(8);
                    typing(temp, 3);
                    break;
                case 'w':
                    temp = fixButton(9);
                    typing(temp, 1);
                    break;
                case 'x':
                    temp = fixButton(9);
                    typing(temp, 2);
                    break;
                case 'y':
                    temp = fixButton(9);
                    typing(temp, 3);
                    break;
                case 'z':
                    temp = fixButton(9);
                    typing(temp, 4);
                    break;
            }
        }

        System.out.println(new String(click, 0, position));
    }
}