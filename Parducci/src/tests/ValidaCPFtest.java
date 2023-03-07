package tests;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import app.CodigoPessoaFisica;

class ValidaCPFtest {

	@Test
	void testCPFvalido() { //QUERO QUE ESSE TESTE RETORNE TRUE
		
		//Given (o que foi dado)
		String CPFTest = "533.845.488-25";
		
		//When (AÇÃO PELO QUE EU ENTENDI, INSTANCIEI O OBJETO)
		CodigoPessoaFisica cpf = new CodigoPessoaFisica();
		
		//Then
		assertTrue(cpf.validaCPF(CPFTest));
	}
	
	@Test
	void testCPFinvalido() { //QUERO QUE ESSE TESTE RETORNE FALSE
		
		//Given (O QUE FOI DADO)
		String CPFTest = "533.845.488-00"; // CPF ERRADO
		
		//When 
		CodigoPessoaFisica cpf = new CodigoPessoaFisica();
		
		//Then
		assertFalse(cpf.validaCPF(CPFTest));
	}

	@Test
	void testCPFformatado() { //QUERO QUE ESSE TESTE RETORNE SO OS NUMEROS
		
		//Given (O QUE FOI DADO)
		String CPFComCaracter = "533.845.488-25"; // CPF COM CARACTERES ESPECIAIS
		String CPFSemCaracter = "53384548825"; // CPF SEM CARACTERES ESPECIAIS
		
		//When 
		CodigoPessoaFisica cpf = new CodigoPessoaFisica();
		String resultado = cpf.removeCaracteresEspeciais(CPFComCaracter);
		
		//Then
		//assertEquals(CPFSemCaracter, cpf.removeCaracteresEspeciais(CPFComCaracter));	
		assertEquals(CPFSemCaracter, resultado);
		}
}
