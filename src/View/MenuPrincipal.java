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
public class MenuPrincipal implements ActionListener {
      
    // Elementos de ventana
    private JFrame ventanaMenu;
    private JPanel panelPrincipal;
    private ImageIcon img;
    private JLabel imgLabel;
    private JLabel resultados;
    private JButton botonAccion;
    private JLabel anuncio1;
    private JTextField campoIngreso;
    
    // Método de actionPerfomed
    @Override
    public void actionPerformed(ActionEvent e){
        int num = Integer.parseInt(campoIngreso.getText());
        Cuadrado square = new Cuadrado(num);
        resultados.setText(square.verArea());
    }
    
    public void init(){
        ventanaMenu = new JFrame("Inicio | Figurasz");
        panelPrincipal = new JPanel();
        // BotonAccion valores - acciones
        botonAccion = new JButton("Calcular");
        botonAccion.setPreferredSize(new Dimension(150,60));
        botonAccion.setFont(new Font("Roboto Light", Font.PLAIN, 25));
        botonAccion.addActionListener(this);
        
        resultados = new JLabel("Area: ");
        // Label Anuncio 1
        anuncio1 = new JLabel("Ingrese número");
        anuncio1.setFont(new Font("Roboto Black", Font.PLAIN, 25));
        // Text Field Valores
        campoIngreso = new JTextField();
        campoIngreso.setPreferredSize(new Dimension(50,60));
        campoIngreso.setFont(new Font("Roboto", Font.BOLD, 25));
        
        // Imagen de APP
        img = new ImageIcon(getClass().getResource("img/clip-221.png"));
        imgLabel = new JLabel(img);
        imgLabel.setPreferredSize(new Dimension(500, 900));
     
        
        // Valores del panelPrincipal 
        // Border(int top, int left, int bottom, int right)
        panelPrincipal.setBorder(BorderFactory.createEmptyBorder(30,40,200,200));
        
        // Ventana de Menu
        ventanaMenu.setBounds(250, 120, 900, 1200);
        ventanaMenu.setVisible(true);
        
        // Agregar componentes a ventana

        panelPrincipal.add(botonAccion);
        panelPrincipal.add(anuncio1);
        panelPrincipal.add(campoIngreso);
        panelPrincipal.add(imgLabel);
        panelPrincipal.add(resultados);
        ventanaMenu.add(panelPrincipal);
        
        // Detiene proceso cuando cierro ventana
        ventanaMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
  
    
}
