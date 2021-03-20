public class Product {
    private String name;
    private double cost;
    private int rate;
    private double sale;


    public void sale(double sale) {
        System.out.println("Your sale " + sale + "%" + " now your cost: " + (cost - cost * (sale /100)));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public double getSale() {
        return sale;
    }

    public void setSale(double sale) {
        this.sale = sale;
    }
}
