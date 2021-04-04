package ru.anvarzhonov;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

@Component
public class FilesM {

    Path path = Path.of("text.txt");
    Path path2 = Path.of("text1.txt");

    @PostConstruct
    public void entrance() throws IOException {
        if (Files.exists(path)) {
            Files.createFile(path2);
            Files.copy(path,path2);
        }
        else{
            Files.createFile(path2);
            Files.writeString(path2,"null");
            System.out.println(Files.readAllLines(path2));
        }
    }
    @PreDestroy
    public void destroy() throws IOException {
        if(Files.exists(path)) {
            Files.delete(path);
            System.out.println("Первый файл удален!");
            System.out.println(Files.readAllLines(path2));
        }

    }

}
