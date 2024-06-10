package iphone;

public class Iphone implements ReprodutorMusical, AparalhoTelefonico, NavegadorInternet{
    // ReprodutorMusical
    @Override
    public void tocar() {
        System.out.println("Tocando musica");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando musica");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Tocando a musica: " + musica);
    }
    // fim do ReprodutorMusical

    // AparalhoTelefonico
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Telefone atendido");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("IniciarCorreio");
    }

    // fim do AparalhoTelefonico

    // NavegadorInternet

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo pagina");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina");
    }

    // fim do NavegadorInternet
}
