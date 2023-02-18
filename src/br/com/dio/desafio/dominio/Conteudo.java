package br.com.dio.desafio.dominio;

//todo bootcamp tem conteudo e titulo e descricao sao conteudos

//abstract = nao consegue instanciar o conteudo
public abstract class Conteudo { //ABSTRACT
    //final = constante/tipo = double
    // modificador de acesso = protected (acesso XP_PADRAO soh pelas classes filhas)...se fosse public (todos classes teriam acesso)....se fosse private (soh a classe Conteudo teria acesso)
    //statico = pode acessar esse XP_PADRAO fora da classe Conteudo
    protected static final double XP_PADRAO = 10d;

    private String titulo;
    private String descricao;

    //ABSTRACT
    public abstract double calcularXp();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
