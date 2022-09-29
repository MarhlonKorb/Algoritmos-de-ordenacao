/**
 * Fachada dos menus do sistema
 */
public class Fachada {

    public static void listarOpcoes() {
        System.out.println("\n*** Agenda ***");
        System.out.println("Fachada de Opções");
        System.out.println("1 - Digitar 20 números");
        System.out.println("2 - Gerar 20 números aleatórios");
        System.out.println("3 - Ordenar(Menu Ordenação)");
        System.out.print("Opção : ");
    }

    public static void menuOrdenacao() {
        System.out.println("\n*** Menu Ordenação ***");
        System.out.println("Fachada de Ordenação");
        System.out.println("1- BubleSort");
        System.out.println("2- InsertionSort");
        System.out.println("3 - SelectionSort");
        System.out.println("4- Voltar ao Menu Anterior");
        System.out.print("Opção : ");
    }

}
