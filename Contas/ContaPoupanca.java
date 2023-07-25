package Contas;

public class ContaPoupanca extends Conta {

    public ContaPoupanca ( Cliente cliente){
        super(cliente);
    }
    public void imprimirExtrato(){
        System.out.println("===== Extrato Contas.Conta Poupança ====");
        System.out.println(String.format("Titular: %s", super.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", super.agencia));
        System.out.println(String.format("Numero: %d", super.numeroConta));
        System.out.println(String.format("Saldo: %.2f\n", super.saldo));

    }
}
