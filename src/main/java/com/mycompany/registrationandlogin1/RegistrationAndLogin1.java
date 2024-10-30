/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.registrationandlogin1;
import java.util.Scanner;
//import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author RC_Student_lab
 */
public class RegistrationAndLogin1 {

   
        
    public static void main(String[] args) {
  
    
       /* Scanner sc = new Scanner(System.in);
        part1Class userLogin = new part1Class();

        // User registration for account
        System.out.println("Register your account..........");

        // Prompt user to enter their details
        System.out.print("Enter your first name: ");
        String firstName = sc.nextLine();
        userLogin.setFirstName(firstName);

        System.out.print("Enter your last name: ");
        String lastName = sc.nextLine();
        userLogin.setLastName(lastName);

        String username, password;
        do {
            System.out.print("Enter your username: ");
            username = sc.nextLine();
            userLogin.setUsername(username);
        } while (!userLogin.checkUsername(username));

        do {
            System.out.print("Enter password: ");
            password = sc.nextLine();
            userLogin.setPassword(password);
        } while (!userLogin.checkPasswordComplexity(password));

        // Register user
        String registrationMessage = userLogin.registerUser();
        System.out.println(registrationMessage);
        
        // User login
        if (!userLogin.loginUser()) {
            System.out.println("Login failed. Please check your username and password.");
            return;
        }

        JOptionPane.showMessageDialog(null, "Welcome to EASYKANBAN");
        Task task = new Task();
        int menu = 0;

        while (menu != 3) {
            menu = Integer.parseInt(JOptionPane.showInputDialog("Select an option: \n 1: Add Tasks\n 2: Show Report\n 3: Exit"));

            switch (menu) {
                case 1:
                    addTasks(task);
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Coming soon");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Goodbye!");
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid option");
            }
        }
    }

    private static void addTasks(Task task) {
        int accumulateHours = 0;
        int size = Integer.parseInt(JOptionPane.showInputDialog("How many tasks do you want to enter?"));
        Tasks[] tasks = new Tasks[size];

        for (int i = 0; i < size; i++) {
            String taskName = JOptionPane.showInputDialog("Enter task name:");
            String taskDescription;

            do {
                taskDescription = JOptionPane.showInputDialog("Enter task description (Max 50 characters):");
            } while (!task.checkTaskDescription(taskDescription));

            String developer = JOptionPane.showInputDialog("Enter developer's first and last name:");
            int duration = Integer.parseInt(JOptionPane.showInputDialog("Enter task duration (in hours):"));
            int status = Integer.parseInt(JOptionPane.showInputDialog("Select an option:\n 1: To do \n 2: Done \n 3: Doing"));

            tasks[i] = new Tasks(taskName, taskDescription, developer, duration, status);
            accumulateHours += duration;

            JOptionPane.showMessageDialog(null, tasks[i].printTaskDetails());
        }

        JOptionPane.showMessageDialog(null, "Total number of tasks: " + size + "\nTotal duration: " + accumulateHours + " hours");
    }
}*/
        
         Scanner sc = new Scanner(System.in);
       // final JDialog dialog = new JDialog();
       // dialog.setAlwaysOnTop(true);

        part1Class userLogin = new part1Class(); // Assuming part1Class contains necessary methods

        // User registration for account
        System.out.println("Register your account..........");

        // Prompt user to enter their details
        System.out.print("Enter your first name: ");
        String firstName = sc.nextLine();
        userLogin.setFirstName(firstName);

        System.out.print("Enter your last name: ");
        String lastName = sc.nextLine();
        userLogin.setLastName(lastName);

        System.out.print("Enter your username: ");
        String username = sc.nextLine();
        userLogin.setUsername(username);

        System.out.print("Enter password: ");
        String password = sc.nextLine();
        userLogin.setPassword(password);

        // Register user and check registration validity
        String registrationMessage = userLogin.registerUser();
        System.out.println(registrationMessage);

        // Check for valid username and password complexity
        while (!userLogin.checkUsername(username) || !userLogin.checkPasswordComplexity(password)) {
            System.out.print("Enter a valid username: ");
            username = sc.nextLine();
            userLogin.setUsername(username);

            System.out.print("Enter a valid password: ");
            password = sc.nextLine();
            userLogin.setPassword(password);

            registrationMessage = userLogin.registerUser();
            System.out.println(registrationMessage);
        }
    

   
        // User login
            // User login
         userLogin.returnLogin();
            JOptionPane.showMessageDialog(null, "Welcome to EASYKANBAN");
            Task task = new Task();
            int menu = 0;

            while (menu != 3) {
                // Allows user to choose a task
                menu = Integer.parseInt(JOptionPane.showInputDialog("Select an option: \n 1: Add Tasks\n 2: Show Report\n 3: Exit"));

                switch (menu) {
                    case 1:
                        int accumulatehours = 0;
                        //int size=0;
                        int size = Integer.parseInt(JOptionPane.showInputDialog("How many tasks do you want to enter?"));
                        String[] Taskname = new String[size];
                        String[] TaskDescription = new String[size];
                        String[] developer = new String[size];
                        int[] duration = new int[size];
                        String[] TaskId = new String[size];
                        String[] Taskstatus = new String[size];

                        for (int i = 0; i < size; i++) { 
                            Taskname[i] = JOptionPane.showInputDialog("Enter task name:");

                            do {
                                TaskDescription[i] = JOptionPane.showInputDialog("Enter task description (Max 50 characters):");
                            } while (!task.checkTaskDescription(TaskDescription[i]));

                            developer[i] = JOptionPane.showInputDialog("Enter developer's first and last name:");
                            duration[i] = Integer.parseInt(JOptionPane.showInputDialog("Enter task duration (in hours):"));

                            TaskId[i] = task.createTaskID(Taskname[i], i, developer[i]);
                            JOptionPane.showMessageDialog(null, "Task ID: " + TaskId[i]);

                            int status = Integer.parseInt(JOptionPane.showInputDialog("Select an option:\n 1: To do \n 2: Done \n 3: Doing"));
                            switch (status) {
                                case 1:
                                    Taskstatus[i] = "To do";
                                    break;
                                case 2:
                                    Taskstatus[i] = "Done";
                                    break;
                                case 3:
                                    Taskstatus[i] = "Doing";
                                    break;
                               
                            }
                            Tasks.printTaskDetails(Taskstatus[i],i,Taskname[i], TaskDescription[i], duration[i]);
                            JOptionPane.showMessageDialog(null, "Task status: " + Taskstatus[i]);
                            
                        }

                        JOptionPane.showMessageDialog(null, "Total number of tasks: " + size);
                        break;

                    case 2:
                        JOptionPane.showMessageDialog(null, "Coming soon");
                        break;

                    case 3:
                        JOptionPane.showMessageDialog(null, "Goodbye!");
                        System.exit(0);
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "Invalid option");
                        break;
       
       }
            }
        } 
    }


        




