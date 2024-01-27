package model;

public class HealthyBurger extends Hamburger {
    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String name, double price, String meat, String breadRollType,
                         String addition1Name, double addition1Price,
                         String addition2Name, double addition2Price,
                         String addition3Name, double addition3Price,
                         String addition4Name, double addition4Price,
                         String healthyExtra1Name, double healthyExtra1Price,
                         String healthyExtra2Name, double healthyExtra2Price) {
        super(name, meat, price, breadRollType, addition1Name, addition1Price,
                addition2Name, addition2Price, addition3Name, addition3Price,
                addition4Name, addition4Price);
        this.healthyExtra1Name = healthyExtra1Name;
        this.healthyExtra1Price = healthyExtra1Price;
        this.healthyExtra2Name = healthyExtra2Name;
        this.healthyExtra2Price = healthyExtra2Price;
    }

    public void addHealthyAddition1(String name, double price) {
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }

    public void addHealthyAddition2(String name, double price) {
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }
}
