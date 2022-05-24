/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.GradesDao;
import dao.GradesDaoImpl;
import dto.Student;
import view.Grades_View;

/**
 *
 * @author Zaw L Than
 */
public class Controller {
    Grades_View view = new Grades_View();
    GradesDao dao = new GradesDaoImpl();
    
    public void run() {
        boolean keepGoing = true;

        while (keepGoing) {
            int menuSelection = getMenuSelection();
            
            switch (menuSelection) {
                case 1:
                    view.displayAllStudentsBanner();
                    break;

                case 2:
                    createStudent();
                    break;

                case 3:
                    view.displayRemoveStudentBanner();
                    break;

                case 4:
                    view.displayListOfScore();
                    break;

                case 5:
                    view.displayAverageQuizScores();
                    break;

                case 6:
                    keepGoing = false;
                    break;

                default:
                    System.out.println("Unknow Command!!!");
            } 
        }                      
        view.displayExitBanner();   
    }
    
    private int getMenuSelection() {
        return view.printMenuAndGetSelection();
    }
    
    private void createStudent() {
        view.displayStudentBanner();
        Student newStudent = view.getNewStudentInfo();
        dao.addStudent(newStudent.getId(), newStudent);
    }
}
