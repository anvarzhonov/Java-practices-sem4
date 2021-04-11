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
            Student student = context.getBean("student",Student.class);
            System.out.println(student);
        context.close();
    }
}
