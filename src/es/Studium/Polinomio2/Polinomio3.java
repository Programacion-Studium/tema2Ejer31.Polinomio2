package es.Studium.Polinomio2;

import java.util.Scanner;

public class Polinomio3 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		double solucion=0;
		int coeficiente, x;
		System.out.println("Indique el valor de x");
		java.util.Scanner teclado = new Scanner(System.in);
		x = teclado.nextInt();
		for(int contador=10; contador>=0; contador--)
		{
			System.out.println("Indique el valor del coeficiente de x elevado a "+contador+" :");
			coeficiente = teclado.nextInt();
			solucion+=(coeficiente*Math.pow(x, contador));
			System.out.println("El resultado del polinomio es "+ solucion);
		}
		teclado.close();
	}

}
