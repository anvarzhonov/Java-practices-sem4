package com.company.AbstractFactory;

public class AbstractFactoryTest {//ัะตัั

    public static void main(String[] args) {
        String country = "UA";
        InteAbsFactory ifactory = null;
        if (country.equals("UA")) {
            ifactory = new UaCarPriceAbsFactory();
        } else if (country.equals("RU")) {
            ifactory = new RuCarPriceAbsFactory();
        }

        Lada lada = ifactory.getLada();
        System.out.println(lada.getLadaPrice());
    }
}
