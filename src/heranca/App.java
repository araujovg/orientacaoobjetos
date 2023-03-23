package heranca;

import heranca.funcionarios.Diretor;
import heranca.funcionarios.Engenheiro;
import heranca.funcionarios.Gerente;
import heranca.funcionarios.Secretario;

public class App {

	public static void main(String[] args) {
		
		Gerente gerente = new Gerente("José da Silva", "11122233344", 4000.00, 1234, 15);
		Diretor diretor = new Diretor("João Moutinho", "22233344455", 10000.00, "superSenha@S");
		Secretario secretario = new Secretario("Cristiano Ronaldo", "33344455566", 2800.00, "Agenda1", "sec@secretariado.com");
		Engenheiro engenheiro = new Engenheiro("Faraó Qeops", "44455566677", 15000.00, "12345-6", "548-9");

		System.out.println("Salário Gerente: " + gerente.getSalario());
		System.out.println("Salário Diretor: " + diretor.getSalario());
		System.out.println("Salário Secretario: " + secretario.getSalario());
		System.out.println("Salário Engenheiro: " + engenheiro.getSalario());
		
		System.out.println("Bonificação Gerente: " + gerente.getBonificacao());
		System.out.println("Bonificação Diretor: " + diretor.getBonificacao());
		System.out.println("Bonificação Secretario: " + secretario.getBonificacao());
		System.out.println("Bonificação Engenheiro: " + engenheiro.getBonificacao());
		
	}

}
