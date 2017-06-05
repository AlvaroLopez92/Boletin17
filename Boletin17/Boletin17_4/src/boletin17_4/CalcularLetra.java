
package boletin17_4;



import java.util.ArrayList;


import javax.swing.JOptionPane;


public class CalcularLetra{
   
     char letra[] = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
   
    
   public void metodoNif(){
       
       int dni = (Integer.parseInt(JOptionPane.showInputDialog("Introduzaca  su DNI")));
       
       int resultado = dni%23;
      
       System.out.println(resultado+ "---> "+letra[resultado]);
       
   }
}