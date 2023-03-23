package orientacaoobj;

public class Carro {
	
	String modelo;
	String fabricante;
	String cor;
	int qtdPortas;
	int potenciaCavalos;
	double velocidaMaxima;
	int qtdMarchas;
	boolean temArCondicionado;
	boolean estaLigado = false;
	
	public void ligar(boolean estaLigado) {
		if(estaLigado == false) {
			this.estaLigado = true;
		}
	}
	
	public void desligar(boolean estaLigado) {
		if(estaLigado) {
			this.estaLigado = false;
		}
	}

	@Override
	public String toString() {
		return "Carro [modelo=" + modelo + ", fabricante=" + fabricante + ", cor=" + cor + ", qtdPortas=" + qtdPortas
				+ ", potenciaCavalos=" + potenciaCavalos + ", velocidaMaxima=" + velocidaMaxima + ", qtdMarchas="
				+ qtdMarchas + ", temArCondicionado=" + temArCondicionado + ", estaLigado=" + estaLigado + "]";
	}
	
	

}
