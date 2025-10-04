package CodeWars;

public class KataTwo {
    public static String countingSheep(int num) {
        StringBuilder result = new StringBuilder ();
        if (num <= 0) return "";
        for (int i = 1; i <= num; i++){
            result.append(i).append(" sheep...");
        }
        return result.toString();
    }
}
