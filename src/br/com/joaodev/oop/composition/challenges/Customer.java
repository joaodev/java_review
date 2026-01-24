package br.com.joaodev.oop.composition.challenges;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    final String name;
    final List<Purchase> purchases = new ArrayList<>();

    Customer(String name) {
        this.name = name;
    }

    void addPurchase(Purchase purchase) {
        this.purchases.add(purchase);
    }

    double getAmountTotal() {
        double total = 0;

        for (Purchase purchase : purchases) {
            total += purchase.getAmountTotal();
        }

        return total;
    }
}
