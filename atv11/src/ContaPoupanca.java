// Segue a mesma lógica de ContaCorrente.java
public class ContaPoupanca extends ContaBancaria {

    public ContaPoupanca(String titular) {
        super(titular);
    }

    @Override
    public void depositar(int dinheiro) {
        this.saldo += (dinheiro * (this.rendimento + 1));
    }

    @Override
    public void depositar(double cheque) {
        this.saldo += (cheque * (this.rendimento + 1));
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    @Override
    public void transferir(double valor, ContaBancaria destino) {
        this.sacar(valor);
        destino.depositar(valor);
    }

    @Override
    public String toString() {
        return "ContaPoupanca{" +
                "titular='" + titular + '\'' +
                ", numeroConta='" + numeroConta + '\'' +
                ", saldo=" + saldo +
                ", rendimento=" + rendimento +
                '}';
    }
}
