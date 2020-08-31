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
class GradeBook {
 private String courseName; 
 private int[][] grades; 


 public GradeBook( String name, int[][] gradesArray )
 {
 courseName = name; 
 grades = gradesArray; 
 } 
 public void setCourseName( String name )
 {
 courseName = name; 
 } 
 public String getCourseName()
 {
 return courseName;
 } 
 public void displayMessage()
 {
 
 System.out.printf( "Welcome to the grade book for\n%s!\n\n",
 getCourseName() );
 } 
 public void outputGrades()
 {
 System.out.println( "The grades are:\n" );
 System.out.print( " " ); 
 for ( int test = 0; test < grades[ 0 ].length; test++ )
 System.out.printf( "  Test %2d  ", test + 1 );
 System.out.println( "Average" ); 
 for ( int student = 0; student < grades.length; student++ )
 {
 System.out.printf( "Student %2d", student + 1 );
 for ( int test : grades[ student ] ) 
 System.out.printf( "%8d", test );
 
 double average = getAverage( grades[ student ] );
 System.out.printf( "%9.2f\n", average );
   } 
 } 

 public void processGrades()
 {

 outputGrades();
 
 System.out.printf( "\n%s %d\n%s %d\n\n",
 "Lowest grade in the grade book is", getMinimum(),
 "Highest grade in the grade book is", getMaximum() );
 
 outputBarChart();
 } 
 public void outputBarChart()    {       
        System.out.println( "Overall grade distribution:" );
     
 
           int[] frequency = new int[ 11 ];        
           for ( int[] studentGrades : grades )     
           {          
               for ( int grade : studentGrades )            
                   ++frequency[ grade / 10 ];       
           }         
           for ( int count = 0; count < frequency.length; count++ )      
           {          
               if ( count == 10 )            
                   System.out.printf( "%5d: ", 100 );
                      else            
           System.out.printf( "%02d-%02d: ",                 count * 10, count * 10 + 9  );                            
               for ( int stars = 0; stars < frequency[ count ]; stars++ )             
                   System.out.print( "*" ); 
 
         System.out.println(); 
 }
} 
 
        public double getAverage( int[] setOfGrades )    {             
               int total = 0;
 
               for ( int grade : setOfGrades )         
                    total += grade; 
 
             
               return (double) total / setOfGrades.length;    
}  
 

 
 
         public int getMaximum()    {       
             int highGrade = grades[ 0 ][ 0 ];
         
 
           for ( int[] studentGrades : grades )       
           {          
               for ( int grade : studentGrades )          
               {             
                   if ( grade > highGrade )             
                       highGrade = grade;
                }      
           } 
 
              return highGrade; 
         } 
 
 
 
         public int getMinimum()   {        
             int lowGrade = grades[ 0 ][ 0 ];
         
            for ( int[] studentGrades : grades )       
            {                   
                for ( int grade : studentGrades )          
                {             
                    if ( grade < lowGrade )               
                        lowGrade = grade;
                }          
            } 
 
              return lowGrade;   
        }
    }
