package com.mps.app.bl.beverages;

import com.mps.app.bl.abstracts.AbstractBeverage;
import com.mps.app.bl.abstracts.AbstractShot;

/**
 * / Created by Mike Schwingenschloegl in Jul 2021
 */
public class Schokolade extends AbstractBeverage {

    AbstractShot shot;

    public Schokolade(AbstractShot shot) {

        this.shot = shot;
    }

    public AbstractShot getShot() {

        return shot;
    }

    @Override
    public String getDescription() {

        return "Heiße Schokolade wird hergestellt aus: "+getShotCounter()+"x "+getText()+" + ";
    }

    @Override
    public double cost() {

        return 0.5;
    }

    @Override
    public int getShotCounter() {

        return this.shot.getShotCounter();
    }

    @Override
    public String getText() {

        return this.shot.getText();
    }
}
