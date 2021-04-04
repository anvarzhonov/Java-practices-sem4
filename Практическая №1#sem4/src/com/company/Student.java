package com.company;

public class Student {
    private String name;
    private Integer age;
    private Integer group;

    public Student(String name, Integer age, Integer group) {
        this.name = name;
        this.age = age;
        this.group=group;
    }


    public Integer getGroup() {
        return group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", group=" + group +
                '}';
    }
}
