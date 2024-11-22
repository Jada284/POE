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
class TaskManager {
    private String[] developers = new String[10];
    private String[] taskNames = new String[10];
    private int[] taskIDs = new int[10];
    private int[] taskDurations = new int[10];
    private String[] taskStatuses = new String[10];
    private int taskCount = 0;

    public void addTask(String developer, String taskName, int duration, String status) {
        developers[taskCount] = developer;
        taskNames[taskCount] = taskName;
        taskIDs[taskCount] = taskCount + 1;  // Simple task ID generation
        taskDurations[taskCount] = duration;
        taskStatuses[taskCount] = status;
        taskCount++;
    }

    public void displayDoneTasks() {
        StringBuilder doneTasks = new StringBuilder("Tasks with status 'done':\n");
        for (int i = 0; i < taskCount; i++) {
            if (taskStatuses[i].equals("done")) {
                doneTasks.append("Developer: ").append(developers[i])
                        .append(", Task Name: ").append(taskNames[i])
                        .append(", Duration: ").append(taskDurations[i])
                        .append("\n");
            }
        }
        JOptionPane.showMessageDialog(null, doneTasks.toString());
    }

    public void displayLongestTask() {
        int maxDuration = -1;
        String developer = "";
        for (int i = 0; i < taskCount; i++) {
            if (taskDurations[i] > maxDuration) {
                maxDuration = taskDurations[i];
                developer = developers[i];
            }
        }
        JOptionPane.showMessageDialog(null, "Developer: " + developer + ", Task Duration: " + maxDuration);
    }

    public void searchTask(String taskName) {
        for (int i = 0; i < taskCount; i++) {
            if (taskNames[i].equalsIgnoreCase(taskName)) {
                JOptionPane.showMessageDialog(null, "Task Name: " + taskNames[i] + "\nDeveloper: " + developers[i] + "\nStatus: " + taskStatuses[i]);
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Task not found.");
    }

    public void searchTasksByDeveloper(String developerName) {
        StringBuilder tasks = new StringBuilder("Tasks assigned to " + developerName + ":\n");
        for (int i = 0; i < taskCount; i++) {
            if (developers[i].equalsIgnoreCase(developerName)) {
                tasks.append("Task Name: ").append(taskNames[i])
                        .append(", Status: ").append(taskStatuses[i])
                        .append("\n");
            }
        }
        if (tasks.length() == 0) {
            JOptionPane.showMessageDialog(null, "No tasks found for developer: " + developerName);
        } else {
            JOptionPane.showMessageDialog(null, tasks.toString());
        }
    }

    public void deleteTask(String taskName) {
        for (int i = 0; i < taskCount; i++) {
            if (taskNames[i].equalsIgnoreCase(taskName)) {
                for (int j = i; j < taskCount - 1; j++) {
                    developers[j] = developers[j + 1];
                    taskNames[j] = taskNames[j + 1];
                    taskIDs[j] = taskIDs[j + 1];
                    taskDurations[j] = taskDurations[j + 1];
                    taskStatuses[j] = taskStatuses[j + 1];
                }
                taskCount--;
                JOptionPane.showMessageDialog(null, "Task '" + taskName + "' deleted.");
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Task not found.");
    }

    public void displayFullReport() {
        StringBuilder report = new StringBuilder("Full Report of Tasks:\n");
        for (int i = 0; i < taskCount; i++) {
            report.append("Task ID: ").append(taskIDs[i])
                    .append(", Developer: ").append(developers[i])
                    .append(", Task Name: ").append(taskNames[i])
                    .append(", Duration: ").append(taskDurations[i])
                    .append(", Status: ").append(taskStatuses[i])
                    .append("\n");
        }
        JOptionPane.showMessageDialog(null, report.toString());
    }
}



