/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.poe_part1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author RC_Student_lab
 */
public class TasksTest {
    
    public TasksTest() {
    }
    
   
    @Test
    public void testCheckTaskDescription1() {
        System.out.println("checkTaskDescription");
        String taskDescription = "create login to authenticate user";
        Tasks instance = new Tasks();
        boolean expResult = true;
        boolean result = instance.checkTaskDescription(taskDescription);
        assertEquals(expResult, result);
        
    }
    @Test
    public void testCheckTaskDescriptio2() {
        System.out.println("checkTaskDescription");
        String taskDescription = "create Add Task feature to add task users";
        Tasks instance = new Tasks();
        boolean expResult = true;
        boolean result = instance.checkTaskDescription(taskDescription);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of createTaskID method, of class Tasks.
     */
    @Test
    public void testCreateTaskID1() {
        System.out.println("createTaskID");
        String taskname = "Login Feature";
        String DeveloperDetails = "Robyn Harrison";
        int TaskNumber = 0;
        Tasks instance = new Tasks();
        String expResult = "LO:0:SON";
        String result = instance.createTaskID(taskname, DeveloperDetails, TaskNumber);
        assertEquals(expResult, result);
       
    }
     @Test
    public void testCreateTaskID2() {
        System.out.println("createTaskID");
        String taskname = "Add Task Feature";
        String DeveloperDetails = "Mike Smith";
        int TaskNumber = 1;
        Tasks instance = new Tasks();
        String expResult = "AD:1:ITH";
        String result = instance.createTaskID(taskname, DeveloperDetails, TaskNumber);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of printTaskDetails method, of class Tasks.
     */
    @Test
    public void testPrintTaskDetails1() {
        System.out.println("printTaskDetails");
        String taskname = "Login Feature";
        String DeveloperDetails = "Robyn Harrison";
        int TaskDetails = 0;
        String status ="Doing";
        int duration=10;
        Tasks instance = new Tasks();
       String expResult = taskname+" "+DeveloperDetails+" "+status+" "+duration+" "+TaskDetails;
        String result = instance.printTaskDetails(TaskDetails);
        assertEquals(expResult, result);
        
    }
    @Test
    public void testPrintTaskDetails2() {
        System.out.println("printTaskDetails");
        String taskname = "Add Task Feature";
        String DeveloperDetails = "Mike Smith";
        String status ="To Do";
        int duration=8;
        int TaskDetails = 1;
        Tasks instance = new Tasks();
        String expResult = taskname+" "+DeveloperDetails+" "+status+" "+duration+" "+TaskDetails;
        String result = instance.printTaskDetails(TaskDetails);
        assertEquals(expResult, result);
       
    }
}
