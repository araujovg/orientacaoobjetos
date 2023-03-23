package classesabstratas;

public class Automovel extends Veiculo{

	@Override
	public void acelerar() {
		setVelocidade(getVelocidade() + 10);
	}

}
