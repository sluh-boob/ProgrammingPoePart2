/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.progpoepart2;

import javax.swing.JOptionPane;

/**
 *
 * @author slule
 */
public class Task {
    private String taskName;
    private int taskNumber;
    private String taskDescription;
    private String developerDetails;
    private int taskDuration;
    private String taskStatus;
    private int total;
    
    public Task() {
        this.total = 0;
    }
    
    public String getTaskName() {
        return this.taskName;
    }
        
     public void setTaskName( String taskName) {
         this.taskName = taskName;
    }
        
    public int getTaskNumber() {
        return this.taskNumber;
    }
    
    public void setTaskNumber( int taskNumber) {
       this.taskNumber = taskNumber;
   }
   
   public String getTaskDescription() {
       return this.taskDescription;
   }
   
   public void setTaskDescription( String taskDescription) {
       this.taskDescription = taskDescription;
   }
   
   public String getDeveloperDetails() {
       return this.developerDetails;
   }
   
   public void setDeveloperDetails( String developerDetails) {
       this.developerDetails = developerDetails;
   }
    
   public int getTaskDuration() {
       return this.taskDuration;
   }
   
   public void setTaskDuration(int taskDuration) {
       this.taskDuration = taskDuration;
   }
    
   public String getTaskStatus() {
       return this.taskStatus;
   }

   public void setTaskStatus(final String taskStatus) {
       this.taskStatus = taskStatus;
   }
   
   public int getTotal() {
       return this.total;
   }
   
   public boolean checkTaskDescription( String taskDescription) {
       int description = taskDescription.length();
      
       return description<=50;
   }
   
     public String createTaskID(String taskName, int taskNumber, String developer) {
         String firstName = developer.substring(0, developer.indexOf(" "));
         String taskId = taskName.substring(0, 2).toUpperCase() + ":" + taskNumber + ":" + firstName.substring(firstName.length() - 3).toUpperCase();
     
     return taskId;
     }
     
public int returnTotalHours(int numTasks, int taskDuration) {
    int count = 0;
    
    if (count < numTasks) {
        this.total += taskDuration;
    }
    return this.total;
}

public String printTaskDetails(String taskID) {
    String output = "Task Details: "+ "/n" +"Task status:  "+ getTaskStatus() +"/n"+ "Developer Details:  "
            +getDeveloperDetails() +"/n"+"Task Number: "+ getTaskNumber() + "/n" +
            "Task Name: "+ getTaskName()+"/n"+ "Task Description: "+ getTaskDescription()+ "/n"
             + "Task ID: "+taskID + "/n" + "Task Duration: "+ getTaskDuration();
    return output;
}

public void display() {
    JOptionPane.showMessageDialog(null, "Total hours for all tasks: " + this.total);
    }
}