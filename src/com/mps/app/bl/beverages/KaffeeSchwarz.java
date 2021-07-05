package com.mps.app.bl.beverages;

import com.mps.app.bl.abstracts.AbstractBeverage;
import com.mps.app.bl.abstracts.AbstractShot;

/**
 * / Created by Mike Schwingenschloegl in Jul 2021
 */
public class KaffeeSchwarz extends AbstractBeverage {

    AbstractShot shot;

    public KaffeeSchwarz(AbstractShot shot) {

        this.shot = shot;
    }

    @Override
    public AbstractShot getShot() {

        return this.shot;
    }

    @Override
    public int getShotCounter() {

        return this.shot.getShotCounter();
    }

    @Override
    public String getText() {

        return this.shot.getText();
    }

    @Override
    public String getDescription() {

        return "Kaffee Schwarz wird hergestellt aus: "+getShotCounter()+"x "+getText()+" + ";
    }

    @Override
    public double cost() {

        return 0.5;
    }
}
