import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class B6811 {
    public static void main(String[] args) throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        GivenPoints points = new GivenPoints();
        points.setTroutPoints(Integer.parseInt(br.readLine()));
        points.setPikePoints(Integer.parseInt(br.readLine()));
        points.setPickerelPoints(Integer.parseInt(br.readLine()));
        points.setTotalPoints(Integer.parseInt(br.readLine()));

        List<PossiblePoints> possiblePoints = findPossiblePoints(points);

        possiblePoints.forEach(pp -> System.out.println(
                pp.getTroutPoints() + " Brown Trout, " + pp.getPikePoints() + " Northern Pike, " + pp.getPickerelPoints() + " Yellow Pickerel"

        ));

        System.out.print("Number of ways to catch fish: " + possiblePoints.size());
    }

    private static List<PossiblePoints> findPossiblePoints(GivenPoints points) {

        int maxTroutNum = points.getTotalPoints() / points.getTroutPoints();
        int maxPikeNum = points.getTotalPoints() / points.getPikePoints();
        int maxPickerel = points.getTotalPoints() / points.getPickerelPoints();
        List<PossiblePoints> possiblePoints = new ArrayList<>();

        for (int i = 0; i <= maxTroutNum; i++) {
            for (int j = 0; j <= maxPikeNum; j++) {
                for (int k = 0; k <= maxPickerel; k++) {
                    int curPoint = i * points.getTroutPoints()
                            + j * points.getPikePoints()
                            + k * points.getPickerelPoints();
                    if (curPoint <= points.getTotalPoints() && curPoint != 0) {
                        possiblePoints.add(new PossiblePoints(i, j, k));
                    }
                }
            }
        }

        return possiblePoints;
    }

    private static class PossiblePoints {
        int troutPoints;
        int pikePoints;
        int pickerelPoints;

        public PossiblePoints(int troutPoints, int pikePoints, int pickerelPoints) {
            this.troutPoints = troutPoints;
            this.pikePoints = pikePoints;
            this.pickerelPoints = pickerelPoints;
        }

        public int getTroutPoints() {
            return troutPoints;
        }

        public int getPikePoints() {
            return pikePoints;
        }

        public int getPickerelPoints() {
            return pickerelPoints;
        }
    }


    private static class GivenPoints {
        int troutPoints;
        int pikePoints;
        int pickerelPoints;
        int totalPoints;

        public int getTroutPoints() {
            return troutPoints;
        }

        public void setTroutPoints(int troutPoints) {
            this.troutPoints = troutPoints;
        }

        public int getPikePoints() {
            return pikePoints;
        }

        public void setPikePoints(int pikePoints) {
            this.pikePoints = pikePoints;
        }

        public int getPickerelPoints() {
            return pickerelPoints;
        }

        public void setPickerelPoints(int pickerelPoints) {
            this.pickerelPoints = pickerelPoints;
        }

        public int getTotalPoints() {
            return totalPoints;
        }

        public void setTotalPoints(int totalPoints) {
            this.totalPoints = totalPoints;
        }
    }
}