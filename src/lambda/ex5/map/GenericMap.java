package lambda.ex5.map;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class GenericMap {

    public static <T, R> List<R> map(List<T> list, Function<T, R> function) {
        List<R> resultList = new ArrayList<>();
        for (T t : list) {
            resultList.add(function.apply(t));
        }
        return resultList;
    }
}
