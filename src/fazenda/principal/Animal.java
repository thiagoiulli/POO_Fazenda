package fazenda.principal;

public class Animal {
    private String raca;
    private String cor;
    private String nome;
    private String tipoRacao;
    private double qtdRacao;

    public Animal (){
        this.raca = "";
        this.cor = "";
        this.nome = "";
        this.tipoRacao = "";
        this.qtdRacao = 0.0;
    }

    public Animal(String raca, String cor, String nome, String tipoRacao, double qtdRacao){
        this.raca = raca;
        this.cor = cor;
        this.nome = nome;
        this.tipoRacao = tipoRacao;
        this.qtdRacao = qtdRacao;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoRacao() {
        return tipoRacao;
    }

    public void setTipoRacao(String tipoRacao) {
        this.tipoRacao = tipoRacao;
    }

    public double getQtdRacao() {
        return qtdRacao;
    }

    public void setQtdRacao(double qtdRacao) {
        this.qtdRacao = qtdRacao;
    }
}
