/*
Olaff Medina Peña
Programa: Calculadora
Ingenieria en Sistemas Computacionales 4to
*/

import java.util.*;
import javax.swing.*;
import java.awt.event.*;

public class CalculadoraOlaff extends JFrame{
   //declaracion de variables
   JTextField num1;
   JTextField num2;
   JButton sumar;
   JButton restar;
   JButton multiplicar;
   JButton dividir;
   JButton salir;
   
   JLabel n1, n2, resultado, letrero;
   JPanel panel; 
   
   //metodo constructor
   public CalculadoraOlaff(){
         initComponents();
   }//constructor
   
   
   //inicializamos las variables de los componentes
   public void initComponents(){
         setSize(500,300);
         num1 = new JTextField(8);
         num2 = new JTextField(8);
         sumar = new JButton("+");
         restar = new JButton("-");
         multiplicar = new JButton("*");
         dividir = new JButton("/");
         salir = new JButton("Salir");
         n1 = new JLabel("Numero 1");
         n2 = new JLabel("Numero 2");
         letrero = new JLabel("Calculadora Olaff");
         resultado = new JLabel();
         
         
         //crear los escuchadores
         sumar.addMouseListener(new MyListenerSumar());
         restar.addMouseListener(new MyListenerRestar());
         multiplicar.addMouseListener(new MyListenerMultiplicar());
         dividir.addMouseListener(new MyListenerDividir());
         salir.addMouseListener(new MyListenerSalir());
         
         //creamos el panel y lo hacemos visible
         panel = new JPanel();
         setTitle("Calculadora");
         panel.add(letrero);
         panel.add(n1);
         panel.add(num1);
         panel.add(n2);
         panel.add(num2);
         panel.add(sumar);
         panel.add(restar);
         panel.add(multiplicar);
         panel.add(dividir);
         panel.add(salir);
         panel.add(resultado);
         setContentPane(panel);
         setVisible(true);

   }//initComponents
   
   private class MyListenerSumar extends MouseAdapter{
         double no1, no2, result;
         public void mouseClicked(MouseEvent event){
            no1 = Double.parseDouble(num1.getText());//aqui convertimos el string en numero
            no2 = Double.parseDouble(num2.getText());
            result = no1+no2;
            //para que algo se pueda imprimir en la interfaz, tiene que ser todo de tipo String
            resultado.setText("Resultado "+String.valueOf(result));

         
         }
   }//MyListenerSumar
   
   private class MyListenerRestar extends MouseAdapter{
         double no1, no2, result;
         public void mouseClicked(MouseEvent event){
            no1 = Double.parseDouble(num1.getText());//aqui convertimos el string en numero
            no2 = Double.parseDouble(num2.getText());
            result = no1-no2;
            //para que algo se pueda imprimir en la interfaz, tiene que ser todo de tipo String
            resultado.setText("Resultado "+String.valueOf(result));

         
         }
   }//MyListenerSumar
   
   
   private class MyListenerMultiplicar extends MouseAdapter{
         double no1, no2, result;
         
         public void mouseClicked(MouseEvent event){
            no1 = Double.parseDouble(num1.getText());//aqui convertimos el string en numero
            no2 = Double.parseDouble(num2.getText());
            result = no1*no2;
            //para que algo se pueda imprimir en la interfaz, tiene que ser todo de tipo String
            resultado.setText("Resultado "+String.valueOf(result));

         
         }
   }//MyListenerSumar
   
   private class MyListenerDividir extends MouseAdapter{
         double no1, no2, result;
         public void mouseClicked(MouseEvent event){
            no1 = Double.parseDouble(num1.getText());//aqui convertimos el string en numero
            no2 = Double.parseDouble(num2.getText());
            result = no1/no2;
            //para que algo se pueda imprimir en la interfaz, tiene que ser todo de tipo String
            resultado.setText("Resultado "+String.valueOf(result));

         
         }
   }//MyListenerSumar
   
   private class MyListenerSalir extends MouseAdapter{
         public void mouseClicked(MouseEvent event){
            System.exit(0); 
         }
   }//MyListenerSumar
   
}//class calculadora


