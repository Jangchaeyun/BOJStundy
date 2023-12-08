import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class B3711 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int k = 0; k < n; k++) {
            int g = Integer.parseInt(br.readLine());
            int[] arr = new int[g];
            for (int i = 0; i < g; i++) {
                arr[i] = Integer.parseInt(br.readLine());
            }

            int m = 0;
            while (true) {
                m++;
                boolean istrue = true;
                ArrayList<Integer> modlist = new ArrayList<Integer>();
                for (int i = 0; i < g; i++) {
                    if (modlist.contains(arr[i] % m)) {
                        istrue = false;
                        break;
                    }
                    modlist.add(arr[i] % m);
                }
                if (istrue == true) {
                    System.out.println(m);
                    break;
                }
            }
        }
    }
}
