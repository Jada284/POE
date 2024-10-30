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
    //Task details
    
    private String taskname;
    private String taskDescription;
    private String DeveloperDetails;
    private int TaskDuration ;
    private String TaskStatus;
    private int TaskNumber;
    private String TaskID;
    private static int totalHours=0;
    
  
    
     //Checking if task Description is valid
   public boolean checkTaskDescription(String taskDescription){
      return taskDescription.length()<50;
   }

   
   
   //Creating a taskID
   public String createTaskID(String taskname,String DeveloperDetails,int TaskNumber){
       String name= taskname.length()>=2?
       taskname.substring(0,2):taskname.toUpperCase();
       
       String Developer= DeveloperDetails.length()>=3?
       DeveloperDetails.substring(DeveloperDetails.length()-3) :DeveloperDetails.toUpperCase();
       
       return name.toUpperCase() +":"+ TaskNumber+":" + Developer.toUpperCase();
       
}

   //Returning the full details of the task
   public String printTaskDetails(int TaskDetails){
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
           
                   
         JOptionPane.showMessageDialog(null, TaskStatus);  
           
       }
      return TaskStatus;
   
   }
   
   //task details
   public void AddTasks(){
       ArrayList<Tasks> taskList=new ArrayList<>();
       int numTasks=
       Integer.parseInt(JOptionPane.showInputDialog("Enter the number of tasks?"));
       for (int k=0;k<numTasks;k++){
            taskname= JOptionPane.showInputDialog("Enter taskname:"+ (k+1));
           
           do{
                taskDescription= JOptionPane.showInputDialog("Enter taskDescription(max 50 characters");
           
           if(!checkTaskDescription(taskDescription)){
               JOptionPane.showMessageDialog(null, "the taskDescription is too long");
               
           }
           else{
              JOptionPane.showMessageDialog(null,"Task description captured successfully");
           }
           }while(!checkTaskDescription(taskDescription));
           DeveloperDetails= JOptionPane.showInputDialog("Enter DeveloperDetails(first last name");
           
           
            TaskDuration= Integer.parseInt(JOptionPane.showInputDialog("Enter Task Duration(in hours):"));
           
            
           //int TaskNumber= k;
           
            TaskID=createTaskID(taskname, DeveloperDetails,k);
           JOptionPane.showMessageDialog(null,"TaskID:" + TaskID);
           
           String status = Status(TaskStatus);
           
            TaskStatus=status;
            
           //String TaskStatus= createTaskID(taskname, DeveloperDetails,k);
           
           JOptionPane.showMessageDialog(null,"Print details\n"+printTaskDetails(k));
       }
   }

    
    }
   

