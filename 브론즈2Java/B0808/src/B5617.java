import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class B5617 {
    public static final int MAX = 3;

    enum Type {
        TRIANGLE, ANGLE, ACUTE, OBTUSE
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] result = new int[4];

        while (true) {
            ArrayList<Integer> sides = new ArrayList<>();

            for (int i = 0; i < MAX; i++) {
                sides.add(scanner.nextInt());
            }

            Collections.sort(sides);

            if (sides.get(0) + sides.get(1) <= sides.get(2)) {
                break;
            }

            result[Type.TRIANGLE.ordinal()]++;

            if (sides.get(0) * sides.get(0) + sides.get(1) * sides.get(1) == sides.get(2) * sides.get(2)) {
                result[Type.ANGLE.ordinal()]++;
                continue;
            }

            if (sides.get(0) * sides.get(0) + sides.get(1) * sides.get(1) > sides.get(2) * sides.get(2)) {
                result[Type.ACUTE.ordinal()]++;
                continue;
            }

            result[Type.OBTUSE.ordinal()]++;
        }

        for (int i = 0; i < 4; i++) {
            System.out.println(result[i]);
        }

        scanner.close();
    }
}