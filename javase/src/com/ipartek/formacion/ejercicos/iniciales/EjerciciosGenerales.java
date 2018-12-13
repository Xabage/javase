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
//		Por ejemplo, suponiendo que las variables se llaman A y B, si A contiene 3 y B contiene 5, despu�s del intercambio A contendr� 5 y B 3. 
//
//		En este ejemplo, para intercambiar el valor entre dos variables utilizaremos una variable auxiliar donde guardar el valor de una de ellas. Despu�s veremos la forma de hacerlo sin usar una variable auxiliar para el intercambio. 
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
//		Tambi�n se puede intercambiar el valor de dos variables sin utilizar una variable auxiliar.
//		En ese caso se resuelve utilizando aritm�tica b�sica: 
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
		
//		Programa Java que pide un n�mero entero por teclado y calcula y muestra el n�mero de cifras que tiene.
		
//		Scanner sc = new Scanner(System.in);
//        int n, cifras;
//        char car;
//        do {
//        	System.out.print("Introduce un n�mero entero: ");
//        	n = sc.nextInt();
//        	cifras = 0;
//        	while(n!=0){
//        		n = n/10;
//        		cifras++;
//        	}
//        	System.out.println("El n�mero tiene " + cifras+ " cifras");
//            System.out.print("Continuar? ");
//            car = (char)System.in.read();	
//        }while(car!='n' && car != 'N');
//        
//        sc.close();
		
		//Ejercicio 3
		
//		Programa Java que lee una temperatura expresada en grados cent�grados y la convierte a grados kelvin. 
//
//		El proceso de leer grados cent�grados se debe repetir mientras que se responda �S� a la pregunta: Repetir proceso? (S/N)
//
//		Para hacer la conversi�n de grados Cent�grados a grados Kelvin hay que utilizar la f�rmula:
//
//		�K = �C + 273
		
//		Scanner sc = new Scanner(System.in);
//		double temperatura;
//		char car;
//        do{
//            System.out.print("Introduce temperatura en �C: ");
//            temperatura = sc.nextDouble();
//            System.out.println("Grados Kelvin ..: " + (temperatura+273));
//            System.out.print("Repetir proceso? (S/N): " );
//            car = (char)System.in.read();            
//        }while(car=='S' || car=='s');
//        
//        sc.close();
		
		//Ejercico 4
		
//		Programa Java que lea un n�mero entero N y muestre la tabla de multiplicar de ese n�mero. Por ejemplo, si se lee el valor 7 se mostrar� por pantalla:
		
//		Scanner sc = new Scanner(System.in);
//        int n;
//        System.out.print("Introduce un n�mero entero: ");
//        n = sc.nextInt();
//        System.out.println("Tabla del " + n);
//        for(int i = 1; i<=10; i++){
//             System.out.println(n + " * " + i + " = " + n*i);
//        }
//        
//        sc.close();
		

		//Ejercico 6
		
//		N�mero perfecto en java
		
//		Un n�mero es perfecto si es igual a la suma de todos sus divisores positivos sin incluir el propio n�mero.
//
//		Por ejemplo, el n�mero 6 es perfecto. 
//
//		El 6 tiene como divisores: 1, 2, 3 y 6 pero el 6 no se cuenta como divisor para comprobar si es perfecto.
//
//		Si sumamos 1 + 2 + 3 = 6 
//
//		Los siguientes n�meros perfectos despu�s del 6 son 28, 496, 8128, 33550336, 8589869056.
		
//		 int i, suma = 0, n;
//	        Scanner sc = new Scanner(System.in);
//	        System.out.println("Introduce un n�mero: ");
//	        n = sc.nextInt();
//	        for(i=1; i<n; i++) {
//	        	if(n % i == 0) {
//	        		suma = suma + i;
//	        	}	        	
//	        }
//		if(suma == n) {
//			System.out.println(n + " es un n�mero perfecto.");
//		}else
//			System.out.println(n + " NO es un n�mero perfecto.");
//		
//		sc.close();
		
//		Utilizando el algoritmo anterior vamos a escribir ahora el programa Java que muestre los n�meros perfectos entre 1 y 1000
//		int i, suma = 0, j;
//		System.out.println("N�meros perfectos entre 1 y 1000: ");
//        for(i=1;i<=1000;i++){    // i es el n�mero que vamos a comprobar
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
		
//		N�meros pares del 1 al 100
		
//		int i;
//		System.out.println("N�mero pares del 1 al 100");
//		for(i=1; i<100; i++) {
//			if(i%2==0) {
//				System.out.println(i);
//			}
//		}
		
		//Ejercico 7
		
//		N�meros amigos en Java
		
