package br.com.joaodev.oop.composition.challenges;

public class Item {

    final Product product;
    final int quantity;

    Item(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }
}
