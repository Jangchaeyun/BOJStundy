import java.util.*;

public class B3699 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();

        for (int testCase = 0; testCase < testCases; testCase++) {
            int h = scanner.nextInt();
            int l = scanner.nextInt();

            Map<Integer, int[]> p_c = new HashMap<>();

            for (int i = 0; i < h; i++) {
                int[] f = new int[l];
                for (int j = 0; j < l; j++) {
                    f[j] = scanner.nextInt();
                }
                for (int j = 0; j < f.length; j++) {
                    if (f[j] != -1) {
                        p_c.put(f[j], new int[]{i + 1, j + 1});
                    }
                }
            }

            SortedMap<Integer, int[]> floor = new TreeMap<>(p_c);

            int[] hh = new int[h + 1];
            int result = 0;

            for (Map.Entry<Integer, int[]> entry : floor.entrySet()) {
                int[] j = entry.getValue();
                result += Math.abs(1 - j[0]) * 20;
                result += Math.min(Math.abs(hh[j[0]] - j[1]), Math.abs(l - Math.abs(hh[j[0]] - j[1]))) * 5;
                hh[j[0]] = j[1];
            }

            System.out.println(result);
        }
    }
}