package desafios.dominio;

import java.time.LocalDate;

public class DominioMain {
    public static void main(String[] args) {
        // Adicionando cursos e mentorias
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descricao Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descricao Curso JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descricao Mentoria Java");
        mentoria.setData(LocalDate.now());

        // Criando o bootcamp com os conteúdos criados
        Bootcamp bootcampJava = new Bootcamp();
        bootcampJava.setNome("Bootcamp Java Developer");
        bootcampJava.setDescricao("Descricao Bootcamp Java Developer");
        bootcampJava.getConteudos().add(curso1);
        bootcampJava.getConteudos().add(curso2);
        bootcampJava.getConteudos().add(mentoria);

        // Criando os alunos (devs)
        Dev dev1 = new Dev();
        dev1.setNome("Mauricio");
        // Inscrevendo no bootcamp
        dev1.inscreverBootcamp(bootcampJava);
        System.out.println("Conteudos inscritos do(a) aluno(a) " + dev1.getNome() + ": " + dev1.getConteudoInscritos());
        dev1.progredir();
        System.out.println();
        System.out.println("Conteudos concluidos do(a) aluno(a) " + dev1.getNome() + ": " + dev1.getConteudoConcluidos());
        System.out.println("Conteudos inscritos do(a) aluno(a) " + dev1.getNome() + ": " + dev1.getConteudoInscritos());
        System.out.println("XP " + dev1.getNome() + ": " + dev1.calcularTotalXp() + " pontos.");

        System.out.println();
        Dev dev2 = new Dev();
        dev2.setNome("Evelin");
        dev2.inscreverBootcamp(bootcampJava);
        System.out.println("Conteudos inscritos do(a) aluno(a) " + dev2.getNome() + ": " + dev2.getConteudoInscritos());
        dev2.progredir();
        System.out.println();
        System.out.println("Conteudos concluidos do(a) aluno(a) " + dev2.getNome() + ": " + dev2.getConteudoConcluidos());
        System.out.println("Conteudos inscritos do(a) aluno(a) " + dev2.getNome() + ": " + dev2.getConteudoInscritos());
        System.out.println("XP " + dev2.getNome() + ": " + dev2.calcularTotalXp() + " pontos.");
    }
}
