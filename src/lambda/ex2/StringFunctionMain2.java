package lambda.ex2;

public class StringFunctionMain2 {

    public static StringFunction buildGreeter(String greeting) {

        return name -> greeting + ", " + name;
    }

    public static void main(String[] args) {
        StringFunction function1 = buildGreeter("Hello");
        StringFunction function2 = buildGreeter("hi");

        System.out.println(function1.apply("Java"));
        System.out.println(function2.apply("haha"));
    }
}
