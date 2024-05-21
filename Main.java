
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devRaissa= new Dev();
        devRaissa.setNome("Raissa");
        devRaissa.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Raissa:" + devRaissa.getConteudosInscritos());
        devRaissa.progredir();
        devRaissa.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Raissa:" + devRaissa.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Raissa:" + devRaissa.getConteudosConcluidos());
        System.out.println("XP:" + devRaissa.calcularTotalXp());

        System.out.println("-------");

        Dev devNeto = new Dev();
        devNeto.setNome("Neto");
        devNeto.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Neto:" + devNeto.getConteudosInscritos());
        devNeto.progredir();
        devNeto.progredir();
        devNeto.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Neto:" + devNeto.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Neto:" + devNeto.getConteudosConcluidos());
        System.out.println("XP:" + devNeto.calcularTotalXp());

    }

}