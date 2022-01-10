package com.bridgelabz.exception;

public class MoodAnalyzer {

    String message;

    public MoodAnalyzer(String message) {

        this.message = message;
    }

    public String analyzeMood(String message) throws MoodAnalysisException {

        this.message = message;

        return analyzeMood();

    }

    public String analyzeMood() throws MoodAnalysisException {

        try {

            if (message.length() == 0) {

                throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_EMPTY, "please enter proper message");

            }

            if (message.contains("sad")) {

                return "SAD";

            }

            return "HAPPY";
        }

        catch (NullPointerException e) {

            throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_NULL, "please enter proper message");

        }
    }
}
