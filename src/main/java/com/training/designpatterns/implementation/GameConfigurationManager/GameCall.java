package com.training.designpatterns.implementation.GameConfigurationManager;

public class GameCall {
    public static void main(String[] args) {
        // Access the Singleton instance
        GameSettings settings = GameSettings.getInstance();

        // Display default settings
        System.out.println("Default Game Settings:");
        settings.showSettings();

        // Update settings
        settings.setResolution("2560x1440");
        settings.setSoundVolume(75);
        settings.setDifficulty("Hard");

        // Display updated settings
        System.out.println("\nUpdated Game Settings:");
        settings.showSettings();

        // Ensure Singleton behavior
        GameSettings anotherSettingsReference = GameSettings.getInstance();
        System.out.println("\nAre both references the same? " + (settings == anotherSettingsReference));
    }
}
