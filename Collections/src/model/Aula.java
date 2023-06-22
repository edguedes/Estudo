package model;

import lombok.Data;

@Data
public class Aula implements Comparable<Aula> {

    private String titulo;
    private int tempo;

    public Aula(String titulo, int tempo) {
        this.titulo = titulo;
        this.tempo = tempo;
    }

    @Override
    public String toString() {
        return "[Aula: " + "titulo=" + titulo + ", tempo=" + tempo + "]";
    }

    @Override
    public int compareTo(Aula other) {
        //TODO criando ordenação de lista de aula
        return this.titulo.compareTo(other.titulo);
    }

}
