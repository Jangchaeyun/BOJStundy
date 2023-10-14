import java.util.Scanner;

public class B16769 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] bucketSize = new int[3];
        int[] realBucket = new int[3];

        for (int i = 0; i < 3; i++) {
            bucketSize[i] = scanner.nextInt();
            realBucket[i] = scanner.nextInt();
        }

        for (int j = 0, i = 0; j < 100; j++) {
            int next = (i + 1) % 3;
            int moveMilk = Math.min(bucketSize[next] - realBucket[next], realBucket[i]);
            realBucket[next] += moveMilk;
            realBucket[i] -= moveMilk;
            i = next;
        }

        for (int i = 0; i < 3; i++) {
            System.out.println(realBucket[i]);
        }
    }
}