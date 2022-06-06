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
public class Circulo extends Figuras implements Circular{
    private double radio;
    private double diametro;
    // Constructor
    public Circulo(double radio){
        this.radio = radio;
        setArea();
        setPerimetro();
        setDiametro(radio);
    }
    // Sobreescribir métodos de clase Figuras
    @Override
    public void setArea(){
        this.area = PI * (radio*radio);
    }
    @Override
    public void setPerimetro(){
        this.perimetro = 2 * radio * PI;
    }
    // desde interfaz circular
    @Override
    public void setDiametro(double radio){
        this.diametro = 2*radio;
    };
    // Getters
    public double getDiametro() {
        return diametro;
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    
}
