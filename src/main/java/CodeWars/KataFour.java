package CodeWars;

public class KataFour {
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        int sum = 0;
        for (int i = 0; i < classPoints.length; ++i) {
            sum += classPoints[i];
        }
        double average = (double) sum / classPoints.length;
        if (yourPoints > average) {
            return true;
        } else {
            return false;
        }
    }
}



