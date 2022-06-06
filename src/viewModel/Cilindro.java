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
public class Cilindro extends Figuras implements Circular {
    private double altura, radio, diametro;
    // Constructor
    public Cilindro(double radio, double altura){
        this.radio = radio;
        this.altura = altura;
        setDiametro(radio);
        setArea();
        setPerimetro();
    }
    // Sobreescribe método de Circular
    @Override
    public void setDiametro(double radio){
        this.diametro = radio * 2;
    }
    
    // Sobreescribe de Figuras
    @Override
    public void setPerimetro(){
        this.perimetro = diametro + altura;
    }
    @Override
    public void setArea(){
        this.area = altura * diametro * PI;
    }
    @Override
    public String verArea(){
        String msg = String.valueOf(getArea()) + "cm3";        
        return msg;
    }
        
}
