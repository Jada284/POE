/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poe_part1;

import javax.swing.JOptionPane;

/**
 *
 * @author RC_Student_lab
 */
public class TaskManagerMain {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();

        // Test Data
        taskManager.addTask("Mike Smith", "Create Login", 5, "to do");
        taskManager.addTask("Edward Harrison", "Create add features", 8, "doing");
        taskManager.addTask("Samantha Paulson", "Create reports", 2, "done");
        taskManager.addTask("Glenda Oberholzer", "Add arrays", 11, "to do");

        // Main Menu loop
        while (true) {
            String menu = "Select an option:\n"
                    + "1. Display tasks with status 'done'\n"
                    + "2. Display developer and longest task duration\n"
                    + "3. Search for task by name\n"
                    + "4. Search tasks by developer\n"
                    + "5. Delete task by name\n"
                    + "6. Display full report of tasks\n"
                    + "7. Exit";
            
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

   /* private void displayFullReport() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void deleteTask(String taskToDelete) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void searchTasksByDeveloper(String developerName) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void searchTask(String taskName) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void displayLongestTask() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void displayDoneTasks() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void addTask(String mike_Smith, String create_Login, int i, String to_do) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
} */

