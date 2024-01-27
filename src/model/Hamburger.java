package model;

public class Hamburger {
    private String name;
    private String meat;
    private String breadRollType;
    private double price;

    private String addition1Name;
    private double addition1Price;
    private String addition2Name;
    private double addition2Price;
    private String addition3Name;
    private double addition3Price;
    private String addition4Name;
    private double addition4Price;

    public Hamburger(String name, double price, String breadRollType, String meat,
                     String addition1Name, double addition1Price,
                     String addition2Name, double addition2Price,
                     String addition3Name, double addition3Price,
                     String addition4Name, double addition4Price) {
        this.name = name;
        this.meat = meat;
        this.breadRollType = breadRollType;
        this.price = price;
        this.addition1Name = addition1Name;
        this.addition1Price = addition1Price;
        this.addition2Name = addition2Name;
        this.addition2Price = addition2Price;
        this.addition3Name = addition3Name;
        this.addition3Price = addition3Price;
        this.addition4Name = addition4Name;
        this.addition4Price = addition4Price;
    }

    public String getName() {
        return name;
    }

    public String getMeat() {
        return meat;
    }

    public double getPrice() {
        return price;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public String getAddition1Name() {
        return addition1Name;
    }

    public double getAddition1Price() {
        return addition1Price;
    }

    public String getAddition2Name() {
        return addition2Name;
    }

    public double getAddition2Price() {
        return addition2Price;
    }

    public String getAddition3Name() {
        return addition3Name;
    }

    public double getAddition3Price() {
        return addition3Price;
    }

    public String getAddition4Name() {
        return addition4Name;
    }

    public double getAddition4Price() {
        return addition4Price;
    }

    public void addHamburgerAddition1(String name, double price){
        this.addition1Name=name;
        this.addition1Price=price;
    }
    public void addHamburgerAddition2(String name, double price){
        this.addition2Name=name;
        this.addition2Price=price;
    }
    public void addHamburgerAddition3(String name, double price){
        this.addition3Name=name;
        this.addition3Price=price;
    }
    public void addHamburgerAddition4(String name, double price){
        this.addition4Name=name;
        this.addition4Price=price;
    }
    public double itemizeHamburger() {
        double totalPrice = this.price;
        System.out.println("Hamburger: " + this.name + " on a " + this.breadRollType + " roll with " + this.meat + ", Price: $" + this.price);

        if (this.addition1Name != null) {
            totalPrice += this.addition1Price;
            System.out.println("Added " + this.addition1Name + " for an extra $" + this.addition1Price);
        }
        if (this.addition2Name != null) {
            totalPrice += this.addition2Price;
            System.out.println("Added " + this.addition2Name + " for an extra $" + this.addition2Price);
        }
        if (this.addition3Name != null) {
            totalPrice += this.addition3Price;
            System.out.println("Added " + this.addition3Name + " for an extra $" + this.addition3Price);
        }
        if (this.addition4Name != null) {
            totalPrice += this.addition4Price;
            System.out.println("Added " + this.addition4Name + " for an extra $" + this.addition4Price);
        }

        System.out.println("Total Price: $" + totalPrice);
        return totalPrice;
    }
    }



