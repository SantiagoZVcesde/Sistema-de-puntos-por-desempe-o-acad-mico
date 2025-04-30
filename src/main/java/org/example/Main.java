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
        Nota_mas_baja = Math.min(Nota_uno, Math.min (Nota_dos , Nota_tres));
        puntos_extras = Math.floor(Asistencia / 5);
        Nota_final = Math.min(5.0, Pomedio_de_notas + puntos_extras);

        System.out.println("La suma total de las notas es:" + Suma_De_notas);
        System.out.println("El promedio general es de:" + Pomedio_de_notas);
        System.out.println("La nota mas baja es de:  " + Nota_mas_baja);
        System.out.println("Los puntos adicionales de las asistencias es:" + puntos_extras);
        System.out.println("La nota final es de:  " + Nota_final);

        if (Nota_final >= 4.5){
            System.out.println("Cumples con los requisitos para la beca");
        }
        else {
            System.out.println("No cumples con los requisitos para la beca");
        }
    }
}