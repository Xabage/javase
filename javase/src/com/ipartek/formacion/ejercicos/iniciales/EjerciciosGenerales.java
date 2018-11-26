package com.ipartek.formacion.ejercicos.iniciales;

import java.io.IOException;
import java.util.Scanner;

public class EjerciciosGenerales {

	public static void main(String[] args) throws IOException {
		
		//Ejercicio 1
		
//		Intercambio de valores entre dos variables utilizando una variable auxiliar.
//
//		Programa para intercambiar el valor de dos variables. Los valores iniciales se leen por teclado.
//
//		Por ejemplo, suponiendo que las variables se llaman A y B, si A contiene 3 y B contiene 5, después del intercambio A contendrá 5 y B 3. 
//
//		En este ejemplo, para intercambiar el valor entre dos variables utilizaremos una variable auxiliar donde guardar el valor de una de ellas. Después veremos la forma de hacerlo sin usar una variable auxiliar para el intercambio. 
//
//		Las instrucciones a realizar son:
//
//		AUX = A;
//		A = B;
//		B = AUX;

//		Scanner sc = new Scanner(System.in);
//		int A, B, AUX;
//		System.out.println("Introduce el valor de A: ");
//		A = sc.nextInt();
//		System.out.println("Introduce el valor de B: ");
//		B = sc.nextInt();
//		System.out.println("Valores iniciales: A = " + A + "   B = " + B);
		
//		Intercambio
//		AUX = A;
//		A = B;
//		B = AUX;
//		System.out.println("Valores intercambiados: A = " + A + "   B = " + B);
//		
//		sc.close();
		
		
//		Intercambio de valores entre dos variables sin utilizar variable auxiliar. 
//		También se puede intercambiar el valor de dos variables sin utilizar una variable auxiliar.
//		En ese caso se resuelve utilizando aritmética básica: 
//		A = A + B;
//		B = A - B;
//		A = A - B;
		
//		Scanner sc = new Scanner(System.in);
//		int A, B, AUX;
//		System.out.println("Introduce el valor de A: ");
//		A = sc.nextInt();
//		System.out.println("Introduce el valor de B: ");
//		B = sc.nextInt();
//		System.out.println("Valores iniciales: A = " + A + "   B = " + B);
//		Intercambio
//		A=A+B;
//		B=A-B;
//		A=A-B;
//		System.out.println("Valores intercambiados: A = " + A + "   B = " + B);
//		
//		sc.close();
		
		//Ejercico 2
		
//		Programa Java que pide un número entero por teclado y calcula y muestra el número de cifras que tiene.
		
//		Scanner sc = new Scanner(System.in);
//        int n, cifras;
//        char car;
//        do {
//        	System.out.print("Introduce un número entero: ");
//        	n = sc.nextInt();
//        	cifras = 0;
//        	while(n!=0){
//        		n = n/10;
//        		cifras++;
//        	}
//        	System.out.println("El número tiene " + cifras+ " cifras");
//            System.out.print("Continuar? ");
//            car = (char)System.in.read();	
//        }while(car!='n' && car != 'N');
//        
//        sc.close();
		
		//Ejercicio 3
		
//		Programa Java que lee una temperatura expresada en grados centígrados y la convierte a grados kelvin. 
//
//		El proceso de leer grados centígrados se debe repetir mientras que se responda ‘S’ a la pregunta: Repetir proceso? (S/N)
//
//		Para hacer la conversión de grados Centígrados a grados Kelvin hay que utilizar la fórmula:
//
//		ºK = ºC + 273
		
//		Scanner sc = new Scanner(System.in);
//		double temperatura;
//		char car;
//        do{
//            System.out.print("Introduce temperatura en ºC: ");
//            temperatura = sc.nextDouble();
//            System.out.println("Grados Kelvin ..: " + (temperatura+273));
//            System.out.print("Repetir proceso? (S/N): " );
//            car = (char)System.in.read();            
//        }while(car=='S' || car=='s');
//        
//        sc.close();
		
		//Ejercico 4
		
//		Programa Java que lea un número entero N y muestre la tabla de multiplicar de ese número. Por ejemplo, si se lee el valor 7 se mostrará por pantalla:
		
//		Scanner sc = new Scanner(System.in);
//        int n;
//        System.out.print("Introduce un número entero: ");
//        n = sc.nextInt();
//        System.out.println("Tabla del " + n);
//        for(int i = 1; i<=10; i++){
//             System.out.println(n + " * " + i + " = " + n*i);
//        }
//        
//        sc.close();
		

		//Ejercico 6
		
//		Número perfecto en java
		
//		Un número es perfecto si es igual a la suma de todos sus divisores positivos sin incluir el propio número.
//
//		Por ejemplo, el número 6 es perfecto. 
//
//		El 6 tiene como divisores: 1, 2, 3 y 6 pero el 6 no se cuenta como divisor para comprobar si es perfecto.
//
//		Si sumamos 1 + 2 + 3 = 6 
//
//		Los siguientes números perfectos después del 6 son 28, 496, 8128, 33550336, 8589869056.
		
//		 int i, suma = 0, n;
//	        Scanner sc = new Scanner(System.in);
//	        System.out.println("Introduce un número: ");
//	        n = sc.nextInt();
//	        for(i=1; i<n; i++) {
//	        	if(n % i == 0) {
//	        		suma = suma + i;
//	        	}	        	
//	        }
//		if(suma == n) {
//			System.out.println(n + " es un número perfecto.");
//		}else
//			System.out.println(n + " NO es un número perfecto.");
//		
//		sc.close();
		
//		Utilizando el algoritmo anterior vamos a escribir ahora el programa Java que muestre los números perfectos entre 1 y 1000
//		int i, suma = 0, j;
//		System.out.println("Números perfectos entre 1 y 1000: ");
//        for(i=1;i<=1000;i++){    // i es el número que vamos a comprobar
//            suma=0;
//            for(j=1;j<i;j++){  // j son los divisores. Se divide desde 1 hasta i-1 
//                 if(i%j==0){
//                    suma=suma+j;     // si es divisor se suma
//                 }
//            }
//          if(i==suma){           // si el numero es igual a la suma de sus divisores es perfecto
//                 System.out.println(i);
//              }
//        }
		
//		Números pares del 1 al 100
		
//		int i;
//		System.out.println("Número pares del 1 al 100");
//		for(i=1; i<100; i++) {
//			if(i%2==0) {
//				System.out.println(i);
//			}
//		}
		
		//Ejercico 7
		
//		Números amigos en Java
		
//		Dos números enteros positivos A y B son números amigos si la suma de los divisores propios de A es igual a B y la suma de los divisores propios de B es igual a A.
//
//		Los divisores propios de un número incluyen la unidad pero no el propio número.
		
//		int i,suma=0, n1, n2;
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Introduce primer número: ");
//        n1 = sc.nextInt();
//        System.out.print("Introduce segundo número: ");
//        n2 = sc.nextInt();
//        for(i=1; i<n1; i++) { // for para sumar todos los divisores propios de n1
//        	if(n1%i==0) {
//        		suma = suma + i;
//        	}
//        }
     // si la suma de los divisores de n1 es igual a n2
        
//        if(suma == n2) {
//        	suma = 0;
//        	for(i=1; i<n2; i++) {
//        		if(n2%i==0) {
//        			suma = suma +i;
//        		}
//        	}
      // si la suma de los divisores de n2 es igual a n1
        	
//        	if(suma==n1) {
//        		System.out.println(n1 + " y " + n2 + " Son Amigos.");
//        	}else
//        		System.out.println("No son amigos.");
//        }
//	  
//        else{
//           System.out.println("No son amigos");
//        }
//        
//        sc.close();
		
		//Ejercico 8
        
//		Fibonacci en java
		
//		La serie de fibonacci la forman una serie de números tales que:
//
//			El primer término de la serie es el número 1
//			El segundo término de la serie es el número 1
//			Los siguientes términos de la serie de fibonacci se obtienen de la suma de los dos anteriores:
//
//			1, 1, 2, 3, 5, 8, 13, .....  

		Scanner sc = new Scanner(System.in);
        int numero,fibo1,fibo2,i;
        do{
            System.out.print("Introduce numero mayor que 1: ");
            numero = sc.nextInt();
        }while(numero<=1);
        System.out.println("Los " + numero + " primeros términos de la serie de Fibonacci son:"); 

        fibo1=1;
        fibo2=1; 

        System.out.print(fibo1 + " ");
        for(i=2;i<=numero;i++){
             System.out.print(fibo2 + " ");
             fibo2 = fibo1 + fibo2;
             fibo1 = fibo2 - fibo1;
        }
        System.out.println();
        sc.close();
	}
}
