import java.util.Scanner;

public class B6502 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 0;
        while (true) {
            int sum = 0;
            double r = scan.nextDouble();
            if(r== 0) {break;}
            double w = scan.nextInt();
            w = Math.pow(w, 2);
            double l = scan.nextInt();
            l = Math.pow(l, 2);
            r = r * 2;
            count++;

            if (r >= Math.sqrt(w + l)) {
                System.out.println("Pizza " + count + " fits on the table.");
            }else {
                System.out.println("Pizza " + count + " does not fit on the table.");
            }
        }
    }
}
