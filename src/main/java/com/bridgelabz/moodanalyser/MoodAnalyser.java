package com.bridgelabz.moodanalyser;

import java.util.Scanner;

public class MoodAnalyser {

    static Scanner scanner = new Scanner(System.in);

    private String message;

    public MoodAnalyser(){

    }

    public MoodAnalyser(String message) {
        this.message = message;
    }

    public String analyseMood() {

        if (message.toLowerCase().contains("HAPPY".toLowerCase())){

            return "HAPPY";

        }else if(message.toLowerCase().contains("SAD".toLowerCase())){

            return "SAD";

        }else{

            return "No MOOD Detected";

        }

    }


    public static void main(String[] args) {
        System.out.println("Welcome to the Mood Analyser Program :");

        System.out.println("Enter message:");
        String message = scanner.nextLine();
        MoodAnalyser moodAnalyser = new MoodAnalyser(message);
        System.out.println("State of MOOD found in message is : "+moodAnalyser.analyseMood());

    }

}
