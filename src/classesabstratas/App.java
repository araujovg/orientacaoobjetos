package classesabstratas;

public class App {

	public static void main(String[] args) {
		
		Automovel automovel = new Automovel();
		Aviao aviao = new Aviao();
		
		/*
		 * System.out.println("Automovel: " + automovel.isStatus()); automovel.ligar();
		 * System.out.println("Automovel: " + automovel.isStatus());
		 * 
		 * System.out.println("Automovel: " + automovel.getVelocidade());
		 * automovel.acelerar(); automovel.acelerar(); automovel.acelerar();
		 * automovel.acelerar(); automovel.acelerar(); automovel.acelerar();
		 * System.out.println("Avião: " + automovel.getVelocidade() + "km/h");
		 */
		
		System.out.println("Avião: " + aviao.isStatus());
		aviao.ligar();
		System.out.println("Avião: " + aviao.isStatus());
		
		System.out.println("Avião: " + aviao.getVelocidade());
		aviao.acelerar();
		aviao.acelerar();
		aviao.acelerar();
		System.out.println("Avião: " + aviao.getVelocidade() + "km/h");
		
	}

}
