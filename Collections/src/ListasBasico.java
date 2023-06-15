import java.util.ArrayList;
import java.util.Collections;

public class ListasBasico {

    public static void main(String[] args) {

        String aula_01 = "Aprofundando em listas";
        String aula_02 = "Modelando listas";
        String aula_03 = "Mais de listas";
        String aula_04 = "Romovendo de uma lista";

        ArrayList<String> listaAulas = new ArrayList<>();

        listaAulas.add(aula_01);
        listaAulas.add(aula_02);
        listaAulas.add(aula_03);
        listaAulas.add(aula_04);

        System.out.println(listaAulas);
        listaAulas.remove(3);
        System.out.println(listaAulas);

        listaAulas.forEach(aula -> System.out.println(aula));

        //TODO Ordenando uma lista
        Collections.sort(listaAulas);
    }

}
