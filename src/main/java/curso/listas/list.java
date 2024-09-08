package curso.listas;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

/*
 * Este programa demonstra o uso de listas em Java com a classe ArrayList e
 * algumas operações comuns realizadas em listas, como adicionar, remover,
 * filtrar e obter informações sobre os elementos.
 *
 * Operações demonstradas:
 * - Adicionar elementos na lista
 * - Obter o tamanho da lista
 * - Filtrar elementos com base em um predicado
 * - Iterar sobre a lista e sobre a lista filtrada
 * - Encontrar a posição de elementos
 * - Remover elementos da lista
 */
public class list {

    public static void main(String[] args) {

        // Criação e inicialização da lista
        List<String> list = new ArrayList<>();

        // Adicionando elementos na lista
        list.add("Maria");
        list.add("joao");
        list.add(1, "maria2"); // Adiciona "maria2" na posição 1, empurrando "joao" para a posição 2
        list.add("jonas");
        list.add("rudas");
        list.add(2, "marcos22"); // Adiciona "marcos22" na posição 2, empurrando os elementos subsequentes
        list.add("abigail");
        list.add("alberto");
        list.add("adalberto");

        // Exibindo o tamanho da lista
        System.out.println("Tamanho da lista: " + list.size());

        System.out.println("--------------");

        // Filtrando elementos que começam com a letra 'a' e coletando o resultado em uma nova lista
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'a').collect(Collectors.toList());

        // Exibindo os elementos filtrados
        System.out.println("Elementos que começam com 'a':");
        for (String x : result) {
            System.out.println(x);
        }

        System.out.println("--------------");

        // Exibindo todos os elementos da lista original
        System.out.println("Todos os elementos da lista:");
        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("--------------");

        // Encontrando e exibindo a posição de elementos específicos
        System.out.println("Índice de 'joao': " + list.indexOf("joao"));
        System.out.println("Índice de 'Juvenal': " + list.indexOf("Juvenal"));

        System.out.println("--------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'x').findFirst().orElse(null);
        System.out.println(name);

        System.out.println("--------------");

        // Removendo elementos da lista
        list.remove("rudas"); // Remove o elemento "rudas"
        list.remove(3); // Remove o elemento na posição 3 (que era "jonas" após a remoção anterior)
        list.removeIf(x -> x.charAt(0) == 'm'); // Remove todos os elementos que começam com 'm'

        // Exibindo a lista após as remoções
        System.out.println("Lista após remoções:");
        System.out.println(list);



    }
}
