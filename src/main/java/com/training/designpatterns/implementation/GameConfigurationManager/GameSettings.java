package com.training.designpatterns.implementation.GameConfigurationManager;

public class GameSettings {
    // Step 1: Create the Singleton instance
    private static GameSettings instance;

    // Step 2: Private fields for settings
    private String resolution;
    private int soundVolume; // 0 to 100
    private String difficulty; // Easy, Medium, Hard

    // Step 3: Private constructor to prevent instantiation
    private GameSettings() {
        // Default settings
        this.resolution = "1920x1080";
        this.soundVolume = 50; // Default volume
        this.difficulty = "Medium"; // Default difficulty
    }

    // Step 4: Provide a thread-safe global access point
    public static GameSettings getInstance() {
        if (instance == null) {
            synchronized (GameSettings.class) {
                if (instance == null) {
                    instance = new GameSettings();
                }
            }
        }
        return instance;
    }

    // Getters and setters for settings
    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public int getSoundVolume() {
        return soundVolume;
    }

    public void setSoundVolume(int soundVolume) {
        this.soundVolume = Math.min(100, Math.max(0, soundVolume)); // Clamped
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    // Display settings
    public void showSettings() {
        System.out.println("Resolution: " + resolution);
        System.out.println("Sound Volume: " + soundVolume);
        System.out.println("Difficulty: " + difficulty);
    }
}
