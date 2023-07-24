public class main {

    public static void main(String[] args) {
        Cliente emerson = new Cliente();
        emerson.setNome("Emerson Carlos");

        Conta cc = new ContaCorrente(emerson);
        Conta cp = new ContaPoupanca(emerson);

        cc.depositar(100);
        cc.transferir(100, cp);
        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
