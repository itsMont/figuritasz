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
public class Cuadrado extends Figuras {
    private double longitud;
    public Cuadrado(double longitud){
        this.longitud = longitud;
        setPerimetro();
        setArea();
    }
    @Override
    public void setArea(){
        this.area = longitud*longitud;
    }
    @Override
    public void setPerimetro(){
        this.perimetro = longitud*4;
    }
}
    