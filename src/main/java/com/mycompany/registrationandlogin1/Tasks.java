/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.registrationandlogin1;

/**
 *
 * @author RC_Student_lab
 */
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
    public String printTaskDetails(String Taskstatu, int i, String par, String par1, int par2){
        return "Task Name" + name + "\nDescription: " + description + "\nDuration: " +duration+ "hours\nStatus: " + status;
    }
}
