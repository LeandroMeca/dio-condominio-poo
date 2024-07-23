package gerencia;

import controle.Morador;

import java.util.HashSet;
import java.util.Set;

public class Adm {

    Set<Morador> cadastro = new HashSet<>();


    public Set<Morador> getCadastro() {
        return cadastro;
    }



    public void cadastrar(Morador morador){

        boolean add = cadastro.add(morador);
        if(add){
            System.out.println("controle.Morador cadastrado "+morador.getNome());
        }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Adm adm)) return false;

        return getCadastro() != null ? getCadastro().equals(adm.getCadastro()) : adm.getCadastro() == null;
    }

    @Override
    public int hashCode() {
        return getCadastro() != null ? getCadastro().hashCode() : 0;
    }
}
