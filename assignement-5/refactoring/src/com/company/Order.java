package com.company;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<String> items;
    private List<Integer> quantities;
    private List<Double> prices;
    private String status;

    public Order() {
        this.items = new ArrayList<String>();
        this.quantities = new ArrayList<Integer>();
        this.prices = new ArrayList<Double>();
        this.status = "open";
    }

    public void addItem(String name, int quantity, double price) {
        this.items.add(name);
        this.quantities.add(quantity);
        this.prices.add(price);
    }

    public double totalPrice() {
        double total = 0;
        for (int i = 0; i < this.prices.size(); i++) {
            total += this.quantities.get(i) * this.prices.get(i);
        }
        return total;
    }

    public void pay(String paymentType, String securityCode) {
        if (paymentType.equals("debit")) {
            System.out.println("Processing debit payment type");
            System.out.println("Verifying security code: " + securityCode);
            this.status = "paid";
        } else if (paymentType.equals("credit")) {
            System.out.println("Processing credit payment type");
            System.out.println("Verifying security code: " + securityCode);
            this.status = "paid";
        } else {
            throw new IllegalArgumentException("Unknown payment type: " + paymentType);
        }
    }

}
