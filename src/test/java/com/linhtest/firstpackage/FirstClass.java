package com.linhtest.firstpackage;

import java.time.LocalDateTime;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class FirstClass {


    @BeforeClass
    public void beforeClass(){
        System.out.println("Before class: Chay truoc tat ca test trong class");
    }

    @BeforeGroups({"smoke","regression"} )
    public void beforeGroup(){
        System.out.println("Before group: Chay truoc khi run test thuoc group");
    }

    @Test(groups = {"smoke", "regression"})
    public void firstTest() {
        System.out.println("First test method");
    }

    @Test
    public void secondTest() {
        System.out.println("Second test method");

        // Ví dụ trong một phương thức:
        System.out.println("Current time: " + LocalDateTime.now());
    }

    @Test(groups = {"smoke"})
    public void thirdTest() {
        System.out.println("Third test method");
    }

    @Test(groups = "regression")
    public void fourthTest() {
        System.out.println("Fourth test method");
    }
}
