

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcao = 0;
        ArrayList lista = new ArrayList<>();
        Scanner leitor = new Scanner(System.in);

        Fachada.listarOpcoes();
        opcao = leitor.nextInt();
        while(opcao != 4 ){

            switch (opcao){
                case 1: armazenararNumeros(lista);
                return;
                case 2:  gerarNumerosAleatorios(lista);
                case 3: Fachada.menuOrdenacao();
                     int opcoesOrdenacao = leitor.nextInt();
                     ordenador(opcoesOrdenacao, lista);
            }
            Fachada.listarOpcoes();
            opcao = leitor.nextInt();
        }
    }

    /**
     * Armazena números da lsita utilizando a classe Scanner
     * @param lista
     */
    private static void armazenararNumeros(List<Integer> lista){
        Scanner leitor = new Scanner(System.in);
        while(lista.size() <= 19){
            if(lista.size() == 0){
                System.out.println("Digite um número: ");
            } else {
           System.out.println(" - Digite outro número: ");
            }
           lista.add(leitor.nextInt());
        }
        Fachada.listarOpcoes();
        int opcoesOrdenacao = leitor.nextInt();
        ordenador(opcoesOrdenacao, lista);
        leitor.close();
        return;
    }

    /**
     * Gera números aleatórios e insere na lista
     * @param lista
     */
    private static void gerarNumerosAleatorios(List<Integer> lista){
        Random gerador = new Random();
        // Seta o tamanho da lista
        final int tamanhoLista = 19;
        while(lista.size() <= tamanhoLista) {
            lista.add(gerador.nextInt(0,50));
        }
        for (Integer numeros: lista
             ) {
            System.out.println(numeros);
        }
    }

    /**
     * Realiza a rota para o método de ordenação selecionado
     * @param opcao
     * @param lista
     */
    private static void ordenador(int opcao, List<Integer> lista){
        switch (opcao){
            case 1: BubbleSort.BubbleSort(lista, lista.size());
            Listador.listar(lista);
            return;
            case 2: InsertionSort.insertionSort(lista);
                Listador.listar(lista);
            return;
            case 3: SelectionSort.SelectionSort(lista);
                Listador.listar(lista);
            return;
        }

    }

}










