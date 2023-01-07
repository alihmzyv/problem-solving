package hackerrank.all.easy;

import java.util.List;

//https://www.hackerrank.com/challenges/bon-appetit/problem
public class BillDivision {
    public static void bonAppetit(List<Integer> bill, int k, int b) {
        bill.remove(k);
        int shareOfAnna = bill.stream()
                .mapToInt(price -> price)
                .sum() / 2;
        if (shareOfAnna == b) {
            System.out.println("Bon Appetit");
        }
        else {
            System.out.println(b - shareOfAnna);
        }
    }
}
