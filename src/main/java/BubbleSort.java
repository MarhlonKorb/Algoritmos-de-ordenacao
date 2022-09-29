import java.util.List;

/**
 * Classe responsável pela ordenação do tipo Bubble
 */
public class BubbleSort {
    public static void BubbleSort(List<Integer> lista, int size) {

        if (size == 1)
            return;
        for (int i=0; i<size-1; i++)
            // Se o número no indice i for maior que do indice j
            // o número no índice i vai para o próximo indice
            if (lista.get(i) > lista.get(i + 1))
            {
                int temp = lista.get(i);
                lista.set(i, lista.get(i+1));
                lista.set(i + 1,  temp);
            }
        BubbleSort(lista, size-1);
    }

}