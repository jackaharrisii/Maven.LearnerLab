package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestInstructor {

    private Instructor instructor;
    private Student student;
    private Student student2;
    private Student[] students;

    @Before
    public void setUp() throws Exception {
        instructor = new Instructor(1, "Test Instructor");
        student = new Student(2, "Test Student");
        student2 = new Student(3, "Other Student");
        students = new Student[]{student, student2};
    }

    @Test
    public void testImplementation(){
        Assert.assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void testInheritance(){
        Assert.assertTrue(instructor instanceof Person);
    }

    @Test
    public void testTeach() {
        instructor.teach(student, 5d);
        Assert.assertEquals(5d, student.getTotalStudyTime(), 0.001);
    }

    @Test
    public void testLecture() {
        instructor.lecture(students,10);
        Assert.assertEquals(5d, student.getTotalStudyTime(), 0.001);
        Assert.assertEquals(5d, student2.getTotalStudyTime(), 0.001);
    }
}