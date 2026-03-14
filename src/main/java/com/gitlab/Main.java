package com.gitlab;

/**
 * Main Java file for Git Version Control Lab
 * 
 * This file is used to demonstrate Git operations:
 * - Initial commit
 * - Branch creation (feature-update, bug-fix)
 * - Merge operations
 * - Conflict resolution
 */
public class Main {

    // Version tracked via Git branches
    private static final String VERSION = "1.0.0";
    private static final String APP_NAME = "Git Lab Demo";

    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("  " + APP_NAME + " v" + VERSION);
        System.out.println("========================================");
        System.out.println("Git Version Control Lab - Task Runner");
        System.out.println();

        // Task 1: Initialize Git
        System.out.println("[Task 1] Git initialized with user config");

        // Task 2: Files created and staged
        System.out.println("[Task 2] main.java and notes.txt created & staged");

        // Task 3: Initial commit
        System.out.println("[Task 3] Initial commit made");

        // Task 4: Remote pushed
        System.out.println("[Task 4] Pushed to GitHub remote");

        // Task 5: Feature branch
        System.out.println("[Task 5] feature-update branch created & committed");

        // Task 6: Bug-fix branch
        System.out.println("[Task 6] bug-fix branch created & committed");

        // Task 7 & 8: Merge
        System.out.println("[Task 7] Branches merged into main");
        System.out.println("[Task 8] Conflicts resolved (if any)");

        System.out.println();
        System.out.println("Lab Complete!");
    }

    /**
     * Feature added in the feature-update branch
     * Demonstrates: git checkout -b feature-update
     */
    public static String getFeatureMessage() {
        // <<< HEAD (main branch version)
        return "Hello from Main Branch!";
        // === conflict separator would appear here during merge conflict
        // return "Hello from Feature Branch!";
        // >>> feature-update
    }

    /**
     * Bug fix applied in the bug-fix branch
     * Demonstrates: git checkout -b bug-fix
     */
    public static int calculateSum(int a, int b) {
        // Fixed bug: was returning a - b instead of a + b
        return a + b;
    }
}
