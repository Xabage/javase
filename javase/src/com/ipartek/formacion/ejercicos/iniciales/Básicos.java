package com.ipartek.formacion.ejercicos.iniciales;

public class Básicos {

	public static void main(String[] args) {
		
		//Ejercicio básico inicial 1:
		//
		//Escribe un programa Java que realice lo siguiente: declarar una variable N de tipo int, una variable A de tipo double y una variable C de tipo char y asigna a cada una un valor. A continuación muestra por pantalla:
		//El valor de cada variable.
		//La suma de N + A
		//La diferencia de A - N
		//El valor numérico correspondiente al carácter que contiene la variable C.
		//Si por ejemplo le hemos dado a N el valor 5, a A el valor 4.56 y a C el valor ‘a’, se debe mostrar por pantalla:
		int N = 5;
		double A = 4.56;
		char C = 'a';
		
		System.out.println(N + A);
		System.out.println(A - N);
		System.out.println("Valor numérico del carácter C " + C + " = " + (int)C);
		
//		Escribe un programa Java que realice lo siguiente: declarar dos variables X e Y de tipo int, dos variables N y M de tipo double y asigna a cada una un valor. A continuación muestra por pantalla:
//			El valor de cada variable.
//			La suma  X + Y
//			La diferencia  X – Y
//			El producto  X * Y
//			El cociente  X / Y
//			El resto  X % Y
//			La suma  N + M
//			La diferencia  N – M
//			El producto  N * M
//			El cociente  N / M
//			El resto  N % M
//			La suma X + N
//			El cociente Y / M
//			El resto Y % M
//			El doble de cada variable
//			La suma de todas las variables
//			El producto de todas las variables
//			Si por ejemplo le hemos dado a X el valor 1, a Y el valor 2, a M el valor 3.2 y a N el valor 4.7 se debe mostrar por pantalla:
//			Variable X = 1
//			Variable Y = 2
//			Variable M = 3.2
//			Variable N = 4.7
		
		int X = 1;
		int Y = 2;
		double M = 3.2;
		double NN = 4.7;
		
		System.out.println(X);
		System.out.println(Y);
		System.out.println(M);
		System.out.println(NN);
		
		System.out.println(X + Y);
		System.out.println(X - Y);
		System.out.println(X * Y);
		System.out.println(X / Y);
		System.out.println(X % Y);

		System.out.println(NN + M);
		System.out.println(NN - M);
		System.out.println(NN * M);
		System.out.println(NN / M);
		System.out.println(NN % M);
		
		System.out.println(X + NN);
		System.out.println(Y / M);
		System.out.println(Y % M);
		System.out.println(2*X);
		System.out.println(2*Y);
		System.out.println(2*M);
		System.out.println(2*NN);
		
		System.out.println(X + Y + M + NN);
		System.out.println(X * Y * M * NN);
		
//		Ejercicio básico inicial 3
//		Escribe un programa Java que declare una variable entera Z y asígnale un valor. A continuación escribe las instrucciones que realicen los siguientes:
//		Incrementar Z en 77.
//		Decrementarla en 3.
//		Duplicar su valor.
//		Si por ejemplo N = 1 la salida del programa será:

		int Z = 1;
		Z+=77;
		System.out.println(Z);
		Z-=3;
		System.out.println(Z);
		Z*=2;
		System.out.println(Z);




		
	}

}
