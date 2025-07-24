package lambda.ex5.filter;

import java.util.List;

import static lambda.ex5.filter.GenericFilter.filter;

public class FilterMainV4 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> filteredNums = filter(numbers, a -> a % 2 == 0);
        System.out.println("filteredNums = " + filteredNums);

        List<String> strings = List.of("A", "BB", "CCC");

        List<String> filteredStrings = filter(strings, a -> a.length() >= 2);
        System.out.println("filteredStrings = " + filteredStrings);
    }
}
