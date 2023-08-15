import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class B11094 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        String regex = "^Simon says(.*)";
        String str = "";
        Matcher matcher;
        for (int i = 0; i < N; i++) {
            str = br.readLine();
            matcher = Pattern.compile(regex).matcher(str);
            if (matcher.find()) {
                bw.write(matcher.group(1) + "\n");
            }
        }
        bw.flush();
    }
}
