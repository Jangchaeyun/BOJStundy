import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class B1942 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 3; i++) {
            String[] t = br.readLine().split(" ");
            List<Integer> st = convertToTimeList(t[0].split(":"));
            List<Integer> et = convertToTimeList(t[1].split(":"));
            int sti = timeCounter(st, false);
            int eti = timeCounter(et, false);
            int count = 0;

            while (sti != eti) {
                if (sti % 3 == 0) {
                    count++;
                }
                sti = timeCounter(st, true);
            }

            count += (eti % 3 == 0) ? 1 : 0;
            System.out.println(count);
        }
    }

    private static List<Integer> convertToTimeList(String[] timeArray) {
        List<Integer> timeList = new ArrayList<>();
        for (String time : timeArray) {
            timeList.add(Integer.parseInt(time));
        }
        return timeList;
    }

    private static int timeCounter(List<Integer> tArr, boolean convert) {
        if (convert) {
            tArr.set(2, tArr.get(2) + 1);

            if (tArr.get(2) == 60) {
                tArr.set(2, 0);
                tArr.set(1, tArr.get(1) + 1);
            }

            if (tArr.get(1) == 60) {
                tArr.set(1, 0);
                tArr.set(0, tArr.get(0) + 1);
            }

            if (tArr.get(0) == 24) {
                tArr.set(0, 0);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int time : tArr) {
            if (time < 10) {
                sb.append("0").append(time);
            } else {
                sb.append(time);
            }
        }
        return Integer.parseInt(sb.toString());
    }
}