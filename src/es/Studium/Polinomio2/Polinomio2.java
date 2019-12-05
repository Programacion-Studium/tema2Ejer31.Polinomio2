package es.Studium.Polinomio2;

import java.util.Scanner;

public class Polinomio2 {

	public static void main(String[] args) 
	{
		// 
		java.util.Scanner teclado = new Scanner(System.in);
		System.out.println( "Indique el valor del coeficiente de x elevado a 10:");
		int a = teclado.nextInt();
		System.out.println( "Indique el valor del coeficiente de x elevado a 9:");
		int b = teclado.nextInt();
		System.out.println( "Indique el valor del coeficiente de x elevado a 8:");
		int c = teclado.nextInt();
		System.out.println( "Indique el valor del coeficiente de x elevado a 7:");
		int d = teclado.nextInt();
		System.out.println( "Indique el valor del coeficiente de x elevado a 6:");
		int e = teclado.nextInt();
		System.out.println( "Indique el valor del coeficiente de x elevado a 5:");
		int f = teclado.nextInt();
		System.out.println( "Indique el valor del coeficiente de x elevado a 4:");
		int g = teclado.nextInt();
		System.out.println( "Indique el valor del coeficiente de x elevado a 3:");
		int h = teclado.nextInt();
		System.out.println( "Indique el valor del coeficiente de x elevado a 2:");
		int i = teclado.nextInt();
		System.out.println( "Indique el valor del coeficiente de x elevado a 1:");
		int j = teclado.nextInt();
		System.out.println( "Indique el valor del termino independiente");
		int k = teclado.nextInt();
		System.out.println( "Indique el valor de x");
		int x = teclado.nextInt();
		System.out.println("El resultado del polinomio es:" + (((a*POTENCIA(x,10)) + (b*POTENCIA(x,9)) + (c*POTENCIA(x,8)) + (d*POTENCIA(x,7)) + (e*POTENCIA(x,6)) + (f*POTENCIA(x,5)) + (g*POTENCIA(x,4)) + (h*POTENCIA(x,3)) + (i*POTENCIA(x,2)) + (j*x)) + k));
		teclado.close();
		}
	public static int POTENCIA(int a, int b)
	{
		int resultado, i;
		resultado=1;
		for(i=1; i<=b;i++) 
		{
			resultado=resultado*a;
		}
		return resultado;
	}

}
