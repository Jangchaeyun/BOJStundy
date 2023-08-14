import java.io.*;

public class B10491 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = "";
        String regex = "(?i).*problem.*";
        while((str = br.readLine()) != null){
            if(str.matches(regex)) {
                bw.write("yes");
            } else {
                bw.write("no");
            }
            bw.newLine();
        }
        bw.flush();
    }
}
