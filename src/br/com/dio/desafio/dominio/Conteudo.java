package br.com.dio.desafio.dominio;

public abstract class Conteudo {

    // Constante para XP padrão
    protected static final double XP_PADRAO = 10d;

    private String titulo;
    private String descricao;

    // Construtor
    public Conteudo(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
    }

    // Método abstrato para calcular XP (deve ser implementado pelas subclasses)
    public abstract double calcularXp();

    // Getters e Setters
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

    // Método toString para representar o conteúdo de maneira legível
    @Override
    public String toString() {
        return "Conteudo{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}


    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
