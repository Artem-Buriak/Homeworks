package com.company;

import homework11.CoffeeOrderBoard;
import homework11.Order;

public class Main {
    public static void main(String[] args) {

        CoffeeOrderBoard board = new CoffeeOrderBoard();
        board.add(new Order("Olaf", "Espresso"));
        board.add(new Order("Boris", "Tea with milk"));
        board.add(new Order("Joe", "Hamburger & Latte"));
        board.add(new Order("Kyrylo", "Himars & Green Tea"));
        board.deliverLast();
        board.add(new Order("Valeriy", "Leopard & Flat White"));
        board.deliver(3);
        board.add(new Order("Volodymyr", "F-16 & Cappuccino"));
        board.draw();
    }
}

