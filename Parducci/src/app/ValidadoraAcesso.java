package app;

public class ValidadoraAcesso {
	
	private String[] cpfsAutorizados;
	public ValidadoraAcesso() {
		cpfsAutorizados = new String[] {"53384548825", "36178671385"};
	}

	public boolean verificaAcesso(String CPFTest) {
		CodigoPessoaFisica cpf = new CodigoPessoaFisica();
		if(cpf.validaCPF(CPFTest) == true) {
			String cpfSemCaracteres = cpf.removeCaracteresEspeciais(CPFTest);
			for(int i = 0; i < cpfsAutorizados.length; i++) {
				
				if(cpfsAutorizados[i].equals(cpfSemCaracteres)) {
					return true;
				}
			}
		}
		return false;
	}
	
}
