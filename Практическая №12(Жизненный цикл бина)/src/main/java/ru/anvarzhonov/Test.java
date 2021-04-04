package ru.anvarzhonov;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.lang.String;

public class Test {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        FilesM  filesM = context.getBean("filesM",FilesM.class);


    }
}
