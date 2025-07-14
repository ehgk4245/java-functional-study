package functionalinterface.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FilterExampleEx {

    public static List<Integer> filter(List<Integer> list, Predicate<Integer> predicate) {
        List<Integer> result = new ArrayList<>();
        for (Integer i : list) {
            if (predicate.test(i)) result.add(i);
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(-3, -2, -1, 1, 2, 3, 5);
        System.out.println("원본 리스트: " + numbers);

        // 1. 음수(negative)만 뽑아내기
        List<Integer> negatives = filter(numbers, value -> value < 0);
        System.out.println("음수만: " + negatives);

        // 2. 짝수(even)만 뽑아내기
        List<Integer> evens = filter(numbers, value -> value % 2 == 0);
        System.out.println("짝수만: " + evens);
    }
}
