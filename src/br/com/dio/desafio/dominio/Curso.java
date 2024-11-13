package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {

    private int cargaHoraria;

    // Construtor completo (com todos os parâmetros necessários)
    public Curso(String titulo, String descricao, int cargaHoraria) {
        super(titulo, descricao);  // Chama o construtor da classe pai (Conteudo)
        this.cargaHoraria = cargaHoraria;
    }

    // Construtor padrão (sem parâmetros) - útil se precisar criar um curso vazio
    public Curso() {
        super("Título Padrão", "Descrição Padrão");  // Chama o construtor da classe pai com valores padrões
    }

    @Override
    public double calcularXp() {
        // Calcula o XP com base na carga horária do curso
        return XP_PADRAO * cargaHoraria;
    }

    // Getter e Setter para cargaHoraria
    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    // Sobrescrita do método toString para representar o objeto de forma legível
    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}

