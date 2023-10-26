import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B14405 {
    static String str;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        str = br.readLine();
        str = str.replaceAll("pi|ka|chu", "");
        if (str.equals(""))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
