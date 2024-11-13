package br.com.dio.desafio.dominio;

public class Main {
    public static void main(String[] args) {

        // Criando um Bootcamp
        Bootcamp bootcampJava = new Bootcamp();
        bootcampJava.setNome("Bootcamp Java");
        bootcampJava.setDescricao("Aprenda Java do básico ao avançado!");

        // Criando conteúdos e adicionando ao Bootcamp
        Curso cursoJava = new Curso("Curso de Java", "Aprenda os conceitos básicos de Java", 8);
        bootcampJava.getConteudos().add(cursoJava);

        // Criando um Dev
        Dev dev = new Dev();
        dev.setNome("João");

        // Inscrevendo o Dev no Bootcamp
        dev.inscreverBootcamp(bootcampJava);

        // Exibindo os conteúdos inscritos
        System.out.println("Conteúdos inscritos no Bootcamp: " + dev.getConteudosInscritos());

        // Dev progredindo
        dev.progredir();
        System.out.println("Conteúdos concluídos pelo Dev: " + dev.getConteudosConcluidos());

        // Calculando o total de XP
        System.out.println("Total de XP: " + dev.calcularTotalXp());
    }
}
