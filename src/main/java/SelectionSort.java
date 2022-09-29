import java.util.List;

/**
 * Classe responsável pela ordenação do tipo Sort
 */
public class SelectionSort {
    static void SelectionSort(List<Integer> lista){
        for (int i = 0; i < lista.size() - 1; i++) {
            int indice = i;
            for (int j = i + 1; j < lista.size(); j++)
                if (lista.get(j) < lista.get(indice))
                    indice = j;
            int menorNumero = lista.get(indice);
            lista.set(indice, lista.get(i));
            lista.set(i, menorNumero);
        }
    }
}
