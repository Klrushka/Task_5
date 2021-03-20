public class Shop {
    public static void main(String[] args) {
        Product [] mp = new Product[10];
        Meat m = new Meat();
        Milk mi = new Milk();
        Bread b = new Bread();

        m.setCost(120);
        mi.setCost(230);
        b.setCost(122);

        m.sale(25);
        mi.sale(20);
        b.sale(10);

    }
}
