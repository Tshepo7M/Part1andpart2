package com.mycompany.tshepo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TaskClassTest {

    public TaskClassTest() {
    }

    @BeforeAll
    public static void setUpClass() throws Exception {
        // Setup logic before all tests
    }

    @AfterAll
    public static void tearDownClass() throws Exception {
        // Cleanup logic after all tests
    }

    @BeforeEach
    public void setUp() throws Exception {
        // Setup logic before each test
    }

    @AfterEach
    public void tearDown() throws Exception {
        // Cleanup logic after each test
    }

    @Test
    public void testCheckTaskDescription1() {
        System.out.println("checkTaskDescription1");
        String taskDescription = "Create Login to authenticate users";
        TaskClass instance = new TaskClass();
        boolean expResult = true;
        boolean result = instance.checkTaskDescription(taskDescription);
        assertEquals(expResult, result, "Task description validation failed for valid description.");
    }

    @Test
    public void testCheckTaskDescription2() {
        System.out.println("checkTaskDescription2");
        String taskDescription = "Create add Task feature to add task users";
        TaskClass instance = new TaskClass();
        boolean expResult = true;
        boolean result = instance.checkTaskDescription(taskDescription); // Fixed typo
        assertEquals(expResult, result, "Task description validation failed for valid description.");
    }

    @Test
    public void testCreateTaskID1() {
        System.out.println("createTaskID1");
        String taskName = "Login Feature";
        String developerDetails = "Robyn Harrison";
        int taskNumber = 0;
        TaskClass instance = new TaskClass();
        String expResult = "LO:0:SON";
        String result = instance.createTaskID(taskName, taskNumber, developerDetails);
        assertEquals(expResult, result, "Task ID generation failed.");
    }

    @Test
    public void testCreateTaskID2() {
        System.out.println("createTaskID2");
        String taskName = "Add Task Feature";
        String developerDetails = "Mike Smith";
        int taskNumber = 1;
        TaskClass instance = new TaskClass();
        String expResult = "AD:1:ITH";
        String result = instance.createTaskID(taskName, taskNumber, developerDetails);
        assertEquals(expResult, result, "Task ID generation failed.");
    }

    @Test
    public void testPrintTaskDetails1() {
        System.out.println("printTaskDetails1");
        int details = 0;
        TaskClass instance = new TaskClass();

        String expResult = "Task Status: To Do\n" +
                           "Developer Details: Robyn Harrison\n" +
                           "Task Number: 0\n" +
                           "Task Name: Login Feature\n" +
                           "Task Description: \n" +
                           "Task ID: LO:0:SON\n" +
                           "Task Duration: 8 hours";
        String result = instance.printTaskDetails(details);
        assertEquals(expResult, result, "Task details mismatch for task 0.");
    }

    @Test
    public void testPrintTaskDetails2() {
        System.out.println("printTaskDetails2");
        int details = 1;
        TaskClass instance = new TaskClass();

        String expResult = "Task Status: Doing\n" +
                           "Developer Details: Mike Smith\n" +
                           "Task Number: 1\n" +
                           "Task Name: Add Task Feature\n" +
                           "Task Description: \n" +
                           "Task ID: AD:1:ITH\n" +
                           "Task Duration: 10 hours";
        String result = instance.printTaskDetails(details);
        assertEquals(expResult, result, "Task details mismatch for task 1.");
    }

    @Test
    public void testReturnTaskDuration1() {
        System.out.println("returnTaskDuration1");
        int taskDuration = 8;
        TaskClass instance = new TaskClass();
        int expResult = 8;
        int result = instance.returnTaskDuration(taskDuration);
        assertEquals(expResult, result, "Task duration mismatch for 8 hours.");
    }

    @Test
    public void testReturnTaskDuration2() {
        System.out.println("returnTaskDuration2");
        int taskDuration = 10;
        TaskClass instance = new TaskClass();
        int expResult = 10;
        int result = instance.returnTaskDuration(taskDuration);
        assertEquals(expResult, result, "Task duration mismatch for 10 hours.");
    }

    @Test
    public void testAddTask() {
        System.out.println("addTask");
        TaskClass instance = new TaskClass();
        instance.addTask();
        // Implement test logic for addTask
        // Remove fail statement after implementation
        fail("The test case for addTask is not implemented.");
    }

    // Repeat similar fixes for all other test cases
    // ...

    /**
     * Test of displayDoneTasks method, of class TaskClass.
     */
    @Test
    public void testDisplayDoneTasks() {
        System.out.println("displayDoneTasks");
        TaskClass instance = new TaskClass();
        instance.displayDoneTasks();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findLongestTask method, of class TaskClass.
     */
    @Test
    public void testFindLongestTask() {
        System.out.println("findLongestTask");
        TaskClass instance = new TaskClass();
        instance.findLongestTask();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchByTaskName method, of class TaskClass.
     */
    @Test
    public void testSearchByTaskName() {
        System.out.println("searchByTaskName");
        String taskName = "";
        TaskClass instance = new TaskClass();
        instance.searchByTaskName(taskName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchTasksByDeveloper method, of class TaskClass.
     */
    @Test
    public void testSearchTasksByDeveloper() {
        System.out.println("searchTasksByDeveloper");
        String developerName = "";
        TaskClass instance = new TaskClass();
        instance.searchTasksByDeveloper(developerName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteTask method, of class TaskClass.
     */
    @Test
    public void testDeleteTask() {
        System.out.println("deleteTask");
        String taskName = "";
        TaskClass instance = new TaskClass();
        instance.deleteTask(taskName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayAllTasks method, of class TaskClass.
     */
    @Test
    public void testDisplayAllTasks() {
        System.out.println("displayAllTasks");
        TaskClass instance = new TaskClass();
        instance.displayAllTasks();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
