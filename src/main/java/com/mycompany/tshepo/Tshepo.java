/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tshepo;
import java.util.ArrayList;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
/**
 *
 * @author RC_Student_lab
 */
public class Tshepo {

   
      private static boolean loggedIn = false;
    private static ArrayList<TaskClass> task = new ArrayList<>();
    public static void main(String[] args) {
        
   final JDialog dialog = new JDialog();
        dialog.setAlwaysOnTop(true);

        Login login = new Login();

        // User registration
        String firstName = JOptionPane.showInputDialog("Enter first name:");
        String lastName = JOptionPane.showInputDialog("Enter last name:");
        String username = JOptionPane.showInputDialog("Enter username (must contain an underscore and be no more than 5 characters):");
        String password = JOptionPane.showInputDialog("Enter password (must be at least 8 characters, contain a capital letter, a number, and a special character):");

        String registrationResult = login.registerUser(username, password, firstName, lastName);
        JOptionPane.showMessageDialog(null, registrationResult);

        if (registrationResult.equals("Username and password successfully captured.")) {
            String loginUsername = JOptionPane.showInputDialog("Enter username for login:");
            String loginPassword = JOptionPane.showInputDialog("Enter password for login:");

            boolean loginStatus = login.LoginUser(loginUsername, loginPassword);
            JOptionPane.showMessageDialog(null, login.returnLoginStatus(loginStatus));

            if (loginStatus) {
                loggedIn = true;
                JOptionPane.showMessageDialog(null, "Welcome to EasyKanban!");

                // Main Menu
                while (true) {
                    String[] options = {"Add Tasks", "Show Tasks (Done)", "Task with Longest Duration", "Search Task by Name", "Search Tasks by Developer", "Delete Task", "Display All Tasks", "Quit"};
                    int choice = JOptionPane.showOptionDialog(null, "Please choose an option", "EasyKanban Menu", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

                    TaskClass task = new TaskClass();
                    switch (choice) {
                        case 0:
                            task.addTask();
                            break;
                        case 1:
                            task.displayDoneTasks();
                            break;
                        case 2:
                            task.findLongestTask();
                            break;
                        case 3:
                            String searchName = JOptionPane.showInputDialog("Enter Task Name:");
                            task.searchByTaskName(lastName);
                            break;
                        case 4:
                            String developerName = JOptionPane.showInputDialog("Enter Developer Name:");
                            task.searchTasksByDeveloper(developerName);
                            break;
                        case 5:
                            String deleteName = JOptionPane.showInputDialog("Enter Task Name to Delete:");
                            task.deleteTask(lastName);
                            break;
                        case 6:
                            task.displayAllTasks();
                            break;
                        case 7:
                            JOptionPane.showMessageDialog(null, "Exiting EasyKanban. Goodbye!");
                            return;
                        default:
                            break;
                    }
                }
            }
        }
    }
}


