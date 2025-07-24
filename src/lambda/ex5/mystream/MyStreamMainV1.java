package lambda.ex5.mystream;

import java.util.List;

public class MyStreamMainV1 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        returnValue(numbers);
    }

    private static List<Integer> returnValue(List<Integer> numbers) {
        MyStreamV1 myStreamV1 = new MyStreamV1(numbers);
        return myStreamV1.filter(n -> n % 2 == 0).map(n -> n * 2).toList();
    }
}
