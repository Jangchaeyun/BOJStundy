import java.io.*;
import java.util.Arrays;

public class B15969 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = Integer.parseInt(br.readLine());
        String line = br.readLine();
        String[] split = line.split(" ");
        int[] students = new int[cnt];
        for (int i = 0; i < students.length; i++) {
            students[i] = Integer.parseInt(split[i]);
        }

        Arrays.sort(students);

        int min = students[0];
        int max = students[students.length - 1];

        bw.append(max - min + "");
        bw.flush();
    }
}
