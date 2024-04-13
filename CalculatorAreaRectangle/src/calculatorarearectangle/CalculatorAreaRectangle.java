/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculatorarearectangle;   
import java.util.Scanner;

/**
 *
 * @author Rafael Tajiri
 */
public class CalculatorAreaRectangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        Rectangle r1 = new Rectangle();
        System.out.println("Enter rectangle width and height: ");
        r1.setWidth(sc.nextDouble());
        r1.setHeight(sc.nextDouble());
        System.out.println("Area = " + r1.calcArea());
        System.out.println("Perimeter = " + r1.calcPerimeter());
        System.out.println("Diagonal = " + r1.calcDiagonal());
    }
    
}
