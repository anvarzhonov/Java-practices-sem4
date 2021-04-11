package ru.anvarzhonov;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

    @Value("${student.name}")
    private String name;
    @Value("${student.last_name}")
    private String last_name;
    @Value("${student.group}")
    private String group;
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", group='" + group + '\'' +
                '}';
    }
}

