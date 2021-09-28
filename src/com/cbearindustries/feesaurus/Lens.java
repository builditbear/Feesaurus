package com.cbearindustries.feesaurus;

import java.util.ArrayList;

public class Lens {
    private EgRx prescription;
    private LensAttribute type;
    private LensAttribute material;
    private LensAttribute coating;
    private ArrayList<LensAttribute> tint;
    private ArrayList<LensAttribute> miscAttributes;
    // Fewer attributes are available for glass lenses, and they are generally more expensive, though they share
    // the same codes and qualities otherwise.
    private boolean isGlass;

    public Lens(EgRx prescription, LensAttribute type, LensAttribute material, LensAttribute coating,
                ArrayList<LensAttribute> tint, ArrayList<LensAttribute> miscAttributes) {
        this.prescription = prescription;
        this.type = type;
        this.material = material;
        this.coating = coating;
        this.tint = tint;
        this.miscAttributes = miscAttributes;
    }

    public EgRx getPrescription() {
        return prescription;
    }

    public void setPrescription(EgRx prescription) {
        this.prescription = prescription;
    }

    public LensAttribute getType() {
        return type;
    }

    public void setType(LensAttribute type) {
        this.type = type;
    }

    public LensAttribute getMaterial() {
        return material;
    }

    public void setMaterial(LensAttribute material) {
        this.material = material;
    }

    public LensAttribute getCoating() {
        return coating;
    }

    public void setCoating(LensAttribute coating) {
        this.coating = coating;
    }

    public ArrayList<LensAttribute> getTint() {
        return tint;
    }

    public void setTint(ArrayList<LensAttribute> tint) {
        this.tint = tint;
    }

    public ArrayList<LensAttribute> getMiscAttributes() {
        return miscAttributes;
    }

    public void setMiscAttributes(ArrayList<LensAttribute> miscAttributes) {
        this.miscAttributes = miscAttributes;
    }

    public boolean isGlass() {
        return isGlass;
    }

    public void setGlass(boolean glass) {
        isGlass = glass;
    }
}
