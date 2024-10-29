/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.progpoepart2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author slule
 */
public class TaskTest {
    
    public TaskTest() {
    }
    
    @Test
    public void testGetTaskName() {
        Task task = new Task();
        task.setTaskName("Sample Task");
        assertEquals("Sample Task", task.getTaskName());
    }
    
    @Test
    public void testSetTaskName() {
        Task task = new Task();
        task.setTaskName("New Task");
        assertEquals("New Task", task.getTaskName());
    }
    
    @Test
    public void testGetTaskNumber() {
        Task task = new Task();
        task.setTaskNumber(1);
        assertEquals(1, task.getTaskNumber());
    }
    
    @Test
    public void testSetTaskNumber() {
        Task task = new Task();
        task.setTaskNumber(5);
        assertEquals(5, task.getTaskNumber());
    }

    @Test
    public void testGetTaskDescription() {
        Task task = new Task();
        task.setTaskDescription("Task Description");
        assertEquals("Task Description", task.getTaskDescription());
    }
    
    @Test
    public void testSetTaskDescription() {
        Task task = new Task();
        task.setTaskDescription("Updated Description");
        assertEquals("Updated Description", task.getTaskDescription());
    }
    
    @Test
    public void testGetDeveloperDetails() {
        Task task = new Task();
        task.setDeveloperDetails("Developer Name");
        assertEquals("Developer Name", task.getDeveloperDetails());
    }
    
    @Test
    public void testSetDeveloperDetails() {
        Task task = new Task();
        task.setDeveloperDetails("New Developer Name");
        assertEquals("New Developer Name", task.getDeveloperDetails());
    }
    
    @Test
    public void testGetTaskDuration() {
        Task task = new Task();
        task.setTaskDuration(10);
        assertEquals(10, task.getTaskDuration());
    }
    
    @Test
    public void testSetTaskDuration() {
        Task task = new Task();
        task.setTaskDuration(15);
        assertEquals(15, task.getTaskDuration());
    }
    
    @Test
    public void testGetTaskStatus() {
        Task task = new Task();
        task.setTaskStatus("To Do");
        assertEquals("To Do", task.getTaskStatus());
    }
    
    @Test
    public void testSetTaskStatus() {
        Task task = new Task();
        task.setTaskStatus("Done");
        assertEquals("Done", task.getTaskStatus());
    }
    
    @Test
    public void testCheckTaskDescriptionTask1() {
        Task task = new Task();
        final String actual = "Create Login to authenticate users";
        final String expected = "Task successfully captured";
        
        assertEquals(expected, task.checkTaskDescription(actual));
    }
    
    @Test
    public void testCheckTaskDescriptionTask2() {
        Task task = new Task();
        final String actual = "Create Add Task feature to add task users..............";
        final String expected = "Task successfully captured";
        
        assertEquals(expected, task.checkTaskDescription(actual));
    }
    
    @Test
    public void testCreateTaskIDTask1() {
        Task task = new Task();
        final String expected = "AD:1:BYN";
        assertEquals(expected, task.createTaskID("Login feature", 0, "Robyn Harrison"));
    }
    
    @Test
    public void testCreateTaskIDTask2() {
        Task task = new Task();
        final String expected = "CR:1:ARD";
        assertEquals(expected, task.createTaskID("Add Task Feature", 1, "Mike Smith"));
    }
    
    @Test
    public void testPrintTaskDetails() {
        Task task = new Task();
        task.setTaskName("Test Task");
        task.setTaskDescription("This is a test task");
        task.setTaskNumber(1);
        task.setDeveloperDetails("John Doe");
        task.setTaskDuration(5);
        task.setTaskStatus("In Progress");

        String expected = "Task Number: 1\nTask Name: Test Task\nDescription: This is a test task\nDeveloper: John Doe\nDuration: 5 hours\nStatus: In Progress";
        
    }
    
    @Test
    public void testReturnTotalHours() {
        Task task = new Task();
        task.setTaskDuration(10);
        
        // Simulating two tasks with durations 10 and 8 hours
        int totalHours = task.returnTotalHours(2, 10);
        totalHours += task.returnTotalHours(2, 8);

        final int expectedTotal = 10 + 8; // Expected total hours
        assertEquals(expectedTotal, totalHours);
    }
}
