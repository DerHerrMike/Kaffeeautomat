package com.mps.app.bl.factory;

import com.mps.app.bl.beverages.*;
import com.mps.app.bl.abstracts.AbstractBeverage;
import com.mps.app.bl.abstracts.AbstractShot;
import com.mps.app.bl.decorators.IrishDecorator;
import com.mps.app.bl.decorators.MilkDecorator;
import com.mps.app.bl.decorators.SugarDecorator;
import com.mps.app.bl.decorators.WaterDecorator;

/**
 * / Created by Mike Schwingenschloegl in Jul 2021
 */
public class BeverageFactory {

    AbstractShot oneCoffeeShot = new ShotCoffee(1);
    AbstractShot twoCoffeeShot = new ShotCoffee(2);
    AbstractShot chocolateShot = new ShotChocolate(1);


    public AbstractBeverage createBeverage(String type, boolean sugar) {

        if (type == null) {
            return null;
        }
        if (type.equalsIgnoreCase("Großer Brauner")) {
            AbstractBeverage grosserBrauner = new GrosserBrauner(twoCoffeeShot);
            grosserBrauner = new WaterDecorator(grosserBrauner);
            grosserBrauner = new MilkDecorator(grosserBrauner);
            grosserBrauner = new MilkDecorator(grosserBrauner);
            grosserBrauner = new SugarDecorator(grosserBrauner);
            return grosserBrauner;
        } else if (type.equalsIgnoreCase("Heiße Schoko")) {
            AbstractBeverage schoko = new Schokolade(chocolateShot);
            schoko = new WaterDecorator(schoko);
            schoko = new WaterDecorator(schoko);
            schoko = new MilkDecorator(schoko);
            schoko = new SugarDecorator(schoko);
            return schoko;
        }   else if (type.equalsIgnoreCase("Kleiner Brauner")){
            AbstractBeverage kleinerBrauner = new KleinerBrauner(oneCoffeeShot);
            kleinerBrauner = new WaterDecorator(kleinerBrauner);
            kleinerBrauner = new MilkDecorator(kleinerBrauner);
            kleinerBrauner = new SugarDecorator(kleinerBrauner);
            return kleinerBrauner;
        }   else if (type.equalsIgnoreCase("Espresso")){
            AbstractBeverage espresso = new Espresso(oneCoffeeShot);
            espresso = new WaterDecorator(espresso);
            espresso = new SugarDecorator(espresso);
            return espresso;
        }   else if (type.equalsIgnoreCase("Kaffee Schwarz")){
            AbstractBeverage kaffeeSchwarz = new KaffeeSchwarz(oneCoffeeShot);
            kaffeeSchwarz = new WaterDecorator(kaffeeSchwarz);
            kaffeeSchwarz = new WaterDecorator(kaffeeSchwarz);
            kaffeeSchwarz = new WaterDecorator(kaffeeSchwarz);
            kaffeeSchwarz = new SugarDecorator(kaffeeSchwarz);
            return kaffeeSchwarz;
        }   else if (type.equalsIgnoreCase(("Cappuccino"))|| (type.equalsIgnoreCase("Capuccino")|| (type.equalsIgnoreCase("Cappucino")))){
            AbstractBeverage cappuccino = new Cappuccino(oneCoffeeShot);
            cappuccino = new WaterDecorator(cappuccino);
            cappuccino = new WaterDecorator(cappuccino);
            cappuccino = new MilkDecorator(cappuccino);
            cappuccino = new MilkDecorator(cappuccino);
            cappuccino = new SugarDecorator(cappuccino);
            return cappuccino;
        }   else if (type.equalsIgnoreCase("Latte")){
            AbstractBeverage latte = new Latte(oneCoffeeShot);
            latte = new WaterDecorator(latte);
            latte = new MilkDecorator(latte);
            latte = new MilkDecorator(latte);
            latte = new MilkDecorator(latte);
            latte = new SugarDecorator(latte);
            return latte;
        }   else if (type.equalsIgnoreCase("Irish Coffee")){
            AbstractBeverage irish = new IrishCoffee(oneCoffeeShot);
            irish = new WaterDecorator(irish);
            irish = new WaterDecorator(irish);
            irish = new MilkDecorator(irish);
            irish = new MilkDecorator(irish);
            irish = new IrishDecorator(irish);
            irish = new SugarDecorator(irish);
            return irish;
        }
        return null;
    }

    public AbstractShot getOneCoffeeShot() {

        return oneCoffeeShot;
    }

    public AbstractShot getTwoCoffeeShot() {

        return twoCoffeeShot;
    }

    public AbstractShot getChocolateShot() {

        return chocolateShot;
    }
}
