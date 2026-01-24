package br.com.joaodev.oop.composition.challenges;

public class Software {

    public static void main(String[] args) {

        System.out.println("The software is running...");

        Purchase purchase1 = new Purchase();
        purchase1.addItem("Notebook", 1534.50, 2);
        purchase1.addItem("Smartphone", 765.32, 3);

        Purchase purchase2 = new Purchase();
        purchase2.addItem("Tablet", 453.23, 1);
        purchase2.addItem("Smartwatch", 323.20, 2);

        Customer c1 = new Customer("John Doe");
        c1.addPurchase(purchase1);
        c1.purchases.add(purchase2);

        System.out.println("Total amount: " + c1.getAmountTotal());
    }
}
