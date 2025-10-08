package CodeWars;

public class Kata {
    public static int quarterOf(int month) {
        int quarter = 0;
        if (month > 0 && month < 13) {
            if (month <= 3) {
                quarter = 1;
            } else if (month <= 6) {
                quarter = 2;
            } else if (month <= 9) {
                quarter = 3;
            } else {
                quarter = 4;
            }
        }
        return quarter;
    }
}