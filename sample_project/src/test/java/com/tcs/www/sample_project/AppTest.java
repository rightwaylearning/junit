package com.tcs.www.sample_project;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void getMessageTestOutPut()
    {
    	App app= new App();
    	String output = app.getMessage("mahesh");
        Assert.assertEquals("hello mahesh", output);
    }
    
    @Test
    public void testNullInput() {
    	App app= new App();
    	String output = app.getMessage(null);
        Assert.assertEquals(null, output);
    }
}
