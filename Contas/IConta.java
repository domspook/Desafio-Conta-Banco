package Contas;
//Todas as classes que implementam esta interface devem fornecer uma implementação para os métodos listados.
public interface IConta {

    // Método para imprimir o extrato da conta
    void imprimirExtrato();

    // Método para realizar um saque na conta
    void sacar(double valor);

    // Método para realizar um depósito na conta
    void depositar(double valor);

    // Método para transferir um valor para outra conta
    void transferir(double valor, Conta contaDestino);
}
