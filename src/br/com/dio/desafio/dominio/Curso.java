package br.com.dio.desafio.dominio;

//tanto a classe Curso como Mentoria usam os mesmos atributos (titulo e descricao)
// e ambas tem calcularXp();

public class Curso {
    //atributos com modificador de acesso private
    private String titulo;
    private String descricao;
    private int cargaHoraria;

    //costrutor
    public Curso() {
    }

    //get e set (encapsulamento/abstracao: o que era private vira public)
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

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    //toString (para imprimir)
    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}
