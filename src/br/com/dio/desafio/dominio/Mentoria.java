package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

    private LocalDate data;

    // Construtor com parâmetros para inicializar a mentoria com título, descrição e data
    public Mentoria(String titulo, String descricao, LocalDate data) {
        setTitulo(titulo);
        setDescricao(descricao);
        this.data = data;
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d; // XP padrão + 20 para mentoria
    }

    // Getters e setters
    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    // Método toString() para exibir os detalhes da mentoria
    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }
}
