import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B10262 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int Gunnar = 0, Emma = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            Gunnar += Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            Emma += Integer.parseInt(st.nextToken());
        }

        if (Gunnar > Emma) {
            System.out.println("Gunnar");
        } else if (Gunnar < Emma) {
            System.out.println("Emma");
        } else {
            System.out.println("Tie");
        }
    }
}