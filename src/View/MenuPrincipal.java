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
    private JLabel resultadoArea;
    private JButton botonAccion;
    private JButton botonSeleccion;
    private JLabel anuncio1;
    private JLabel anuncio2;
    private JTextField campoIngreso;
    private JLabel ingresarAltura;
    private JTextField campoAltura;
    
    // ComboBox para opciones de selección figura
    private JComboBox opciones;
    
     // Método de actionPerfomed para seleccionar
    @Override
    public void actionPerformed(ActionEvent e)
    {
        anuncio2.setText("Seleccionada Figura " + opciones.getSelectedItem());
        panelPrincipal.add(botonAccion);
        panelPrincipal.add(anuncio1);
        panelPrincipal.add(campoIngreso);
        
        // Cada vez que seleccione una figura reinicia el label del resultado del área
        resultadoArea.setText("Área");
        
        if (opciones.getSelectedItem() == "Cilindro") 
        {
            panelPrincipal.add(ingresarAltura);
            panelPrincipal.add(campoAltura);
        }
        else
        {
            // Si despues de seleccionar cilindro selecciona otra figura
            // Elimina los campos de cilindro
            panelPrincipal.remove(ingresarAltura);
            panelPrincipal.remove(campoAltura);
        }
    }
    
    public void init(){
        ventanaMenu = new JFrame("Inicio | Figuritasz");
        panelPrincipal = new JPanel();
        // opciones comboBox - Inicializar comboBox
        String [] figuras = {"Cuadrado","Circulo","Cilindro"};
        opciones = new JComboBox(figuras);
        
        // Boton Seleccion Figura
        botonSeleccion = new JButton("Seleccionar");
        botonSeleccion.setPreferredSize(new Dimension(150,60));
        botonSeleccion.setFont(new Font("Roboto Light", Font.PLAIN, 18));
        botonSeleccion.addActionListener(this);
        
        // Deja declarado este Label para que después tenga un valor
        resultadoArea = new JLabel();
        // Label Anuncio 1
        anuncio1 = new JLabel("Ingrese número");
        anuncio1.setFont(new Font("Roboto Black", Font.PLAIN, 25));
        // Label Anuncio 2
        anuncio2 = new JLabel("Seleccione una figura");
        anuncio2.setFont(new Font("Roboto Italic", Font.PLAIN, 25));
        // Label Ingresar Altura
        ingresarAltura = new JLabel("Ingrese una altura");
        ingresarAltura.setFont(new Font("Roboto Italic", Font.PLAIN, 16));
        // Text Field Valores (Cuadrado - Longitud; Circulo - Radio)
        campoIngreso = new JTextField();
        campoIngreso.setPreferredSize(new Dimension(50,60));
        campoIngreso.setFont(new Font("Roboto", Font.BOLD, 25));
        // Text Field Cilindro Altura
        campoAltura = new JTextField();
        campoAltura.setPreferredSize(new Dimension(50,60));
        campoAltura.setFont(new Font("Roboto", Font.BOLD, 25));
        
        /* Imagen de APP
        img = new ImageIcon(getClass().getResource("img/clip-221.png"));
        imgLabel = new JLabel(img);
        imgLabel.setPreferredSize(new Dimension(500, 900));
        */
        
        // BOTONES
        
         // BotonAccion Calcular valores - acciones
        botonAccion = new JButton("Calcular");
        botonAccion.setPreferredSize(new Dimension(150,60));
        botonAccion.setFont(new Font("Roboto Light", Font.PLAIN, 18));
        
        // Agregar acción personalizada para este botón mediante clase anonima
        botonAccion.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                
                // Saber qué tipo de figura es para realizar operaciones
                try{
                    Double num = Double.parseDouble(campoIngreso.getText());
                    String tipoFigura = String.valueOf(opciones.getSelectedItem());
                    switch(tipoFigura){
                        case "Cuadrado":
                            Cuadrado square = new Cuadrado(num);
                            resultadoArea.setText("Área: " + String.valueOf(square.getArea()) );
                            break;
                        case "Cilindro":
                            Double altura = Double.parseDouble(campoAltura.getText());
                            Cilindro cilindro = new Cilindro(num, altura);
                            resultadoArea.setText("Área: " + String.valueOf(cilindro.getArea()) );
                            break;
                        case "Circulo":
                            Circulo circle = new Circulo(num);
                            resultadoArea.setText("Área: " + String.valueOf(circle.getArea()) );                
                            break;
                    }
                } 
                // En caso de que ocurra algo con el ingreso de datos en el formulario (Vacío u otro tipo de dato)
                catch(NumberFormatException exc){
                    JOptionPane.showMessageDialog(ventanaMenu,
                    "No ha ingresado un número en el campo designado.",
                    "Advertencia",
                    JOptionPane.WARNING_MESSAGE);
                }
                
                
            }
        });
        
        // Valores del panelPrincipal 
        // Border(int top, int left, int bottom, int right)
        panelPrincipal.setBorder(BorderFactory.createEmptyBorder(30,40,200,200));
        
        // Ventana de Menu
        ventanaMenu.setBounds(250, 120, 900, 1200);
        ventanaMenu.setVisible(true);
        
        // Agregar componentes a ventana
        panelPrincipal.add(opciones);
        panelPrincipal.add(botonSeleccion);
        //
        panelPrincipal.add(anuncio2);
        //panelPrincipal.add(campoIngreso);
        //panelPrincipal.add(imgLabel);
        panelPrincipal.add(resultadoArea);
        ventanaMenu.add(panelPrincipal);
        
        // Detiene proceso cuando cierro ventana
        ventanaMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
  
    
}
