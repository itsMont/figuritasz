/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import javax.swing.*;
import java.awt.*;  
import java.awt.event.*;  

import viewModel.Cilindro;
import viewModel.Circulo;
import viewModel.Cuadrado;

/**
 *
 * @author Jhojan M
 */
public abstract class app {
    public static void main(String[] args) {
        MenuPrincipal app = new MenuPrincipal();
        app.init();
        
        // Crear figura circulo
        Circulo obj1 = new Circulo(3);
        System.out.println("Area Circulo: ");
        obj1.verArea();
        System.out.println("Perimetro CIrculo");
        obj1.verPerimetro();
        System.out.println(obj1.getDiametro());
        
        // Crear figura cilindro
        Cilindro obj2 = new Cilindro(3,4);
        System.out.println("Area Cilindro");
        obj2.verArea();
        System.out.println("Perimetro Cilindro");
        obj2.verPerimetro();
        
        // Crear cuadrado
        Cuadrado obj3 = new Cuadrado(8.2);
        System.out.println("área Cuadrado");obj3.verArea();
        System.out.println("Perimetro Cuadrado: ");
        obj3.verPerimetro();
        
    }
    
    
}
