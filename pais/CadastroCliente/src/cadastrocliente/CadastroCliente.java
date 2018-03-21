package cadastrocliente;

import java.util.ArrayList;
import java.util.Scanner;

public class CadastroCliente {

    public static void main(String[] args) {
        int opt = 0;
        Scanner ler = new Scanner(System.in);
        ArrayList<Cliente> clientes = new ArrayList<>();
        Cliente cliente;
        //
        while(opt != 3){
            System.out.println("Escolha uma opção abaixo:");
            System.out.println("1 - Inserir Cliente");
            System.out.println("2 - Listar Clientes");
            System.out.println("3 - Sair");
            
            opt = ler.nextInt();
            ler.nextLine();
            
            switch (opt) {
                case 1:
                    System.out.println("\n\n==========================");
                    System.out.println("Cadastrando cliente");
                    System.out.println("==========================");
                    
                    System.out.println("Qual o nome do cliente?");
                    String nome = ler.nextLine();
                    cliente = new Cliente();
                    cliente.setNome(nome);
                    
                    clientes.add(cliente);
                    break;
                case 2:
                    System.out.println("==========================");
                    System.out.println("\n\nListagem de Clientes");
                    System.out.println("==========================");
                    
                    for (Cliente c : clientes)
                        System.out.println(c);
                    
                    break;
                case 3:
                    System.out.println("\n\n\n\nSistema Finalizado!");
                    break;
                default:
                    System.out.println("\n\n\n\nOpção inválida!");;
            }
        }
        
    }
    
}
