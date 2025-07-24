package lambda.ex5.mystream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class MyStreamV1 {

    private List<Integer> internalList;

    public MyStreamV1(List<Integer> internalList) {
        this.internalList = internalList;
    }

    public MyStreamV1 filter(Predicate<Integer> predicate) {
        List<Integer> result = new ArrayList<>();
        for (Integer i : internalList) {
            if (predicate.test(i)) result.add(i);
        }
        return new MyStreamV1(result);
    }

    public MyStreamV1 map(Function<Integer, Integer> function) {
        List<Integer> result = new ArrayList<>();
        for (Integer i : internalList) {
            result.add(function.apply(i));
        }
        return new MyStreamV1(result);
    }

    public List<Integer> toList() {
        return internalList;
    }
}
