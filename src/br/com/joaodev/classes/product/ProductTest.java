package br.com.joaodev.classes.product;

public class ProductTest {

    public static void main(String[] args) {

        Product p1 = new Product("TV", 2000.32);

        var p2 = new Product();
        p2.name = "Smartphone 2";
        p2.price = 500.90;

        Product.discount = 0.29;

        System.out.printf("%s %.2f\n", p1.name, p1.priceWithDiscount());
        System.out.printf("%s %.2f\n", p2.name, p2.priceWithDiscount());

        double finalPrice1 = p1.priceWithDiscount(0);
        double finalPrice2 = p2.priceWithDiscount(0.1);
        double averagePrice = (finalPrice1 + finalPrice2) / 2;

        System.out.printf("Average price: $%.2f", averagePrice);
    }
}
