package poo_triangulos;

public class Triangulo {
	private int a;
	private int b;
	private int c;
	
	public Triangulo(int a, int b, int c) {
		if((a<b+c)&&(b<a+c)&&(c<a+b)) {
			this.a=a;
			this.b=b;
			this.c=c;
		}else {
			this.a=5;
			this.b=5;
			this.c=5;
		}
	}
	
	public Triangulo(int n) {
		this.a=n;
		this.b=n;
		this.c=n;
	}
	
	public int perimetro() {
		return this.a+this.b+this.c;
	}
	
	public String toString() {
		return this.a+" - "+this.b+" - "+this.c;
	}
	
	public void setA(int n) {
		if((n<this.b+this.c)&&(this.b<n+this.c)&&(this.c<n+this.b)) {
			this.a=n;
		}
	}
}
