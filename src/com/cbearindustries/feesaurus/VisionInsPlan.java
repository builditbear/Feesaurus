package com.cbearindustries.feesaurus;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class VisionInsPlan {
    private int examCopay;
    private int materialCopay;
    // If the plan doesn't renew by calendar year, it renews by DoS (Date of Service).
    private boolean renewsByCalYr;
    // The renewal frequencies are listed in order of Exam, Lenses, then Frame.
    private ArrayList<Integer> benefitFrequencies;
    // Can be used to look up whether a lens enhancement is covered under this plan. Return true if so, and false otherwise.
    private HashMap<LensAttribute, Boolean> attributeIsCovered;
}
