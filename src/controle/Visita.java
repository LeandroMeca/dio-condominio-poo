package controle;

import controle.Morador;

public class Visita extends Morador {

    public Visita(String nome, int apto, int documento) {
        super();
        this.setNome(nome);
        this.setApto(apto);
        this.setDocumento(documento);

    }

    @Override
    public String toString() {
        return "controle.Visita{" +
                "nome='" + getNome() + '\'' +
                ", apto=" + getApto() +
                ", documento=" + getDocumento() +
                '}';
    }
}
