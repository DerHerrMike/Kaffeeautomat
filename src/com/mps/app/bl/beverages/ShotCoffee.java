package com.mps.app.bl.beverages;

import com.mps.app.bl.abstracts.AbstractShot;

/**
 * / Created by Mike Schwingenschloegl in Jul 2021
 */
public class ShotCoffee extends AbstractShot {

    int shotCounter;
    final String text = "Shot frisch gerösteter Kaffee";

    public ShotCoffee(int shotCounter) {

        this.shotCounter = shotCounter;
    }

    public String getText() {

        return text;
    }

    @Override
    public int getShotCounter() {

        return this.shotCounter;
    }


}
