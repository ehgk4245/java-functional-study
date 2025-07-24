package lambda.ex5.map;

import java.util.List;

public class MapMainV1 {
    public static void main(String[] args) {
        List<String> strings = List.of("1", "12", "123", "1234");

        List<Integer> mappedNums = GenericMap.map(strings, s -> Integer.parseInt(s));
        System.out.println( "mappedNums = " + mappedNums);

        List<String> mappedStrings = GenericMap.map(strings, s -> s.replaceAll("1", "5"));
        System.out.println("mappedStrings = " + mappedStrings);
    }
}
