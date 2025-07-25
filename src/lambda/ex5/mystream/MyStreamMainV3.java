package lambda.ex5.mystream;

import java.util.List;

public class MyStreamMainV3 {
    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("apple", 100),
                new Student("banana", 80),
                new Student("orange", 70),
                new Student("grape", 60)
        );

        MyStreamV3.of(students)
                .filter(student -> student.getScore() >= 80)
                .map(Student::getName)
                .forEach(System.out::println);

        List<String> list1 = MyStreamV3.of(students)
                .filter(student -> student.getName().length() == 5 && student.getScore() >= 80)
                .map(student -> student.getName().toUpperCase())
                .toList();

        System.out.println(list1);
    }
}
