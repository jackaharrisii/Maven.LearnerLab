package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class TestPeople {

    private Person testPerson;
    private Person otherPerson;
    private People people;

    //Can't be instantiated because People is now an abstract class
//    @Before
//    public void setUp() throws Exception {
//        testPerson = new Person(1,"Steve");
//        otherPerson = new Person(2,"Jimbo");
//        people = new People();
//        people.add(testPerson);
//    }
//
//    @Test
//    // tests add and contains
//    public void testAdd() {
//        people.add(otherPerson);
//        Assert.assertTrue(people.contains(otherPerson));
//    }
//
//    @Test
//    public void testFindById() {
//        Assert.assertEquals(testPerson, people.findById(1));
//    }
//
//    @Test
//    //remove by person
//    public void testRemove() {
//        people.remove(testPerson);
//        Assert.assertFalse(people.contains(testPerson));
//    }
//
//    @Test
//    //remove by id
//    public void testRemove2() {
//        people.add(otherPerson);
//        people.remove(2);
//        Assert.assertFalse(people.contains(otherPerson));
//    }
//
//    @Test
//    // removeAll and count
//    public void testRemoveAll() {
//        people.removeAll();
//        Assert.assertEquals(0,people.count(), 0.001);
//    }

}