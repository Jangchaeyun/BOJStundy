import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B25246 {
    public static void main(String[] args) throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final String name = br.readLine();

        System.out.print(findEntering(name));
    }

    private static String findEntering(String name) {
        final String vowels = "aeiou";
        String retVal = name;

        for (int idx = name.length() - 1; idx >= 0; idx--) {
            if (vowels.indexOf(name.toLowerCase().charAt(idx)) >= 0) {
                retVal = name.substring(0, idx + 1) + "ntry";
                break;
            }
        }

        return retVal;
    }
}