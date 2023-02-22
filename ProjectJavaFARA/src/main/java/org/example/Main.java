package org.example;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*System.out.println("Hello world!");
        System.out.println("Fernando Arturo Rodriguez Arevalo");
        int miEntero = 10;
        float miPuntoFlotante = 0.5f;
        double miDecimal = 22.5;
        String miTexto = "Hola soy un texto en Java";
        char micaracter = 'a';


        Scanner miescaner = new Scanner(System.in);

        int numero;
        numero = miescaner.nextInt();

        System.out.println("Mi numero que acabo de ingresar es: " + numero);*/


        /*Scanner miescaner = new Scanner(System.in);


        int numero1;
        int numero2;

        numero1 = miescaner.nextInt();
        numero2 = miescaner.nextInt();
        int suma = numero1 + numero2;



        System.out.println("La suma de los dos numeros es: " +suma);*/

        //Desarrollar un programa que le pida al usuario su nombre, su edad, su peso y su altura y que calcule su
        // imc(índice de masa corporal) es peso/altura2 o peso/altura * altura y al final que muestre una ficha de todos esos datos


        Scanner miescaner = new Scanner(System.in);
        String miTexto = "Nombre";

        String nombre;
        int edad;
        double peso;
        double altura;
        double IMC;

        nombre = miescaner.nextLine();
        edad = miescaner.nextInt();
        peso = miescaner.nextDouble();
        altura = miescaner.nextDouble();
        IMC = miescaner.nextDouble();
        double division = peso / altura * altura;

        System.out.println("El nombre del usuario es: " +nombre);
        System.out.println("La edad del usuario es: " +edad);
        System.out.println("El peso del usuario es: " +peso);
        System.out.println("La altura del usuario es: " +altura);
        System.out.println("El IMC del usuario es: " +IMC);






    }
}