import java.util.Scanner;

public class B25166 {
    public static boolean func(String needMoney, String borrowMoney) {
        StringBuilder sb = new StringBuilder();
        String a;
        String b;
        if(needMoney.length()<borrowMoney.length()) {
            for (int i = 0; i < borrowMoney.length() - needMoney.length(); i++) {
                sb.append("0");
            }
            sb.append(needMoney);
            a = sb.toString();
            b = borrowMoney;
        }else if(needMoney.length()>borrowMoney.length()) {
            for (int i = 0; i < needMoney.length() - borrowMoney.length(); i++) {
                sb.append("0");
            }
            sb.append(borrowMoney);
            a = sb.toString();
            b = needMoney;
        }else {
            a = needMoney;
            b = borrowMoney;
        }

        for (int i = 0; i < a.length(); i++) {
            if(a.charAt(i) != b.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String money = Integer.toBinaryString(1023);
        String price = Integer.toBinaryString(a);
        if(a<1024) {
            System.out.println("No thanks");
        }else {
            String needMoney = Integer.toBinaryString(a-1023);
            String borrowMoney = Integer.toBinaryString(b);
            if(func(needMoney,borrowMoney)) {
                System.out.println("Thanks");
            }else{
                System.out.println("Impossible");
            }
        }
    }
}