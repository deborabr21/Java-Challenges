package com.entertainment;

public enum VolumeLevel {
    OFF (0),
    SOFT (25),
    MEDIUM (50),
    LOUD (75),
    MAX (100);

    private final int preset;

    VolumeLevel(int volume) {
        this.preset=volume;
    }

    public int getVolume() {
        return this.preset;
    }
}

