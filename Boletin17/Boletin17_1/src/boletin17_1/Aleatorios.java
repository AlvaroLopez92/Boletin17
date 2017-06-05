
package boletin17_1;

import java.util.ArrayList;


public class Aleatorios {
    
    private int numero_generado;
   
    int [] Generar = new int [6];    
public void generaNumeros (){

    for (int i=0; i<Generar.length; i++)
        
        Generar [i] = numero_generado=(int)Math.floor(Math.random()*50+1);
        
    }

public void visualizar (){

    for (int i=Generar.length-1; i>0; i--)
        System.out.print(Generar[i] + ", ");
    

}
    




}

    
   




    
    

