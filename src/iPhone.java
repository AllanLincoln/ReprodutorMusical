// Classe iPhone que implementa ReprodutorMusical, NavegadorInternet e AparelhoTelefonico
public class iPhone implements ReprodutorMusical, NavegadorInternet, AparelhoTelefonico {
    @Override
    public void tocar() {
        // Implementação da reprodução de música
        System.out.println("Tocando música...");
    }

    @Override
    public void pausar() {
        // Implementação da pausa da reprodução de música
        System.out.println("Pausando música...");
    }

    @Override
    public void selecionarMusica(String musica) {
        // Implementação da seleção de música
        System.out.println("Selecionando música: " + musica);
    }

    @Override
    public void exibirPagina(String url) {
        // Implementação da exibição de página
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba(String url) {
        // Implementação da adição de nova aba
        System.out.println("Adicionando nova aba: " + url);
    }

    @Override
    public void atualizarPagina() {
        // Implementação da atualização de página
        System.out.println("Atualizando página...");
    }

    @Override
    public void ligar() {
        // Implementação da função de ligar
        System.out.println("Ligando o iPhone...");
    }

    @Override
    public void atender() {
        // Implementação da função de atender chamada
        System.out.println("Atendendo chamada no iPhone...");
    }

    @Override
    public void iniciarCorreioVoz() {
        // Implementação do correio de voz no iPhone
        System.out.println("Iniciando correio de voz no iPhone...");
    }

}
