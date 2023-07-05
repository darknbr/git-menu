import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        int opcao;
            do {        
                System.out.println("|   MENU            | ");
                System.out.println("| Opções:           | ");
                System.out.println("|       1. Opção 1  | ");
                System.out.println("|       2. Opção 2  | ");
                System.out.println("|       3. Sair     | ");

                Scanner menu = new Scanner(System.in);

                System.out.println(" Selecione uma opção: ");
                opcao = menu.nextInt();

                } while(opcao != 3);
    }
}