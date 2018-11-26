package com.ipartek.formacion.ejercicos.iniciales;

import java.util.Scanner;

public class EstructuraSecuencial {

	public static void main(String[] args) {
//		1.      Programa Java que lea dos números enteros por teclado y los muestre por pantalla.
		
		//declaración de variables
        	//int n1, n2;
        //Scanner sc = new Scanner(System.in);
        //leer el primer número 
			//System.out.println("Introduce un número entero: "); 
        	//n1 = sc.nextInt();      //lee un entero por teclado
        //leer el segundo número
        	//System.out.println("Introduce otro número entero: "); 
        	//n2 = sc.nextInt();      //lee un entero por teclado
        //mostrar resultado
        	//System.out.println("Ha introducido los números: " + n1 + " y " + n2);

        	//sc.close();
        
//        2.      Programa Java que lea un nombre y muestre por pantalla:
		//        Scanner sc = new Scanner(System.in);
		//        String cadena;
		//        System.out.println("Introduce una frase: ");
		//        cadena = sc.nextLine();
		//        System.out.println("Has escrito: " + cadena);
		//        
		//        sc.close();
        
//		3.      Escribe un programa Java que lee un número entero por teclado y obtiene y muestra por pantalla el doble y el triple de ese número.
//		int n;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Introduce una número: ");
//		n = sc.nextInt();		
//		System.out.println("El número es: " + n);
//		System.out.println("El doble es: " + n*2);
//		System.out.println("El triple es: " + n*3);
//		
//		sc.close();
		
//		Ejercicio 4:
//			Programa que lea una cantidad de grados centígrados y la pase a grados Fahrenheit. 
//			La fórmula correspondiente para pasar de grados centígrados a fahrenheit es:
//			F = 32 + ( 9 * C / 5)
		
//		Scanner sc = new Scanner(System.in);
//	      double gradosC, gradosF;
//	      System.out.println("Introduce grados Centígrados:");
//	      gradosC = sc.nextDouble();
//	      gradosF = 32 + (9 * gradosC / 5);
//	      System.out.println(gradosC +" ºC = " + gradosF + " ºF");
//	      sc.close();
		
//		Ejercicio 5. Programa que lee por teclado el valor del radio de una circunferencia y calcula y muestra por pantalla la longitud y el área de la circunferencia. 
//
//		Longitud de la circunferencia = 2*PI*Radio, Area de la circunferencia = PI*Radio^2
		
//		Scanner sc = new Scanner(System.in);
//		double radio, longitud, area;
//		System.out.println("Introduce radio de la circunferencia:");
//		radio = sc.nextDouble();
//		longitud = 2*Math.PI*radio;
//		area = Math.PI*Math.pow(radio, 2);
//		System.out.println("El radio es: " + radio + ", " + "El area es: " + area + ", " + "La longitud es: " + longitud + "." );
//		sc.close();
		
//		Ejercicio 6. Programa que pase una velocidad en Km/h a m/s. La velocidad se lee por teclado.
//		Scanner sc = new Scanner(System.in);
//		double velocidadKm, velocidadM;
//		System.out.println("Introduce la velocidad en Km/h:");
//		velocidadKm = sc.nextDouble();
//		velocidadM = velocidadKm*1000/3600;
//		System.out.println(velocidadKm + " Km/h = " + velocidadM + " m/s");
//		sc.close();
		
//		Ejercicio 7. Programa lea la longitud de los catetos de un triángulo rectángulo y calcule la longitud de la hipotenusa según el teorema de Pitágoras.

//		Scanner sc = new Scanner(System.in);
//		double lado1, lado2, hipotenusa;
//		System.out.println("Introduce el primer lado:");
//		lado1 = sc.nextDouble();
//		System.out.println("Introduce el segundo lado:");
//		lado2 = sc.nextDouble();
//		hipotenusa = Math.sqrt(Math.pow(lado1, 2)+Math.pow(lado2, 2));
//		System.out.println("La Hipotenusa es: " + hipotenusa);
//		sc.close();
		
//		Ejercicio 10:
//		Programa Java que lea un número entero de 3 cifras y muestre por separado las cifras del número.
		
//		Scanner sc = new Scanner(System.in);
//        int N;
//        System.out.print("Introduzca valor de N: ");
//        N = sc.nextInt(); //supondremos que el número introducido tiene 3 cifras
//        
//        System.out.println("Primera cifra de " + N + " -> " + (N/100)); 
//        System.out.println("Cifra central de " + N + " -> " + (N/10)%10);
//        System.out.println("Última cifra  de " + N + " -> " + (N%10));
//        
//        sc.close();
		
		//Ejercicio 12:
//		Programa Java que lea un número entero N de 5 cifras y muestre sus cifras igual que en el ejemplo.
//		Por ejemplo para un número N = 12345
//		 Scanner sc = new Scanner(System.in);
//	        int N;
//	        System.out.print("Introduzca valor de N: ");
//	        N = sc.nextInt();  //supondremos que el número introducido tiene 5 cifras
//	        System.out.println(N%10);
//	        System.out.printf("%02d %n",N%100);
//	        System.out.printf("%03d %n",N%1000);
//	        System.out.printf("%04d %n",N%10000);
//	        System.out.printf("%05d %n",N);
//	        sc.close();
		
//		Ejercicio 13:
//		Programa que pida por teclado la fecha de nacimiento de una persona (dia, mes, año) y calcule su número de la suerte.
//		El número de la suerte se calcula sumando el día, mes y año de la fecha de nacimiento y a continuación sumando las cifras obtenidas en la suma.
		
//		Scanner sc = new Scanner(System.in);
//        int dia, mes, año, suerte, suma, cifra1, cifra2, cifra3, cifra4;
//        System.out.println("Introduzca fecha de nacimiento");
//        System.out.print("día: ");
//        dia = sc.nextInt();
//        System.out.print("mes: ");
//        mes = sc.nextInt();
//        System.out.print("año: ");
//        año = sc.nextInt();
//        suma = dia + mes + año;
//        cifra1 = suma/1000;      //obtiene la primera cifra
//        cifra2 = suma/100%10;  //obtiene la segunda cifra
//        cifra3 = suma/10%10;   //obtiene la tercera cifra
//        cifra4 = suma%10;        //obtiene la última cifra
//        suerte = cifra1 + cifra2 + cifra3 + cifra4;
//        System.out.println("Su número de la suerte es: " + suerte);
//        sc.close();
		
		
		
	}

}
