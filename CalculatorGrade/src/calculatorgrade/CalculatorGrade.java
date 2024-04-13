/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculatorgrade;
import java.util.Scanner;
/**
 *
 * @author Rafael Tajiri
 */
public class CalculatorGrade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Student st1 = new Student();
        System.out.print("Student name: ");
        st1.setName(sc.nextLine());
        System.out.print("Grade first semester: ");
        st1.setGradeFirstSem(sc.nextDouble());
        System.out.print("Grade second semester: ");
        st1.setGradeSecondSem(sc.nextDouble());
        System.out.print("Grade third semester: ");
        st1.setGradeThirdSem(sc.nextDouble());
        
        st1.calcFinalGrade();
        
        System.out.println("\nFinal Grade = " + st1.getFinalGrade());
        System.out.println(st1.situation());
    }
    
}
