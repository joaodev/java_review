package br.com.joaodev.oop.composition.one.to.many;

public class PurchaseTest {

    public static void main(String[] args) {

        Purchase purchase = new Purchase();
        purchase.customer = "John Doe";
        purchase.items.add(new Item("Laptop", 1, 999.99));
        purchase.items.add(new Item("Mouse", 2, 19.99));
        purchase.items.add(new Item("Keyboard", 1, 49.99));

        System.out.println(purchase.items.size());
        System.out.printf("Total purchase amount: $%.2f%n", purchase.purchaseTotal());
    }
}
