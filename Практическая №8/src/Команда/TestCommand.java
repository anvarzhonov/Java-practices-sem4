
package Команда;

/**
 * цель данного паттерна — это создание структуры, в которой класс-отправитель и класс-получатель
 * не зависят друг от друга напрямую.
 *         Организация обратного вызова к классу, который включает в себя класс-отправитель.
 */

public class TestCommand {
    public static void main(String[] args) {
        // создаем объект, который будет использоваться
        Light l = new Light();
        // создаем объекты для всех умений объекта Light:
        Command switchUp = new TurnOnLightCommand(l);
        Command switchDown = new TurnOffLightCommand(l);

        // Создаемтся invoker, с которым мы будем непосредственно контактировать:
        Switch s = new Switch(switchUp, switchDown);

        // вот проверка этого, используем методы:
        s.flipUp();
        s.flipDown();
    }
}
