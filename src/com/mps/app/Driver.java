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
        automat.preSelectCup();
        automat.preSelectSugar();
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
        boolean sugar = automat.isSugar();
        AbstractBeverage grosserBrauner = automat.orderBeverage("Großer Brauner",sugar);
        System.out.println(grosserBrauner.getDescription() + ".");
        System.out.println("Der Preis beträgt € " + f.format(grosserBrauner.cost()) + ".");
        System.out.println("Münzauswurf €: " + (f.format(automat.getInsertedAmount() - grosserBrauner.cost())));
        System.out.println();
    }

    static void presentCC(BeverageStore automat, DecimalFormat f) {
        boolean sugar = automat.isSugar();
        AbstractBeverage cappuccino = automat.orderBeverage("Cappuccino",sugar);
        System.out.println(cappuccino.getDescription() + ".");
        System.out.println("Der Preis beträgt € " + f.format(cappuccino.cost()) + ".");
        System.out.println("Münzauswurf €: " + (f.format(automat.getInsertedAmount() - cappuccino.cost())));
        System.out.println();
    }

    static void presentEP(BeverageStore automat, DecimalFormat f) {
        boolean sugar = automat.isSugar();
        AbstractBeverage espresso = automat.orderBeverage("Espresso",sugar);
        System.out.println(espresso.getDescription() + ".");
        System.out.println("Der Preis beträgt € " + f.format(espresso.cost()) + ".");
        System.out.println("Münzauswurf €: " + ((f.format(automat.getInsertedAmount() - espresso.cost()))));
        System.out.println();
    }

    static void presentKS(BeverageStore automat, DecimalFormat f) {
        boolean sugar = automat.isSugar();
        AbstractBeverage kaffeeSchwarz = automat.orderBeverage("Kaffee Schwarz",sugar);
        System.out.println(kaffeeSchwarz.getDescription() + ".");
        System.out.println("Der Preis beträgt € " + f.format(kaffeeSchwarz.cost()) + ".");
        System.out.println("Münzauswurf €: " + (f.format(automat.getInsertedAmount() - kaffeeSchwarz.cost())));
        System.out.println();
    }

    static void presentKB(BeverageStore automat, DecimalFormat f) {
        boolean sugar = automat.isSugar();
        AbstractBeverage kleinerBrauner = automat.orderBeverage("Kleiner Brauner",sugar);
        System.out.println(kleinerBrauner.getDescription() + ".");
        System.out.println("Der Preis beträgt € " + f.format(kleinerBrauner.cost()) + ".");
        System.out.println("Münzauswurf €: " + (f.format(automat.getInsertedAmount() - kleinerBrauner.cost())));
        System.out.println();
    }

    static void presentLA(BeverageStore automat, DecimalFormat f) {
        boolean sugar = automat.isSugar();
        AbstractBeverage latte = automat.orderBeverage("Latte",sugar);
        System.out.println(latte.getDescription() + ".");
        System.out.println("Der Preis beträgt € " + f.format(latte.cost() + "."));
        System.out.println("Münzauswurf €: " + (f.format(automat.getInsertedAmount() - latte.cost())));
        System.out.println();
    }

    static void presentIC(BeverageStore automat, DecimalFormat f) {
        boolean sugar = automat.isSugar();
        AbstractBeverage irish = automat.orderBeverage("Irish Coffee",sugar);
        System.out.println(irish.getDescription() + ".");
        System.out.println("Der Preis beträgt € " + f.format(irish.cost() + "."));
        System.out.println("Münzauswurf €: " + (f.format(automat.getInsertedAmount() - irish.cost())));
        System.out.println();
    }

    static void presentSH(BeverageStore automat, DecimalFormat f) {
        boolean sugar = automat.isSugar();
        AbstractBeverage schokolade = automat.orderBeverage("Heiße Schoko",sugar);
        System.out.println(schokolade.getDescription() + ".");
        System.out.println("Der Preis beträgt € " + f.format(schokolade.cost()) + ".");
        System.out.println("Münzauswurf €: " + (f.format(automat.getInsertedAmount() - schokolade.cost())));
        System.out.println();

    }


}

