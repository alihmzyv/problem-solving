package hackerrank.problemsolving;

import java.util.Scanner;

public class SolveMeFirst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(sum(a, b));
    }

    private static int sum(int a, int b) {
        return a + b;
    }
}
