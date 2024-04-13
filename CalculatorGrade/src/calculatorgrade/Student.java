/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculatorgrade;

/**
 *
 * @author Rafael Tajiri
 */
public class Student {
    private String name;
    private double gradeFirstSem;
    private double gradeSecondSem;
    private double gradeThirdSem;
    private double finalGrade;
    
    public Student(){
        super();
    }
    
    public Student(double gradeFirstSem, double gradeSecondSem, double gradeThirdSem){
        this.gradeFirstSem = gradeFirstSem;
        this.gradeSecondSem = gradeSecondSem;
        this.gradeThirdSem = gradeThirdSem;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String name(){
        return name;
    }
    
    public void setGradeFirstSem(double gradeFirstSem){
        this.gradeFirstSem = gradeFirstSem;
    }
    
    public double getGradeFirstSem(){
        return gradeFirstSem;
    }
    
    public void setGradeSecondSem(double gradeSecondSem){
        this.gradeSecondSem = gradeSecondSem;
    }
    
    public double getGradeSecondSem(){
        return gradeSecondSem;
    }
    
    public void setGradeThirdSem(double gradeThirdSem){
        this.gradeThirdSem = gradeThirdSem;
    }
    
    public double getGradeThirdSem(){
        return gradeThirdSem;
    }
    
    public double getFinalGrade(){
        return finalGrade;
    }
    
    public void calcFinalGrade(){
        finalGrade = gradeFirstSem  + gradeSecondSem + gradeThirdSem;
    }
    
    public String situation(){
        if (finalGrade > 60){
            return ("Pass.");
        }
        else{
            double missing;
            missing = 60 - finalGrade;
            return ("Failed, missing " + missing + " points.");
        }
    }
}
