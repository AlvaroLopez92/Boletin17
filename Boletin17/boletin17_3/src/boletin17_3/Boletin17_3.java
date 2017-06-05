package boletin17_3;

import javax.swing.JOptionPane;


public class Boletin17_3 {


    public static void main(String[] args) {
        
        
            NotasDam notas = new NotasDam();
            
    
    int seleccion;
    do{ 
    seleccion=Integer.parseInt(JOptionPane.showInputDialog("1.Introducir alumno \n2.Ver notas \n3.Maxima \n4.Media \n5.Buscar" ));
    switch(seleccion){
    case 1: notas.cargarNotas();
    break;
    case 2: notas.verNotasGenerales();
    break;
    case 3:notas.verNotaMasAlta();
    break;
    case 4: notas.calcularMedia();
    break;
     case 5: notas.verNotaAlumno();
    break;
    
    
    }

    

    }while(seleccion!=0);
    
    
    }}