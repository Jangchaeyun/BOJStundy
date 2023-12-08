import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class B4378 {
    public static String teAch(String errorStr) {
        Map<String, String> keyboardCorrMap = new HashMap<>();
        keyboardCorrMap.put("1", "`"); keyboardCorrMap.put("2", "1"); keyboardCorrMap.put("3", "2");
        keyboardCorrMap.put("4", "3"); keyboardCorrMap.put("5", "4"); keyboardCorrMap.put("6", "5");
        keyboardCorrMap.put("7", "6"); keyboardCorrMap.put("8", "7"); keyboardCorrMap.put("9", "8");
        keyboardCorrMap.put("0", "9"); keyboardCorrMap.put("-", "0"); keyboardCorrMap.put("=", "-");
        keyboardCorrMap.put("w", "q"); keyboardCorrMap.put("e", "w"); keyboardCorrMap.put("r", "e");
        keyboardCorrMap.put("t", "r"); keyboardCorrMap.put("y", "t"); keyboardCorrMap.put("u", "y");
        keyboardCorrMap.put("i", "u"); keyboardCorrMap.put("o", "i"); keyboardCorrMap.put("p", "o");
        keyboardCorrMap.put("[", "p"); keyboardCorrMap.put("]", "["); keyboardCorrMap.put("\\", "]");
        keyboardCorrMap.put("s", "a"); keyboardCorrMap.put("d", "s"); keyboardCorrMap.put("f", "d");
        keyboardCorrMap.put("g", "f"); keyboardCorrMap.put("h", "g"); keyboardCorrMap.put("j", "h");
        keyboardCorrMap.put("k", "j"); keyboardCorrMap.put("l", "k"); keyboardCorrMap.put(";", "l");
        keyboardCorrMap.put("'", ";"); keyboardCorrMap.put("x", "z"); keyboardCorrMap.put("c", "x");
        keyboardCorrMap.put("v", "c"); keyboardCorrMap.put("b", "v"); keyboardCorrMap.put("n", "b");
        keyboardCorrMap.put("m", "n"); keyboardCorrMap.put(",", "m"); keyboardCorrMap.put(".", ",");
        keyboardCorrMap.put("/", "."); keyboardCorrMap.put(" ", " ");

        return keyboardCorrMap.get(errorStr.toLowerCase()).toUpperCase();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                String input = scanner.nextLine();
                for (char typeWord : input.toCharArray()) {
                    System.out.print(teAch(String.valueOf(typeWord)));
                }
                System.out.println();
            } catch (Exception e) {
                break;
            }
        }
    }
}