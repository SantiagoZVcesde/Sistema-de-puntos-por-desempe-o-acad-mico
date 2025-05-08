package org.example;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double Nota_uno = 0;
        double Nota_dos = 0;
        double Nota_tres = 0;
        double Asistencia = 0;
        double Suma_De_notas = 0;
        double Pomedio_de_notas = 0;
        double Nota_mas_baja = 0;
        double puntos_extras = 0;
        double Nota_final = 0;

        System.out.println("Ingrese las notas de 3 materias (0.0 a 5.0):");
        System.out.println("Nota uno:");
        Nota_uno = sc.nextDouble();
        System.out.println("Nota dos:");
        Nota_dos = sc.nextDouble();
        System.out.println("Nota tres:");
        Nota_tres = sc.nextDouble();

        System.out.println("Ingrese el total de asistencias :");
        Asistencia = sc.nextInt();

        Suma_De_notas = Nota_uno + Nota_dos + Nota_tres;
        Pomedio_de_notas = Suma_De_notas / 3;

        if (Nota_uno <= Nota_dos) {
            if (Nota_uno <= Nota_tres) {
                Nota_mas_baja = Nota_uno;
            } else {
                Nota_mas_baja = Nota_tres;
            }
        } else {
            if (Nota_dos <= Nota_tres) {
                Nota_mas_baja = Nota_dos;
            } else {
                Nota_mas_baja = Nota_tres;
            }
        }

        double division = Asistencia / 5;
        if (division == (int)division) {
            puntos_extras = division;
        } else {
            if (division > 0) {
                puntos_extras = (int)division;
            } else {
                puntos_extras = (int)division - 1;
            }
        }

        double suma_nota = Pomedio_de_notas + puntos_extras;
        if (suma_nota < 5.0) {
            Nota_final = suma_nota;
        } else {
            Nota_final = 5.0;
        }

        System.out.println("La suma total de las notas es:" + Suma_De_notas);
        System.out.println("El promedio general es de:" + Pomedio_de_notas);
        System.out.println("La nota mas baja es de:  " + Nota_mas_baja);
        System.out.println("Los puntos adicionales de las asistencias es:" + puntos_extras);
        System.out.println("La nota final es de:  " + Nota_final);

        if (Nota_final >= 4.5) {
            System.out.println("Cumples con los requisitos para la beca");
        }
        else {
            System.out.println("No cumples con los requisitos para la beca");
        }
    }
}