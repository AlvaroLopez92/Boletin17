/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin17_3;

import javax.swing.JOptionPane;

/**
 *
 * @author alopezcobo
 */
public class NotasDam {
//23
    int alumnos = 5; //Cantidad de alumnos
    int notasAlumnos[] = new int[alumnos];
    String nombresAlumnos[] = new String[alumnos];

    public void cargarNotas() {

        for (int i = 0; i < nombresAlumnos.length; i++) {
            nombresAlumnos[i] = JOptionPane.showInputDialog(null, " ¿Nombre del alumno -" + (i + 1) + "-?");
        }

        for (int j = 0; j < notasAlumnos.length; j++) {

            notasAlumnos[j] = Integer.parseInt(JOptionPane.showInputDialog(null, " Alumno " + nombresAlumnos[j] + ".\n "
                    + "Introduzca su nota"));
        }

    }

    public void verNotaAlumno() {
        String aux;

        aux = JOptionPane.showInputDialog(null, "¿De que alumnos desea saber la nota?");

        if (nombresAlumnos[alumnos].equals(aux)) {
            System.out.println("El alumno " + aux + " tiene el nº ");
        }

    }

    public void verNotasGenerales() {
        int aprobados = 0;
        int suspensos = 0;
        for (int i = 0; i < notasAlumnos.length; i++) {
            if (notasAlumnos[i] > 4) {
                aprobados++;
            } else {
                suspensos++;
            }
        }

        System.out.println("NOTAS DAM\n" + "Aprobados= " + aprobados + "\nSuspensos= " + suspensos);

    }

    public void calcularMedia() {
        int suma = 0;

        for (int i = 0; i < notasAlumnos.length; i++) {
            suma = suma + notasAlumnos[i];
        }
        int media = suma / notasAlumnos.length;

        System.out.println("La media de los " + (notasAlumnos.length) + " alumnos es = " + media);
    }

    public void verNotaMasAlta() {
        int maximo = 0;
        for (int i = 0; i < notasAlumnos.length; i++) {
            if (notasAlumnos[i] > maximo) {
                maximo = notasAlumnos[i];
            }
        }
        System.out.println("La nota más alta de la clase es= " + maximo);

    }
}
