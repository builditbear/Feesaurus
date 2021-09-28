package com.cbearindustries.feesaurus;

import java.util.ArrayList;

public class Lens {
    private egRx prescription;
    private lensAttribute type;
    private lensAttribute material;
    private lensAttribute coating;
    private ArrayList<lensAttribute> tint;
    private ArrayList<lensAttribute> miscAttributes;
    // Fewer attributes are available for glass lenses, and they are generally more expensive, though they share
    // the same codes and qualities otherwise.
    private boolean isGlass;

    public Lens(egRx prescription, lensAttribute type, lensAttribute material, lensAttribute coating,
                lensAttribute tint, ArrayList<lensAttribute> miscAttributes) {
        this.prescription = prescription;
        this.type = type;
        this.material = material;
        this.coating = coating;
        this.tint = tint;
        this.miscAttributes = miscAttributes;
    }

    public egRx getPrescription() {
        return prescription;
    }

    public void setPrescription(egRx prescription) {
        this.prescription = prescription;
    }

    public lensAttribute getType() {
        return type;
    }

    public void setType(lensAttribute type) {
        this.type = type;
    }

    public lensAttribute getMaterial() {
        return material;
    }

    public void setMaterial(lensAttribute material) {
        this.material = material;
    }

    public lensAttribute getCoating() {
        return coating;
    }

    public void setCoating(lensAttribute coating) {
        this.coating = coating;
    }

    public ArrayList<lensAttribute> getTint() {
        return tint;
    }

    public void setTint(ArrayList<lensAttribute> tint) {
        this.tint = tint;
    }

    public ArrayList<lensAttribute> getMiscAttributes() {
        return miscAttributes;
    }

    public void setMiscAttributes(ArrayList<lensAttribute> miscAttributes) {
        this.miscAttributes = miscAttributes;
    }

    public boolean isGlass() {
        return isGlass;
    }

    public void setGlass(boolean glass) {
        isGlass = glass;
    }
}
