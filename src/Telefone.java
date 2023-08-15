// Classe Telefone que implementa AparelhoTelefonico
public class Telefone implements AparelhoTelefonico {
    @Override
    public void ligar() {
        // Implementação da função de ligar
        System.out.println("Ligando o telefone...");
    }

    @Override
    public void atender() {
        // Implementação da função de atender chamada
        System.out.println("Atendendo chamada...");
    }

    @Override
    public void iniciarCorreioVoz() {
        // Implementação do correio de voz
        System.out.println("Iniciando correio de voz...");
    }

    // Métodos adicionais específicos do telefone, se necessário
}
