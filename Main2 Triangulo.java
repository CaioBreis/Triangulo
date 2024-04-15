package poo_triangulos;

public class AppTriangulo {

	public static void main(String[] args) {
		Triangulo t1 =new Triangulo(2, 3, 4);
		Triangulo t2 =new Triangulo(2, 2, 9);
		Triangulo t3 = new Triangulo(2);
		
		System.out.println(t1);
		System.out.println(t1.perimetro());
		System.out.println(" ");
		System.out.println(t2);
		System.out.println(t2.perimetro());
		System.out.println(" ");
		System.out.println(t3);
		System.out.println(t3.perimetro());
		System.out.println(" ");

	}

}
