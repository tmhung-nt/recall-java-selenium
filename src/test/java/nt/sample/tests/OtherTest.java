package nt.sample.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class OtherTest {
    @Test
    public void div(){
        System.out.println("DIV");
        int a = 10;
        int b = 20;
        Assert.assertEquals(2, b/a);
    }

    @Test
    public void multi(){
        System.out.println("MULTI");
        int a = 10;
        int b = 20;
        Assert.assertEquals(200, b*a);
    }
}
