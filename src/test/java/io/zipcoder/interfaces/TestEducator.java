package io.zipcoder.interfaces;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestEducator {

    private Student student;
    private Student student2;
    private Student[] students;

    @Before
    public void setUp() throws Exception {
        student = new Student(1, "John");
        student2 = new Student(2, "Jim");
        students = new Student[]{student, student2};
    }

    @After
    public void tearDown() throws Exception {
        for(Student coder : Students.getInstance()){
            coder.forget();
        }
    }

    @Test
    public void testGetID() {
        Assert.assertEquals(41, Educator.YOUNGER.getID(), 0.0001);
    }

    @Test
    public void testGetName() {
        Assert.assertEquals("Kris Younger", Educator.YOUNGER.getName());
    }

    @Test
    public void testGetTimeWorked() {
    }

    @Test
    public void testTeach() {
        Educator.YOUNGER.teach(student,5);
        Assert.assertEquals(5, Educator.YOUNGER.getTimeWorked(),0.0001);
        Assert.assertEquals(5,student.getTotalStudyTime(),0.0001);
    }

    @Test
    public void testLecture() {
        Educator.SLEUTH.lecture(students,5);
        Assert.assertEquals(5,Educator.SLEUTH.getTimeWorked(),0.0001);
        Assert.assertEquals(2.5,student.getTotalStudyTime(),0.0001);
        Assert.assertEquals(2.5,student2.getTotalStudyTime(),0.0001);
    }
}