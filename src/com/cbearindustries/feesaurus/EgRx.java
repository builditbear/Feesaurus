package com.cbearindustries.feesaurus;

public class EgRx {
    private double rightSphere;
    private double rightCylinder;
    private double rightAxis;
    private double rightPrism;

    private double leftSphere;
    private double leftCylinder;
    private double leftAxis;
    private double leftPrism;

    private double addPower;

    public EgRx(double rightSphere, double rightCylinder, double rightAxis, double rightPrism,
                double leftSphere, double leftCylinder, double leftAxis, double leftPrism, double addPower) {
        this.rightSphere = rightSphere;
        this.rightCylinder = rightCylinder;
        this.rightAxis = rightAxis;
        this.rightPrism = rightPrism;

        this.leftSphere = leftSphere;
        this.leftCylinder = leftCylinder;
        this.leftAxis = leftAxis;
        this.leftPrism = leftPrism;

        this.addPower = addPower;
    }

    public void print(EgRxPrinter printer, boolean printInPlus){
        if(printInPlus){
            printer.printPlusCylinder(this);
        }else{
            printer.printMinusCylinder(this);
        }
    }
}
