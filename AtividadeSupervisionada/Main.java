import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    
    public static void operaPilha(Pilha pilha) {
        int opcao;
        do {
            System.out.println("\n[Operações com Pilha]");
            System.out.println("1 - Inserir");
            System.out.println("2 - Remover");
            System.out.println("3 - Listar");
            System.out.println("0 - Voltar");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();
            
            switch (opcao) {
            case 1:
                System.out.print("Digite um valor para inserir na Pilha: ");
                pilha.inserir(scanner.nextInt());
                break;
            case 2:
            	if( pilha.vazia() ) 
            		System.out.println("Pilha vazia!");
            	else
            		System.out.println("Removido da Pilha: " + pilha.remover());
                break;
            case 3:
                pilha.listar();
                break;
            }
            
        while( opcao != 0);
    }
    
    public static void operaFila(Fila fila) {
        int opcao;
        do {
            System.out.println("\n[Operações com Fila]");
            System.out.println("1 - Inserir");
            System.out.println("2 - Remover");
            System.out.println("3 - Listar");
            System.out.println("0 - Voltar");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();
            
            switch (opcao) {
            case 1:
                System.out.print("Digite um valor: ");
                fila.inserir(scanner.nextInt());
                break;
            case 2:
            	if( fila.vazia() ) 
            		System.out.println("Fila vazia!");
            	else
            		System.out.println("Removido da Fila: " + fila.remover());
                break;
            case 3:
                fila.listar();
                break;
            }
        } while( opcao != 0);    	
    }
    
    public static void operaMerge(Merge merge) {
        Fila A = new Fila();
        Fila B = new Fila();
        System.out.println("Insira elementos em ordem na Fila A (-1 para terminar):");
        
        int dado = scanner.nextInt();
        while( dado != -1 ) {
            A.inserir(dado);
            dado = scanner.nextInt();
        }

        System.out.println("Insira elementos em ordem na Fila B (-1 para terminar):");
        dado = scanner.nextInt();
        while( dado != -1 ) {
            B.inserir(dado);
            dado = scanner.nextInt();
        }

        System.out.println("Fila A:");
        A.listar();
        System.out.println("Fila B:");
        B.listar();

        Fila C = merge.merge(A, B);
        System.out.println("Fila C (merge):");
        C.listar();    	
    }
    
    public static void operaMergeV(MergeV merge) {
        FilaV AV = new FilaV();
        FilaV BV = new FilaV();
        System.out.println("Insira elementos em ordem na Fila A (-1 para terminar):");
        
        int dado = scanner.nextInt();
        while( dado != -1 ) {
            AV.inserir(dado);
            dado = scanner.nextInt();
        }

        System.out.println("Insira elementos em ordem na Fila B (-1 para terminar):");
        dado = scanner.nextInt();
        while( dado != -1 ) {
            BV.inserir(dado);
            dado = scanner.nextInt();
        }

        System.out.println("Fila A:");
        AV.listar();
        System.out.println("Fila B:");
        BV.listar();

        FilaV C = merge.merge(AV, BV);
        System.out.println("Fila C (merge):");
        C.listar();
    }

    public static void main(String[] args) {
        Pilha pilha = new Pilha();
        Fila fila = new Fila();
        Merge merge = new Merge();
        MergeV mergev = new MergeV();

        int opcao;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Operações com Pilha");
            System.out.println("2 - Oerações com Fila");
            System.out.println("3 - Merge em Fila com Lista");
            System.out.println("4 - Merge em Fila com Vetor");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                	operaPilha(pilha);
                	break;
                case 2:
                	operaFila(fila);
                    break;
                case 3:
                	operaMerge(merge);
                    break;
                case 8:
                	operaMergeV(mergev);
                    break;
                case 0:
                    System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
