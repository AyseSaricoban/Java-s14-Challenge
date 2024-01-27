package model;

public class DeluxeBurger extends Hamburger{

    public DeluxeBurger(String name, String meat, double price, String breadRollType, String addition1Name, double addition1Price, String addition2Name, double addition2Price, String addition3Name, double addition3Price, String addition4Name, double addition4Price) {
        super(name, meat, price, breadRollType, addition1Name, addition1Price, addition2Name, addition2Price, addition3Name, addition3Price, addition4Name, addition4Price);
   addHamburgerAddition1("Chips", 2.75);
        addHamburgerAddition1("Drink", 1.81);

    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        super.addHamburgerAddition1(name, price);
        System.out.println("Deluxe Burger için yeni malzeme eklenemez");

    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Deluxe Burger için yeni malzeme eklenemez");
    }
    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Deluxe Burger için yeni malzeme eklenemez");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Deluxe Burger için yeni malzeme eklenemez");
    }
}
