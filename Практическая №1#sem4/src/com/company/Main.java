package com.company;
import java.util.*;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
     /*   List<String> list = Arrays.asList("der", "kq", "k");
        Collections.sort(list, (String s1, String s2) -> {
            return Integer.compare(s1.length(), s2.length());
        });
        System.out.println(list); */

        Student student1 = new Student("Андрей", 19);
        Student student2 = new Student("Евгений", 23);
        Student student3 = new Student("Артем", 35);
        Student student4 = new Student("Мики", 18);
        Student student5 = new Student("Арнольд", 20);

        List<Student> list = new ArrayList<>();
        list.add(student1);

        Map<String,List<Student>> boo=new HashMap<>();
        System.out.println(boo);




    }
}
