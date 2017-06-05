
package boletin17_2;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author alopezcobo
 */
public class notas_dam1 {
    

int notasAlumnos[] = new int[5];

    public void ponerNotas() {
        
        for (int i = 0; i < notasAlumnos.length; i++) {
            
                notasAlumnos[i] = Integer.parseInt(JOptionPane.showInputDialog(null," Alumno "+(i+1)+"\n "
                + "Introduzca nota"));
                
                //Modificacion

        }
    }
   
    public void verNotas(){
        int aprobados=0; 
        int suspensos=0;
        for (int i =0; i <notasAlumnos.length; i++) {
            if(notasAlumnos[i]>4){
                aprobados ++;             
            }else suspensos ++;    
        }
        
        System.out.println("NOTAS DAM\n"+"Aprobados= "+aprobados+"\nSuspensos= "+ suspensos);
        
    
}
    public void calcularNotaMedia(){
        int suma=0;

        for (int i =0; i < notasAlumnos.length; i++){
            suma= suma + notasAlumnos[i];
        }
        int media=suma/notasAlumnos.length;
        
        System.out.println("La media de los "+(notasAlumnos.length)+" alumnos es = "+media);
    }
    
    public void verNotaMasAlta (){
        int maximo =0;
        for (int i =0; i< notasAlumnos.length; i++){
            if (notasAlumnos[i]>maximo){
                maximo=notasAlumnos[i];
            }
        }System.out.println("La nota más alta de la clase es= "+maximo);
        
    }
}