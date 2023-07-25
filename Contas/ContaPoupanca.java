package Contas;

public class ContaPoupanca extends Conta {

    // Construtor da Conta Poupança que recebe um cliente como parâmetro
    public ContaPoupanca(Cliente cliente) {
        super(cliente); // Chama o construtor da classe Conta (superclasse) passando o cliente recebido como parâmetro
    }

    // Método para imprimir o extrato da Conta Poupança
    public void imprimirExtrato() {
        // Imprime o cabeçalho do extrato
        System.out.println("===== Extrato Conta Poupança ====");
        // Imprime o nome do titular da conta
        System.out.println(String.format("Titular: %s", super.cliente.getNome()));
        // Imprime o número da agência da conta
        System.out.println(String.format("Agencia: %d", super.agencia));
        // Imprime o número da conta
        System.out.println(String.format("Numero: %d", super.numeroConta));
        // Imprime o saldo da conta
        System.out.println(String.format("Saldo: %.2f\n", super.saldo));
    }
}
