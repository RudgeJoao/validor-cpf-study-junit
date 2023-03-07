package tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import app.ValidadoraAcesso;

class ValidaAcessoTest {

	@Test
	void testAcessoPermitido() { //QUERO QUE ESSE TESTE RETORNE TRUE
		
		//Given (o que foi dado)
		String CPFTest = "533.845.488-25";
		
		//When (AÇÃO PELO QUE EU ENTENDI, INSTANCIEI O OBJETO)
		ValidadoraAcesso cpf = new ValidadoraAcesso();
		boolean resultado = cpf.verificaAcesso(CPFTest);
		
		//Then
		assertTrue(resultado);
	}
	
	@Test
	void testAcessoNegado() { //QUERO QUE ESSE TESTE RETORNE FALSE
		
		//Given (o que foi dado)
		String CPFTest = "533.845.488-00"; //CPF ERRADO
		
		//When (AÇÃO PELO QUE EU ENTENDI, INSTANCIEI O OBJETO)
		ValidadoraAcesso cpf = new ValidadoraAcesso();
		boolean resultado = cpf.verificaAcesso(CPFTest);
		
		//Then
		assertFalse(resultado);
	}

}
