import java.io.*;

public class B13777 {
    static int[] card = new int[50];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < card.length; i++) {
            card[i] = i + 1;
        }

        String str = new String();
        while (!(str = br.readLine()).equals("0")) {
            int num = Integer.parseInt(str);
            sb.append(binarySearch(num)).append("\n");
        }

        bw.write(sb.toString());

        bw.flush();
    }

    public static String binarySearch(int target) {
        StringBuilder sb = new StringBuilder();
        int left = 0;
        int right =card.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (card[mid] == target) {
                sb.append(card[mid]);
                break;
            } else if (card[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }

            sb.append(card[mid]).append(" ");
        }

        return sb.toString();
    }
}
