package methodref;

import java.util.function.Function;
import java.util.function.Supplier;

public class MethodRefEx1 {
    public static void main(String[] args) {
        Supplier<String> staticMethod1 = Person::greeting;
        System.out.println(staticMethod1.get());

        Function<String, String> staticMethod2 = Person::greetingWithName;
        System.out.println(staticMethod2.apply("안녕"));

        Person kim = new Person("kim");

        Supplier<String> instanceMethod1 = kim::getName;
        System.out.println(instanceMethod1.get());

        Function<Integer, String> instanceMethod2 = kim::introduceWithNumber;
        System.out.println(instanceMethod2.apply(20));

        Supplier<Person> newPerson1 = Person::new;
        Person unknown = newPerson1.get();
        System.out.println(unknown.getName());

        Function<String, Person> newPerson2 = Person::new;
        Person park = newPerson2.apply("park");
        System.out.println(park.getName());

        Function<Person, String> func1 = Person::introduce;
        System.out.println(func1.apply(kim));
    }
}
