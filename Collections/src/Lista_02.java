import model.Aula;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Lista_02 {

    public static void main(String[] args) {

        Aula aula_01 = new Aula("Titulo 1", 15);
         Aula aula_02 = new Aula("Titulo 2", 21);
         Aula aula_03 = new Aula("Titulo 3", 34);

         ArrayList<Aula> listaAulas = new ArrayList<Aula>();

         listaAulas.add(aula_01);
         listaAulas.add(aula_02);
         listaAulas.add(aula_03);

        System.out.println(listaAulas.toString());

        //TODO Ordenando lista
        Collections.sort(listaAulas);
//        listaAulas.sort(Comparator.comparing(Aula::getTitulo));
    }
}
