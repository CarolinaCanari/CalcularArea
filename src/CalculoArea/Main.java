package CalculoArea;

public class Main {

	public static void main(String[] args) {
		double AreaQuadrado = Quadrado.AreaQuadrado(5);
		System.out.println("Area quadrado: " + AreaQuadrado);	
		
		
		double AreaCirculo = Circulo.AreaCirculo(7);
		System.out.println("Area circulo: " + AreaCirculo);	
		
		
		double AreaRetangulo = Retangulo.AreaRetangulo(2, 4);
		System.out.println("Area retangulo: " + AreaRetangulo);	
	
	}

}
