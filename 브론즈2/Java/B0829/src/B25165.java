import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B25165 {
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        final String input01 = br.readLine();
        final String input02 = br.readLine();
        final String inpunt03 = br.readLine();
        System.out.print(solve(input01, input02, inpunt03));
    }

    private static String solve(String input01, String input02, String input03) {
        String[] inputArr01 = input01.split(" ");
        String[] inputArr02 = input02.split(" ");
        String[] inputArr03 = input03.split(" ");

        // wilderness size row col
        final int wRow = Integer.parseInt(inputArr01[0]);
        final int wCol = Integer.parseInt(inputArr01[1]);
        // ari position row col
        final int aRow = 1;
        final int aCol = Integer.parseInt(inputArr02[0]);
        boolean isRight = Integer.parseInt(inputArr02[1]) != 0;
        // monster position row col
        final int mRow = Integer.parseInt(inputArr03[0]);
        final int mCol = Integer.parseInt(inputArr03[1]);

        String retVal = "NO...";

        if (mRow < aRow) {
            retVal = "YES!";
        }

        else if (mRow == aRow) {
            if (isRight) {
                if (mCol < aCol) {
                    retVal = "YES!";
                }
            } else {
                if (mCol > aCol) {
                    retVal = "YES!";
                }
            }
        }
        else {
            if (mRow == wRow){
                if (((wRow - aRow) % 2)  == 1){
                    isRight = !isRight;
                }
                if (isRight) {
                    if (wCol < mCol) {
                        retVal = "YES!";
                    }
                } else {
                    if (wCol > mCol) {
                        retVal = "YES!";
                    }
                }
            }
        }

        return retVal;
    }
}