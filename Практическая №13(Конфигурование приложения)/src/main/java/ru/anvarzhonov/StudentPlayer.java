package ru.anvarzhonov;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentPlayer {
    private Student student;

    @Autowired
    public StudentPlayer(Student student) {
        this.student=student;
    }
}