//		Dos n�meros enteros positivos A y B son n�meros amigos si la suma de los divisores propios de A es igual a B y la suma de los divisores propios de B es igual a A.
//
//		Los divisores propios de un n�mero incluyen la unidad pero no el propio n�mero.
		
//		int i,suma=0, n1, n2;
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Introduce primer n�mero: ");
//        n1 = sc.nextInt();
//        System.out.print("Introduce segundo n�mero: ");
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
		
//		La serie de fibonacci la forman una serie de n�meros tales que:
//
//			El primer t�rmino de la serie es el n�mero 1
//			El segundo t�rmino de la serie es el n�mero 1
//			Los siguientes t�rminos de la serie de fibonacci se obtienen de la suma de los dos anteriores:
//
//			1, 1, 2, 3, 5, 8, 13, .....  

//		Scanner sc = new Scanner(System.in);
//        int numero,fibo1,fibo2,i;
//        do{
//            System.out.print("Introduce numero mayor que 1: ");
//            numero = sc.nextInt();
//        }while(numero<=1);
//        System.out.println("Los " + numero + " primeros t�rminos de la serie de Fibonacci son:"); 
//
//        fibo1=1;
//        fibo2=1; 
//
//        System.out.print(fibo1 + " ");
//        for(i=2;i<=numero;i++){
//             System.out.print(fibo2 + " ");
//             fibo2 = fibo1 + fibo2;
//             fibo1 = fibo2 - fibo1;
//        }
//        System.out.println();
//        sc.close();
		
		//Ejercicio 9
//		Decimal a binario en java
		
//		En esta entrada vamos a escribir el programa java para convertir un n�mero de decimal a binario.
//
//		Para escribir el programa nos vamos a basar en la forma cl�sica de pasar de decimal a binario, o sea, dividir el n�mero entre 2 y quedarnos con el resto de la divisi�n. Esta cifra, que ser� un cero o un uno, es el d�gito de menos peso (m�s a la derecha) del n�mero binario. A continuaci�n volvemos a dividir el cociente que hemos obtenido entre 2 y nos quedamos con el resto de la divisi�n. Esta cifra ser� la segunda por la derecha del n�mero binario. Esta operaci�n se repite hasta que obtengamos un cero como cociente.

		//Ejercicio 11
		
//		COMPROBAR SI UN NÚMERO ES CAPICÚA EN JAVA
//		Un número es capicúa si se puede leer igual de derecha a izquierda que de izquierda a derecha. Ejemplos de números capicúas: 121, 3003, 1234321, 33, 445544, etc.
//		Vamos a escribir un programa Java que pida por teclado un número entero N de más de una cifra y verifique si es capicúa.
		
//		Scanner sc = new Scanner (System.in);
//		int numero, aux, cifra, inverso=0;
//		
//		do {
//		System.out.println("Introduce un número de más de una cifra: ");
//		numero = sc.nextInt();
//		}while(numero<10);
		//le damos la vuelta al número
//		aux = numero;
//		while(aux!=0) {
//			cifra = aux %10;
//			inverso = inverso*10 + cifra;
//			aux = aux/10;
//		}
//		if(numero == inverso) {
//			System.out.println("Es Capicúa");
//		}else {
//			System.out.println("No es Capicúa");
//		}
//			
//		sc.close();
	
//		Ejercicios de Bucles Anidados
		
		//Ejercicio 4 Pirámide inversa abecedário
		
//		for(char x='Z'; x >= 'A';x--) {
//			for(char y = x; y >='A';y--) {
//				System.out.print(y);
//			}
//			System.out.println();
//		}
		
		//Java Ejercicios Básicos de Arrays 1
		
//		Scanner sc = new Scanner(System.in);
//        int i;
//        int[] numeros = new int[10];
//        double media = 0;

        //lectura de datos y llenar el array
//        System.out.println("Lectura de los elementos del array: ");
//        for (i = 0; i < 10; i++) {
//            System.out.print("numeros[" + i + "]= ");
//            numeros[i] = sc.nextInt();
//        }
        
        //Recorrer el array y calcular la media
//        for (i = 0; i < 10; i++) {
//            if (i % 2 == 0){ //si la posición actual es par
//                media = media + numeros[i]; //se suma el valor de esa posición 
//            }
//        }
        //Calcular y mostrar la media
//        System.out.println("Media de los valores que se encuentran en posiciones pares: "+ media/5);
//        sc.close();
//		Scanner sc = new Scanner (System.in);
//		int numAlum, i;
//		double suma = 0, media;
//		
//		do {
//			System.out.println("Número de alumnos de clase: ");
//			numAlum = sc.nextInt();
//		}while(numAlum <=0);
		
		//se crea un array llamado notas de numAlumn elementos de tipo double
//        double[] notas = new double[numAlum]; 
        
     // Entrada de datos. Se lee la nota de cada alummo y se guarda
        // en cada elemento del array
        
