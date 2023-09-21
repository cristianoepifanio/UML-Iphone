package interfaces;

public class Browser implements NavegadorDaInternet{

    public void exibirPagina() {
        System.out.println("BROWSER: Exibindo pagina");    
    }
    
    public void adicionarAba() {
        System.out.println("BROWSER: Adicionando Aba");    
    }
    
    public void atualizarPagina() {
        System.out.println("BROWSER: Atualizando pagina");    
    }

    @Override
    public void navegarNaInternet() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'navegarNaInternet'");
    }
    
}
