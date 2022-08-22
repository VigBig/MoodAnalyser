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

    public String analyseMood() throws MoodAnalysisException{

        try {

            if (message == null || message.isEmpty()) {

                throw new MoodAnalysisException("Invalid Mood : Message is empty or NULL");

            }

            if (message.toLowerCase().contains("HAPPY".toLowerCase())) {

                return "HAPPY";

            } else if (message.toLowerCase().contains("SAD".toLowerCase())) {

                return "SAD";

            } else{

                return "No MOOD Detected";

            }

        }catch(MoodAnalysisException e){

            return "Invalid Mood";

        }


    }

    public static void main(String[] args){
        System.out.println("Welcome to the Mood Analyser Program :");

        try{

            System.out.println("Enter message:");
            String message = scanner.nextLine();
            MoodAnalyser moodAnalyser = new MoodAnalyser(message);
            System.out.println("State of MOOD found in message is : "+moodAnalyser.analyseMood());

        }catch(MoodAnalysisException e){
            System.out.println("Exception is Handled");
        }

        try{

            System.out.println("Testing by sending message as NULL :");
            MoodAnalyser moodAnalyser2 = new MoodAnalyser(null);
            System.out.println("State of MOOD found in message is : "+moodAnalyser2.analyseMood());

        }catch(MoodAnalysisException e){
            System.out.println("Exception is Handled");
        }

        try{

            System.out.println("Testing by sending message as EMPTY:");
            MoodAnalyser moodAnalyser3 = new MoodAnalyser("");
            System.out.println("State of MOOD found in message is : "+moodAnalyser3.analyseMood());

        }catch(MoodAnalysisException e){
            System.out.println("Exception is Handled");
        }

    }

}
