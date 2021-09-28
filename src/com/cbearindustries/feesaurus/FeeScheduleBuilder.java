package com.cbearindustries.feesaurus;

import java.util.TreeSet;

public interface FeeScheduleBuilder {
    // Populates a binary search tree with all valid lens attributes available for this plan.
    // Lens attributes are sorted within this tree in order of their ID. Search, add, and remove should all take O(log(n)).
     TreeSet<lensAttribute> buildPlanSchedule(String planID);
}
