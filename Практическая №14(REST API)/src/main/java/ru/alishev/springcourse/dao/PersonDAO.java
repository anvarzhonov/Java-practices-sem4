package ru.alishev.springcourse.dao;

import org.springframework.stereotype.Component;
import ru.alishev.springcourse.models.Manufacture;
import ru.alishev.springcourse.models.Worker;


import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDAO {

    private List<Worker> worker;
    private List<Manufacture> manufacture;


    {
        worker = new ArrayList<>();
        worker.add(new Worker("Zhenya","Anvarzhonov","Albertovich"));
        worker.add(new Worker("Mishytka","Kyrapatov","Vsevolodich"));
        worker.add(new Worker("Alesha","Golovomov","Huseynovich"));
        worker.add(new Worker("Artemiy","Yakov","Jorovich"));

        manufacture = new ArrayList<>();
        manufacture.add(new Manufacture("rty","Vernadka"));
        manufacture.add(new Manufacture("DinKiyMinkiy","ul Aleshina"));
        manufacture.add(new Manufacture("GuramBuram","ul Guramovicha, 8 "));
    }
    // Метод возвращает объект из классов Person(Список из людей)
    public List<Worker> index(){
        return worker;
    }
    public List<Manufacture> index1(){
        return manufacture;
    }


    // Добавляет каждый созданный объект
    public void save_worker(Worker person){
        worker.add(person);
    }
    // Добавляет в список созданный объект
    public void save_manufacture(Manufacture place){
        manufacture.add(place);
    }

    public void delete(String name){
        worker.removeIf(p-> p.getFirstName() == name);
    }

}
