// Importando uma biblioteca para gerar números aleatórios
import java.util.Random;

// Definição da classe abstrata
public abstract class ContaBancaria {

    // Argumentos protegidos como encapsulamento de herença
    protected String numeroConta;
    protected String titular;
    protected double saldo;
    protected double taxa;
    protected double rendimento;

    // Construtor da classe tornando o titular da conta obrigatório
    public ContaBancaria(String titular) {
        this.titular = titular;

        // Gerar numero aleatório para a conta
        this.numeroConta = gerarNumeroConta(10);
        this.saldo = 0;
    }

    // função para gerar o número aleatório
    public static String gerarNumeroConta(int numeroDigitos) {
        Random random = new Random();
        StringBuilder numeroConta = new StringBuilder();

        // Gera o primeiro dígito, garantindo que não seja zero
        numeroConta.append(random.nextInt(8) + 1);

        // Gera os dígitos restantes
        for (int i = 1; i < numeroDigitos; i++) {
            numeroConta.append(random.nextInt(10));
        }

        return numeroConta.toString();
    }

    public void setTaxa(double taxa) {
        this.taxa = (taxa/100);
    }

    public void setRendimento(double rendimento) {
        this.rendimento = (rendimento/100);
    }

//    Métodos abstratos para sobrecarga e sobreposição
    public abstract void depositar(int dinheiro);

    public abstract void depositar(double cheque);

    public abstract void sacar(double valor);

    public abstract void transferir(double valor, ContaBancaria destino);

    public String getNumeroConta() {
        return numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "titular='" + titular + '\'' +
                ", numeroConta='" + numeroConta + '\'' +
                ", saldo=" + saldo +
                '}';
    }

}
