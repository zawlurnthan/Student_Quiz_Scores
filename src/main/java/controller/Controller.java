/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import view.Grades_View;

/**
 *
 * @author Zaw L Than
 */
public class Controller {
    Grades_View view = new Grades_View();
    
    public void run() {
        boolean keepGoing = true;

        while (keepGoing) {
            int menuSelection = view.printMenuAndGetSelection();
            
            switch (menuSelection) {
                case 1:
                    view.displayAllStudentsBanner();
                    break;

                case 2:
                    view.displayStudentBanner();
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
                    view.displayExitBanner();
                    break;

                default:
                    System.out.println("Unknow Command!!!");
            } 
        }     
    }
}
