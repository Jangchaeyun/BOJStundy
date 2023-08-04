import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2954 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String pwd = br.readLine();
        String[] vowelPwd = {"apa", "epe", "ipi", "opo", "upu"};
        String[] vowel = {"a", "e", "i", "o", "u"};
        for (int i = 0; i < 5; i++)
            pwd = pwd.replaceAll(vowelPwd[i], vowel[i]);
        System.out.println(pwd);
    }
}