import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //instanciar objeto
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição curso JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setData(LocalDate.now());

        //Conteudo conteudo = new Conteudo();  >> nao da para criar pois eh classe ABSTRATA
        //posso criar Curso a partir da classe Conteudo:
        Conteudo conteudo = new Curso(); //POLIMORFISMO
        // tudo que tem em Conteudo tem em Curso...mas nem tudo que tem em Curso tem em Conteudo
        Conteudo conteudo1 = new Mentoria(); //conteudo eh mae de mentoria

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devNayara = new Dev();
        devNayara .setNome("Camila");
        devNayara .inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Nayara:" + devNayara .getConteudosInscritos());
        devNayara .progredir();
        devNayara .progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Nayara:" + devNayara .getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Nayara:" + devNayara .getConteudosConcluidos());
        System.out.println("XP:" + devNayara .calcularTotalXp());

        System.out.println("-------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos João:" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());
    }
}
