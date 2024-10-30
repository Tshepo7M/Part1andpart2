/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.registrationandlogin1;

import java.util.Scanner;

/**
 *
 * @author RC_Student_lab
 */
class part1Class {
    
     private String firstName, lastName, password, username;
    private boolean isAuthenticated;

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public boolean checkUsername(String username) {
        return username.length() >= 6 && !username.contains(" ");
    }

    public boolean checkPasswordComplexity(String password) {
        boolean hasCapitalLetter = false;
        boolean hasNumber = false;
        boolean hasSpecialChar = false;

        if (password.length() >= 8) {
            for (char ch : password.toCharArray()) {
                if (Character.isUpperCase(ch)) hasCapitalLetter = true;
                if (Character.isDigit(ch)) hasNumber = true;
                if (!Character.isLetterOrDigit(ch)) hasSpecialChar = true;
            }
        }

        return hasCapitalLetter && hasNumber && hasSpecialChar;
    }

    public String registerUser() {
        if (checkUsername(username) && checkPasswordComplexity(password)) {
            return "User has been registered successfully.";
        } else {
            return "Username or password does not meet the requirements.";
        }
    }

    public boolean loginUser() {
        Scanner scan = new Scanner(System.in);
        String inputUsername, inputPassword;

        do {
            System.out.print("Enter username: ");
            inputUsername = scan.nextLine();

            System.out.print("Enter password: ");
            inputPassword = scan.nextLine();

            if (inputUsername.equals(username) && inputPassword.equals(password)) {
                isAuthenticated = true;
                return true;
            } else {
                System.out.println("Username or password is incorrect. Please try again.");
            }
        } while (!isAuthenticated);

        return false;
    }

    public void returnLogin() {
        if (isAuthenticated) {
            System.out.println("Welcome back, " + username + "!");
        } else {
            System.out.println("Username or password is incorrect. Please try again.");
        }
    }
}

class Task {
    public boolean checkTaskDescription(String description) {
        return description.length() <= 50;
    }
}

class Tasks {
    private String name;
    private String description;
    private String developer;
    private int duration;
    private int status;

    public Tasks(String name, String description, String developer, int duration, int status) {
        this.name = name;
        this.description = description;
        this.developer = developer;
        this.duration = duration;
        this.status = status;
    }

    public String printTaskDetails() {
        return "Task Name: " + name + "\nDescription: " + description + "\nDuration: " + duration + " hours\nStatus: " + status;
    }
}
    
    /* private String firstName, lastName, password,username;
    private boolean isAuthenticated;
    
    //the get and set methods
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName= lastName;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password= password;
    }
    public String getUsername(){
         return username;
    }
    public void setUsername(String username){
        this.username = username;
    }
    private boolean istrue = false;
    //check if the username is correct
    
    public boolean checkUsername(String username){
        boolean validate = false;
        if (username.length() >= 6 && username.contains(" ")){
        
        validate = true;
    } else{
    validate = false;
}
    return validate;
}

  

    // Check the password complexity
    public boolean checkPasswordComplexity(String password) {
        boolean hasCapitalLetter = false;
        boolean hasNumber = false;
        boolean hasSpecialChar = false;

        if (password.length() >= 8) {
            for (char ch : password.toCharArray()) {
                if (Character.isUpperCase(ch)) {
                    hasCapitalLetter = true;
                } else if (Character.isDigit(ch)) {
                    hasNumber = true;
                } else if (!Character.isLetterOrDigit(ch)) {
                    hasSpecialChar = true;
                }
            }
        }

        return hasCapitalLetter && hasNumber && hasSpecialChar;
    }

    // Register the user by checking username and password validity
    public String registerUser() {
        if (checkUsername(username) && checkPasswordComplexity(password)) {
            return "User has been registered successfully.";
        } else {
            return "Username or password does not meet the requirements.";
        }
    }

    // User login
    public boolean loginUser() {
        Scanner scan = new Scanner(System.in);
        String inputUsername;
        String inputPassword;

        do {
            System.out.print("Enter username: ");
            inputUsername = scan.nextLine();

            System.out.print("Enter password: ");
            inputPassword = scan.nextLine();

            if (inputUsername.equals(username) && inputPassword.equals(password)) {
                isAuthenticated = true;
                return true; 
            } else {
                System.out.println("Username or password is incorrect. Please try again.");
            }
        } while (!isAuthenticated);

        return false; 
    }

    public void returnLogin() {
        if (isAuthenticated) {
            System.out.println("Welcome back, " + username + "!");
        } else {
            System.out.println("Username or password is incorrect. Please try again.");
        }
    }
    public class Tasks {
    private String name;
     private String description;
    private String developer;
    private int duration;
    private int status;
    
    public Tasks (String name, String description, String developer, int duration, int status){
        this.name = name;
        this.description = description;
        this.developer = developer;
        this.duration = duration;
        this.status = status;
    }
    public boolean checkTaskDescription(){
        return description.length() <50;
    }
    public int getDuration(){
        return duration;
    }
    public String printTaskDetails(){
        return "Task Name" + name + "\nDescription: " + description + "\nDuration: " +duration+ "hours\nStatus: " + status;
    }
    
}

}*/


