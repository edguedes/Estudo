import java.util.ArrayList;
import java.util.List;

public class ExemploList {

    public static void main(String[] args) {
        // Criando uma List usando ArrayList
        List<String> lista = new ArrayList<>();

        // Adicionando elementos
        lista.add("Maçã");
        lista.add("Banana");
        lista.add("Laranja");

        // Acessando elementos por índice
        String primeiroElemento = lista.get(0);
        System.out.println("Primeiro elemento: " + primeiroElemento);

        // Alterando um elemento
        lista.set(1, "Abacate");

        // Removendo um elemento
        lista.remove(2);

        // Percorrendo a lista
        for (String elemento : lista) {
            System.out.println(elemento);
        }

        // Verificando o tamanho da lista
        int tamanho = lista.size();
        System.out.println("Tamanho da lista: " + tamanho);
    }
}
