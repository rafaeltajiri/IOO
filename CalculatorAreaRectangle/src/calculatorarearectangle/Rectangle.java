/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculatorarearectangle;

/**
 *
 * @author Rafael Tajiri
 */
public class Rectangle {
    private double width;
    private double height;
    
    public Rectangle(){
        super();
    }
    
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    
    public void setWidth(double width){
         this.width = width;
    }
    
    public double getWidth(){
        return width;
    }
    
    public void setHeight(double height){
         this.height = height;
    }
    
    public double getHeight(){
        return height;
    }
    
    public double calcArea(){
        
        return width * height;

    }
    
    public double calcPerimeter(){

        return width * 2 + height * 2;

    }
    
    public double calcDiagonal(){
        
        return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));

    }
}
