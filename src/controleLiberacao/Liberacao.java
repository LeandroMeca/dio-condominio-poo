package controleLiberacao;

import controle.Visita;
import gerencia.Portaria;

public class Liberacao extends Apto {
    private boolean libera;

    public Liberacao() {
        super();
    }

    public void liberar(boolean liberar){

        if(liberar){
            Portaria porteiro = new Portaria();
            porteiro.cadadastrar(new Visita(getNome(), getApto(), getDocumento()));

            System.out.println("liberado "+getNome());
        }else {
            System.out.println("não autorizado");
        }
    }

    @Override
    public String toString() {
        return "controle.Liberacao{" +
                "libera=" + libera +
                '}';
    }
}
