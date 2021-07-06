package com.mps.app;

import com.mps.app.bl.abstracts.AbstractBeverage;
import com.mps.app.bl.factory.BeverageFactory;

import java.util.ArrayList;
import java.util.List;
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

    public void makePayment() {

        System.out.println();
        System.out.println("Bitte Münzen einwerfen:");
        System.out.println();
        System.out.println("Eingeworfener Betrag (double): ");
        double inserted = scanner.nextDouble();
        scanner.nextLine();
        inserted = Math.round(100.0 * inserted) / 100.0;
        while (inserted < 0.5) {
            System.out.println("Bitte weitere Münzen einwerfen (min. 50 Cent)!");
            System.out.println("Weiterer eingeworfener Betrag: ");
            inserted = inserted + scanner.nextDouble();
            scanner.nextLine();
        }
        setInsertedAmount(inserted);
    }

    public void placeOrder() {

        System.out.println();
        List<String> available = new ArrayList<>();
        available.add("Espresso");
        available.add("Kaffee Schwarz");
        available.add("Kleiner Brauner");
        available.add("Großer Brauner");
        available.add("Cappuccino");
        available.add("Latte");
        available.add("Heiße Schoko");
        available.add("Irish Coffee");

        if (getInsertedAmount() <= 0.59) {

            while (true) {
                String selectedBeverage;
                System.out.println("Folgende Produkte können gekauft werden:");
                System.out.println("****************************************");
                System.out.println("Espresso");
                System.out.println("Kaffee Schwarz");
                System.out.println("Kleiner Brauner");
                System.out.println("Großer Brauner");
                System.out.println("Cappuccino");
                System.out.println("Latte");
                System.out.println("Heiße Schoko");
                System.out.println("****************************************");
                System.out.println();
                System.out.println("Bitte geben Sie den gewünschten Produktnamen ein: ");
                selectedBeverage = scanner.nextLine();
                if (available.contains(selectedBeverage)) {
                    System.out.println("Ihre Bestellung wird zubereitet...");
                    System.out.println();
                    setOrderBeverage(selectedBeverage);
                    break;
                } else {
                    System.out.println();
                    System.out.println("Bitte treffen Sie eine gültige Auswahl!");
                    System.out.println();
                }
            }


        } else if (getInsertedAmount() >= 0.6) {
            while (true) {
                String selectedBeverage;

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
                selectedBeverage = scanner.nextLine();
                if (available.contains(selectedBeverage)) {
                    System.out.println();
                    System.out.println("Ihre Bestellung wird zubereitet...");
                    setOrderBeverage(selectedBeverage);
                    break;
                } else {
                    System.out.println();
                    System.out.println("Bitte treffen Sie eine gültige Auswahl!");
                    System.out.println();
                }

            }
        }
    }

    public String getOrderBeverage() {

        return orderBeverage;
    }

    public void setOrderBeverage(String orderBeverage) {

        this.orderBeverage = orderBeverage;
    }

    public double getInsertedAmount() {

        return insertedAmount;
    }

    public void setInsertedAmount(double insertedAmount) {

        this.insertedAmount = insertedAmount;
    }
}
