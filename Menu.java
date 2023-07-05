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

            processar(opcao);
            } while(opcao != 3);
        }

        public static void processar(int opcao){

            switch (opcao) {
                case 1:
                    System.out.println("Você escolheu a primeira opção");
                    break;
                case 2:
                    System.out.println("Você escolheu a segunda opção");
                    break;
                case 3:
                    System.out.println("O programa foi encerrado");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
        }
    }
}
