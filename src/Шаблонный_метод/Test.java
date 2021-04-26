package Шаблонный_метод;

public class Test {

    public static void main(String[] args) {

        System.out.println("\n");
        HouseTemplate houseType = new WoodenHouse();

        //using template method
        houseType.buildHouse();
        System.out.println("\n************\n");

        houseType = new GlassHouse();

        houseType.buildHouse();
    }
}
