package com.mps.app.bl.decorators;

import com.mps.app.bl.abstracts.AbstractBeverage;
import com.mps.app.bl.abstracts.AbstractDecorator;

/**
 * / Created by Mike Schwingenschloegl in Jul 2021
 */
public class MilkDecorator extends AbstractDecorator {

    AbstractBeverage beverage;

    public MilkDecorator(AbstractBeverage beverage) {

        this.beverage = beverage;
    }


    public AbstractBeverage getBeverage() {

        return beverage;
    }



    @Override
    public String getDescription() {

        return this.getBeverage().getDescription() + "Milch, ";
    }

    @Override
    public double cost() {

        return this.getBeverage().cost();
    }

    @Override
    public int getShotCounter() {

        return this.getBeverage().getShotCounter();
    }

    @Override
    public String getText() {

        return this.getBeverage().getText();
    }
}
