package org.example;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
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


        /*Scanner miescaner = new Scanner(System.in);
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
        System.out.println("El IMC del usuario es: " +IMC);*/

        //Desarrollar un programa que le pida al usuario su nombre, apellido, domicilio, cuanto cotizo en 2022, x
        // calcular cuanto impuesto va a pagar.
        //Declarar constante de ISR = 12%
        //mostrar los datos al usuario

        /*Scanner scanner = new Scanner(System.in);
        String nom, apel, dom;
        Double cotizo2022, impuestoApagar;
        final double isr = 0.12;

        System.out.println("Ingresa tu nombre: ");
        nom = scanner.nextLine();
        System.out.println("Ingresa tu apellido: ");
        apel = scanner.nextLine();
        System.out.println("Ingresa tu domicilio: ");
        dom = scanner.nextLine();
        System.out.println("Ingresa la cantidad que cotizaste en 2022: ");
        cotizo2022 = scanner.nextDouble();

        impuestoApagar = cotizo2022 * isr;

        System.out.println("NOmbre: " + nom);
        System.out.println("Apellido: " + apel);
        System.out.println("Domicilio: " +dom);
        System.out.println("Cotiazdo 2022: " + cotizo2022);
        System.out.println("Impuesto a pagar (ISR): " + impuestoApagar);*/

        //paso 1 pedir al usuario nombre, apellido, domicilio, precio de su carro
        //paso 2 calcular el impuesto de tenencia vale 1.3% del costo del carro

        /*Scanner scanner = new Scanner(System.in);
        String nom, apel, dom;
        double preciocarro;
        final double impuestotenencia = 0.013;
        double impuestoApagar;

        System.out.println("Ingresa tu nombre: ");
        nom = scanner.nextLine();
        System.out.println("Ingresa tu apellido: ");
        apel = scanner.nextLine();
        System.out.println("Ingresa tu domicilio: ");
        dom = scanner.nextLine();
        System.out.println("Ingresa el precio de tu carro: ");
        preciocarro =scanner.nextDouble();

        impuestoApagar = preciocarro * impuestotenencia;

        System.out.println("Nombre: " +nom);
        System.out.println("Apellido: " +apel);
        System.out.println("Domicilio: " +dom);
        System.out.println("Preciocarro: " +preciocarro);
        System.out.println("ImpuestoApagar:" +impuestoApagar);*/

        int a = 10;
        int b = 5;
        int c = 3;
        if(a > b){
            System.out.println("a es mayor que b");
        }else{
            System.out.println("a no es mayor que b");
        }









    }
}