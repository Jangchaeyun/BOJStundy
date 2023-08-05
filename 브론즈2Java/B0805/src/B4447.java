import java.util.Scanner;

public class B4447 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < num; i++)
        {
            String man = sc.nextLine();
            int Gcnt = 0;
            int Bcnt = 0;
            for (int j = 0; j < man.length(); j++)
            {
                if (man.charAt(j) == 'B' || man.charAt(j) == 'b')
                    Bcnt++;
                else if (man.charAt(j) == 'G' || man.charAt(j) == 'g')
                    Gcnt++;
            }
            if (Gcnt > Bcnt)
                System.out.println(man + " is GOOD");
            else if (Gcnt < Bcnt)
                System.out.println(man + " is A BADDY");
            else
                System.out.println(man + " is NEUTRAL");
        }
    }
}