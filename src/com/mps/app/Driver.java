package com.mps.app;

import com.mps.app.bl.abstracts.AbstractBeverage;
import com.mps.app.bl.factory.BeverageFactory;

import java.text.DecimalFormat;

public class Driver {

    public static void main(String[] args) {

        BeverageFactory factory = new BeverageFactory();

        BeverageStore automat = new BeverageStore(factory);

        DecimalFormat f = new DecimalFormat("##.00");
        automat.makePayment();
        automat.placeOrder();
        System.out.println();
        System.out.println();
        switch (automat.getOrderBeverage()) {
            case "Großer Brauner" -> presentGB(automat, f);
            case "Heiße Schoko" -> presentSH(automat, f);
            case "Espresso" -> presentEP(automat, f);
            case "Kaffee Schwarz" -> presentKS(automat, f);
            case "Kleiner Brauner" -> presentKB(automat, f);
            case "Cappuccino" -> presentCC(automat, f);
            case "Latte" -> presentLA(automat, f);
            case "Irish Coffee" -> presentIC(automat, f);
        }
        System.out.println("Genießen Sie Ihr Heißgetränk. Liebe Grüße, Mike");

    }

    static void presentGB(BeverageStore automat, DecimalFormat f) {

        AbstractBeverage grosserBrauner = automat.orderBeverage("Großer Brauner");
        System.out.println(grosserBrauner.getDescription() + ".");
        System.out.println("Der Preis beträgt € " + grosserBrauner.cost() + ".");
        System.out.println("Münzauswurf: " + (f.format(automat.getInsertedAmount() - grosserBrauner.cost())) + "€");
        System.out.println();
    }

    static void presentCC(BeverageStore automat, DecimalFormat f) {

        AbstractBeverage cappuccino = automat.orderBeverage("Cappuccino");
        System.out.println(cappuccino.getDescription() + ".");
        System.out.println("Der Preis beträgt € " + cappuccino.cost() + ".");
        System.out.println("Münzauswurf: " + (f.format(automat.getInsertedAmount() - cappuccino.cost()) + " €"));
        System.out.println();
    }

    static void presentEP(BeverageStore automat, DecimalFormat f) {

        AbstractBeverage espresso = automat.orderBeverage("Espresso");
        System.out.println(espresso.getDescription() + ".");
        System.out.println("Der Preis beträgt € " + espresso.cost() + ".");
        System.out.println("Münzauswurf: " + ((f.format(automat.getInsertedAmount() - espresso.cost())) + "€"));
        System.out.println();
    }

    static void presentKS(BeverageStore automat, DecimalFormat f) {

        AbstractBeverage kaffeeSchwarz = automat.orderBeverage("Kaffee Schwarz");
        System.out.println(kaffeeSchwarz.getDescription() + ".");
        System.out.println("Der Preis beträgt € " + kaffeeSchwarz.cost() + ".");
        System.out.println("Münzauswurf: " + (f.format(automat.getInsertedAmount() - kaffeeSchwarz.cost()) + "€"));
        System.out.println();
    }

    static void presentKB(BeverageStore automat, DecimalFormat f) {

        AbstractBeverage kleinerBrauner = automat.orderBeverage("Kleiner Brauner");
        System.out.println(kleinerBrauner.getDescription() + ".");
        System.out.println("Der Preis beträgt € " + kleinerBrauner.cost() + ".");
        System.out.println("Münzauswurf: " + (f.format(automat.getInsertedAmount() - kleinerBrauner.cost()) + "€"));
        System.out.println();
    }

    static void presentLA(BeverageStore automat, DecimalFormat f) {

        AbstractBeverage latte = automat.orderBeverage("Latte");
        System.out.println(latte.getDescription() + ".");
        System.out.println("Der Preis beträgt € " + latte.cost() + ".");
        System.out.println("Münzauswurf: " + (f.format(automat.getInsertedAmount() - latte.cost()) + "€"));
        System.out.println();
    }

    static void presentIC(BeverageStore automat, DecimalFormat f) {

        AbstractBeverage irish = automat.orderBeverage("Irish Coffee");
        System.out.println(irish.getDescription() + ".");
        System.out.println("Der Preis beträgt € " + irish.cost() + ".");
        System.out.println("Münzauswurf: " + (f.format(automat.getInsertedAmount() - irish.cost()) + "€"));
        System.out.println();
    }

    static void presentSH(BeverageStore automat, DecimalFormat f) {

        AbstractBeverage schokolade = automat.orderBeverage("Heiße Schoko");
        System.out.println(schokolade.getDescription() + ".");
        System.out.println("Der Preis beträgt € " + schokolade.cost() + ".");
        System.out.println("Münzauswurf: " + (f.format(automat.getInsertedAmount() - schokolade.cost()) + "€"));
        System.out.println();

    }


}

