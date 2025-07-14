package lambda.ex2;

import java.util.ArrayList;
import java.util.List;

public class StringFunctionMain {

    public static void main(String[] args) {
        List<String> list = List.of("hello", "java", "lambda");
        System.out.println(map(list, str -> str.toUpperCase()));
        System.out.println(map(list, str -> String.format("***%s***", str)));
    }

    public static List<String> map(List<String> list, StringFunction stringFunction) {
        List<String> mapList = new ArrayList<>();
        for (String s : list) {
            mapList.add(stringFunction.apply(s));
        }
        return mapList;
    }
}
