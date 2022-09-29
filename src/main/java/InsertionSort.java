import java.util.List;

/**
 * Classe responsável pela ordenação do tipo Insertion
 */
public class InsertionSort {

    public static void insertionSort(List<Integer> lista) {
        int i, j;
        for (i = 1; i < lista.size(); i++) {
            int tmp = lista.get(i);
            j = i;
            while ((j > 0) && (lista.get(j - 1) > tmp)) {
                lista.set(j, lista.get(j - 1));
                j--;
            }
            lista.set(j, tmp);
        }
        System.out.println("InsertionSort: ");
    }
}
