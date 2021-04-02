package com.company;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        List<Human> students = new ArrayList<>();
        Human student1=new Human(18,"Evgen","Mushutov",2001,60);
        Human student2=new Human(20,"Alesha","Difurov",1999,66);
        Human student3=new Human(58,"Kirill","Vorobiov",1970,76);
        Human student4=new Human(25,"Seresha","Krilov",2005,80);
        Human student5=new Human(60,"Vanya","Orlov",2000,70);

        Collections.addAll(students,student1,student2,student3,student4,student5);



        Stream<Human> humanStream = students.stream();
        System.out.println("=========Cортировка по дате рождения==============");
        humanStream.sorted(Comparator.comparingInt(Human::getBirthDate)).forEach(System.out::println);
        System.out.println("=========================================");

        Stream<Human> humanStream1 = students.stream();
        System.out.println("========Фильтрация по возрасту меньше, чем 50=======");
        humanStream1.filter(x->x.getAge()<50).forEach(x-> System.out.println(x));
        System.out.println("=========================================");

        Stream<Human> humanStream2 = students.stream();
        System.out.println("========Сортировка по весу=======");
        humanStream2.sorted(Comparator.comparingInt(Human::getWeight)).forEach(System.out::println);
        System.out.println("=========================================");

        System.out.println("========Конкатенация всех имен в одну большую строку=======");
        Stream<Human> humanStream3 = students.stream();
        humanStream3.forEach(p-> System.out.print(p.firstName+" "));
        System.out.println("=========================================");




    }
}

