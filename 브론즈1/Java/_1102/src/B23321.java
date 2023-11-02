import java.util.Scanner;

public class B23321 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] partyPeople = new String[5];

        for (int i = 0; i < 5; i++) {
            partyPeople[i] = scanner.next();
        }

        String[] photo = new String[5];
        for (int i = 0; i < 5; i++) {
            photo[i] = "";
        }

        for (int i = 0; i < partyPeople[0].length(); i++) {
            String peopleMod = "" + partyPeople[0].charAt(i) + partyPeople[1].charAt(i)
                    + partyPeople[2].charAt(i) + partyPeople[3].charAt(i) + partyPeople[4].charAt(i);

            if (peopleMod.equals(".omln")) {
                photo[0] += "o";
                photo[1] += "w";
                photo[2] += "l";
                photo[3] += "n";
                photo[4] += ".";
            } else if (peopleMod.equals("owln.")) {
                photo[0] += ".";
                photo[1] += "o";
                photo[2] += "m";
                photo[3] += "l";
                photo[4] += "n";
            } else {
                photo[0] += ".";
                photo[1] += ".";
                photo[2] += "o";
                photo[3] += "L";
                photo[4] += "n";
            }
        }

        for (String p : photo) {
            System.out.println(p);
        }
    }
}
