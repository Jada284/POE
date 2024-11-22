/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poe_part1;

import java.util.Scanner;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.*;


/**
 *
 * @author RC_Student_lab
 */
public class POE_Part1 {

    public static void main(String[] args) {
        //Pass the external class
        LoginClass log= new LoginClass();
        TaskManager taskManager = new TaskManager();

       
//Declarations
       String firstname;
       String lastname;
       String username ;
       String password;
       
        //create an object of the scanner
        Scanner input=new Scanner(System.in);
        JDialog dialog = new JDialog();
        dialog.setAlwaysOnTop(true);
       
        //prompt the user to enter the firstname. lastname, username and password
          System.out.println("Enter First Name:");
        firstname=input.next();
       
       
         System.out.println("Enter Last Name:");
        lastname=input.next();
       
       
        System.out.println("Enter username:");
        username=input.next();
       
       
        System.out.println("Enter password:");
        password=input.next();
     
       
               
        //register the user
        String registration=log.registerUser(firstname,lastname,username,password);
        System.out.println("Registration: "+ registration);
       
        //login user
        System.out.println("Enter username to login:");
        username=input.next();
        System.out.println("Enter password to login:");
        password=input.next();
       
        //dispaly  login Status
        boolean loginSuccessful= log.loginUser(username,password);
       String loginMessage=log.returnLoginStatus(loginSuccessful);
       System.out.println(loginMessage);
       
       if(loginSuccessful){
           JOptionPane.showMessageDialog(dialog, "Welcome to EasyKanban");
       }
           Tasks task=new Tasks();
           
           
           //Using loops to allow user to enter the number of choice
          /* while (loginSuccessful){
               int menu=Integer.parseInt(JOptionPane.showInputDialog(null,"choose an option:\n1)Add Tasks \n2)show report(Coming soon)\n3)Quit"));
               
               //Choices using switch case
               switch(menu){
                   case 1:
                       task.AddTasks();
                       
                       break;
                       
                   case 2:
                       JOptionPane.showMessageDialog(null,"Coming soon");
                       
                       break;
                       
                   case 3:
                        JOptionPane.showMessageDialog(null,"Goodbye");
                       System.exit(0);
                     
                       return;
                   default:
                       
                       JOptionPane.showMessageDialog(null, "Invalid option.Please try again.");
                       
                       break;*/
               
                // Main Menu loop
        while (true) {
            String menu = """
                          Select an option:
                          1. Display tasks with status 'done'
                          2. Display developer and longest task duration
                          3. Search for task by name
                          4. Search tasks by developer
                          5. Delete task by name
                          6. Display full report of tasks
                          7. Exit""";
            
            String choiceStr = JOptionPane.showInputDialog(menu);
            int choice = Integer.parseInt(choiceStr);

            switch (choice) {
                case 1:
                    taskManager.displayDoneTasks();
                    break;
                case 2:
                    taskManager.displayLongestTask();
                    break;
                case 3:
                    String taskName = JOptionPane.showInputDialog("Enter task name to search:");
                    taskManager.searchTask(taskName);
                    break;
                case 4:
                    String developerName = JOptionPane.showInputDialog("Enter developer name to search for tasks:");
                    taskManager.searchTasksByDeveloper(developerName);
                    break;
                case 5:
                    String taskToDelete = JOptionPane.showInputDialog("Enter task name to delete:");
                    taskManager.deleteTask(taskToDelete);
                    break;
                case 6:
                    taskManager.displayFullReport();
                    break;
                case 7:
                    JOptionPane.showMessageDialog(null, "Exiting the program.");
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid choice. Please try again.");
            }
        }
    }
}
               
               
               
               
                        
          
       // input.close();
      // dialog.dispose();  
             
       
           
    
 


       
    
    

