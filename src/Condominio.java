import controle.Morador;
import controle.Visita;
import gerencia.Adm;

public class Condominio {

    public static void main(String[] args) {

        Morador leandro = new Morador();
        leandro.setNome("leandro");
        leandro.setApto(10);
        leandro.setDocumento(64);


        Adm sindico = new Adm();
        sindico.cadastrar(leandro);


        leandro = new Visita("raul", leandro.getApto(), 1234);

        leandro.liberar(true);


    }
}
