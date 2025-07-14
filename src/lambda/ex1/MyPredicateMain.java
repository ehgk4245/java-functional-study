package lambda.ex1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyPredicateMain {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(-3, -2, -1, 1, 2, 3, 5));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(-3, -2, -1, 1, 2, 3, 5));
        filter(list1, value -> value < 0);
        System.out.println(list1);

        filter(list2, value -> value % 2 == 0);
        System.out.println(list2);
    }

    static void filter(List<Integer> list, MyPredicate myPredicate) {
        for (int i = 0; i < list.size(); i++) {
            if (!myPredicate.test(list.get(i))) {
                list.remove(i--);
            }
        }
    }
}
