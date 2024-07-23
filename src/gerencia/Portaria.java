package gerencia;

import controle.Visita;

import java.util.LinkedHashSet;
import java.util.Set;


public class Portaria {


Set<Visita> cadastro = new LinkedHashSet<>();

    public void cadadastrar(Visita visita)
    {

        boolean cad = cadastro.add(visita);
        if(cad){
            System.out.println("controle.Visita cadastrada "+visita.getNome());
        }
    }

    public Set<Visita> getCadastro() {
        return cadastro;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Portaria portaria)) return false;

        return getCadastro() != null ? getCadastro().equals(portaria.getCadastro()) : portaria.getCadastro() == null;
    }

    @Override
    public int hashCode() {
        return getCadastro() != null ? getCadastro().hashCode() : 0;
    }
}
