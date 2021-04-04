package ru.anvarzhonov;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Neil Alishev
 */
public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        Student st = context.getBean("student", Student.class);
        StudentPlayer studentPlayer=new StudentPlayer(st);
        System.out.println(studentPlayer);
    }
}
