package com.company;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
     /*   List<String> list = Arrays.asList("der", "kq", "k");
        Collections.sort(list, (String s1, String s2) -> {
            return Integer.compare(s1.length(), s2.length());
        });
        System.out.println(list); */

        List<Student> students = new ArrayList<>();

        Student student1 = new Student("Андрей", 19,10);
        Student student2 = new Student("Евгений", 23,25);
        Student student3 = new Student("Артем", 35,2);
        Student student4 = new Student("Мики", 18, 28);
        Student student5 = new Student("Арнольд", 20, 6);


        Collections.addAll(students, student1, student2, student3, student4, student5);

        Stream<Student> studentStream = students.stream();
        System.out.println("=========Cортировка по группе студентов==============");
        studentStream.sorted(Comparator.comparingInt(Student::getGroup)).forEach(System.out::println);





    }
}
