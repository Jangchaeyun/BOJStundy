import java.io.*;

public class B1811 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        String s;
        while ((s = reader.readLine()) != null && !s.equals("#")) {
            int b = 0, g = 0, w = 0;
            String[] input = s.split(" ");
            String p = input[0];
            String t = input[1];
            StringBuilder pCheck = new StringBuilder(p);
            StringBuilder tCheck = new StringBuilder(t);

            for (int i = 0; i < p.length(); i++) {
                if (pCheck.charAt(i) == tCheck.charAt(i)) {
                    pCheck.setCharAt(i, '*');
                    tCheck.setCharAt(i, '*');
                    b++;
                }
            }

            if (!pCheck.toString().matches(".*[^*].*")) {
                writer.write(t + ": " + b + " black, " + g + " grey, " + w + " white\n");
                continue;
            }

            pCheck = new StringBuilder(" " + pCheck + " ");
            tCheck = new StringBuilder(" " + tCheck + " ");

            for (int i = 1; i < pCheck.length() - 1; i++) {
                if (tCheck.charAt(i) != '*' && pCheck.charAt(i - 1) == tCheck.charAt(i)) {
                    pCheck.setCharAt(i - 1, '*');
                    tCheck.setCharAt(i, '*');
                    g++;
                }
                if (tCheck.charAt(i) != '*' && pCheck.charAt(i + 1) == tCheck.charAt(i)) {
                    pCheck.setCharAt(i + 1, '*');
                    tCheck.setCharAt(i, '*');
                    g++;
                }
            }

            if (!pCheck.toString().matches(".*[^*\\s].*")) {
                writer.write(t + ": " + b + " black, " + g + " grey, " + w + " white\n");
                continue;
            }

            pCheck = new StringBuilder(pCheck.toString().trim());
            tCheck = new StringBuilder(tCheck.toString().trim());

            for (int i = 0; i < pCheck.length(); i++) {
                if (pCheck.charAt(i) != '*' && tCheck.toString().contains(String.valueOf(p.charAt(i)))) {
                    w++;
                }
            }

            writer.write(t + ": " + b + " black, " + g + " grey, " + w + " white\n");
        }
        writer.close();
    }
}