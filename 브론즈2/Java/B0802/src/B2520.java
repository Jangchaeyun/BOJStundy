import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2520 {
    public static final double MILK = 0.5;
    public static final double YOLK = 0.5;
    public static final double SUGAR = 0.25;
    public static final double SALT = 0.0625;
    public static final double FLOUR = 0.5625;

    public static final int BANANA = 1;
    public static final int STRABERRY_JAM = 30;
    public static final int CHOCHOLATE = 25;
    public static final int WALNUT = 10;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            br.readLine();
            StringTokenizer st = new StringTokenizer(br.readLine());

            int c = (int) (Integer.parseInt(st.nextToken()) / MILK);
            int y = (int) (Integer.parseInt(st.nextToken()) / YOLK);
            int su = (int) (Integer.parseInt(st.nextToken()) / SUGAR);
            int sa = (int) (Integer.parseInt(st.nextToken()) / SALT);
            int f = (int) (Integer.parseInt(st.nextToken()) / FLOUR);

            int cake = Math.min(c, Math.min(y, Math.min(su, Math.min(sa, f))));

            st = new StringTokenizer(br.readLine());
            int b = Integer.parseInt(st.nextToken()) / BANANA;
            int sg = Integer.parseInt(st.nextToken()) / STRABERRY_JAM;
            int cg = Integer.parseInt(st.nextToken()) / CHOCHOLATE;
            int w = Integer.parseInt(st.nextToken()) / WALNUT;

            int sum = b + sg + cg + w;

            int result = Math.min(cake, sum);

            System.out.println(result);
        }
    }
}
