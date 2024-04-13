/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calcsalary;
import java.util.Scanner;
/**
 *
 * @author Rafael Tajiri
 */
public class CalcSalary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        Employee emp1 = new Employee();
        System.out.print("Name: ");
        emp1.setName(sc.nextLine());
        System.out.print("Gross salary: ");
        emp1.setGlossSalary(sc.nextDouble());
        System.out.print("Tax: ");
        emp1.setTax(sc.nextDouble());
        
        System.out.println("\nEmployee: " + emp1.getName() + ", R$ " + emp1.netSalary());
        
        System.out.print("\nWhich percentage to increase salary? ");
        System.out.println("\nUpdate data: " + emp1.getName() + ", R$" + emp1.increaseSalary(sc.nextDouble()));
    }
    
}
