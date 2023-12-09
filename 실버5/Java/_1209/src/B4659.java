import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B4659 {
    static class Pair<K, V> {
        private K key;
        private V value;

        public Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }
    }

    public static boolean onemoreComp(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                return true;
            }
        }
        return false;
    }

    public static boolean threeConti(String str) {
        int consonant = 0;
        int collection = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                if (consonant != 0) {
                    consonant = 0;
                }
                collection += 1;
            } else {
                if (collection != 0) {
                    collection = 0;
                }
                consonant += 1;
            }

            if (consonant >= 3 || collection >= 3) return false;
        }
        return true;
    }

    public static boolean twoConti(String str) {
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                if (str.charAt(i) == 'e' || str.charAt(i) == 'o') continue;
                else return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Pair<String, Boolean>> list = new ArrayList<>();

        while (true) {
            String str = scanner.next();
            if (str.equals("end")) break;

            boolean isValid = onemoreComp(str) && threeConti(str) && twoConti(str);
            list.add(new Pair<>(str, isValid));
        }

        for (Pair<String, Boolean> pair : list) {
            System.out.print("<" + pair.getKey() + "> is ");
            if (pair.getValue()) {
                System.out.println("acceptable.");
            } else {
                System.out.println("not acceptable.");
            }
        }
    }
}