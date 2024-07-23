package controleLiberacao;

public abstract class Apto {
    private String nome;
    private int apto;
    private int documento;
    public Apto() {
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getApto() {
        return apto;
    }
    public void setApto(int apto) {
        this.apto = apto;
    }
    public int getDocumento() {
        return documento;
    }
    public void setDocumento(int documento) {
        this.documento = documento;
    }
}
