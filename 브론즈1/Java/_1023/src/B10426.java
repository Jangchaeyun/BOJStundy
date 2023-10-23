import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class B10426 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] inputs = input.split(" ");
        String myDate = inputs[0];
        int celebrate = Integer.parseInt(inputs[1]);

        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date date = sdf.parse(myDate);

            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            calendar.add(Calendar.DAY_OF_YEAR, celebrate);

            Date newDate = calendar.getTime();

            String result = sdf.format(newDate);
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}