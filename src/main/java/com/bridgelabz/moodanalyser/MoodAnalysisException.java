package com.bridgelabz.moodanalyser;

public class MoodAnalysisException extends Exception {
    String message;

    public MoodAnalysisException(String message) {
        super(message);
    }
}