public class Main {
    public static void main(String[] args) {
//        Instância da classe de gerenciamento
        GerenciamentoContas gerenciamento = new GerenciamentoContas();
//        Instância da contaCorrente
        ContaBancaria contaC = new ContaCorrente("Teste corrente");
//        setando o valor da taxa de operação
        contaC.setTaxa(2.0);
//        depósito em dinheiro
        contaC.depositar(100);
//        depósito em cheque
        contaC.depositar(200.3);
//        adicionar a conta ao gerenciador
        gerenciamento.addConta(contaC);
        contaC.sacar(50);
//        Exibir as contas
        System.out.println(gerenciamento + "\n");

//        Mesma lógica para poupança
        ContaBancaria contaP = new ContaPoupanca("Teste poupança");
        contaP.setRendimento(2.0);
        System.out.println(contaP);
        gerenciamento.addConta(contaP);
        contaP.depositar(300.56);
        contaP.sacar(100);
        System.out.println(gerenciamento + "\n");

//        Após as duas contas criadas, é feita a transferência
        contaC.transferir(100, contaP);
        System.out.println(gerenciamento);
    }
}
