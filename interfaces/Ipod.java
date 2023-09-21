package interfaces;

public class Ipod implements ReprodutorMusical{

    public void tocar() {
        System.out.println("IPOD: Tocando musica");
    }
    public void pausar() {
        System.out.println("IPOD: Pausando musica");
    }
    public void selecionarMusica() {
        System.out.println("IPOD: Selecionando musica");
    }
    @Override
    public void reproduzirMusica() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'reproduzirMusica'");
    }

}
