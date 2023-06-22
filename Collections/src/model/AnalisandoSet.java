package model;

import java.util.*;

public class AnalisandoSet {
    public static void main(String[] args) {

        Set<String> listaAlunos = new HashSet<>();

        //1) adicione alguns alunos

        listaAlunos.add("Aluno AAA");
        listaAlunos.add("Aluno BBB");
        listaAlunos.add("Aluno CCC");

        // imprima o tamanho da colecao
        System.out.println("Total de alunos:" + listaAlunos.size());

        // tente adicionar um aluno que existe
        System.out.println("Aluno: " + listaAlunos);
        listaAlunos.add("Aluno CCC");
        //SET não permiti duplicidade
        System.out.println("Aluno: " + listaAlunos);

    }
}