//       for(i=0; i < notas.length; i++) {
//    	   System.out.print("Alumno " + (i+1) + " Nota final: ");
//    	   notas[i] = sc.nextDouble();
//       } 
       
    // Sumar todas las notas
//       for(i=0; i < notas.length; i++) {
//    	   suma = suma + notas[i];
//       }
       
       // Calcular la media
//       media = suma/notas.length;
       
       // Mostrar la media
//       System.out.printf("Nota media del curso: %.2f %n", media);
       
       // Mostrar los valores superiores a la media
//       System.out.println("Listado de notas superior  a la media: ");
//       for(i=0; i<notas.length; i++) {
//    	   if(notas[i]>media) {
//    		   System.out.println("Alumno numero " + (i + 1)+ " Nota final: " + notas[i]);
//    	   }
//    		   
//       }
       
       //5. Programa Java que guarda en un array 10 números enteros que se leen por teclado. A continuación se recorre el array y calcula cuántos números son positivos, cuántos negativos y cuántos ceros.
       
		
//		Scanner sc = new Scanner(System.in);
//		int[] numeros = new int[10];
//		int i;
//		int pos=0, neg=0, cero=0;
		
		//Leemos los valores por teclado y los guardamos en el array
//		System.out.println("Introducir 10 números: ");
//		for(i=0;i<numeros.length;i++) {
//			System.out.print("numeros[" +  i  + "] = ");
//			numeros[i] = sc.nextInt();
//		}
		 //se recorre el array para contar positivos, negativos y ceros
//		for(i=0;i<numeros.length;i++) {
//			if(numeros[i] >0) {
//				pos++;
//			}else if(numeros[i] ==0) {
//				cero++;
//			}else {
//				neg++;
//			}
//		}
		
		//mostrar resultados
//		System.out.println("Hay " + pos + " números positivos.");
//		System.out.println("Hay " + neg + " números negativos.");
//		System.out.println("Hay " + cero + " ceros.");
		
//		6. Programa Java que llene un array con 10 números enteros que se leen por teclado. A continuación calcula y muestra la media de los valores positivos y la de los valores negativos del array.
		
//		 Scanner sc = new Scanner(System.in);
//	        int[] numeros = new int[10];
//	        int pos = 0, neg = 0;  //contadores para positivos y negativos
//	        int i;
//	        double sumaPos = 0, sumaNeg = 0;  //suma de positivos y negativos
	        //Leemos los valores por teclado y los guardamos en el array
//	        System.out.println("Lectura de los elementos del array: ");
//	        for (i = 0; i < numeros.length; i++) {
//	            System.out.print("numeros[" + i + "]= ");
//	            numeros[i]=sc.nextInt();
//	        }
	      //se recorre el array para sumar positivos y negativos
//	        for (i = 0; i < numeros.length; i++) {
//	            if (numeros[i] > 0){ //sumar positivos
//	                sumaPos += numeros[i];
//	                pos++;
//	            } else if (numeros[i] < 0){ //sumar negativos
//	                sumaNeg += numeros[i];
//	                neg++;
//	            }
//	        }
//		
//		if (pos != 0) {
//            System.out.println("Media de los valores positivos: " + sumaPos / pos);
//        } else {
//            System.out.println("No ha introducido números positivos");
//        }
//        if (neg != 0) {
//            System.out.println("Media de los valores negativos: " + sumaNeg / neg);
//        } else {
//            System.out.println("No ha introducido números negativos");
//        }
		
//		7. Programa Java para leer la altura de N personas y calcular la altura media. Calcular cuántas personas tienen una altura superior a la media y cuántas tienen una altura inferior a la media. El valor de N se pide por teclado y debe ser entero positivo.
        
		Scanner sc = new Scanner(System.in);
		int i, N;
		int contMas=0, contMenos=0;
		double media = 0;
		
		do {
			System.out.println("Número de personas: ");
			N= sc.nextInt();
		}while(N<=0);
		
		//Se crea el array de tamaño N
		double[]alto = new double[N];
		//Leer alturas
		for(i=0; i<N;i++) {
			 System.out.print("persona " + (i+1) + " = ");
			 alto[i] = sc.nextDouble();
			 media = media + alto[i];
		}
		
		//Calcular la media
        media = media / N;
        //recorremos el array para ver cuantos hay más altos
        //que la media y cuantos más bajos
        
        for(i=0; i<alto.length; i++) {
        	if(alto[i]>media) {
        		contMas++;
        	}else if(alto[i]<media) {
        		contMenos++;
        	}
        }
        //Mostrar resultados
        System.out.println("Estatura media: " + media);
        System.out.println("Personas con estatura superior a la media: " + contMas);
        System.out.println("Personas con estatura inferior a la media: " + contMenos);
		
		}
				
	}

