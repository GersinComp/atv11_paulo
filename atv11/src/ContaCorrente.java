public class ContaCorrente extends ContaBancaria {

    public ContaCorrente(String titular) {
        super(titular);
    }

//    Sobreescrevendo os métodos abstratos
    @Override
    public void depositar(int valor) {
        this.saldo += valor;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    @Override
    public void transferir(double valor, ContaBancaria destino) {
//      Remove o valor da taxa de operação do saldo do usuário
        this.sacar(valor + this.taxa);
        destino.depositar(valor);
    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "titular='" + titular + '\'' +
                ", numeroConta='" + numeroConta + '\'' +
                ", saldo=" + saldo +
                ", taxa=" + taxa +
                '}';
    }
}
