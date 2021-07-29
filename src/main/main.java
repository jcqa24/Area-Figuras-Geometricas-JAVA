package main;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Areas A = new Areas();
		Scanner sn = new Scanner(System.in);
		System.out.println("**********************************************************************");
		System.out.println("\n\tPROGRAMA PARA CALCULAR EL AREA DE DIFERENTES FIGURAS\n");
		System.out.println("**********************************************************************");

		boolean salir = false;
		int opcion; // Guardaremos la opcion del usuario

		while (!salir) {
			System.out.println("\n\n ======== MENU ========");
			System.out.println("1. Area de un cuadrado");
			System.out.println("2. Area de un rectangulo");
			System.out.println("3. Area de un triangulo");
			System.out.println("4. Area de un circulo");
			System.out.println("5. Salir");

			System.out.println("Escribe una de las opciones");
			opcion = sn.nextInt();
			double a,b;

			switch (opcion) {
			case 1:
				System.out.println("\tAREA DE UN CUADRADO");
				System.out.println("Ingresa el tamaño de uno de los lados");
				a=sn.nextDouble();
				System.out.println("El area es: "+ A.areaCuadrado(a) );
				break;
			case 2:
				System.out.println("\tAREA DE UN RECTANGULO");
				System.out.println("Ingresa el tamaño de uno de la base");
				a=sn.nextDouble();
				System.out.println("Ingresa el tamaño de uno de la altura");
				b=sn.nextDouble();
				System.out.println("El area es: "+ A.areaRectangulo(a,b) );
				break;
			case 3:
				System.out.println("\tAREA DE UN TRIANGULO");
				System.out.println("Ingresa el tamaño de uno de la base");
				a=sn.nextDouble();
				System.out.println("Ingresa el tamaño de uno de la altura");
				b=sn.nextDouble();
				System.out.println("El area es: "+ A.areaTriangulo(a,b) );
				break;
			case 4:
				System.out.println("\tAREA DE UN CIRCULO");
				System.out.println("Ingresa el tamaño de uno del radio del circulo");
				a=sn.nextDouble();
				System.out.println("El area es: "+ A.areaCirculo(a) );
				break;
			case 5:
				salir = true;
				break;
			default:
				System.out.println("Solo números entre 1 y 4");
			}

		}

	}


}
