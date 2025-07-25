package lambda.ex5.mystream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

//static factory 추가
public class MyStreamV2 {

    private List<Integer> internalList;

    private MyStreamV2(List<Integer> internalList) {
        this.internalList = internalList;
    }

    public static MyStreamV2 of(List<Integer>  internalList) {
        return new MyStreamV2(internalList);
    }

    public MyStreamV2 filter(Predicate<Integer> predicate) {
        List<Integer> result = new ArrayList<>();
        for (Integer i : internalList) {
            if (predicate.test(i)) result.add(i);
        }
        return new MyStreamV2(result);
    }

    public MyStreamV2 map(Function<Integer, Integer> function) {
        List<Integer> result = new ArrayList<>();
        for (Integer i : internalList) {
            result.add(function.apply(i));
        }
        return new MyStreamV2(result);
    }

    public List<Integer> toList() {
        return internalList;
    }
}
