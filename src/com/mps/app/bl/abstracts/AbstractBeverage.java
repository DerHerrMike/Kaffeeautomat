package com.mps.app.bl.abstracts;

/**
 * / Created by Mike Schwingenschloegl in Jul 2021
 */
public abstract class AbstractBeverage extends AbstractShot implements IBeverage {

    AbstractShot shot;

    public AbstractShot getShot() {

        return shot;
    }
}
