package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Order order = new Order();
        order.addItem("Keyboard", 1, 50);
        order.addItem("SSD", 1, 150);
        order.addItem("USB cable", 2, 5);

        System.out.println(order.totalPrice());
        order.pay("debit", "0372846");
    }
}
