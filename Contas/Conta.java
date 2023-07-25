package Contas;

import lombok.Data;

@Data
public abstract class Conta implements IConta {

    // Variável estática para controlar o número sequencial de contas criadas
    private static int SEQUENCIAL = 1;

    // Constante para definir a agência padrão para todas as contas
    private static int AGENCIA_PADRAO = 1;

    // Atributos da conta
    protected int agencia; // Número da agência da conta
    protected int numeroConta; // Número da conta
    protected double saldo; // Saldo da conta
    protected Cliente cliente; // Cliente associado à conta

    // Construtor da conta
    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO; // Define a agência padrão para a conta
        this.numeroConta = SEQUENCIAL++; // Atribui o próximo número sequencial para a conta
        this.cliente = cliente; // Associa o cliente à conta
    }

    @Override
    public void sacar(double valor) {
        saldo = saldo - valor; // Realiza o saque e atualiza o saldo da conta
    }

    @Override
    public void depositar(double valor) {
        saldo = saldo + valor; // Realiza o depósito e atualiza o saldo da conta
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor); // Realiza o saque da conta atual
        contaDestino.depositar(valor); // Deposita o valor na conta de destino
    }
}
