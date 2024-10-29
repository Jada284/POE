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
    
   /* //Construct to initialize a new task
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
    }*/
    
    /* private List<Tasks>taskList;
     float totalHours;
     
     public Tasks(){
         this.taskList= new ArrayList<>();
     }*/
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
   public String printTaskDetails(Tasks task){
       return "Task Status:"+ TaskStatus+ "\nDeveloper Details:"+ DeveloperDetails+ "\nTask Number:"+ TaskNumber+"\nTask Name:"+ taskname+ "\nTask Description:"+ taskDescription+ "\nTask ID:"+ TaskID+ "\nTask Duration:"+ TaskDuration+"hours"; 
   }
   public String Status (String TaskStatus){
       String Status="";
       boolean valid= false;
       
       while (!valid){
           String input= JOptionPane.showInputDialog(null, "Select the option \n1)To Do \n2)Doing \n3)Done");
           int choice= Integer.parseInt(input);
           
           
           switch (choice){
               case 1:
                   TaskStatus="To DO";
                   valid= true;
                   
                   break;
                   
               case 2:
                   TaskStatus="Doing";
                   valid= true;
                   
                   break;
                   
               case 3:
                   TaskStatus="Done";
                   valid= true;
                   
                   break;
                   
               default:
                   
             JOptionPane.showMessageDialog(null, "Invalid option. Please enter 1,2 or 3");
           }
           
                   
           
           
       }
      return TaskStatus;
   
   }
   
   //task details
   public void AddTasks(){
       int numTasks=
       Integer.parseInt(JOptionPane.showInputDialog("Enter the number of tasks?"));
       for (int k=0;k<numTasks;k++){
           String taskName= JOptionPane.showInputDialog("Enter taskname:");
           
           String taskDescription= JOptionPane.showInputDialog("Enter taskDescription(max 50 characters");
           
           String DeveloperDetails= JOptionPane.showInputDialog("Enter DeveloperDetails(first last name");
           
           int TaskDuration= Integer.parseInt(JOptionPane.showInputDialog("Enter Task Duration(in hours):"));
           
           totalHours+= TaskDuration;
           
           
           int TaskNumber= k++;
           String menu= Status(TaskStatus);
           String TaskStatus= createTaskID(taskname, DeveloperDetails,TaskNumber);
           
          
           
        
           
           
       }
   }
   
}
