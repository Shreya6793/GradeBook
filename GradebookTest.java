/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GradebookTest;

/**
 *
 * @author LodhS5962
 */
public class GradebookTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] gradesArray = { { 87, 96, 70 },
                      { 68, 87,90 },
                      { 94, 100, 90 },
                      { 100, 81, 82 },
                      { 83, 65, 85 },
                      { 78, 87, 65 },
                      { 85, 75, 83 },
                      { 91, 94, 100 },
                      { 76, 72, 84 },
                      { 87, 93, 73 }};

 GradeBook myGradeBook = new GradeBook(
 "CSCI2315 Introduction to Data Structures!", gradesArray );
 myGradeBook.displayMessage();
 myGradeBook.processGrades();
    }
    
}
