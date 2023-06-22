import java.util.LinkedHashSet;

public class ExemploLinkedHashSet {
    /*
    * Em resumo, o LinkedHashSet é útil quando você precisa
    * armazenar elementos em uma coleção que mantenha a ordem
    * de inserção, além de garantir que não haja duplicatas.
    * */
    public static void main(String[] args) {
        // Criando um LinkedHashSet
        LinkedHashSet<String> conjunto = new LinkedHashSet<>();

        // Adicionando elementos
        conjunto.add("Maçã");
        conjunto.add("Banana");
        conjunto.add("Laranja");

        // Exibindo os elementos na ordem de inserção
        for (String elemento : conjunto) {
            System.out.println(elemento);
        }
    }
}
