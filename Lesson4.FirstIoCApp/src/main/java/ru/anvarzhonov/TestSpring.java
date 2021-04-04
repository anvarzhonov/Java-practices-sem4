package ru.anvarzhonov;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        Magican magican1 = context.getBean("harryPotter",Magican.class);
        MagicDo Potter = new MagicDo(magican1);
        Potter.DoingMagic();

        Magican magican2 = context.getBean("voldemort",Magican.class);
        MagicDo voldemort = new MagicDo(magican2);
        voldemort.DoingMagic();

        Magican magican3 = context.getBean("ronWeesly",Magican.class);
        MagicDo ron = new MagicDo(magican3);
        ron.DoingMagic();

    }
}
