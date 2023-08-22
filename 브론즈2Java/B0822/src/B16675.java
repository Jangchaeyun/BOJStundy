import java.util.Scanner;

public class B16675 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String ML = scanner.next();
        String MR = scanner.next();
        String TL = scanner.next();
        String TR = scanner.next();

        if (!ML.equals(MR) && !TL.equals(TR)) {
            System.out.println("?");
        } else if (ML.equals(MR) && !TL.equals(TR)) {
            if (ML.equals("S") && (TL.equals("R") || TR.equals("R"))) {
                System.out.println("TK");
            } else if (ML.equals("P") && (TL.equals("S") || TR.equals("S"))) {
                System.out.println("TK");
            } else if (ML.equals("R") && (TL.equals("P") || TR.equals("P"))) {
                System.out.println("TK");
            } else {
                System.out.println("?");
            }
        } else if (!ML.equals(MR) && TL.equals(TR)) {
            if (TL.equals("S") && (ML.equals("R") || MR.equals("R"))) {
                System.out.println("MS");
            } else if (TL.equals("P") && (ML.equals("S") || MR.equals("S"))) {
                System.out.println("MS");
            } else if (TL.equals("R") && (ML.equals("P") || MR.equals("P"))) {
                System.out.println("MS");
            } else {
                System.out.println("?");
            }
        } else {
            if (ML.equals("S")) {
                if (TL.equals("P")) {
                    System.out.println("MS");
                }
                if (TL.equals("S")) {
                    System.out.println("?");
                }
                if (TL.equals("R")) {
                    System.out.println("TK");
                }
            }
            if (ML.equals("R")) {
                if (TL.equals("P")) {
                    System.out.println("TK");
                }
                if (TL.equals("S")) {
                    System.out.println("MS");
                }
                if (TL.equals("R")) {
                    System.out.println("?");
                }
            }
            if (ML.equals("P")) {
                if (TL.equals("P")) {
                    System.out.println("?");
                }
                if (TL.equals("S")) {
                    System.out.println("TK");
                }
                if (TL.equals("R")) {
                    System.out.println("MS");
                }
            }
        }

        scanner.close();
    }
}