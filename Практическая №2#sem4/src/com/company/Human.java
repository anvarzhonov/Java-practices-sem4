package com.company;

import java.time.LocalDate;

public class Human {
    public int age;
    public String firstName;
    public String lastName;
    public Integer birthDate;
    public int weight;

    public Human(int age, String firstName, String lastName, Integer birthDate, int weight) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.weight = weight;
    }

    public Integer getBirthDate() {
        return birthDate;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate=" + birthDate +
                ", weight=" + weight +
                '}';
    }
}
