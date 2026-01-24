package br.com.joaodev.oop.composition.one.to.many;

import java.util.ArrayList;

public class Purchase {

    String customer;
    ArrayList<Item> items = new ArrayList<Item>();

    void addItem(String name, int quantity, double price) {
        this.addItem(new Item(name, quantity, price));
    }

    void addItem(Item item) {
        this.items.add(item);
        item.purchase = this;
    }

    double purchaseTotal() {
        double total = 0;

        for (Item item : items) {
            total += item.quantity * item.price;
        }

        return total;
    }
}
