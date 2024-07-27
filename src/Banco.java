import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        //variáveis
        int saldo = 2500;

        //informações do usario
        System.out.println("***********************");
        System.out.println("Dados iniciais do cliente: \n");
        System.out.println("Nome: Bryan Machado");
        System.out.println("Tipo conta: Corrente");
        System.out.println("Saldo inicial: R$ 2500,00");
        System.out.println("*********************** \n");

        int escolha = 0;
        while(escolha != 4) {

            //parte de operações
            System.out.println("Operações");
            System.out.println("1- Consultar Saldo");
            System.out.println("2- Receber Valores");
            System.out.println("3- Transferir Valores");
            System.out.println("4- Sair \n");

            //solicitação úsuario
            System.out.print("Digite a opção desejada: ");
            escolha = leitura.nextInt();

            if (escolha == 1) {
                System.out.println("Seu saldo é de: " + saldo);
            } else if (escolha == 2) {
                System.out.print("Informe o valor a receber: ");
                int valorRecebido = leitura.nextInt();
                saldo += valorRecebido;
                System.out.println("Saldo atualizado: " + saldo);
            } else if (escolha == 3) {
                System.out.print("Informe o valor a ser transferido: ");
                int saldoTransferido = leitura.nextInt();

                if(saldoTransferido <= saldo){
                    saldo -= saldoTransferido;
                    System.out.println("Saldo atualizado: " + saldo);
                } else {
                    System.out.println("Saldo insuficiente para transação");
                }

            } else if (escolha == 4) {
                System.out.println("Encerrando programa...");
            }

        }
    }
}