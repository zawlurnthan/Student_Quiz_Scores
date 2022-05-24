/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dto.Student;
import java.util.List;

/**
 *
 * @author Zaw L Than
 */
public interface GradesDao {
    Student addStudent(String id, Student student);
    List<Student> getAllStudents();
    Student removeStudent(String id);
    int getStudentScore(String id);
    int getAverageScore(String id);  
}
