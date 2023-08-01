import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class B2139 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int day = scanner.nextInt();
            int month = scanner.nextInt();
            int year = scanner.nextInt();

            if (day == 0 && month == 0 && year == 0) {
                break;
            }

            System.out.println(calculateLiveDay(year, month, day));
        }
        scanner.close();
    }

    public static long calculateLiveDay(int year, int month, int day) {
        LocalDate inputDay = LocalDate.of(year, month, day);
        LocalDate stdDay = LocalDate.of(year, 1, 1);

        long daysDifference = ChronoUnit.DAYS.between(stdDay,  inputDay);
        return daysDifference + 1;
    }
}
