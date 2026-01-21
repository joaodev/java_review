package classes.product;

public class ProductTest {

    public static void main(String[] args) {

        Product p1 = new Product();
        p1.name = "TV";
        p1.price = 2000.32;
        p1.discount = 0.25;

        var p2 = new Product();
        p2.name = "Smartphone";
        p2.price = 500.90;
        p2.discount = 0.29;

        System.out.println(p1.name);
        System.out.println(p2.name);

        double finalPrice1 = p1.price * (1 - p1.discount);
        double finalPrice2 = p2.price * (1 - p2.discount);
        double averagePrice = (finalPrice1 + finalPrice2) / 2;

        System.out.printf("Average price: $%.2f", averagePrice);
    }
}
