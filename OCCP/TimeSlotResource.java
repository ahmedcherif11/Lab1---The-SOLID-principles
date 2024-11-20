package com.directi.training.ocp.exercise;

public class TimeSlotResource implements Resource {
    @Override
    public int allocate() {
        int resourceId = findFreeTimeSlot();
        markTimeSlotBusy(resourceId);
        return resourceId;
    }

    @Override
    public void free(int resourceId) {
        markTimeSlotFree(resourceId);
    }

    private int findFreeTimeSlot() {
        return 0; // Implémentation spécifique
    }

    private void markTimeSlotBusy(int resourceId) {
        // Implémentation spécifique
    }

    private void markTimeSlotFree(int resourceId) {
        // Implémentation spécifique
    }
}