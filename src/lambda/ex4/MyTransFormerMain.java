package lambda.ex4;

import java.util.ArrayList;

public class MyTransFormerMain {

    public static MyTransFormer compose(MyTransFormer f1, MyTransFormer f2) {
        return str -> f2.apply(f1.apply(str));
    }

    public static void main(String[] args) {
        MyTransFormer f1 = str -> str.toUpperCase();
        MyTransFormer f2 = str -> String.format("**%s**", str);

        MyTransFormer composeFunc = compose(f1, f2);

        System.out.println(composeFunc.apply("hello"));
    }
}
