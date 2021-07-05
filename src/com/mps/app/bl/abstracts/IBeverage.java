package com.mps.app.bl.abstracts;

/**
 * / Created by Mike Schwingenschloegl in Jul 2021
 */
public interface IBeverage {

    String description = "Unspecified Beverage";

    String getDescription();

    double cost();


}
