import java.util.Scanner;

public class B1340 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] time = sc.nextLine().split(" ");

        int year = Integer.parseInt(time[2]);
        boolean yearCheck = false;
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            yearCheck = true;
        }

        String month = time[0];
        int mon = 0;
        switch (month) {
            case "January":
                mon = 1;
                break;
            case "February":
                mon = 2;
                break;
            case "March":
                mon = 3;
                break;
            case "April":
                mon = 4;
                break;
            case "May":
                mon = 5;
                break;
            case "June":
                mon = 6;
                break;
            case "July":
                mon = 7;
                break;
            case "August":
                mon = 8;
                break;
            case "September":
                mon = 9;
                break;
            case "October":
                mon = 10;
                break;
            case "November":
                mon = 11;
                break;
            case "December":
                mon = 12;
                break;
        }

        int days[] =  { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        int day = Integer.parseInt(time[1].split(",")[0]);
        int dayCnt = 0;
        for (int i = 1; i < mon; i++) {
            if (yearCheck && i == 2) {
                dayCnt += 29;
                continue;
            }
            dayCnt += days[i];
        }
        dayCnt += day;

        int hour = 60 * Integer.parseInt(time[3].split(":")[0]);
        int min = Integer.parseInt(time[3].split(":")[1]);
        int timeHM = hour + min;

        int timeTohour = 60 * 24 * (dayCnt - 1) + timeHM;

        int totalYear = 0;
        if (yearCheck) {
            totalYear = 366 * 60 * 24;
        } else {
            totalYear = 365 * 60 * 24;
        }

        System.out.println((double) ((double) timeTohour * 100 / (double) totalYear));
    }

    private static String src = "";
}