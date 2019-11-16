package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestStudent {

    private Student student;
    private Double studyTime;

    @Before
    public void setUp(){
        student = new Student(Integer.MAX_VALUE, "Test Student");
        studyTime = 5d;
    }

    @Test
    public void testImplementation(){
        Assert.assertTrue(student instanceof Learner);
    }

    @Test
    public void testInheritance(){
        Assert.assertTrue((student instanceof Person));
    }

    @Test
    public void testLearn() {
        student.learn(studyTime);
        Assert.assertEquals(studyTime, student.getTotalStudyTime());
    }

}