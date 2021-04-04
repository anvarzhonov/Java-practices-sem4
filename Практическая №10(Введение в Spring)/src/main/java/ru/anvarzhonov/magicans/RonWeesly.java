package ru.anvarzhonov.magicans;

import org.springframework.stereotype.Component;
import ru.anvarzhonov.Magican;

@Component
public class RonWeesly implements Magican {
    @Override
    public String fight() {
        return "Венгардиум Левиоса!!!";
    }
}
