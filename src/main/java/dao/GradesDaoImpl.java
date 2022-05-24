/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dto.Student;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Zaw L Than
 */
public class GradesDaoImpl implements GradesDao {
    public static final String ROSTER_FILE = "quiz_score.txt";
    public static final String DELIMITER = "::";
    private Map<String, List<Integer>> scores = new HashMap<>();

    @Override
    public Student addStudent(String id, Student student) {
        //Student student = new Student(id);
        return student;
    }

    @Override
    public List<Student> getAllStudents() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Student removeStudent(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getStudentScore(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getAverageScore(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    private String marshallStudent(Student student) {
    String studentAsText = student.getId() + DELIMITER 
            + student.getFirstName() + DELIMITER 
            + student.getLastName() + DELIMITER 
            + student.getScore();
    return studentAsText;    
    }
    
    
    private Student unmarshallStudent(String studentAsText) {
        String[] studentTokens = studentAsText.split(DELIMITER);
        String id = studentTokens[0];
        Student studentFromFile = new Student(id);
        studentFromFile.setFirstName(studentTokens[1]);
        studentFromFile.setLastName(studentTokens[2]);
        studentFromFile.setScore(studentTokens[3]);
        return studentFromFile;
    }
}
