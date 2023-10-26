
public class Main {

	public static void main(String[] args) {
		int x, y;
		
		x = 5;
		y = 2 * x;
		
		System.out.println("X: " + x);
		System.out.println("Y: " + y);
		
		// area de um trapezio
		
		double b, B, h, area;
		
		b = 6.0;
		B = 8.0;
		h = 5.0;
		
		area = (b + B) / 2.0 * h;
		System.out.println("\nArea do trapezio: " + area);
		
		// casting = conversao de tipo
		
		int f, g;
		double resultado;
		
		f = 5;
		g = 2;
		// esse (double) é obrigatório para o programa entender que deve fazer casting, 
		//se não o resultado será um numero intero arredondado
		resultado = (double) f / g;
		System.out.println("\nCasting de numero int p/ double: " + resultado);
	}

}
