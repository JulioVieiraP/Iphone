import iphone.Iphone;

public class App {
    public static void main(String[] args) {
        // Criar uma instância de IPhone
        Iphone iPhone = new Iphone();

        // Testar algumas funcionalidades
        iPhone.tocar();
        iPhone.pausar();
        iPhone.selecionarMusica("Nome da música");
        iPhone.ligar("123456789");
        iPhone.atender();
        iPhone.iniciarCorreioVoz();
        iPhone.exibirPagina();
        iPhone.adicionarNovaAba();
        iPhone.atualizarPagina();
    }
}
