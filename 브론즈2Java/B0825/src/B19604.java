import java.util.ArrayList;
import java.util.Scanner;

public class B19604 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());

        ArrayList<Integer> xCoordinates = new ArrayList<>();
        ArrayList<Integer> yCoordinates = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String[] coordinates = scanner.nextLine().split(",");
            int x = Integer.parseInt(coordinates[0]);
            int y = Integer.parseInt(coordinates[1]);
            xCoordinates.add(x);
            yCoordinates.add(y);
        }

        int minX = xCoordinates.get(0);
        int minY = yCoordinates.get(0);
        int maxX = xCoordinates.get(0);
        int maxY = yCoordinates.get(0);

        for (int i = 1; i < N; i++) {
            minX = Math.min(minX, xCoordinates.get(i));
            minY = Math.min(minY, yCoordinates.get(i));
            maxX = Math.max(maxX, xCoordinates.get(i));
            maxY = Math.max(maxY, yCoordinates.get(i));
        }

        System.out.println((minX - 1) + "," + (minY - 1));
        System.out.println((maxX + 1) + "," + (maxY + 1));
    }
}
