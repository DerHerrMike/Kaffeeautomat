package com.mps.app;

import com.mps.app.bl.abstracts.AbstractBeverage;
import com.mps.app.bl.factory.BeverageFactory;

import java.util.Scanner;

/**
 * / Created by Mike Schwingenschloegl in Jul 2021
 */
public class BeverageStore {

    private static final Scanner scanner = new Scanner(System.in);
    BeverageFactory factory;
    String orderBeverage;

    public BeverageStore(BeverageFactory factory) {

        this.factory = factory;
    }

    public AbstractBeverage orderBeverage(String type){
        AbstractBeverage beverage;
        return beverage = factory.createBeverage(type);
    }

    public String getOrder(){

        System.out.println();

            System.out.println("Folgende Produkte können gekauft werden:");
            System.out.println("****************************************");
            System.out.println("Espresso");
            System.out.println("Kaffee Schwarz");
            System.out.println("Kleiner Brauner");
            System.out.println("Großer Brauner");
            System.out.println("Cappuccino");
            System.out.println("Latte");
            System.out.println("Heiße Schoko");
            System.out.println("Irish Coffee");
            System.out.println("****************************************");
            System.out.println();
            System.out.println("Bitte geben Sie den gewünschten Produktnamen ein: ");

            return orderBeverage = scanner.nextLine();


    }



}
