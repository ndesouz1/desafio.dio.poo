package br.com.dio.desafio.dominio;

//tanto a classe Curso como Mentoria usam os mesmos atributos (titulo e descricao)
// e ambas tem o metodo calcularXp() em comum;
//criar classe Conteudo (mae)....titulo e descricao (filhas)

public class Curso extends Conteudo{  //HERANCA
    //atributos com modificador de acesso private
    //private String titulo;    >>tem na classe mae
   // private String descricao; >>tem na classe mae
    private int cargaHoraria;

    //jogar para cima
    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    //costrutor
    public Curso() {
    }

//    get e set (encapsulamento/abstracao: o que era private vira public)
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
                "titulo='" + getTitulo() + '\'' +   //mudar titulo para getTitulo()
                ", descricao='" + getDescricao() + '\'' +  //descricao para getDescricao()
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}
