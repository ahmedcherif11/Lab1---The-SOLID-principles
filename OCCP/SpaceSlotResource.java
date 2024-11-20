package com.directi.training.ocp.exercise;

public class SpaceSlotResource implements Resource {
    @Override
    public int allocate() {
        int resourceId = findFreeSpaceSlot();
        markSpaceSlotBusy(resourceId);
        return resourceId;
    }

    @Override
    public void free(int resourceId) {
        markSpaceSlotFree(resourceId);
    }

    private int findFreeSpaceSlot() {
        return 0; // Implémentation spécifique
    }

    private void markSpaceSlotBusy(int resourceId) {
        // Implémentation spécifique
    }

    private void markSpaceSlotFree(int resourceId) {
        // Implémentation spécifique
    }
}