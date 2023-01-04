import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Curso java dio");
        curso1.setCargaHoraria(8);

        //System.out.println(curso1);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Js");
        curso2.setDescricao("Curso js dio");
        curso2.setCargaHoraria(4);

        //System.out.println(curso2);



        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Dio java");
        mentoria.setDescricao("Java curso");
        mentoria.setData(LocalDate.now());

        //System.out.println(mentoria1);



        //System.out.println(mentoria2);

        BootCamp bootCamp = new BootCamp();
        bootCamp.setNome("Bootcamp Java Developer");
        bootCamp.setDescricao("Descrição bootcamp java developer");
        bootCamp.getConteudos().add(curso1);
        bootCamp.getConteudos().add(curso2);
        bootCamp.getConteudos().add(mentoria);

        Dev devAmilton = new Dev();
        devAmilton.setNome("Amilton");
        devAmilton.inscreverBootCamp(bootCamp);
        System.out.println("Conteudos inscritos" + devAmilton.getConteudosInscritos());
        devAmilton.progredir();
        devAmilton.progredir();
        System.out.println("Conteudos inscritos" + devAmilton.getConteudosInscritos());
        System.out.println("Conteudos Concluidos" + devAmilton.getConteudosConcluidos());
        System.out.println("XP" + devAmilton.calcularTotalXp());


        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootCamp(bootCamp);
        System.out.println("Conteudos inscritos" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos" + devJoao.getConteudosInscritos());
        System.out.println("Conteudos Concluidos" + devJoao.getConteudosConcluidos());
        System.out.println("XP" + devJoao.calcularTotalXp());
    }
}
