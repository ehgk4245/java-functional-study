package lambda.ex3;

import java.util.List;

public class MyReducerMain {

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4);
        System.out.println(reduce(list, 0, (a, b) -> {
            return a + b;
        }));
        System.out.println(reduce(list, 1, (a, b) -> {
            return a * b;
        }));
    }

    public static int reduce(List<Integer> list, int initial, MyReducer myReducer) {
        for (Integer i : list) {
            initial = myReducer.reduce(i, initial);
        }
        return initial;
    }
}
