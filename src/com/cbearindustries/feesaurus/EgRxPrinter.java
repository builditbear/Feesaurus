package com.cbearindustries.feesaurus;

// Defines the basic functions any class capable of printing an eyeglass prescription must employ.
// Intended to provide flexible and easily interchangeable outputs for this data.
public interface EgRxPrinter {
    void printMinusCylinder(EgRx prescription);
    void printPlusCylinder(EgRx prescription);
}
