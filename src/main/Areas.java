package main;

public class Areas {
	public double areaCuadrado(double lado) {
		double area = 0;
		area = lado * lado;
		return area;
	}

	public double areaRectangulo(double base, double altura) {
		double area = 0;
		area = base * altura;
		return area;
	}

	public double areaTriangulo(double base, double altura) {
		double area = 0;
		area = (base * altura) / 2;
		return area;
	}

	public double areaCirculo(double radio) {
		double area = 0;
		area = Math.PI * radio * radio;
		return area;
	}

}
