package Contas;

import Contas.Conta;

public interface IConta {

    void imprimirExtrato();
    void sacar (double valor);
    void depositar (double valor);
    void transferir (double valor, Conta contaDestino);
}
