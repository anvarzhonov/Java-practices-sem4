package com.company.FactoryMethod;

//Используется, когда у нас есть суперкласс с несколькими подклассами и на основе ввода,
// нам нужно вернуть один из подкласса. Класс не знает какого типа объект он должен создать.
// Объекты создаются в зависимости от входящих данных.
public class FactoryTest {//тест

    public static void main(String[] args) {
        String win = "linux";
        Factory factory = new Factory();
        OS os = factory.getCurrentOS(win);
        os.getOS();
    }
}
