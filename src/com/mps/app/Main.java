package com.mps.app;

import com.mps.app.bl.abstracts.AbstractBeverage;
import com.mps.app.bl.factory.BeverageFactory;

public class Main {

    public static void main(String[] args) {

        BeverageFactory factory = new BeverageFactory();

        BeverageStore automat = new BeverageStore(factory);

//        AbstractBeverage grosserBrauner = automat.orderBeverage("Großer Brauner");
//        AbstractBeverage schokolade = automat.orderBeverage("Schoko");
//        AbstractBeverage cappuccino = automat.orderBeverage("Cappuccino");
//        AbstractBeverage espresso = automat.orderBeverage("Espresso");
//        AbstractBeverage kaffeeSchwarz = automat.orderBeverage("Kaffee Schwarz");
//        AbstractBeverage kleinerBrauner = automat.orderBeverage("Kleiner Brauner");
//        AbstractBeverage latte = automat.orderBeverage("Latte");
//        AbstractBeverage irish = automat.orderBeverage("Irish");

        String selectedBeverage = automat.getOrder();
        System.out.println();
        System.out.println();

        switch (selectedBeverage) {
            case "Großer Brauner" -> presentGB(automat);
            case "Heiße Schoko" -> presentSH(automat);
            case "Espresso" -> presentEP(automat);
            case "Kaffee Schwarz" -> presentKS(automat);
            case "Kleiner Brauner" -> presentKB(automat);
            case "Cappuccino" -> presentCC(automat);
            case "Latte" -> presentLA(automat);
            case "Irish Coffee" -> presentIC(automat);
        }
        System.out.println("Genießen Sie Ihr Heißgetränk. Liebe Grüße, Mike");










    }

    static void presentGB(BeverageStore automat) {
        AbstractBeverage grosserBrauner = automat.orderBeverage("Großer Brauner");
        System.out.println(grosserBrauner.getDescription()+". Der Preis beträgt € "+grosserBrauner.cost()+".");
        System.out.println();
    }

    static void presentCC(BeverageStore automat){
        AbstractBeverage cappuccino = automat.orderBeverage("Cappuccino");
        System.out.println(cappuccino.getDescription()+". Der Preis beträgt € "+cappuccino.cost()+".");
        System.out.println();
    }

    static void presentEP(BeverageStore automat){
        AbstractBeverage espresso = automat.orderBeverage("Espresso");
        System.out.println(espresso.getDescription()+". Der Preis beträgt € "+espresso.cost()+".");
        System.out.println();
    }

    static void presentKS(BeverageStore automat){
        AbstractBeverage kaffeeSchwarz = automat.orderBeverage("Kaffee Schwarz");
        System.out.println(kaffeeSchwarz.getDescription()+". Der Preis beträgt € "+kaffeeSchwarz.cost()+".");
        System.out.println();
    }
    static void presentKB(BeverageStore automat){
        AbstractBeverage kleinerBrauner = automat.orderBeverage("Kleiner Brauner");
        System.out.println(kleinerBrauner.getDescription()+". Der Preis beträgt € "+kleinerBrauner.cost()+".");
        System.out.println();
    }

    static void presentLA(BeverageStore automat){
        AbstractBeverage latte = automat.orderBeverage("Latte");
        System.out.println(latte.getDescription()+". Der Preis beträgt € "+latte.cost()+".");
        System.out.println();
    }

    static void presentIC(BeverageStore automat){
        AbstractBeverage irish = automat.orderBeverage("Irish Coffee");
        System.out.println(irish.getDescription()+". Der Preis beträgt € "+irish.cost()+".");
        System.out.println();
    }

    static void presentSH(BeverageStore automat){
        AbstractBeverage schokolade = automat.orderBeverage("Heiße Schoko");
        System.out.println(schokolade.getDescription()+". Der Preis beträgt € "+schokolade.cost()+".");
        System.out.println();

    }



}

