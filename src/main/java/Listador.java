import java.util.List;

/**
 * Classe responsável pela listagem dos números
 */
public class Listador {

    public static void listar(List<Integer> lista){
        for (Object numero: lista
        ) {
            System.out.println(String.valueOf(lista.indexOf(numero ))+ " - " + numero);
        }
        lista.clear();
    }
}
