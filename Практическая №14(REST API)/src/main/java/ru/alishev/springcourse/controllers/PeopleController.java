package ru.alishev.springcourse.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.alishev.springcourse.dao.PersonDAO;
import ru.alishev.springcourse.models.Manufacture;
import ru.alishev.springcourse.models.Worker;


@Controller
@RequestMapping("/home")
public class PeopleController {

    private final PersonDAO personDAO;

    public PeopleController(PersonDAO personDAO) {
        this.personDAO = personDAO;
    }

    @GetMapping()
    public  String home(){
        return "people/home";
    }

    @GetMapping("/index")
    public String index(Model model){
        // Получим всех люде из DAO и передадим на отображение этих людей в представление
        model.addAttribute("Worker", personDAO.index()); // под ключом worker будут лежать все рабочие
        model.addAttribute("manufacture",personDAO.index1());
        return "people/index";
    }
    // Маппинг для добавления нового рабочего
    @GetMapping("/new")
    public String newWorker(Model model){
        model.addAttribute("worker",new Worker());
        model.addAttribute("manufacture", new Manufacture());
        return "people/new";
    }

    //  Маппинг для сохранения и отображения добавленного рабочего
    @PostMapping()
    public String create_worker(@ModelAttribute("worker") Worker worker,
                                @ModelAttribute("manufacture") Manufacture manufacture ){
        personDAO.save_worker(worker);
        personDAO.save_manufacture(manufacture);
        return "redirect:/home/index";
    }
    @DeleteMapping("/{name}")
    public String delete(@PathVariable("name") String name){

        personDAO.delete(name);

        return "redirect:/home/index";
    }

}
