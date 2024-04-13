/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calcsalary;

/**
 *
 * @author Rafael Tajiri
 */
public class Employee {
    private String name;
    private double glossSalary;
    private double tax;
    
    public Employee(String name, double glossSalary, double tax){
        this.name = name;
        this.glossSalary = glossSalary;
        this.tax = tax;
    }
    
    public Employee(){
        super();
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    public void setGlossSalary(double glossSalary){
        this.glossSalary = glossSalary;
    }
    
    public void setTax(double tax){
        this.tax = tax;
    }
    
    public double getTax(){
        return tax;
    }
    
    public double netSalary(){
        return glossSalary - tax;
    }
    
    public double increaseSalary(double percentage){
        return (glossSalary + (glossSalary * (percentage/100))) - tax;
    }
}
