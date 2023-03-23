package empregados;

public class Diretor {
	
	String nome;
	
	public void enviarEmail(String emailDestinatario, String cc, String assunto, String conteúdo) {
		Secretario secretario = new Secretario();
		secretario.enviarEmail(emailDestinatario, cc, assunto, conteúdo);
	}

}
