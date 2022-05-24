/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dto.Student;

/**
 *
 * @author Zaw L Than
 */
public class Grades_View {
    private final UserIO io = new UserIOConsoleImpl();
    
    public int printMenuAndGetSelection() {
        io.print("Main Menu");
        io.print("1. List of Students");
        io.print("2. Create New Student");
        io.print("3. Remove a Student");
        io.print("4. View the list of quiz score of a Student");
        io.print("5. View the average quiz score of a Student");
        io.print("6. Exit");
        return io.readInt("Please select from the above choices.", 1, 6);
    }
    
        public Student getNewStudentInfo() {
        String id = io.readString("Please enter student ID");
        String firstName = io.readString("Please enter First Name");
        String lastName = io.readString("Please enter Last Name");
        int score = io.readInt("Please enter the quiz score");
        
        Student student = new Student(id);
        student.setFirstName(firstName);
        student.setLastName(lastName);
        student.setScore(score);
        return student;
    }
        
    public void displayAllStudentsBanner() {
        io.print("=== Display all Students ===");
    }
    
    public void displayStudentBanner() {
        io.print("=== Display Student ===");
    }
    
    public void displayRemoveStudentBanner() {
        io.print("=== Remove Student ===");
    }
    
    public void displayListOfScore() {
        io.print("=== LIst of quiz score Of a student ===");
    }
    
    public void displayAverageQuizScores() {
        io.print("=== Average Quiz Score ===");
    }
        
    public void displayExitBanner() {
        io.print("Good Bye!");
    }
    
    public void displayUnknownCommandBanner() {
        io.print("Unknown Command!!!");
    }
    
    public void displayErrorMessage(String errorMsg) {
        io.print("=== ERROR ===");
        io.print("errorMsg");
    }
}
