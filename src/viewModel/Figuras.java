package viewModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public abstract class Figuras {
    protected double area;
    protected double perimetro;
        
    // Setters
    public abstract void setArea();
    public abstract void setPerimetro();
    // Getters
    public double getArea() {
        return area;
    }
    public double getPerimetro() {
        return perimetro;
    }
    
    // Métodos en Común para todas las figuras
    public String verArea(){
        String msg = String.valueOf(getArea()) + "cm2";
        return msg;
    }
    public void verPerimetro(){
        System.out.printf("%.2fcm\n", getPerimetro());
    }
    
}
