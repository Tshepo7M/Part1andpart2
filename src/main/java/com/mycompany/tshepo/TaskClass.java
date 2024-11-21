/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tshepo;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author RC_Student_lab
 */
class TaskClass {

     private static boolean loggedIn = false;
    private static ArrayList<String> developers = new ArrayList<>();
    private static ArrayList<String> taskNames = new ArrayList<>();
    private static ArrayList<String> taskIDs = new ArrayList<>();
    private static ArrayList<Integer> taskDurations = new ArrayList<>();
    private static ArrayList<String> taskStatuses = new ArrayList<>();
    
    // Method to add a new task
    void addTask() {
        String taskName = JOptionPane.showInputDialog("Enter Task Name:");
        String developerName = JOptionPane.showInputDialog("Enter Developer Name:");
        String taskDescription = JOptionPane.showInputDialog("Enter Task Description (max 50 characters):");

        if (taskDescription.length() > 50) {
            JOptionPane.showMessageDialog(null, "Please enter a task description of less than 50 characters.");
            return;
        }

        int duration = Integer.parseInt(JOptionPane.showInputDialog("Enter Task Duration (in hours):"));
        String status = JOptionPane.showInputDialog("Enter Task Status (To Do, Doing, Done):");

        // Generate Task ID
        String taskID = taskName.substring(0, 2).toUpperCase() + ":" + taskNames.size() + ":" + developerName.substring(developerName.length() - 3).toUpperCase();

        // Add task details to arrays
        taskNames.add(taskName);
        developers.add(developerName);
        taskIDs.add(taskID);
        taskDurations.add(duration);
        taskStatuses.add(status);

        JOptionPane.showMessageDialog(null, "Task successfully added!");
    }

    // Method to display tasks with "Done" status
    void displayDoneTasks() {
        StringBuilder output = new StringBuilder("Tasks with Status 'Done':\n");
        for (int i = 0; i < taskStatuses.size(); i++) {
            if (taskStatuses.get(i).equalsIgnoreCase("Done")) {
                output.append("Developer: ").append(developers.get(i))
                        .append("\nTask Name: ").append(taskNames.get(i))
                        .append("\nDuration: ").append(taskDurations.get(i)).append(" hours\n\n");
            }
        }
        JOptionPane.showMessageDialog(null, output.toString());
    }

    // Method to find task with the longest duration
     void findLongestTask() {
        int maxIndex = 0;
        for (int i = 1; i < taskDurations.size(); i++) {
            if (taskDurations.get(i) > taskDurations.get(maxIndex)) {
                maxIndex = i;
            }
        }
        JOptionPane.showMessageDialog(null, "Longest Task:\nDeveloper: " + developers.get(maxIndex) + "\nDuration: " + taskDurations.get(maxIndex) + " hours");
    }

    // Method to search task by name
     void searchByTaskName(String taskName) {
        for (int i = 0; i < taskNames.size(); i++) {
            if (taskNames.get(i).equalsIgnoreCase(taskName)) {
                JOptionPane.showMessageDialog(null, "Developer: " + developers.get(i) + "\nStatus: " + taskStatuses.get(i));
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Task not found!");
    }

    // Method to search tasks by developer
     void searchTasksByDeveloper(String developerName) {
        StringBuilder output = new StringBuilder("Tasks assigned to " + developerName + ":\n");
        for (int i = 0; i < developers.size(); i++) {
            if (developers.get(i).equalsIgnoreCase(developerName)) {
                output.append("Task Name: ").append(taskNames.get(i))
                        .append("\nStatus: ").append(taskStatuses.get(i)).append("\n\n");
            }
        }
        JOptionPane.showMessageDialog(null, output.toString());
    }

    // Method to delete a task by name
     void deleteTask(String taskName) {
        for (int i = 0; i < taskNames.size(); i++) {
            if (taskNames.get(i).equalsIgnoreCase(taskName)) {
                taskNames.remove(i);
                developers.remove(i);
                taskIDs.remove(i);
                taskDurations.remove(i);
                taskStatuses.remove(i);
                JOptionPane.showMessageDialog(null, "Task successfully deleted!");
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Task not found!");
    }

    // Method to display all tasks
     void displayAllTasks() {
        StringBuilder output = new StringBuilder("All Tasks:\n");
        for (int i = 0; i < taskNames.size(); i++) {
            output.append("Task ID: ").append(taskIDs.get(i))
                    .append("\nDeveloper: ").append(developers.get(i))
                    .append("\nTask Name: ").append(taskNames.get(i))
                    .append("\nDuration: ").append(taskDurations.get(i)).append(" hours")
                    .append("\nStatus: ").append(taskStatuses.get(i)).append("\n\n");
        }
        JOptionPane.showMessageDialog(null, output.toString());
    }
     
}
   



   

