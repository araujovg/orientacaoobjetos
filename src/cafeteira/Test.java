package cafeteira;

import java.math.MathContext;

public class Test {

	public static void main(String[] args) {
		
		Cafeteira cafeteira = new Cafeteira();
		cafeteira.setMarca("Arno");
		cafeteira.setModelo("A1");
		cafeteira.setTipo("Capsula");
		
		Cafeteira cafeteira2 = new Cafeteira();
		cafeteira2.setMarca(cafeteira.getMarca());
		cafeteira2.setModelo("Ph1");
		cafeteira2.setTipo("filtro");
		
		System.out.println("Cafeteira: " + cafeteira.toString());
		System.out.println("Cafeteira2: " + cafeteira2.toString());
	
		System.out.println("PI : " + Math.PI);
		
		
		
	}

}
