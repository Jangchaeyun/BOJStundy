import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.StringTokenizer;

public class B27963 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int d1 = Integer.parseInt(st.nextToken());
        int d2 = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        int D1 = Math.max(d1, d2);
        int D2 = Math.min(d1, d2);
        double m = 100 - X;
        double v = m / D2;
        m = X;
        v += m / D1;
        System.out.println(100 / v);
    }
}