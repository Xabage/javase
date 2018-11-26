package com.ipartek.formacion.ejercicos.iniciales;

import java.io.IOException;
import java.util.Scanner;
import java.io.*;

public class EjerciciosCondicionales {

	public static void main(String[] args) throws IOException{
//		1. Programa Java que lea un número entero por teclado y calcule si es par o impar.
//
//		Podemos saber si un número es par si el resto de dividir el número entre 2 es igual a cero. En caso contrario el número es impar
//
//		El operador Java que calcula el resto de la división entre dos números enteros o no es el operador %
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Introduce un número entero: ");
//		int numero;
//		numero = sc.nextInt();
//		if(numero%2==0) {
//			
//		System.out.println("El número " + numero + " es par.");			
//		}else {
//			System.out.println("El número " + numero + " es impar.");
//		}
//		sc.close();
		
//		3. Programa que lea un carácter por teclado y compruebe si es una letra mayúscula
		
//		Scanner sc = new Scanner(System.in);
//		char car;
//		System.out.println("Introduce una letra: ");
//		car = (char)System.in.read();
//		 if(Character.isUpperCase(car)) //utilizamos el método isUpperCase de la clase Character
//             System.out.println("Es una letra mayúscula");    
//          else
//              System.out.println("No es una letra mayúscula");  
//		sc.close();
		
//		Ejercicio 4: Programa que lea dos caracteres y compruebe si son iguales.
//		char car1, car2;
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Introduzca primer carácter: ");
//		car1 = (char)System.in.read(); //lee un carácter
//		sc.nextLine(); //saltar el intro que ha quedado en el buffer
//		System.out.print("Introduzca segundo carácter: ");
//		car2 = (char)System.in.read(); //lee el segundo carácter
//
//		if(car1 == car2)
//		System.out.println("Son iguales"); 
//		else
//		System.out.println("No son iguales"); 
//		sc.close();
		
		
		
//		Ejercicios básicos que utilizan la estructura repetitiva. 

		
//		1. Ejemplo de uso de while: Programa Java que muestre los números del 1 al 100 utilizando la instrucción while.
//		System.out.println("Numeros del 1 al 100: ");
//        int i=1;
//        while(i<=100) {
//                  System.out.println(i);
//                  i++;
//        }
		 
//		Ejercicio 6: Programa java que lea un carácter por teclado y compruebe si es un dígito numérico (cifra entre 0 y 9).
//
//		Vamos a escribir dos soluciones a este ejercicio. 
//
//		La primera consiste en comprobar si el carácter es un dígito mediante el método isDigit de la clase Character. Este método devuelve true si el carácter que se le pasa como parámetro es una cifra entre 0 y 9:
		
//		 char car1;
//	        System.out.print("Introduzca carácter: ");
//	        car1 = (char)System.in.read(); //lee un carácter
//	        if(Character.isDigit(car1)) //utilizamos el método isDigit de la clase Character
//	           System.out.println("Es un número");
//	        else
//	           System.out.println("No es un número");
		
//		Ejercicio 7: Programa que lea dos números por teclado y muestre el resultado de la división del primer número por el segundo. Se debe comprobar que el divisor no puede ser cero.
		
//		Scanner sc = new Scanner(System.in);
//        double dividendo, divisor;
//        System.out.print("Introduzca el dividendo: ");
//        dividendo = sc.nextDouble();
//        System.out.print("Introduzca el divisor: ");
//        divisor = sc.nextDouble();
//        if(divisor == 0) {
//        	System.out.println("No se puede dividir");
//        }else {
//        	//System.out.println(dividendo/divisor);
//        	System.out.println(dividendo + " / " + divisor + " = " + dividendo/divisor);   
//            System.out.printf("%.2f / %.2f = %.2f %n" , dividendo, divisor , dividendo/divisor);
//        }
//        sc.close();
		
//		Ejercicio 9:
//
//			Programa que lea por teclado tres números enteros H, M, S correspondientes a hora, minutos y segundos respectivamente, y comprueba si la hora que indican es una hora válida. 
//
//			Supondremos que se leemos una hora en modo 24 Horas, es decir, el valor válido para las horas será mayor o igual que cero y menor que 24.
//
//			El valor válido para los minutos y segundos estará comprendido entre 0 y 59 ambos incluidos
//		
//       Scanner sc = new Scanner(System.in);
//       int H, M, S;
//       System.out.println("Introduzca la hora: ");
//       H = sc.nextInt();
//       System.out.println("Introduzca los minutos: ");
//       M = sc.nextInt();
//       System.out.println("Introduzca los segundos: ");
//       S = sc.nextInt();
//       if(H>=0 && H<24 && M>=0 && M<60 && S>=0 && S<60) {
//    	   System.out.println(H + ":" + M + "." + S );
//       }else if(H<0 || H>24) {
//    	   System.out.println("Hora no válida");
//       }else if(M<0 || M>59) {
//    	   System.out.println("Minutos no válidos");
//       }else {
//    	   System.out.println("Segundos no válidos");
//       }
//       sc.close();
		
//		Ejercicio 10:

//			Programa que lea una variable entera mes y compruebe si el valor corresponde a un mes de 30 días, de 31 o de 28. Supondremos que febrero tiene 28 días. Se mostrará además el nombre del mes. Se debe comprobar que el valor introducido esté comprendido entre 1 y 12.
		Scanner sc = new Scanner(System.in);
        int mes;
        System.out.print("Introduzca número de mes: ");
        mes =  sc.nextInt();
        if(mes<1 || mes>12)
        	System.out.println("Mes incorrecto.");
        else {
        	switch (mes) {
    case 1: System.out.print("Enero");
            break;
    case 2: System.out.print("Febrero");
            break;
    case 3: System.out.print("Marzo");
            break;
    case 4: System.out.print("Abril");
            break;
    case 5: System.out.print("Mayo");
            break;
    case 6: System.out.print("Junio");
            break;
    case 7: System.out.print("Julio");
            break;
    case 8: System.out.print("Agosto");
            break;
    case 9: System.out.print("Septiembre");
            break;
    case 10: System.out.print("Octubre");
            break;
    case 11: System.out.print("Noviembre");
            break;
    case 12: System.out.print("Diciembre");
            break;
			
			}
        	if(mes == 4 || mes == 6 || mes == 9 || mes == 11) {
        		System.out.println(" tiene 30 días.");
        	}else if (mes == 2) {
        		System.out.println(" tiene 28 días.");
        	}else
        		System.out.println(" tiene 31 días");        	
        }
        sc.close();
	}

}
