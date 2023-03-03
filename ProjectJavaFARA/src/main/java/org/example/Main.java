package org.example;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Desarrollar un programa que le pregunte al usuario 3 numeros
        //y decirle cuañ es mayor de los 3

        /*Scanner scanner = new Scanner (System.in);
        int num1, num2, num3, num4;
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();
        num4 = scanner.nextInt();
        int mayor;
        System.out.println("Ingresaste el numero 1: " +num1);
        System.out.println("Ingresaste el numero 2: " +num2);
        System.out.println("Ingresaste el numero 3: " +num3);
        System.out.println("Ingresaste el numero 4: " +num4);

        if (num1 > num2 && num1 > num3 ){//SI
            System.out.println("El numero 1 es mayor a num2, num3");
        }
        else if(num2 > num3 && num2 > num1 ){ //sino
            System.out.println("El numero 2 es mayor a num1, num3");
        } else if (num3>num2&&num3>num1) {
            System.out.println("El numero 3 es mayor a num2, num1");
        }else if(num4>num1 && num4>num2 && num4>num3){
            System.out.println("El numero 4 es mayor a num1,num2,num3");
        }
        else{
            System.out.println("Los numeros son iguales");
        }
        System.out.println();*/

        //Control de flujo de programa
        /*for(int i = 0; i < 10; i++){
            System.out.println("i vale: " +i);            
        }*/



        /*Scanner scanner = new Scanner (System.in);
        for(int i = 0; i < 5; i++){
            String nom;
            System.out.println("Ingresa tu nombre: ");
            nom = scanner.nextLine();
            System.out.println("Nombre: "+nom);
        }*/

        /*Scanner scanner = new Scanner (System.in);
        for(int i= 0; i < 3; i++){
            int num1;
            System.out.println("Ingresa un numero: ");
            num1 = scanner.nextInt();
            System.out.println("Numero1: "+num1);
        }*/

        /*Scanner scanner = new Scanner (System.in);
        int num1,num2;
        int suma;
        for(int i = 0; i < 6; i++){

            System.out.println("Ingresa un numero 1: ");
            num1 = scanner.nextInt();
            System.out.println("Ingresa un numero 2: ");
            num2 = scanner.nextInt();
            suma = num1 + num2;
            System.out.println("La suma es: "+suma);

        }*/

        /*Scanner scanner = new Scanner (System.in);
        int edad;

        for(int i = 0; i < 4; i++){
            System.out.println("Ingresa tu edad: ");
            edad = scanner.nextInt();
            System.out.println("Tu edad es: "+edad);
            if( edad > 17){
                System.out.println("Es mayor de edad: ");
            }else{
                    System.out.println("Es menor de edad");
                }

        }*/
        Scanner miescaner = new Scanner(System.in);
        double miArraydouble[] = new double[7];
        for(int i = 0; i < 7; i ++){
            miArraydouble[i] = miescaner.nextDouble();
        }















    }
}