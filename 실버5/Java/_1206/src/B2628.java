import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2628 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int WIDTH = Integer.parseInt(st.nextToken());
        int HEIGHT = Integer.parseInt(st.nextToken());

        boolean[] widthArr = new boolean[WIDTH];
        boolean[] heightArr = new boolean[HEIGHT];

        int n = Integer.parseInt(bf.readLine());

        while (n > 0) {
            st = new StringTokenizer(bf.readLine());
            int wh = Integer.parseInt(st.nextToken());
            int index = Integer.parseInt(st.nextToken());
            if (wh == 0) {
                heightArr[index] = true;
            }
            if (wh == 1) {
                widthArr[index] = true;
            }
            n--;
        }

        int max_width = 0;
        int tmp = 0;
        for (int i = 0; i < widthArr.length; i++) {
            if (widthArr[i]) {
                max_width = Math.max(max_width, tmp);
                tmp = 1;
            } else
                tmp++;
        }
        max_width = Math.max(max_width, tmp);

        tmp = 0;
        int max_height = 0;
        for (int i = 0; i < heightArr.length; i++) {
            if (heightArr[i]) {
                max_height = Math.max(max_height, tmp);
                tmp = 1;
            } else
                tmp++;
        }
        max_height = Math.max(max_height, tmp);

        System.out.println(max_width * max_height);
    }
}