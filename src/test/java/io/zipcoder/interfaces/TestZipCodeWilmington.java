package io.zipcoder.interfaces;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestZipCodeWilmington {

    private static final Students students = Students.getInstance();
    private static final Instructors instructors = Instructors.getInstance();
    private static final ZipCodeWilmington zcw = ZipCodeWilmington.getInstance();
    Instructor kris;

    @Before
    public void setUp() throws Exception {
        kris = new Instructor(1, "Kris");
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testGetInstance() {
    }

    @Test
    public void testHostLectureByTeacher() {
        zcw.hostLecture(kris, 70f);
        Assert.assertEquals(2, ((Learner)students.findById(1)).getTotalStudyTime(), 0.001);
    }

    @Test
    public void testHostLectureByID() {
        zcw.hostLecture(45, 70f);
        Assert.assertEquals(2, ((Learner)students.findById(1)).getTotalStudyTime(), 0.001);
    }

}