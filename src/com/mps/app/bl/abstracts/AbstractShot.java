package com.mps.app.bl.abstracts;

/**
 * / Created by Mike Schwingenschloegl in Jul 2021
 */
public abstract class AbstractShot {

    int shotCounter;
    final String text = "Shot ";

    public abstract int getShotCounter();

    public abstract String getText();
}
