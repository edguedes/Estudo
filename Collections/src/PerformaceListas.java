import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class PerformaceListas {

    public static void main(String[] args) {

        System.out.println("**** ArrayList vs LinkedList ***");

        List<Integer> numerosArrayList = new ArrayList<>();
        List<Integer> numerosLinkedList = new LinkedList<>();
        Collection<Integer> numerosCollectionList = new ArrayList<Integer>();
        int quantidadeElementos = 1000000;

        long tempoArrayList = insereElementosNo(numerosArrayList, quantidadeElementos);
        long tempoLinkedList = insereElementosNo(numerosLinkedList, quantidadeElementos);
        long tempoCollectionList = insereElementosNoCollectio(numerosCollectionList, quantidadeElementos);

        System.out.println("Inserção na ArrayList demorou  " + tempoArrayList);
        System.out.println("Inserção na LinkedList demorou " + tempoLinkedList);
        System.out.println("Inserção na CollectionList demorou " + tempoCollectionList);

        tempoArrayList = removePrimeirosElementos(numerosArrayList);
        tempoLinkedList = removePrimeirosElementos(numerosLinkedList);
        tempoCollectionList = removeTodosCollectio(numerosCollectionList);

        System.out.println("Remoção da ArrayList demorou  " + tempoArrayList);
        System.out.println("Remoção da LinkedList demorou " + tempoLinkedList);
        System.out.println("Remoção da CollectionList demorou " + tempoCollectionList);
    }

    private static long insereElementosNoCollectio(Collection<Integer> numeros, int quantidade) {
        long ini = System.currentTimeMillis();
        for (int i = 0; i < quantidade; i++) {
            numeros.add(i);
        }
        long fim = System.currentTimeMillis();
        return fim - ini;
    }

    private static long removeTodosCollectio(Collection<Integer> numeros) {
        long ini = System.currentTimeMillis();

        for (int i = 0; i < 100; i++) {
            numeros.remove(i); //removendo sempre o primeiro elemento
        }
        long fim = System.currentTimeMillis();
        return fim - ini;
    }

    /*
     * removendo 100 elementos sempre na primeira posição
     */
    private static long removePrimeirosElementos(List<Integer> numeros) {
        long ini = System.currentTimeMillis();

        for (int i = 0; i < 100; i++) {
            numeros.remove(0); //removendo sempre o primeiro elemento
        }
        long fim = System.currentTimeMillis();
        return fim - ini;
    }

    private static long insereElementosNo(List<Integer> numeros, int quantidade) {
        long ini = System.currentTimeMillis();
        for (int i = 0; i < quantidade; i++) {
            numeros.add(i);
        }
        long fim = System.currentTimeMillis();
        return fim - ini;
    }

}


