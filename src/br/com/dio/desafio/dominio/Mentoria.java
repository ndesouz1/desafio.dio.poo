package br.com.dio.desafio.dominio;

import java.time.LocalDate;

//extends = mentoria filha de Conteudo
//vai ficar vermelho pq tem q implementr metodo da classe mae (calcularXp())
public class Mentoria extends Conteudo{
    //private String titulo; >>tem na classe mae
    //private String descricao;  >>tem na classe mae
    private LocalDate data;

    //implementar metodo da classe mae
    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    public Mentoria() {
    }

//    public String getTitulo() {
//        return titulo;
//    }
//
//    public void setTitulo(String titulo) {
//        this.titulo = titulo;
//    }
//
//    public String getDescricao() {
//        return descricao;
//    }
//
//    public void setDescricao(String descricao) {
//        this.descricao = descricao;
//    }
//
    //deixar data pq nao tem na classe mae
    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    //Control + enter --> toString()
    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +    //mudar titulo para getTitulo()
                ", descricao='" + getDescricao() + '\'' +//descricao para getDescricao()
                ", data=" + data +
                '}';
    }
}
