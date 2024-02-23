package CarreiraTech.Fundamentos;

import java.util.Scanner;
import java.util.UUID;

public class JornadaBank {
    static String[][] user= new String[4][2];
    static int[][] conta = new int[4][2];

    static int aux = 0;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcao;







        do {
            System.out.println("""
                                        
                    --Olá seja bem vindo ao Jornada Bank
                    --Selecione as opcões para continuar
                    (0) - Sair.    
                    (1) - Registrar usuario.
                    (2) - Visualizar dados
                    (3) - Criar conta
                    (4) - Fazer depósito
                    (5) - Fazer saque
                    (6) - Fazer transferência
                    """);
            opcao = input.nextInt();
            input.nextLine();

            switch (opcao) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    registra();
                    break;
                case 2:
                    visualizarDados();
                    break;
                case 3:
                    criarConta();
                    break;
                case 4:
                    fazerDeposito();
                    break;
                case 5:
                    fazerSaque();
                    break;
               case 6:
                    fazerTransferencia();
                    break;
            }
        }while (opcao != 0);
    }



    public static void registra(){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = input.nextLine();

        System.out.println("Digite sua senha:");
        String senha = input.nextLine();

        user[aux][0] = nome;
        user[aux][1] = senha;

        System.out.println("Usuario registrado com sucesso!");
        aux++;
    }

    public static void visualizarDados(){
        System.out.println("Dados do usuario");
        for (int i = 0; i < aux; i++) {
            System.out.println("Seu nome: "+user[i][0]);
            System.out.println("Sua senha: "+user[i][1]);
            System.out.println();
        }
    }
    private static void criarConta() {
        System.out.println("Criando conta...");
        aux--;

        int id = aux;
        conta[aux][0] = id;

        int saldo = 0;
        conta[aux][1] = saldo;

        System.out.println("...Conta criada, id: "+id+" com saldo de R$ "+saldo);
        aux++;
    }
    private static void fazerDeposito() {
        Scanner input = new Scanner(System.in);
        System.out.println("Qual é o valor do depósito");
        int valorDeposito = input.nextInt();
        if (valorDeposito > 0){
            aux--;
            conta[aux][1] +=valorDeposito;
            System.out.println("Sua conta id:"+conta[aux][0]+" tem saldo de R$ "+ conta[aux][1]);
            aux++;
        }else {
            System.out.println("O valor deve ser maior que zero");
        }
    }

    private static void fazerSaque() {
        Scanner input = new Scanner(System.in);
        System.out.println("Qual é o valor do saque");
        int valorSaque = input.nextInt();
        aux--;
        if (conta[aux][1] > valorSaque){
            conta[aux][1] -= valorSaque;
            System.out.println("Concluido com sucesso!");
            System.out.println("Sua conta id:"+conta[aux][0]+" tem saldo de R$ "+ conta[aux][1]);
        }else {
            System.out.println("Você não possui essa quantia");
        }
        aux++;
    }
    private static void fazerTransferencia() {
        Scanner input = new Scanner(System.in);

        System.out.println("Qual é o valor da Transferencia");
        int valorTransferencia = input.nextInt();
        System.out.println("Qual é o id da Conta a ser transferido");
        int idContaTransferencia = input.nextInt();

        aux--;
        if (conta[aux][1] > valorTransferencia){
            conta[aux][1] -= valorTransferencia;
            conta[idContaTransferencia][1] = valorTransferencia;

            System.out.println("Transferência realizada com sucesso!");
            System.out.println("Sua conta id:"+conta[aux][0]+" tem saldo de R$ "+ conta[aux][1]);
        }else {
            System.out.println("Você não possui essa quantia");
        }
        aux++;

    }

}
