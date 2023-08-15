public class Main {
    public static void main(String[] args) {
        // Criando uma instância de iPhone
        iPhone meuIPhone = new iPhone();

        // Demonstração das funcionalidades do iPhone
        meuIPhone.ligar();
        meuIPhone.tocar();
        meuIPhone.selecionarMusica("Música Legal");
        meuIPhone.pausar();
        meuIPhone.exibirPagina("https://www.example.com");
        meuIPhone.adicionarNovaAba("https://www.example.com/nova-aba");
        meuIPhone.atualizarPagina();
        meuIPhone.atender();
        meuIPhone.iniciarCorreioVoz();

        // Demonstração das funcionalidades do Telefone
        Telefone telefone = new Telefone();
        telefone.ligar();
        telefone.atender();
        telefone.iniciarCorreioVoz();
    }
}

