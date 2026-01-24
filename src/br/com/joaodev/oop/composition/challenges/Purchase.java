package br.com.joaodev.oop.composition.challenges;

import java.util.ArrayList;
import java.util.List;

public class Purchase {

    final List<Item> items = new ArrayList<>();

    void addItem(Product product, int quantity) {
        this.items.add(new Item(product, quantity));
    }

    void addItem(String name, double price, int quantity) {
        var product = new Product(name, price);
        this.items.add(new Item(product, quantity));
    }

    double getAmountTotal() {
        double total = 0;

        for (Item item : items) {
            total += item.quantity * item.product.price;
        }

        return total;
    }
}
