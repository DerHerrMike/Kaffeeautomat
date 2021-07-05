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
    double insertedAmount;

    public BeverageStore(BeverageFactory factory) {

        this.factory = factory;
    }

    public AbstractBeverage orderBeverage(String type) {


        return factory.createBeverage(type);
    }

    public double getPayment() {

        System.out.println();
        System.out.println("Bitte Münzen einwerfen:");
        System.out.println();
        System.out.println("Eingeworfener Betrag (double): ");
        double inserted = scanner.nextDouble();
        scanner.nextLine();
        while (inserted < 0.5) {
            System.out.println("Bitte weitere Münzen einwerfen (min. 50 Cent)!");
            System.out.println("Weiterer eingeworfener Betrag: ");
            inserted = inserted + scanner.nextDouble();
        }
        setInsertedAmount(inserted);

        return getInsertedAmount();

    }

    public String getOrder() {

        System.out.println();

        if (getInsertedAmount() <= 0.59) {

            System.out.println("Folgende Produkte können gekauft werden:");
            System.out.println("****************************************");
            System.out.println("Espresso");
            System.out.println("Kaffee Schwarz");
            System.out.println("Kleiner Brauner");
            System.out.println("Großer Brauner");
            System.out.println("Cappuccino");
            System.out.println("Latte");
            System.out.println("Heiße Schoko");
//            System.out.println("Irish Coffee");
            System.out.println("****************************************");
            System.out.println();
            System.out.println("Bitte geben Sie den gewünschten Produktnamen ein: ");
            return orderBeverage = scanner.nextLine();

        } else if (getInsertedAmount() >= 0.6) {
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
        return null;
    }

    public double getInsertedAmount() {

        return insertedAmount;
    }

    public void setInsertedAmount(double insertedAmount) {

        this.insertedAmount = insertedAmount;
    }
}
