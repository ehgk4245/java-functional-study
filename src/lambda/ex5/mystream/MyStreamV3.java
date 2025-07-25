package lambda.ex5.mystream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class MyStreamV3<T>{

    private final List<T> internalList;

    private MyStreamV3(List<T> internalList) {
        this.internalList = internalList;
    }

    public static <T> MyStreamV3<T> of(List<T> internalList) {
        return new MyStreamV3<>(internalList);
    }

    public MyStreamV3<T> filter(Predicate<T> predicate) {
        List<T> result = new ArrayList<>();
        for (T t : internalList) {
            if (predicate.test(t)) result.add(t);
        }
        return of(result);
    }

    public <R> MyStreamV3<R> map(Function<T, R> function) {
        List<R> result = new ArrayList<>();
        for (T t : internalList) {
            result.add(function.apply(t));
        }
        return of(result);
    }

    public List<T> toList() {
        return internalList;
    }
}
