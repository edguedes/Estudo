import java.util.LinkedList;

public class ExemploLinkedList {

    public static void main(String[] args) {
        // Criando uma LinkedList
        LinkedList<String> lista = new LinkedList<>();

        // Adicionando elementos
        lista.add("Maçã");
        lista.add("Banana");
        lista.add("Laranja");

        // Acessando elementos
        String primeiroElemento = lista.getFirst();
        String ultimoElemento = lista.getLast();
        System.out.println("Primeiro elemento: " + primeiroElemento);
        System.out.println("Último elemento: " + ultimoElemento);

        // Adicionando elementos no início e no final
        lista.addFirst("Abacaxi");
        lista.addLast("Uva");

        // Removendo elementos
        lista.removeFirst();
        lista.removeLast();

        // Percorrendo a lista
        for (String elemento : lista) {
            System.out.println(elemento);
        }

        // Verificando o tamanho da lista
        int tamanho = lista.size();
        System.out.println("Tamanho da lista: " + tamanho);
    }
}
