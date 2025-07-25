package methodref.start;

import java.util.function.BinaryOperator;

public class MethodRefStartV1 {
    public static void main(String[] args) {
        BinaryOperator<Integer> lambda = MethodRefStartV1::add;

        System.out.println(lambda.apply(1, 2));
    }

    public static int add(int x, int y) {
        return x + y;
    }
}
