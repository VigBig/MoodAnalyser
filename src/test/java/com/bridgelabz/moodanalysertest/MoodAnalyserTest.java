package com.bridgelabz.moodanalysertest;

import com.bridgelabz.moodanalyser.MoodAnalyser;
import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MoodAnalyserTest {

    @Test
    public void testHAPPYMood() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I cleared my exams. I am very hApPy!!!");
        String actual = moodAnalyser.analyseMood();
        assertEquals("test HAPPY MOOD pass","HAPPY",actual);
    }

    @Test
    public void testSADMood() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("My dog passed away recently, due to which I am saD.");
        String actual = moodAnalyser.analyseMood();
        assertEquals("test SAD MOOD pass","SAD",actual);
    }

    @Test
    public void testNOMood() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("Ok, so the flight has been postponed.");
        String actual = moodAnalyser.analyseMood();
        assertEquals("test NO MOOD pass","No MOOD Detected",actual);
    }

    @Test
    public void testNULLMood() {
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        String actual = moodAnalyser.analyseMood();
        assertEquals("test NULL MOOD pass","HAPPY",actual);
    }

}
