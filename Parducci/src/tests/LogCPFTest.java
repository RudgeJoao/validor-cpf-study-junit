package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import app.LogCPF;
import app.ValidadoraAcesso;

class LogCPFTest {

	String MensagemValido = "Seu CPF é válido para acesso ao sistema";
	String MensagemInvalido = "Seu CPF é inválido para acesso ao sistema";
	@Test
	void testLogCPFValido() {
		
		//Given (o que foi dado)
		String CPFTest = "533.845.488-25";
		LogCPF logcpf = new LogCPF();
		String resultado = logcpf.MensagemLog(CPFTest);
		
		assertEquals(MensagemValido, resultado );
	}
	@Test
	void testLogCPFInvalido() {
		
		//Given (o que foi dado)
		String CPFTest = "533.845.488-00";
		LogCPF logcpf = new LogCPF();
		String resultado = logcpf.MensagemLog(CPFTest);
		
		assertEquals(MensagemInvalido, resultado );
	}
}
	
	
	
	


