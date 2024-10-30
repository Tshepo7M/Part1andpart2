/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.registrationandlogin1;

import javax.swing.JOptionPane;

/**
 *
 * @author RC_Student_lab
 */
class JOptionpane {
    JOptionPane.showMessageDialog(null, "Welcome to EASYKANBAN");
        Tast task = new Task();
        int Menu = 0;
        while(Menu!=3){
            
            //allows user to choose a task
            Menu = Integer.parseInt(JOptionPane.showInputDialog("how many tasks do you want to enter "));
            String []Taskname = new String[size];
             String []TaskDescription = new String[size];
              String [] Developer = new String[size];
              int [] duration = new int [size];
              String [] TaskId = new String [size];
               String [] TaskStatus = new String [size];
               
               for (int i = 0; 1< size; 1++){
                   Taskname[i] JOptionPane.showInputDialog("Enter taskname");
                   
                   do{
                       TaskDescription[i]=JOptionPane.showInputDialog("Enter task Discription(Max 50 characters):");
                      
                   }while(
                           !task.checkTaskDescription(TaskDescription[i]));
                   Developer[i]= JOptionPane.showInputDialog("Firstname and lastname");
                   duration[i] = Integer.parseInt(JOptionPane.showInputDialog("Enter task duration of (in hours)"));
                  
                   TaskId [i] = task.createTaskID(Taskname[i],i,Developer[i]);
                   JOptionPane.showMessageDialog(null,"Task ID" + TaskId);
                   int status = Integer.parseInt(JOptionPane.showInputDialog("Select an option\n 1: To do \n 2: Done \n 3: Doing"));
                String[] Taskstatus;
                   
                   switch(status){
                       case 1:
                           Taskstatus[i]="to do";
                           break;
                           
                       case 2:
                           Taskstatus[i]="Done";
                           break;
                           
                       case 3:
                           Taskstatus[i]="Doing";
                           break;
                   }
                   JOptionPane.showMessageDialog(null, "Task status:"+Taskstatus[i]);
                   //do a while loop for Taskdescription
                   task.printTaskDetails(Taskstatus[i],i,Taskname[i],TaskDescription[i], TaskId[i], duration[i]);
                   accumulatehours= accumulationhours+ task.ReturnTotalHours(duration[i]);
               }
               JOptionPane.showMessageDialog(null, "Total of all the tasks : " + size);
               
               break;
               case 2:
               JOptionPane.showMessageDialog(null,"coming  soon");
               
               case 3:
               JOptionPane.showMessageDialog(null,"GoodBye!");
               System.exit(0);
               break;
               default :
               JOptionPane.showMessageDialog(null,"Invaid option");
        }
}

    
    
}
