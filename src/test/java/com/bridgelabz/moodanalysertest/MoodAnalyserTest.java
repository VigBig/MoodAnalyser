package com.bridgelabz.moodanalysertest;

import com.bridgelabz.moodanalyser.MoodAnalyser;
import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MoodAnalyserTest {

    @Test
    public void testHAPPYMood() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String actual = moodAnalyser.analyseMood("I cleared my exams. I am very happy!!!");
        assertEquals("test HAPPY MOOD pass","HAPPY",actual);
    }

    @Test
    public void testSADMood() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String actual = moodAnalyser.analyseMood("My dog passed away recently, due to which I am saD.");
        assertEquals("test SAD MOOD pass","SAD",actual);
    }

    @Test
    public void testNOMood() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String actual = moodAnalyser.analyseMood("Ok, so the flight has been postponed.");
        assertEquals("test NO MOOD pass","No MOOD Detected",actual);
    }

}