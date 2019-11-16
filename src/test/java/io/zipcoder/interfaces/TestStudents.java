package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestStudents {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void getInstance() {
        Assert.assertEquals("Christopher Santana", Students.getInstance().findById(1).getName());
        Assert.assertEquals("Rashmi Paranjape", Students.getInstance().findById(2).getName());
        Assert.assertEquals("Kendra Ng", Students.getInstance().findById(3).getName());
        Assert.assertEquals("Aashna Bajwa", Students.getInstance().findById(4).getName());
        Assert.assertEquals("Michael Doll", Students.getInstance().findById(5).getName());
        Assert.assertEquals("Joshua Gates", Students.getInstance().findById(6).getName());
        Assert.assertEquals("Angel Mendoza", Students.getInstance().findById(7).getName());
        Assert.assertEquals("Julia Evans", Students.getInstance().findById(8).getName());
        Assert.assertEquals("Miral Doshi", Students.getInstance().findById(9).getName());
        Assert.assertEquals("Michael King", Students.getInstance().findById(10).getName());
        Assert.assertEquals("Maira Botelho", Students.getInstance().findById(11).getName());
        Assert.assertEquals("Ryan Miller", Students.getInstance().findById(12).getName());
        Assert.assertEquals("Brandon Chambers", Students.getInstance().findById(13).getName());
        Assert.assertEquals("Kwame Warrick", Students.getInstance().findById(14).getName());
        Assert.assertEquals("Brian Patterson", Students.getInstance().findById(15).getName());
        Assert.assertEquals("John Tokhi", Students.getInstance().findById(16).getName());
        Assert.assertEquals("Valentin Gheorghe", Students.getInstance().findById(17).getName());
        Assert.assertEquals("Kane Kopetski", Students.getInstance().findById(18).getName());
        Assert.assertEquals("Grace Bunde", Students.getInstance().findById(19).getName());
        Assert.assertEquals("Eddie Morales", Students.getInstance().findById(20).getName());
        Assert.assertEquals("Charlotte Beale", Students.getInstance().findById(21).getName());
        Assert.assertEquals("Emmanuel Etumadu", Students.getInstance().findById(22).getName());
        Assert.assertEquals("Valerie Fragier", Students.getInstance().findById(23).getName());
        Assert.assertEquals("Chung Arguello", Students.getInstance().findById(24).getName());
        Assert.assertEquals("Sandy Pham", Students.getInstance().findById(25).getName());
        Assert.assertEquals("Leland Schoenbeck", Students.getInstance().findById(26).getName());
        Assert.assertEquals("Ronald Duwell", Students.getInstance().findById(27).getName());
        Assert.assertEquals("Benjamin Coon", Students.getInstance().findById(28).getName());
        Assert.assertEquals("Mike Gray", Students.getInstance().findById(29).getName());
        Assert.assertEquals("Usha Kunapareddy", Students.getInstance().findById(30).getName());
        Assert.assertEquals("Kaila Shields", Students.getInstance().findById(31).getName());
        Assert.assertEquals("David Trombello", Students.getInstance().findById(32).getName());
        Assert.assertEquals("Jack Harris", Students.getInstance().findById(33).getName());
        Assert.assertEquals("Kievina Haynes", Students.getInstance().findById(34).getName());
        Assert.assertEquals("Wesley Jones", Students.getInstance().findById(35).getName());
    }

}