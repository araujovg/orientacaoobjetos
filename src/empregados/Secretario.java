package empregados;

public class Secretario {
	
	String nome;
	
	public void enviarEmail(String emailDestinatario, String cc, String assunto, String conteúdo) {
		String fullemail = 
				"Assunto: " + assunto
				+"\nConteúdo: " + conteúdo
				+ "\nDestinatário: " + emailDestinatario
				+ "\nCC: " + cc;
		
		System.out.println(fullemail);
	}
}
