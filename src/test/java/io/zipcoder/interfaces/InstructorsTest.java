package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class InstructorsTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void getInstance() {
        Assert.assertEquals("Kris Younger", Instructors.getInstance().findById(41).getName());
        Assert.assertEquals("Dolio Durant", Instructors.getInstance().findById(42).getName());
        Assert.assertEquals("Roberto DeDeus", Instructors.getInstance().findById(43).getName());
        Assert.assertEquals("Froilan Miranda", Instructors.getInstance().findById(44).getName());
        Assert.assertEquals("Christopher Nobles", Instructors.getInstance().findById(45).getName());
    }
}