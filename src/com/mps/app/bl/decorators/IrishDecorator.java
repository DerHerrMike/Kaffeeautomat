package com.mps.app.bl.decorators;

import com.mps.app.bl.abstracts.AbstractBeverage;
import com.mps.app.bl.abstracts.AbstractDecorator;

/**
 * / Created by Mike Schwingenschloegl in Jul 2021
 */
public class IrishDecorator extends AbstractDecorator {

    AbstractBeverage beverage;

    public IrishDecorator(AbstractBeverage beverage) {

        this.beverage = beverage;
    }

    public AbstractBeverage getBeverage() {

        return beverage;
    }

    @Override
    public int getShotCounter() {

        return this.getBeverage().getShotCounter();
    }

    @Override
    public String getText() {

        return this.getBeverage().getText();
    }

    @Override
    public String getDescription() {

        return  this.getBeverage().getDescription() + "Baileys Sirup, ";
    }

    @Override
    public double cost() {

        return this.getBeverage().cost()+0.1;
    }
}
