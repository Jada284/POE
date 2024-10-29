/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poe_part1;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author RC_Student_lab
 */
public class Tasks {
    //Task properties
    
    private String taskname;//Name of the task
    private String taskDescription;//Description of the task
    private String DeveloperDetails;//Developer assigned to the task
    private String TaskDuration;//Duration of the task in hours
    private String TaskStatus;//Current status of the task
    private int TaskNumber;//Auto-generated task number
    private int TaskID;//Auto-generated task ID
    //Static counter for generating unique task numbers
    private static int taskCounter=0;
    
    //Construct to initialize a new task
     public Tasks(String TaskName,String TaskDescription,String DeveloperDetails,String TaskDuration,String TaskStatus,int TaskNumber, int TaskID){
        this.taskname= TaskName;
        this.taskDescription= TaskDescription;
        this.DeveloperDetails= DeveloperDetails;
        this.TaskDuration= TaskDuration;
        this.TaskStatus= TaskStatus;
        this.TaskNumber= TaskNumber;
        this.TaskID= TaskID;
        this.TaskNumber= taskCounter++;
        
        //  this.taskID= createTaskID();//Generate TaskID
        //  checkTaskDescription();//Validate taskDescription
    }
    
     private List<Tasks>taskList;
     float totalHours;
     
     public Tasks(){
         this.taskList= new ArrayList<>();
     }
   public boolean checkTaskDescription(String description){
       boolean valid= false;
       if(taskDescription.length()<=50){
           JOptionPane.showMessageDialog(null,"Task description successfuly");
           
           valid= true;//description is too long
       }else {
           JOptionPane.showMessageDialog(null,"Task description not successful");
           valid= false;
       }
      return valid;
   }

   
   
   //Creating a unique taskID
   public String createTaskID(String taskname,String DeveloperDetails,int TaskNumber){
       String name= taskname.length()>=2?
       taskname.substring(0,2):taskname.toUpperCase();
       
       String Developer= DeveloperDetails.length()>=3?
       DeveloperDetails.substring(0,3):DeveloperDetails.toUpperCase();
       
       return name +":"+ TaskNumber+":" + Developer;
       
}

   //Returning the full details of the task
   
   
}
