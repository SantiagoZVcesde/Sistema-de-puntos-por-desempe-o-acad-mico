package org.example;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double notaUno = 0;
        double notaDos = 0;
        double notaTres = 0;
        double asistencia = 0;
        double sumaDeNotas = 0;
        double promedioDeNotas = 0;
        double notaMasBaja = 0;
        double puntosExtras = 0;
        double notaFinal = 0;

        System.out.println("Ingrese las notas de 3 materias (0.0 a 5.0):");
        System.out.println("Nota de materia uno:");
        notaUno = sc.nextDouble();
        System.out.println("Nota de materia dos:");
        notaDos = sc.nextDouble();
        System.out.println("Nota de materia tres:");
        notaTres = sc.nextDouble();

        System.out.println("Ingrese el total de asistencias :");
        asistencia = sc.nextInt();

        sumaDeNotas = notaUno + notaDos + notaTres;
        promedioDeNotas = sumaDeNotas / 3;

        if (notaUno <= notaDos) {
            if (notaUno <= notaTres) {
                notaMasBaja = notaUno;
            } else {
                notaMasBaja = notaTres;
            }
        } else {
            if (notaDos <= notaTres) {
                notaMasBaja = notaDos;
            } else {
                notaMasBaja = notaTres;
            }
        }

        double division = asistencia / 5;
        if (division == (int)division) {
            puntosExtras = division;
        } else {
            if (division > 0) {
                puntosExtras = (int)division;
            } else {
                puntosExtras = (int)division - 1;
            }
        }

        double sumaNota = promedioDeNotas + puntosExtras;
        if (sumaNota < 5.0) {
            notaFinal = sumaNota;
        } else {
            notaFinal = 5.0;
        }

        System.out.println("La suma total de las notas es:" + sumaDeNotas);
        System.out.println("El promedio general es de:" + promedioDeNotas);
        System.out.println("La nota mas baja es de:  " + notaMasBaja);
        System.out.println("Los puntos adicionales de las asistencias es:" + puntosExtras);
        System.out.println("La nota final es de:  " + notaFinal);

        if (notaFinal >= 4.5) {
            System.out.println("Cumples con los requisitos para la beca");
        }
        else {
            System.out.println("No cumples con los requisitos para la beca");
        }
    }
}