package com.linhtest.firstpackage;

import org.testng.annotations.Test;

public class SecondClass {
    @Test(groups = "smoke")
    public void firstTest(){
        System.out.println("2.First test method ");
    }
    @Test
    public void secondTest(){
        System.out.println("2. Seconde test method");
    }
}
