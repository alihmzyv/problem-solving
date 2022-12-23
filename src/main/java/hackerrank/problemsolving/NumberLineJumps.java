package hackerrank.problemsolving;

public class NumberLineJumps {
    public static String kangaroo(int x1, int v1, int x2, int v2) {
        if (canMeet(x1, v1, x2, v2)) {
            return "YES";
        }
        return "NO";
    }

    private static boolean canMeet(int x1, int v1, int x2, int v2) {
        //meets if: x1 + t*v1 = x2 + t*v2 - solution for t (times) is positive integer
        if (v2 - v1 == 0 && x1 != x2) {
            return false;
        }
        return (x1 - x2) % (v2 - v1) == 0 && (x1 - x2) / (v2 - v1) > 0;
    }
}
