package controle;

import controleLiberacao.Liberacao;

public class Morador extends Liberacao {


    public Morador(String nome, int apto, int documento) {
        this.setNome(nome);
        this.setApto(apto);
        this.setDocumento(documento);
    }

    public Morador() {
    }

    @Override
    public String toString() {
        return "controle.Morador{" +
                "nome='" + getNome() + '\'' +
                ", apto=" + getApto() +
                '}';
    }
}
