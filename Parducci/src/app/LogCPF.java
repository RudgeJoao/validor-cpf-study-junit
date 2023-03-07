package app;

public class LogCPF {
    private ValidadoraAcesso Validador;

    public LogCPF() {
        Validador = new ValidadoraAcesso();
    }

    public String MensagemLog(String CPFTest) {
        if (Validador.verificaAcesso(CPFTest) == true) {
            return "Seu CPF é válido para acesso ao sistema";
        } else {
            return "Seu CPF é inválido para acesso ao sistema";
        }
    }
}

