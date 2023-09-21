package interfaces;
import interfaces.AparelhoTelefonico;
import interfaces.NavegadorDaInternet;
import interfaces.ReprodutorMusical;

/**
 * Iphone
 */
public class Iphone implements AparelhoTelefonico , NavegadorDaInternet , ReprodutorMusical{

   /* Metodos do Phone */
   public void ligar() {
    // TODO Auto-generated method stub
    System.out.println("IPHONE: ligando.");
    }   
    public void atender() {
    // TODO Auto-generated method stub
    System.out.println("IPHONE: atendendo.");
    }   
    public void iniciarCorreioDeVoz() {
    // TODO Auto-generated method stub
    System.out.println("IPHONE: iniciando correio de voz.");
    }
    /* Metodos do navegador da Internet */
    public void exibirPagina() {
        System.out.println("IPHONE: Exibindo pagina");    
    }
    
    public void adicionarAba() {
        System.out.println("IPHONE: Adicionando Aba");    
    }
    
    public void atualizarPagina() {
        System.out.println("IPHONE: Atualizando pagina");    
    }
    /* Metodos do Reprodutor de musica */
    public void tocar() {
        System.out.println("IPHONE: Tocando musica");
    }
    public void pausar() {
        System.out.println("IPHONE: Pausando musica");
    }
    public void selecionarMusica() {
        System.out.println("IPHONE: Selecionando musica");
    }

}


