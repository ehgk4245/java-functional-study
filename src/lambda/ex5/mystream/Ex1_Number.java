package lambda.ex5.mystream;

import lambda.ex5.filter.GenericFilter;
import lambda.ex5.map.GenericMap;

import java.util.ArrayList;
import java.util.List;

public class Ex1_Number {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> directList = direct(numbers);
        System.out.println("directList = " + directList);

        List<Integer> lambdaList = lambda(numbers);
        System.out.println("lambdaList = " + lambdaList);
    }

    private static List<Integer> lambda(List<Integer> numbers) {
        List<Integer> filtered = GenericFilter.filter(numbers, n -> n % 2 == 0);
        List<Integer> map = GenericMap.map(filtered, n -> n * 2);
        return map;
    }

    private static List<Integer> direct(List<Integer> numbers) {
        List<Integer> result = new ArrayList<>();

        for (Integer i : numbers) {
            if (i % 2 == 0) result.add(i * 2);
        }

        return result;
    }
}
