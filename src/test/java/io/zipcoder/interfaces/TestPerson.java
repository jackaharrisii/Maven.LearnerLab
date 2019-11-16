package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestPerson {

    private Person testPerson;
    private long expectedID;
    private String expectedName;

    @Before
    public void setUp() {
        expectedID = Long.MAX_VALUE;
        expectedName = "PersonName";
        testPerson = new Person(expectedID, expectedName);
    }

    @Test
    public void testConstructor(){

        long actualID = testPerson.getId();
        String actualName = testPerson.getName();

        Assert.assertEquals(expectedID, actualID);
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testSetName(){
        testPerson.setName("Leon");
        Assert.assertEquals("Leon", testPerson.getName());
    }

}
