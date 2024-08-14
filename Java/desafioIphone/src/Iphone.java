import funcionalidades.AparelhoTelefonico;
import funcionalidades.NavegadorInternet;
import funcionalidades.ReprodutorMusica;

public class Iphone implements AparelhoTelefonico, ReprodutorMusica, NavegadorInternet{

    @Override
    public void atender() {
        System.out.println("Atendendo Telefone");
        
    }

    @Override
    public void iniciarCorreiodeVoz() {
        System.out.println("Iniciando Correio de Voz");
        
    }

    @Override
    public void ligar() {
        System.out.println("Ligando Telefone");
        
        
    }

    @Override
    public void pausar() {
        System.out.println("Pausando Musica");
        
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando Musica");
        
    }

    @Override
    public void tocar() {
        System.out.println("Telefone Tocando");
        
    }

    @Override
    public void adicionarNovaPagina() {
        System.out.println("Pagina Adicionada");
        
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Pagina Atualizada");
        
    }

    @Override
    public void exibirPagina() {
        System.out.println("Pagina Exibida");
        
    }
    
}
