package CaixaEletronico;
import Contas.Cliente;
import Contas.Conta;
import Contas.ContaCorrente;
import Contas.ContaPoupanca;
import Santander.Banco;
import java.util.Scanner;

public class Menu {
    public void exibirMenu(){
        //Instanciando as variáveis
        Scanner sc = new Scanner(System.in);
        Cliente cliente = new Cliente();
        Conta cc = new ContaCorrente(cliente);
        Conta cp = new ContaPoupanca(cliente);
        Banco banco = new Banco();
        String nome;
        int opc;
        int opcInterno;
        double valor;

        do {
            System.out.println("Bem Vindos ao Banco Santander!\n");
            System.out.println(" ========= MENU PRINCIPAL========== \n");
            System.out.println("1. CADASTRAR CONTA");
            System.out.println("2. DEPOSITAR");
            System.out.println("3. SACAR");
            System.out.println("4. TRANSFERIR");
            System.out.println("5. EXTRATO");
            System.out.println("6. SAIR");
            opc = sc.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("INFORME O NOME DO CLIENTE");
                    nome = sc.next();
                    cliente.setNome(nome);

                    System.out.println("INFORME O TIPO DE CONTA\n");
                    System.out.println("1. CONTA CORRENTE");
                    System.out.println("2. CONTA POUPANCA");
                    opcInterno = sc.nextInt();
                    // Verifica a opção interna e cadastra a conta de acordo com a escolha do usuário
                    if (opcInterno == 1) {
                        cc.setCliente(cliente);
                        System.out.println("CONTA CORRENTE CADASTRADA!\n");
                    } else if (opcInterno == 2) {
                        cp.setCliente(cliente);
                        System.out.println("CONTA POUPANCA CADASTRADA!\n");
                    } else {
                        System.out.println("OPCAO INVALIDA");
                        break;
                    }
                    break;
                case 2:
                    System.out.println("INFORME O TIPO DE CONTA PARA DEPOSITO\n");
                    System.out.println("1. CONTA CORRENTE");
                    System.out.println("2. CONTA POUPANCA");
                    opcInterno = sc.nextInt();
                    // Verifica se a opção interna é válida
                    if (opcInterno != 1 && opcInterno != 2) {
                        System.out.println("OPCAO INVALIDA");
                        break;
                    }

                    System.out.println("INFORME O VALOR DO DEPOSITO");
                    valor = sc.nextDouble();
                    // Executa o depósito na conta escolhida
                    if (opcInterno == 1) {
                        cc.depositar(valor);
                    } else {
                        cp.depositar(valor);
                    }
                    break;
                case 3:
                    System.out.println("INFORME O TIPO DE CONTA QUE DESEJA SACAR\n");
                    System.out.println("1. CONTA CORRENTE");
                    System.out.println("2. CONTA POUPANCA");
                    opcInterno = sc.nextInt();
                    // Verifica se a opção interna é válida
                    if (opcInterno != 1 && opcInterno != 2) {
                        System.out.println("OPCAO INVALIDA");
                        break;
                    }

                    System.out.println("INFORME O VALOR DO SAQUE\n");
                    valor = sc.nextDouble();
                    // Executa o saque na conta escolhida
                    if (opcInterno == 1){
                        cc.sacar(valor);
                    } else {
                        cp.sacar(valor);
                    }
                    break;
                case 4:
                    System.out.println("INFORME QUAL DAS OPÇOES VOCE DESEJA\n");
                    System.out.println("1. TRANSFERIR DA CONTA CORRENTE PARA CONTA POUPANCA");
                    System.out.println("2. TRANSFERIR DA CONTA POUPANCA PARA A CONTA CORRENTE");
                    opcInterno = sc.nextInt();
                    // Verifica se a opção interna é válida
                    if (opcInterno != 1 && opcInterno != 2) {
                        System.out.println("OPCAO INVALIDA");
                        break;
                    }

                    System.out.println("INFORME O VALOR DA TRANSFERENCIA");
                    valor = sc.nextDouble();
                    // Executa a transferência entre as contas escolhidas
                    if (opcInterno == 1){
                        cc.transferir(valor, cp);
                    } else {
                        cp.transferir(valor, cc);
                    }
                    break;
                case 5:
                    System.out.println("INFORME O TIPO DE CONTA QUE DESEJA EXTRATO\n");
                    System.out.println("1. CONTA CORRENTE");
                    System.out.println("2. CONTA POUPANCA");
                    opcInterno = sc.nextInt();
                    // Exibe o extrato da conta escolhida
                    if (opcInterno == 1){
                        cc.imprimirExtrato();
                    } else if (opcInterno == 2) {
                        cp.imprimirExtrato();
                    } else {
                        System.out.println("OPCAO INVALIDA");
                    }

            }
        } while (opc != 6);

        System.out.println("SAINDO...");
        sc.close();
    }
}
