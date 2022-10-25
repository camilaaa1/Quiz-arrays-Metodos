package com.arrysq;

import java.util.*;

import javax.swing.JOptionPane;

public class Quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String menu="Seleccione si: \n"
				+ "1. Ver el número mayor.\n"
				+ "2. Ver el número menor.\n"
				+ "3. Calcular la raíz cuadrada.\n"
				+ "4. Elevar una potencia.\n"
				+ "5.Salir";
		
		int opcion=0;
		do {opcion=Integer.parseInt(JOptionPane.showInputDialog(menu));
			switch (opcion)
			{
			case 1:
				nummayor();
				break;
			case 2:
				nummenor();
				break;
			case 3:
				numraiz();
				break;
			case 4:
				numpotencia();
				break;
			}
		}while(opcion!=5);

	}
	public static void nummayor() {
		int []numero = new int [5];
		int mayor = 0;
		for (int x=0; x <=numero.length; x++) {
			int num = Integer.parseInt(JOptionPane.showInputDialog("Digite un número"));
			if(num>mayor)
	        {
	            mayor=num;
	        }
		}
		System.out.println("El número mayor es: "+ mayor);
	}
	public static void nummenor() {
		int []numero = new int [5];
		int menor = 100;
		for (int x=0; x <numero.length; x++) {
			int num = Integer.parseInt(JOptionPane.showInputDialog("Digite un número"));
			if(num<menor)
	        {
	            menor=num;
	        }
		}
		System.out.println("El número menor es: "+ menor);
	}
	public static void numraiz() {
		int []numero = new int [3];
		for (int x=0; x <numero.length; x++) {
			int num = Integer.parseInt(JOptionPane.showInputDialog("Digite un número"));
	        double resultado = Math.sqrt(num);
	        System.out.println("La raíz del número es: "+ resultado);
		}
	}
	public static void numpotencia() {
		int []numero = new int [3];
		for (int x=0; x <numero.length; x++) {
			int num = Integer.parseInt(JOptionPane.showInputDialog("Digite un número"));
			double potencia = Integer.parseInt(JOptionPane.showInputDialog("Digite el número al cual se va a elevar"));
	        double resultado = Math.pow(num,potencia);
	        System.out.println("El numero elevado a la "+ potencia +" es: "+ resultado);
		}
	}
	}
