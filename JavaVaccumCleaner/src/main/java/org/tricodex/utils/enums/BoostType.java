package org.tricodex.utils.enums;

public enum BoostType {
    SPEED("Speed"),
    BATTERY_LEVEL("Battery Level"),
    BATTERY_MAX("Battery Max"),
    VACUUM_CAPACITY("Vacuum Capacity");

    private final String displayName;

    BoostType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}